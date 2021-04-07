public class Casting {

  public static void main(String[] args) {

    char c = 'z';
    int cI = (int) c;
    System.out.println("c a entero: " + cI);

    int i = 250;
    long iL = (long) i;
    System.out.println("de entero a long: " + iL);
    short ilS = (short) iL;
    System.out.println("de long a short: " + ilS);

    double d = 301.607;
    long dL = (long) d;
    System.out.println("de souble a long: " + dL);

    int j = 100;
    float jf = (float) j;
    jf += 5000.66;
    System.out.println("de entero a flotante: " + jf);

    int k = 737;
    k *= 100;
    byte kb = (byte) k;
    System.out.println("de entero a byte: " + kb);

  }

}
