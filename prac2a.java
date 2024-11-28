abstract class shape{
    public abstract double area();
}
class circle extends shape{
    private double raduis;
    public circle(double raduis){
        this.raduis=raduis;
    }
public double area(){
    return Math.PI*raduis*raduis;
}
}
class prac2a{
    public static void main(String args[]){
        circle c = new circle(10.0);
        System.out.println("Circle area is  "+c.area());

    }
}