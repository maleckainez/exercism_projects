public class EliudsEggs {
    public int eggCount(int number) {
        int ones = 0;
        while(number>0){
            final boolean isRemainder = number%2==1;
            if(isRemainder){
                ones ++;
                number = (number-1)/2;}
            else{number = number/2;}
        }
        return ones;
    }
}
