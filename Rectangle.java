public class Rectangle extends   Figura{

    public double costat1;
    public double costat2;
    public double area;

    public double area(){
        area = costat1*costat2;
        return area;
    }
}