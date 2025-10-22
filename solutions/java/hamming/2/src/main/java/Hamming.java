public class Hamming {
    private String lS;
    private String rS;
    public Hamming(String lS, String rS) {
        if(lS.length()!=rS.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.lS = lS;
        this.rS = rS;
    }

    public int getHammingDistance() {
        int diff = 0;
        for(int i=0; i<lS.length();i++)
            if(lS.charAt(i)!=rS.charAt(i)){
                diff+=1;
            }
        return diff;
    }
}
