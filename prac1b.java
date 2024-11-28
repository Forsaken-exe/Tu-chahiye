
class A{
    void show(){
        System.out.println(" Base class ");
    }
}
class B extends A{
    void show(){
        System.out.println(" Derived Class ");
    }
}
public class prac1b {
    public static void main(String[] args) {
        
    
    B  s = new B();
    A s1 = new A();
    s. show();
    s1. show();
    }
}