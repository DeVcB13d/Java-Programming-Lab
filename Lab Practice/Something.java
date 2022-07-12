public class Something {
    public static void main(String[] args) {
        int[] list = new int[5];
        for(int i = 0 ; i < 5 ;i++){
            list[i] = i*2;
        }
        for (int k : list){
            System.out.println(k);
        }
    }
}
