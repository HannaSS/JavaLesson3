package br.tr.module3h;
import java.util.Scanner; 
public class homework3h {

	public static void main (String[] argc) {
		
		double a, b, h, x, Fx = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a");
		a = sc.nextDouble();
		System.out.println("Insert b");
		b = sc.nextDouble();
		System.out.println("Insert h");
		h = sc.nextDouble();	
		for (x = a; x <= b; x += h) {
		Fx = 2*Math.tan(x/2) + 1;
		}
		System.out.println("x = "+ x +" "+ "F(x) = "+Fx);
	}
}

		
		