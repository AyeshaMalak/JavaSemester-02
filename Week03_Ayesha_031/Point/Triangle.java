public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    // Default constructor
    public Triangle() {
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }

    // Parameterized constructor
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // Copy constructor
    public Triangle(Triangle t) {
        this.p1 = new Point(t.p1);
        this.p2 = new Point(t.p2);
        this.p3 = new Point(t.p3);
    }

    // Display points
    public void display() {
        System.out.println("Point 1: ");
        p1.display();

        System.out.println("Point 2: ");
        p2.display();

        System.out.println("Point 3: ");
        p3.display();
    }
}