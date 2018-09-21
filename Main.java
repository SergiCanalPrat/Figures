public class Main{

  public static void main(String [ ] args)
  {
    System.out.println("Àrea de la figura: ");
    Figura figura;
    Figura figura2;
    Figura figura3;

    System.out.println("Area de un circulo de radio 2: ");
    figura = new Cercle(2);
    System.out.println(figura.area());

    figura2 = new Rectangle(3, 4);
    System.out.println(figura2.area());

    figura3 = new Triangle(5, 2);
    System.out.println(figura3.area());
  }

}
