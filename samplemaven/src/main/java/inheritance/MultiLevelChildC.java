package inheritance;

public class MultiLevelChildC extends MultiLevelParentB
{
public void display3()
{
	System.out.println("Parent C");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MultiLevelChildC obj=new MultiLevelChildC();
obj.display1();
obj.display2();
obj.display3(); 
	}

}
