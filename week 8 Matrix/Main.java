public class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        int[] source = {1, 2, 3, 4, 5, 6};

        Matrix original = new Matrix(2, 3, source);

        System.out.println("Original: " + original);

        // Shallow copy
        Matrix shallow = original.clone();

        shallow.set(0, 1, 99);

        System.out.println("Shallow: " + shallow);
        System.out.println("Original after shallow: " + original);

        // Deep copy
        Matrix deep = original.deepCopy();

        deep.set(1, 2, 88);

        System.out.println("Deep: " + deep);
        System.out.println("Original after deep: " + original);
    }
}