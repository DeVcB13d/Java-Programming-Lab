import java.util.*;
//class to add 2 numbers

class Add{
    //Main function
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt(); 
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Sum  =  " + sum);
        }
    }
}