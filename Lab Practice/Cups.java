public class Cups{
    Cup Cup1;
    Cup Cup2;
    {
        Cup1 = new Cup(1);
        Cup2 = new Cup(2);  
        System.out.println("Cup1 and cup2 initialised");
    }
    Cups(){
        System.out.println("Cups()");
    }
    Cups(int i){
        System.out.println("Cups(int)");
    }
    public static void main(String[] args){
        System.out.println("Inside main");
        new Cups();
        System.out.println("new Cups() completed");
        new Cups(1);
        System.out.println("new Cups(1) completed");
    }
}