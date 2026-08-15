public class Main { 
    public static void main(String[] args) { 
 
        // Default Constructor 
        Point P = new Point(); 
 
        // Parameterized Constructor 
        Point P1 = new Point(10, 20); 
 
        // Copy Constructor 
        Point P2 = new Point(P); 
 
        // Display 
        P.display(); 
        P1.display(); 
        P2.display(); 
 
        // toString() 
        System.out.println(P.toString()); 
        System.out.println(P1.toString()); 
        System.out.println(P2.toString()); 
 
        // Addition 
        Point P4 = new Point(5, 5); 
        Point P3 = P1.add(P4); 
 
        System.out.println("Addition: " + P3); 
 
        // Subtraction 
        Point P5 = P1.subtract(P4); 
 
        System.out.println("Subtraction: " + P5);

        // Triangle

        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(2, 3);

        Triangle T = new Triangle(A, B, C);

        System.out.println("\nTriangle Points:");
        T.display();
    } 
}