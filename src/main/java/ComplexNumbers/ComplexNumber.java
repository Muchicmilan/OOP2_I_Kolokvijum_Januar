package ComplexNumbers;

import lombok.Getter;

@Getter

public class ComplexNumber {
   final private double real;
   final private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double modulus(){
        return Math.sqrt(real * real + imag * imag);
    }
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imag + other.imag);
    }
    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real*c2.real -(c1.imag*c2.imag), c1.real*c2.imag + c1.imag*c2.real);
    }

    @Override
    public String toString() {
        String res = "";
        double r = modulus();
        double radian = Math.atan2(imag,real);
        ComplexNumber z = new ComplexNumber(r*Math.cos(radian), r*Math.sin(radian));
        res += z.getReal() + z.getImag() + "i";
        return res;
    }

}
