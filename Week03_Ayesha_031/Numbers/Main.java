public class Main {

    public static void main(String[] args) {
        // Complex Number
        // Default Constructor
        Complex C = new Complex();

        // Parameterized Constructor
        Complex C1 = new Complex(3, 4);

        // Copy Constructor
        Complex C2 = new Complex(C1);

        System.out.println("Complex Numbers:");

        System.out.println("C: " + C);
        System.out.println("C1: " + C1);
        System.out.println("C2: " + C2);

        // Addition
        Complex C3 = C1.add(new Complex(2, 5));

        System.out.println("Addition: " + C3);

        // Subtraction
        Complex C4 = C1.subtract(new Complex(2, 5));

        System.out.println("Subtraction: " + C4);

        // Rational Number
        
        // Default Constructor
        Rational R = new Rational();

        // Parameterized Constructor
        Rational R1 = new Rational(1, 2);

        // Copy Constructor
        Rational R2 = new Rational(R1);

        System.out.println("\nRational Numbers:");

        System.out.println("R: " + R);
        System.out.println("R1: " + R1);
        System.out.println("R2: " + R2);

        // Addition
        Rational R3 = R1.add(new Rational(1, 3));

        System.out.println("Addition: " + R3);

        // Subtraction
        Rational R4 = R1.subtract(new Rational(1, 3));

        System.out.println("Subtraction: " + R4);
    }
}