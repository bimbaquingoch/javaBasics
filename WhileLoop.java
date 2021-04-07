public class WhileLoop {

  static boolean isTurnLight = false;

  public static void main(String[] args) {

    turnOnOffLight();

    int i = 1;
    while (isTurnLight && i <= 10) {

      printSOS();
      i++;

    }

  }

  public static void printSOS() {
    System.out.println(". . . _ _ _ . . .");
  }

  public static boolean turnOnOffLight() {

    // operador terneario

    isTurnLight = (isTurnLight) ? false : true;

    return isTurnLight;

  }

}
