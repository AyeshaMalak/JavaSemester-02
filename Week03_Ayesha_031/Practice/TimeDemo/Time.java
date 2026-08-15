class Time {
    private int hours ;
    private int minutes ;
    private int seconds ;


//null constructor 
public Time (){
     this.hours = 0;
    this.minutes = 0 ;
   this.seconds = 0 ;
}

//parametrized constructor 
public Time (int hours , int minutes , int seconds ){
    this.hours = hours ;
    this.minutes = minutes ;
    this.seconds = seconds ;
}

// copy constructor 
 public Time (Time t){
    this.hours = t.hours ;
    this.minutes = t.minutes ;
    this.seconds= t.seconds ;
   
    
}
//setters

public void sethours( int hours ){
    if (hours>=0 && hours <=23 ){
        this.hours = hours ;
    } 
    else {
        System.out.println("Not a valid input");
    }
}

public void setminutes (int minutes){
    if (minutes >= 0 && minutes <= 59 ){
        this.minutes= minutes ;
    }
     else {
        System.out.println("Not a valid input");
    }
}
public void setseconds( int seconds ){
 if (seconds >= 0 && seconds <= 59){
        this.seconds= seconds ;
    }
     else {
        System.out.println("Not a valid input");
    }

}

//getters 
public int gethours(){
    return hours ;
}
public int getminutes(){
    return minutes ;
}
public int getseconds (){
    return seconds ; 
}

//display 
 public void display (){
    System.out.println("the time is:" + hours + ":" + minutes + ":" + seconds);
}

}
