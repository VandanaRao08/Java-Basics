package JavaOOP;

public class CountWithStatic 
{
   static int count;
   static int Marks=100;
   
 CountWithStatic()
   {
	   count++;
	   System.out.println(count);
   }
 
 public static void changemark()
 {
	 Marks=200;
 }
 
 public void showMark()
 {
	 System.out.println(Marks);
 }
	public static void main(String[] args) {
		CountWithStatic obj1=new CountWithStatic();
		
	//	CountWithStatic obj2=new CountWithStatic();
	
		//CountWithStatic obj3=new CountWithStatic();
		CountWithStatic.changemark();
		obj1.showMark();


	}

}
