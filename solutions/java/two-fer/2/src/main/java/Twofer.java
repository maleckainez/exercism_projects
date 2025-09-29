public class Twofer {
    public String twofer(String name) {
        name = (name==null)?name="you":name;
        String answer = "One for " + name + ", one for me.";
        return answer;
    }
}
