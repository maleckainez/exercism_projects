class CalculatorConundrum {
    public String calculate(int o1, int o2, String operation) {
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        int result;
        switch (operation){ 
            case "+": 
                result = o1 + o2; 
                break;
            case "-": 
                result = o1 - o2;
                break;
            case "*": 
                result = o1 * o2;
                break;
            case "/":
                try{
                    result = o1 / o2;
                }
                catch(ArithmeticException e){
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                break;
            default: 
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        } 
        return String.format("%d %s %d = %d", o1, operation, o2, result);
    }
}
