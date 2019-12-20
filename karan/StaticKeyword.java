import java.io.*;

class StaticKeyword{
	int id;
	String name;
	static String CLG="BEC";
	static1(int i,String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println("Name : "+name+"\t||\tID : "+id+"\t||\tCollege Name : "+CLG);
	}
	public static void main(String[] args){
		static1 oj1=new static1(001,"Kaiser");
		static1 oj2=new static1(002,"Karan");
		static1 oj3=new static1(003,"Sundar");
		oj1.display();
		oj2.display();
		oj3.display();
	}
}
