import java.util.Scanner;

public class Hw02 {
  public static final double G = 6.674e-11;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("This program calculates universal gravitation force between two masses");

    System.out.print("Enter mass 1 (m1) : ");
    double m1 = input.nextDouble();

    System.out.print("Enter mass 2 (m2) : ");
    double m2 = input.nextDouble();

    System.out.print("Enter distance between the two masses (r) : ");
    double r = input.nextDouble();

    double r2 = Math.pow(r, 2);
    double F = G * (m1 * m2) / r2;

    System.out.printf("The universal gravitation force (F) between m1 and m2 is %.3f\n", F);

    input.close();
  }
}
