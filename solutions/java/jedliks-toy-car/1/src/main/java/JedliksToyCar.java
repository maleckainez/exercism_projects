public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryLevel = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
        if(batteryLevel == 0){return "Battery empty";}
        return String.format("Battery at %d%%", batteryLevel);
    }

    public void drive() {
        if(batteryLevel==0){return;}
        distanceDriven += 20;
        batteryLevel -= 1;
    }
}
