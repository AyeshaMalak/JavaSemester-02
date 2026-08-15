public class Main {
    public static void main(String[] args) {
        
        Time t1 = new Time(2, 10, 20);
        Time t2 = new Time(t1); // copy constructor
         t1.display();
         
         t2.sethours(5);
         t2.display();
    }
}