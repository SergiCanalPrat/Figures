public class Triangle extends   Figura{

    public double costat1;
    public double costat2;
    public double area;

    public Triangle(double c1, double c2){
        this.costat1 = c1;
        this.costat2= c2;
    }
    public double area(){
        return costat1*costat2/2;
    }
}