public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 6);
        Point p3 = new Point(8, 9);

        Point[] arr = {p1, p2, p3};

        PointArray original = new PointArray(arr);

        // Print original
        System.out.println("Original: " + original);

        // Get Point
        System.out.println("Point at index 1: " + original.getPoint(1));

        // Shallow Copy
        PointArray shallowCopy = original.clone();
        System.out.println("Shallow Copy: " + shallowCopy);

        // Deep Copy
        PointArray deepCopy = original.deepCopy();
        System.out.println("Deep Copy: " + deepCopy);
    }
}