import java.io.PrintStream;
import java.util.Scanner;
public class ClassCollatz {
  PrintStream out;
  Scanner in ;
  public static void main(String[] argv) {
    new ClassCollatz().start();

  }
  ClassCollatz() {
    out = new PrintStream(System.out); in = new Scanner(System.in);
  }

  void start() {
    out.println("----------------");
    out.print("|Give the value| ");
    System.out.println("\n----------------");
    out.printf("==>");

    long metav1 = in .nextInt();

    out.printf("%d", metav1);
    System.out.println("\n" + "--------");
    while (metav1 != 1) {

      Long metav2 = (metav1 % 2);

      if (metav2 == 0) {
        metav1 = (metav1 / 2);
      } else {
        metav1 = (3 * metav1 + 1);
      }
      out.printf("%4d", metav1);
      System.out.println("\n---------");
    }
  }

}
