public class EliudsEggs {
    public int eggCount(int number) {
        int ones = 0;
        while(number>0){
                number &= (number-1);
                ones+=1;}
        return ones;
    }
}