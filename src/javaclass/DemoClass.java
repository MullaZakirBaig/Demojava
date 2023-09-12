package javaclass;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this is DemocClass");

		myprogram ref = new myprogram();

		ref.mycity();
		ref.mycollage();
		System.out.println(ref.str);

}
}

class myprogram {

	String str = "this is mulla zakir";
	
	public void mycity() {
		System.out.println("Andhara Pradesh");
	}

	public void mycollage() {
		System.out.println("BSNRM Collage");
	}

}