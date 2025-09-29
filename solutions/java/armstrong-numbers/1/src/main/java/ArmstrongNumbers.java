class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int len = String.valueOf(numberToCheck).length();
        int value = 0;
        for(int i=0; i<len; i++){
            int temp = (int) (numberToCheck/Math.pow(10,i)) %10;
            value += Math.pow(temp, len);
        }
        return value==numberToCheck;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

    }

}
