
public class student {
	// Attributes
	private int RollNo;
	private String Name;
	private float Sub1 ;
	private float Sub2 ;
	private float Sub3 ;
	private float Total ;
	
	public void calculateTotal() {
		if ((this.Sub1 >= 50 && this.Sub2 >= 50) && this.Sub3 >= 50) {
			this.Total = Sub1 + Sub2 + Sub3;
		}
		else {
			this.Total = 0;
		}
	}
	public int getRollNo() {	
		return this.RollNo ;
	}
	public String getName(){
		return this.Name ;
	}
	public float getTotal() {
		return this.Total ;
	}
	public void set_RollNo(int Rno) {
		this.RollNo = Rno;
	}
	public void set_Name(String Name) {
		this.Name = Name;
	}
	public void set_Marks(float M1,float M2,float M3) {
		if (0<=M1 && 100>=M1) {
			this.Sub1 = M1;
		}
		else {
			System.out.println("Invalid Marks subject 1");
		}
		if (0<=M2 && 100>=M2) {
			this.Sub2 = M2;
		}
		else {
			System.out.println("Invalid Marks subject 2");
		}
		if (0<=M3 && 100>=M3) {
			this.Sub2 = M3;
		}
		else {
			System.out.println("Invalid Marks subject 3");
		}
	}
	
	// Constructor for the class
	public student(int RollNo,String Name,float M1,float M2,float M3) {
		this.set_RollNo(RollNo);
		this.set_Name(Name);
		this.set_Marks(M1, M2, M3);
		this.calculateTotal();
		this.Total = M1 + M2 + M3;
	}
	public student() {}
	
	public void display() {
		System.out.println("\nDetails");
		System.out.print("Roll No : ");
		System.out.println(this.getRollNo());
		System.out.print("\nName :");
		System.out.println(this.getName());
		System.out.print("\nTotal  :");
		System.out.println(this.getTotal());
		System.out.println("\n");
		
	}
	
	// Main
	public static void main(String args[]){ 
		int Rnos[] = {1,2,3};
		String Names[] = {"dev","raju","sam"};
		float[][] Marks = {{100,100,100},{30,30,37},{90,60,66}};
		int Datas = 3;
		student Slist[] = new student[3];
		for(int i = 0 ; i < Datas ; i++ ){
			Slist[i] = new student(Rnos[i],Names[i],Marks[i][0],Marks[i][1],Marks[i][2]);
			Slist[i].display();
		}
		
	}
		
	
	
}
