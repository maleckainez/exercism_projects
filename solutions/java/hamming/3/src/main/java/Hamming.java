public class Hamming {
    private int HammingDistance;
    public Hamming(String lS, String rS) {
        if(lS.length()!=rS.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.HammingDistance = calculateHammingDistance(lS, rS);
    }
    private int calculateHammingDistance(String lS, String rS){
        int diff = 0;
        for(int i=0; i<lS.length();i++)
            if(lS.charAt(i)!=rS.charAt(i)){
                diff+=1;
            }
        return diff;
    }

    public int getHammingDistance() {
        return HammingDistance;
    }
}
