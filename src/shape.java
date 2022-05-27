import java.util.*;

public abstract class Shape {
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
		int shape = Integer.parseInt(args[0]);
		try (Scanner Sc = new Scanner (System.in)) {
			if (shape == 1) {
				System.out.print("Enter the 2 sides of rectangle : ");
				int A1 = Sc.nextInt();
				int B1 = Sc.nextInt();
				int Area = computeArea(A1,B1);
				System.out.println("Area of rectangle : " + Area );
			}
			else if (shape == 2) {
				System.out.print("Enter the side of square : ");
				int A = Sc.nextInt();
				int Area = computeArea(A);
				System.out.println("Area of Square : " + Area );
			}
			else if (shape == 3) {
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
}

