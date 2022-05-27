import java.util.*;

public abstract class shape {
	public static int computeArea(int a,int b) {
		return a*b;
	}
	public static int computeArea(int a){
		return a*a;
	}
	public static double computeArea(double r) {
		return (3.141)*(r)*(r);
	}
	public static void main(String args[]) {
		System.out.println(args[0]);
		String S1 = "rectangle";
		Scanner Sc = new Scanner (System.in);
		if (args[0] == S1) {
			System.out.print("Enter the 2 sides of rectangle : ");
			int A1 = Sc.nextInt();
			int B1 = Sc.nextInt();
			int Area = computeArea(A1,B1);
			System.out.println("Area of rectangle : " + Area );
		}
		else if (args[0] == "square") {
			System.out.print("Enter the side of square : ");
			int A = Sc.nextInt();
			int Area = computeArea(A);
			System.out.println("Area of Square : " + Area );
		}
		else if (args[0] == "circle") {
			System.out.print("Enter the radius : ");
			double R = Sc.nextDouble();
			double Area = computeArea(R);
			System.out.println("Area of Circle : " + Area );
		}
		else {
			System.out.println("Invalid shape");
		}
	}
}

