
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
       birdsPerDay[birdsPerDay.length-1]+=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int c:birdsPerDay){
            if(c==0){return true;}
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if(numberOfDays>birdsPerDay.length){numberOfDays=birdsPerDay.length;}
        int temp = 0;
        for(int i = 0; i<numberOfDays; i++){
            temp+=birdsPerDay[i];
        }
        return temp;
    }

    public int getBusyDays() {
        int temp=0;
        for(int birds:birdsPerDay){
            if(birds>=5){temp+=1;}
        }
        return temp;
    }
}
