public class SwitchStatement {

  public static void main(String[] args) {

    String colorModeSelected = "Dark";

    switch (colorModeSelected) {
      case "Light":
        System.out.println("Seleccionaste el light mode");
        break;
      case "Night":
        System.out.println("Seleccionaste night mode");
        break;
      case "Blue-Mode":
        System.out.println("Seleccionaste blue dark mode");
        break;
      case "Dark":
        System.out.println("Seleccionaste dark mode");
        break;

      default:
        System.out.println("Lo siento esa opcion no existe");
        break;
    }

  }
}
