public class IfStatement {

  public static void main(String[] args) {

    boolean isBluethoothEnabled = true;
    int fileSended = 3;

    if (isBluethoothEnabled) {

      fileSended++;
      System.out.println("Archivo enviado");

    } else {
      System.out.println("Por favor enciende el Bluethooth para iniciar la transferencia");
    }

    System.out.println(isBluethoothEnabled);
    System.out.println(fileSended);

  }
}
