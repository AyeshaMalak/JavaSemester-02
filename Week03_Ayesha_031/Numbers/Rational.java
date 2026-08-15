public class Rational {

    private int numerator;
    private int denominator;

    // Default Constructor
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    // Parameterized Constructor
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Copy Constructor
    public Rational(Rational R) {
        this.numerator = R.numerator;
        this.denominator = R.denominator;
    }

    // Addition
    public Rational add(Rational R) {

        int n = (this.numerator * R.denominator)
              + (R.numerator * this.denominator);

        int d = this.denominator * R.denominator;

        return new Rational(n, d);
    }

    // Subtraction
    public Rational subtract(Rational R) {

        int n = (this.numerator * R.denominator)
              - (R.numerator * this.denominator);

        int d = this.denominator * R.denominator;

        return new Rational(n, d);
    }

    // toString
    public String toString() {
        return numerator + "/" + denominator;
    }
}