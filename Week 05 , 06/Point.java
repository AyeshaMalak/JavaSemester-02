public class Point {

    private int x;
    private int y;

    // Normal constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // toString()
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}