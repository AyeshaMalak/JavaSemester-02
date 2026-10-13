public class PointArray implements Cloneable {

    private Point[] points;

    // Constructor
    public PointArray(Point[] points) {
        this.points = points;
    }

    // Get a Point
    public Point getPoint(int index) {
        return points[index];
    }

    // Shallow Copy
    @Override
    public PointArray clone() throws CloneNotSupportedException {
        return (PointArray) super.clone();
    }


    // Deep Copy
    public PointArray deepCopy() {

        // Create a new array
        Point[] newPoints = new Point[this.points.length];

        // Copy each Point
        for (int i = 0; i < this.points.length; i++) {

            if (this.points[i] != null) {
                newPoints[i] = new Point(this.points[i]);
            }
        }

        // Create a new PointArray
        return new PointArray(newPoints);
    }



    // toString()
    @Override
    public String toString() {

        String result = "[";

        for (int i = 0; i < this.points.length; i++) {

            if (i > 0) {
                result = result + ", ";
            }

            result = result + this.points[i];
        }

        return result + "]";
    }
}