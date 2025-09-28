class MicroBlog {
    public String truncate(String input) {
        if (input.length() > 6){
            return input.substring(0,5);
        } else {return input;}
    }
}
