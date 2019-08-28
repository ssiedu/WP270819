public class Test {

	private int x, y;
	
	public String toString(){
		
		String res=x+","+y;
		return res;
	}
	
	public void disp(){
		System.out.println(x+","+y);
	}
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public static void main(String...args) {

		Test t1=new Test(10,20);
		Test t2=new Test(10,20);
		Test t3=t1;
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
		
	}

}
