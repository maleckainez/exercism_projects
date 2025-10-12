import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime finalDateTime = LocalDateTime.parse(appointmentDateDescription, parser);
        return finalDateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return(appointmentDate.isBefore(LocalDateTime.now()));
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return(appointmentDate.getHour()>=12&&appointmentDate.getHour()<18);
    }

    public String getDescription(LocalDateTime aD) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.");
        return (String)"You have an appointment on " + aD.format(formatter);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
