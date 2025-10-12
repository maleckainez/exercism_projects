public class Say {

    // Deklaracje stałych muszą być poza metodą
    final private static String[] numbers = {
        "zero", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    final private static String[] decimals = {
        null, "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    
    public String say(long number) {
        if (number<0) {throw new IllegalArgumentException("numbers must be positive integers!");}
        if (number < 20) {
            return numbers[(int) number];
        }
        if(number<100){ if(number%10==0){return decimals[(int)number/10];} 
        return decimals[(int)number/10]+"-"+say(number%10); 
        }
        if(number<1000){
            if(number%100==0){return numbers[(int)number/100]+" hundred";}
            return say(number/100)+" hundred "+say(number%100);
        }
        if(number<1000000){
            if(number%1000==0){return numbers[(int)number/1000]+" thousand";}
            return say(number/1000)+" thousand "+say(number%1000);
        }
        if(number<1000000000){
            if(number%1000000==0){return numbers[(int)number/1000000]+ " million";}
            return say(number/1000000)+" million "+say(number%1000000);
        }
        if (number < 1_000_000_000_000L) { // < 1 trillion
        if (number % 1_000_000_000L == 0) {return say(number / 1_000_000_000L) + " billion";}
        return say(number / 1_000_000_000L) + " billion " + say(number % 1_000_000_000L);
        }

        throw new IllegalArgumentException("numbers above 999,999,999,999 are out of range");
    }
}