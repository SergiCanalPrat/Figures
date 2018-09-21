public class Figura {
    public double area;
    public String figura;
    Rectangle rectangle = new Rectangle();
    Quadrat quadrat = new Quadrat();
    Cercle cercle = new Cercle();
    Triangle triangle = new Triangle();

    public double CalcularArea (String figura, double costat1, double costat2, double radi){
        if (figura == "rectangle"){
            area = rectangle.area();
        }
        if (figura == "quadrat"){
            area = quadrat.area();
        }
        if (figura == "cercle"){
            area = cercle.area();
        }
        if (figura == "triangle"){
            area = triangle.area();
        }
    }
}