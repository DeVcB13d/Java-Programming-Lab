import java.util.*;
class Reverse 
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number : ");
        try (Scanner Sc = new Scanner (System.in)) {
            int N = Sc.nextInt();
            int Nt = N;
            int Rev = 0;
            System.out.print("Reverse : ");
            while (Nt != 0)
            {
                System.out.print(Nt%10);
                Rev = (Rev*10) + (Nt%10);
                Nt = Nt / 10;
            }
        }
    }
}