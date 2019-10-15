package Negative_testScripts;

public class FinalClass_inheritance {
	public static void main(String[] args) {

		child ch = new child();
		ch.getAddress(" 19,nanda gokula jp nagar");
		ch.getName();
		ch.getAge();//child class and parent class  method is accessed since we have given super keyword
	}
}

class parent {
	final int age = 20;
	String address="madhuban nagpur";
	private String name = "Radhika";

	final public void getName() {
		System.out.print(name);
	}

	public void getAge() {
		System.out.print(age);
	}
}

class child extends parent {
	int age=30;
	String address;
	public void getAddress(String address) {
		System.out.print( address);

		System.out.print("\n" + super.address);
	}
	final public void getAge() {
		System.out.print("\n" +age);
		System.out.print("\n" + super.age);

	}
}
