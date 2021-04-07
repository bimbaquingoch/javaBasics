public class Mathematic {

  public static void main(String[] args) {
    double x = 2.1;
    double y = 3;

    System.out.println(Math.ceil(x));
    System.out.println(Math.floor(x));
    System.out.println(Math.pow(x, y));
    System.out.println(Math.max(x, y));
    System.out.println(Math.sqrt(y));
    // area de un circulo
    System.out.println(Math.PI * Math.pow(y, 2));

    // area de una esfera
    System.out.println(4 * Math.PI * Math.pow(y, 2));

    // volumen de una esfera
    System.out.println((4 / 3) * Math.PI * Math.pow(y, 3));

  }

}
