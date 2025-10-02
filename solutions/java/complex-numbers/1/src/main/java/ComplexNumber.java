class ComplexNumber {

    private double real;
    private double imaginary;
    
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    double getReal() {
        return real;
    }

    double getImaginary() {
        return imaginary;
    }

    double abs() {
        double resAbs = Math.sqrt(Math.pow(getReal(),2)+Math.pow(getImaginary(),2));
        return resAbs;
    }

    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(real+c.real, imaginary+c.imaginary);
    }

    ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(real-c.real, imaginary-c.imaginary);
    }

    ComplexNumber multiply(ComplexNumber c) {
        return new ComplexNumber(real*c.real-imaginary*c.imaginary,imaginary*c.real+real*c.imaginary);
    }

    ComplexNumber divide(ComplexNumber c) {
        return new ComplexNumber((real*c.real+imaginary*c.imaginary)/(c.real*c.real+c.imaginary*c.imaginary), (imaginary*c.real-real*c.imaginary)/(c.real*c.real+c.imaginary*c.imaginary));
    }

    ComplexNumber conjugate() {
        return new ComplexNumber(real, -imaginary);
    }

    ComplexNumber exponentialOf() {
        return new ComplexNumber(Math.exp(real)*Math.cos(imaginary), Math.exp(real)*Math.sin(imaginary));
    }
}