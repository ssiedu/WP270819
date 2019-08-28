
public class Student {
	
	private int rno;
	private String name;
	private int marks;
	private static int totalPass, totalFail;
	
	
	
	
	
	public int getRno() {
		return rno;
	}



	public void setRno(int rno) {
		this.rno = rno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public Student() {
		super();
	}



	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}



	public Student(int rno, String name, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}



	public static void showAvg(Student...tmp){
	
		int total=0;
		
		for(Student s:tmp){
			total=total+s.marks;
		}
		System.out.println("AVG MARKS : "+(total/tmp.length));
	}
	
	
	
	public static void showData(Student tmp){
		System.out.println(tmp.rno+","+tmp.name+","+tmp.marks);
	}
	
	
	public static void showOverallResult(){
		System.out.println("TOTAL NO OF PASSED CANDIDATES : "+totalPass);
		System.out.println("TOTAL NO OF FAILED CANDIDATES : "+totalFail);
		System.out.println("_________________________________________________________");
	}
	
	public void result(){
		if(marks>=33){
			System.out.println(rno+" is passed with "+marks);
			totalPass++;
		}else{
			System.out.println(rno+" is failed with "+marks);
			totalFail++;
		}
		System.out.println("_________________________________________________________");
	}
	
	public void setData(int rno, String name, int marks){
		this.rno=rno; 
		this.name=name;
		this.marks=marks;
	}
	
	public static void main(String args[]){
		Student s1=new Student(111,"AAA",50);
		Student s2=new Student(112,"BBB",60);
		Student s3=new Student(113,"CCC",70);
		Student s4=new Student(114,"DDD");
		
		//s1.setData(111,"AAA",50);
		//s2.setData(112,"BBB",60);
		//s3.setData(113,"CCC",70);
		//s4.setData(114,"DDD",30);
		
		Student.showData(s1);
		Student.showData(s2);
		Student.showData(s3);
		Student.showData(s4);
		
		//Student.showAvg(s1, s2);
		//Student.showAvg(s1, s2, s3);
		//Student.showAvg(s1, s2, s3, s4);
		
		//s1.showData();
		//s2.showData();
		/*s1.result();
		s2.result();
		s3.result();
		s4.result();
		
		Student.showOverallResult();*/
		
		
		
	}
}
