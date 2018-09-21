public class Cercle extends Figura{

  public double radi;

  public Cercle(double radi) {
    this.radi = radi;
  }

  public double area(){
            return Math.PI*radi*radi;
        }
    }
