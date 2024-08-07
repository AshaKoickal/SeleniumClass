package accessmodifier;

public class AccessModifiers {
int a =10;
public int b=20;
private int c=30;
protected int d=40;

public void  publicShow()
{
	System.out.println("Public Method");
}
void defaultShow()
{
	System.out.println("Default Method");
}
private void privateShow()
{
	System.out.println("Private Method");
}
protected void protectedShow()
{
	System.out.println("Protected Method");
}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj=new AccessModifiers();
		obj.defaultShow();
		obj.privateShow();
		obj.protectedShow();
		obj.publicShow();

	}*/

}
