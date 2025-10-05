import java.util.Objects;

class Rational {
    private int num;
    private int denum;
    Rational(int num, int denum) {
        if(denum!=0){
            if(denum<0){
                num = -num;
                denum = -denum;
            }
        }
        else{
            throw new UnsupportedOperationException("Denumenator cannot be 0!");
        }
        int gcd = getGCD(num,denum);
        this.num = num/gcd;
        this.denum = denum/gcd;
        
    }

    int getNumerator() {
        return num;
    }

    int getDenominator() {
        return denum;
    }
    int getGCD(int num, int denum){
        int a = Math.abs(num);
        int b = Math.abs(denum);
        if(b == 0){
            return a;
        }
        return getGCD(b, a % b);
    }
    Rational add(Rational other) {
        int newNum = (int)(num*other.denum+other.num*denum);
        int newDenum = (int)(denum*other.denum);
        return new Rational((int)newNum,(int)newDenum);
    }

    Rational subtract(Rational other) {
        return add(new Rational(-other.num,other.denum));
    }

    Rational multiply(Rational other) {
        int newNum = (int)(num*other.num);
        int newDenum = (int)(denum*other.denum);
        return new Rational((int)newNum,(int)newDenum);
    }

    Rational divide(Rational other) {
        int newNum = (int)(num*other.denum);
        int newDenum = (int)(other.num*denum);
        return new Rational((int)newNum,(int)newDenum);

    }
    int myMathAbs(int x){
        return (x<0) ? -x:x;
    }
    Rational abs() {
        return new Rational(myMathAbs(num),myMathAbs(denum));
    }

    Rational pow(int n) {
        int absN = myMathAbs(n);
        int bToN = (int) Math.pow(denum,absN);
        int aToN = (int) Math.pow(num,absN);
        return (n>=0) ? new Rational(aToN,bToN):new Rational(bToN,aToN);
    }

    double exp(double x) {
        return Math.pow(Math.pow(x, 1.0 / denum), num);
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
