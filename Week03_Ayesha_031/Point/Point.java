class Point{
    private int x ;
    private int y ;

//null constructor
public Point (){
    this.x = 0 ;
    this.y = 0 ;
} 

//parameterized constructor
public Point (int x  , int y ){
    this.x = x ;
    this.y = y  ;
}
//copy constructor
public Point (Point P){
    this.x = P.x ;
    this.y = P.y ;
}
//getters
public int getx(){
    return x ;
}
public int gety(){
    return y ;
}
//setters
public void setx(int x){
    this.x = x ;
}
 
public void sety(int y){
    this.y = y ;
}

public void display(){
    System.out.println(x);
    System.out.println(y);
}

 //toString directly override values from object 
public String toString() {
    return "(" + x + ", " + y + ")";
}
 public Point add(Point P){
    int newX = this.x + P.x ;
    int newY = this.y + P.y ;

    return new Point(newX , newY);
 }

 public Point subtract(Point P){
    int newX = this.x - P.x ;
    int newY = this.y - P.y ;

    return new Point(newX , newY);
 }
}