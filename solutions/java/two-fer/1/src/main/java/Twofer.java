public class Twofer {
    public String twofer(String name) {
        if(name == null){
            name = "you";
        }
        String answer = "One for " + name + ", one for me.";
        return answer;
    }
}
