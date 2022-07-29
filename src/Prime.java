import java.util.*;

public class Prime {
    public void PrimeRange(int N){
        // Check numebers from i to N
        for(int i = 2 ; i <= N  ; i++){
            int factors = 0;
            for(int j = 2 ; j < i-1 ; j++){
                if(i % j == 0){
                    factors = factors + 1;
                    // TO exit the loop 
                    j = N + 1;
                }
            }
            if (factors == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the range to check for : ");
            int A = sc.nextInt();
            Prime P = new Prime();
            P.PrimeRange(A);
        }
    }
}
