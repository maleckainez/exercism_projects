public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int production = speed*221;
        return switch (speed){
            case 0, 1, 2, 3, 4 -> production;
            case 5, 6, 7, 8 -> production*0.9;
            case 9 -> production*0.8;
            case 10 -> production*0.77;
            default -> 0;
        };
    }

    public int workingItemsPerMinute(int speed) {
        return (int) Math.floor(productionRatePerHour(speed)/60);
    }
}
