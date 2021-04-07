import java.util.Scanner;

public class DoWhileLoop {

  public static void main(String[] args) {

    int response;

    /**
     * Descripcon: Menu de opciones
     */

    do {

      System.out.println("Selecciona el numero de la opcion deseada");
      System.out.println("1. Movies");
      System.out.println("2. Series");
      System.out.println("0. Salir");

      Scanner sc = new Scanner(System.in);
      response = sc.nextInt();

      switch (response) {
        case 0:
          System.out.println("Gracias por visitarnos");
          break;
        case 1:
          System.out.println("Movies");
          break;
        case 2:
          System.out.println("Series");
          break;
        default:
          System.out.println("Selecciona una opcion valida");
          break;

      }

      sc.close();
    } while (response != 0);

    System.out.println("Fin del programa");
  }
}
