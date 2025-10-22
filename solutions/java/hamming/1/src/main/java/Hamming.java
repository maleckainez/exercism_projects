public class Hamming {
    private char[] lS;
    private char[] rS;
    public Hamming(String lS, String rS) {
        if(lS.length()!=rS.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.lS = lS.toCharArray();
        this.rS = rS.toCharArray();
    }

    public int getHammingDistance() {
        int diff = 0;
        for(int i=0; i<lS.length;i++)
            if(lS[i]!=rS[i]){
                diff+=1;
            }
        return diff;
    }
}
