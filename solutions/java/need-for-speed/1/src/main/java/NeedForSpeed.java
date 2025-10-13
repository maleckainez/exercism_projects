class NeedForSpeed {
    private int battery = 100;
    private int distanceDriven=0;
    public final int speed;
    public final int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery<batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(batteryDrained()){return;}
        battery -= batteryDrain;
        distanceDriven +=speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    final int trackDistance;
    RaceTrack(int distance) {
        this.trackDistance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return trackDistance<=(car.speed*100/car.batteryDrain);
    }
}
