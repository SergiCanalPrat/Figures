public class Rectangle extends Figura{

    public double costat1;
    public double costat2;
    public double area;


    public Rectangle(double costat1, double costat2){
      this.costat1 = costat1;
      this.costat2 = costat2;
    }

    public double area() {
      return costat1 * costat2;
    }
}