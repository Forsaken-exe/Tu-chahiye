class prac1a{
    int a,b;    // Instance Variables

// Constructor overloading 
public prac1a(){
    this.a=0;
    this.b=0;
    System.out.println(" Default Constructor : a  = "+a+" b = "+b);

} 
public prac1a(int a){
    this.a=0;
    this.b=0;
    System.out.println(" Single Parameter Constructor : a  = "+a+" b = "+b);

} 
public prac1a(int a,int b ){
    this.a=0;
    this.b=0;
    System.out.println(" Two  Parameter Constructor : a  = "+a+" b = "+b);

} 

// Method Overloading
public void display(){
    System.out.println(" Display with no Parameter  : a  = "+a+" b = "+b);
}

public void display(int a){
    System.out.println(" Display with one Parameter  : a  = "+a+" b = "+b);
}
public void display(int a ,int b){
    System.out.println(" Display with two Parameter  : a  = "+a+" b = "+b);
}

//Static method

public static void staticMethod()
{
    System.out.println("This is Static Method ");
}

public static void main(String[] args){
    // Constructor Overloading 
    prac1a obj1 = new prac1a();
    prac1a obj2 = new prac1a(5);
    prac1a obj3 = new prac1a(5,10);

    //  Method Overloading examples 
    obj1.display();
    obj2.display(7);
    obj3.display(7,14);

    //Static method example
    prac1a.staticMethod();
}
}