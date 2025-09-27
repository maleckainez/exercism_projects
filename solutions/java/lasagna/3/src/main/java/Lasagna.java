public class Lasagna {
    // DONE: define the 'expectedMinutesInOven()' method
    static final int EXPECTED_MINUTES_IN_OVEN = 40;
    static final int TIME_PER_LAYER = 2;

    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }
    // DONE: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven()-minutesInOven;
    }
    // DONE: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers*TIME_PER_LAYER;
    }
    // DONE: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven){
        return preparationTimeInMinutes(layers)+minutesInOven;
    }
}
