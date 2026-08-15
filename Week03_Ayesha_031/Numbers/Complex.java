public class Complex {

    private double real;
    private double imaginary;

    // Default Constructor
    public Complex() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy Constructor
    public Complex(Complex C) {
        this.real = C.real;
        this.imaginary = C.imaginary;
    }

    // Addition
    public Complex add(Complex C) {
        return new Complex(
            this.real + C.real,
            this.imaginary + C.imaginary
        );
    }

    // Subtraction
    public Complex subtract(Complex C) {
        return new Complex(
            this.real - C.real,
            this.imaginary - C.imaginary
        );
    }

    // toString
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}