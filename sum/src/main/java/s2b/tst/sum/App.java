package s2b.tst.sum;

import java.util.Scanner;

/**
 * Sum!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("A:\n");
		double a = input.nextDouble();
		System.out.printf("B:\n");
		double b = input.nextDouble();
		input.close();
		double r = Sum.sum(a, b);
		System.out.printf("A= %f\n", a);
		System.out.printf("B= %f\n", b);
		System.out.printf("SUM= %f\n", r);
	}
}
