public class EliudsEggs {
    private int isRemainder;
    private int number;
    public int eggCount(int number) {
        this.number = number;
        if(number==0){return 0;}
        StringBuilder sb = new StringBuilder();
        while(number>0){
            isRemainder = number%2;
            if(isRemainder==1){
                sb.append("1");
                number = (int) (number-1)/2;}
            else if(isRemainder==0){
                sb.append("0");
                number = (int) number/2;}
        }
        int ones = 0;
        for(int i = 0; i<sb.length();i++){
            char c = sb.charAt(i);
            if(c=='1') ones ++;
        }
        return (int) ones;
    }
}
