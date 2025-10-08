public class EliudsEggs {
    private int isRemainder;
    private int number;
    public int eggCount(int number) {
        this.number = number;
        if(number==0){return 0;}
        int ones = 0;
        while(number>0){
            isRemainder = number%2;
            if(isRemainder==1){
                ones ++;
                number = (int) (number-1)/2;}
            else if(isRemainder==0){
                number = (int) number/2;}
        }
        return (int) ones;
    }
}
