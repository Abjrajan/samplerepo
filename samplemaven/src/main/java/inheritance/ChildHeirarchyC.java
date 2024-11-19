package inheritance;

public class ChildHeirarchyC extends ParentHeirarchyA{
public void display2()
{
	System.out.println("Child C");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildHeirarchyC obj=new ChildHeirarchyC();
obj.display();
obj.display2();
	}

}
