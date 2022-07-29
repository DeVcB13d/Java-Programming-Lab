import java.util.* ;

public class Largest {
    public int[] Array;
    public int get_3rd_Largest(){
        int l1 = this.Array[0];
        int l2 = this.Array[0];
        int l3 = this.Array[0];
        for(int el : Array){
            if (el >= l1){
                l3 = l2 ;
                l2 = l1 ;
                l1 = el ; 
            }
            // between l2 and l1
            else if (el >= l2 && el < l1 ){
                l3 = l2;
                l2 = el;
            }
            // between l3 and l2
            else if (el < l2){
                l3 = el ;
            }
        }
        return l3;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Array Length : ");
            int len = sc.nextInt();
            Largest L1 = new Largest();
            L1.Array = new int[len];
            System.out.println("Enter the Array");
            for(int k = 0 ; k < len ; k++)
            {
                L1.Array[k] = sc.nextInt();
            }
            int Large3 = L1.get_3rd_Largest();
            System.out.println("The 3rd largest number is : " + Large3);
        }
    }
}
