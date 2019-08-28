
public class B extends A{
	public B(){
		super(10);
		System.out.println("B-0");
	}
	public B(int p){
		super(1,2);
		System.out.println("B-1");
	}
	public B(int p, int q){
		super(1);
		System.out.println("B-2");
	}
	public static void main(String args[]){
		
		B ob=new B(10,20);
	}
}
