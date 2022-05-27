import java.util.*;

public class OddEven {
    public static void OddEvenCheck(int A)
    {
        if (A%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    } 
    public static void main(String[] args)
    {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int N = Sc.nextInt();
            OddEvenCheck(N);
        }
    }
}
