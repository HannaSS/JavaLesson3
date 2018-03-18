package by.tr.module3;
import java.util.Scanner; 
public class homework3 {
		public static void main (String[] argc) {	
			@SuppressWarnings("resource")
			Scanner sc = new Scanner (System.in);
			double x = 0; 
		    double Fx;
			System.out.print("Insert x: ");
		    if(sc.hasNextDouble());
		       x = sc.nextDouble();
		    if (x<=-3) 
		    	Fx = 9;
		    else Fx = 1/(Math.pow(x,3)+1);
		    System.out.println("F(x)="+Fx);
		    }
		}
