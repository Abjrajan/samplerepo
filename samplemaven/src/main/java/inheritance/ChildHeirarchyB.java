package inheritance;

public class ChildHeirarchyB extends ParentHeirarchyA {
	public void display1() {
		System.out.println("Child B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildHeirarchyB obj=new ChildHeirarchyB();
obj.display();
obj.display1();
	}

}
