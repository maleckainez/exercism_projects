public class SquareRoot {
    public int squareRoot(int radicand) {
        //    This task will be calculated using the Heron's method.
        double x = radicand;
        double tolerancy = 0.00000001;
        while(x*x-radicand > tolerancy){
            x = 0.5*(x+radicand/x);
        }
        return (int) x;
    }
}
