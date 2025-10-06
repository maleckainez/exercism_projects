import java.util.Objects;

class Rational {
    final private int num;
    final private int denum;
    Rational(int num, int denum) {
        if(denum==0) throw new IllegalArgumentException("Denominator cannot be 0!");
        if(denum<0){
            num = -num;
            denum = -denum;
        }
        final int gcd = getGCD(num,denum);
        this.num = num/gcd;
        this.denum = denum/gcd;
    }

    int getNumerator() {
        return num;
    }

    int getDenominator() {
        return denum;
    }
    int getGCD(int a, int b){
        if(b == 0) return Math.abs(a);
        return getGCD(b, a % b);
    }
    Rational add(Rational other) {
        return new Rational((num*other.denum)+(other.num*denum),(denum*other.denum));
    }

    Rational subtract(Rational other) {
        return add(new Rational(-other.num,other.denum));
    }

    Rational multiply(Rational other) {
        return new Rational((num*other.num),(denum*other.denum));
    }

    Rational divide(Rational other) {
        return multiply(new Rational(other.denum, other.num));

    }
    int myMathAbs(int x){
        return (x<0) ? -x:x;
    }
    Rational abs() {
        return new Rational(myMathAbs(num),denum);
    }

    Rational pow(int n) {
        if(n<0)return new Rational(denum,num).pow(-n); 
        return new Rational((int)Math.pow(num,n),(int)Math.pow(denum,n));
        
    }
    double approx(){
        return (double) num/denum;
    }

    double exp(double x) {
        return Math.pow(x,approx());
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.getNumerator(), this.getDenominator());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rational other) {
            return this.getNumerator() == other.getNumerator()
                    && this.getDenominator() == other.getDenominator();
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNumerator(), this.getDenominator());
    }
}
