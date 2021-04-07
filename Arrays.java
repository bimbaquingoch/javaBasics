public class Arrays {

  public static void main(String[] args) {

    // el nombre de arreglos siempre puede ir en plural
    String[] androidVersions = new String[17];
    String days[] = new String[7];
    String[][] cities = new String[4][2];

    // este tipo de arrelgos es mejor tenerlos en una base de datos
    // 2 filas 2 columnas y 2 paginas o 2 niveles porque es un arreglo en 3D
    int[][][] numbers = new int[2][2][2];
    int[][][][] numbres4 = new int[2][2][2][2];

    androidVersions[0] = "Apple Pie";
    androidVersions[1] = "Banana Bread";
    androidVersions[2] = "Cupcake";
    androidVersions[3] = "Donut";

    for (int i = 0; i <= androidVersions.length - 1; i++) {
      System.out.println(androidVersions[i]);
    }

    for (String androidVersion : androidVersions) {

      System.out.println(androidVersion + " con foreach");

    }

    for (int i = 0; i < days.length; i++) {

      System.out.println(days[i] + " DIAS");

    }

    System.out.println("\n");

    cities[0][0] = "Colombia";
    cities[0][1] = "Medellin";
    cities[1][0] = "Colombia";
    cities[1][1] = "Bogota";
    cities[2][0] = "Mexico";
    cities[2][1] = "Guadalajara";
    cities[3][0] = "Mexico";
    cities[3][1] = "CDMX";

    for (int i = 0; i < cities.length; i++) {

      for (int j = 0; j < cities[i].length; j++) {

        System.out.println(cities[i][j]);

      }

    }

    for (String[] pair : cities) {

      for (String name : pair) {

        System.out.println(name + " con foreach");

      }

    }

    String animals[][][][] = new String[2][3][2][2];
    animals[1][0][0][1] = "Monkey";
    System.out.println("\n");
    // System.out.println(animals[1][0][0][1]);

    for (int i = 0; i <= 1; i++) {
      for (int j = 0; j <= 0; j++) {
        for (int j2 = 0; j2 <= 0; j2++) {
          for (int k = 0; k <= 1; k++) {

            System.out.println(animals[i][j][j2][k]);

          }

        }

      }

    }

  }
}
