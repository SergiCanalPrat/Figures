public class Figura {
    public double area;
    public String figura;
    Rectangle rectangle = new Rectangle();
    Quadrat quadrat = new Quadrat();
    Cercle cercle = new Cercle();

    public double CalcularArea (String figura, double costat1, double costat2, double radi){
        if (figura == "rectangle"){
            area = Rectangle.area(costat1, costat2);
        }
        if (figura == "quadrat"){
            area = Quadrat.area(costat);
        }
        if (figura == "cercle"){
            area = Cercle.area(radi);
        }
        if (figura == "triangle"){
            area = Triangle.area(costat1, costat2);
        }
    }
}