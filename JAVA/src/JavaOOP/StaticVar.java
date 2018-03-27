package JavaOOP;

public class StaticVar 
{
	int a;
	static int b=20;
	int c;
	
	
	public void showVar()
	{
		System.out.println(a+b+c);
	}
	
	public void showVarsMult()
	{
		System.out.println(a*b);
	}


	public static void main(String[] args) 
	        {
               StaticVar obj1=new StaticVar();
               obj1.a=10;
               obj1.c=30;
               obj1.showVar();
               
               
               StaticVar obj2=new StaticVar();
               obj2.a=40;
               obj2.showVarsMult();
            		   
	
            }

}
