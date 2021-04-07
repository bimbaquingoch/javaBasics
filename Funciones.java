public class Funciones {

  public static void main(String[] args) {

    double y = 3;
    double area = circuleArea(y);
    System.out.println("Area de un circulo: " + area);
    double sphere = sphereArea(y);
    System.out.println("Area de una esfera: " + sphere);
    double vsphere = sphereVolumen(y);
    System.out.println("Volumen de una esfera: " + vsphere);

    System.out.println("PESOS A DOLARES: " + converToDolar(1000, "COP"));

  }

  public static double circuleArea(double radio) {
    /**
     * Descripcion: Calcula el area de un circulo
     * 
     * @param radio Utiliza el valor del rario y este es de tipo double
     * @return devuelve el area del circulo
     */
    return Math.PI * Math.pow(radio, 2);

  }

  public static double sphereArea(double radio) {
    /**
     * Descripcion:Calcula el area de una esfera
     * 
     * @param radio Recibe el valor del dadio como type double
     * @return devuelve el area de la esfera
     */

    return 4 * Math.PI * Math.pow(radio, 2);

  }

  public static double sphereVolumen(double radio) {
    /**
     * Descripcion: Calcula el columen de una esfera
     * 
     * @param radio Es el valor del radio como double
     * @return devuelve el volumen de la esfera
     */

    return (4 / 3) * Math.PI * Math.pow(radio, 3);

  }

  /**
   * Descripcion: Funcion, que especificando su moneda convierte una cantidad de
   * dinero en dolares
   * 
   * @param quality  Cantidad de dinero
   * @param currency Tipo de moneda, SOlo acepta MXM o COP
   * @return quality Devuelve la cantidad en dolares
   * 
   */
  public static double converToDolar(double quality, String currency) {

    switch (currency) {
      case "MXM":
        quality = quality * 0.052;
        break;
      case "COP":
        quality *= 0.00031;
        break;

      default:
        System.out.println("No conozco esa divisa");
        break;
    }

    return quality;

  }

}
