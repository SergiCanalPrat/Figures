public static void main(String [ ] args)
{
    System.out.println("Àrea de la figura: ");
    Figura figura;

    System.out.println("Area de un circulo de radio 2: ");
    figura = new Cercle(2);
    System.out.println(figura.area());
}