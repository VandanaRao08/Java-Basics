package JavaOOP;

public class ConstLaptop 
{
    String color;
    int price;
    
//    ConstLaptop(String c, int p)
//    {
//    	color=c;
//    	price=p;
//    }
      ConstLaptop(){System.out.println("def constructor");}
    public void showDetail()
    {
    	System.out.println("Details are:" +color +" "+price);
    }
	public static void main(String[] args) 
	{
      // ConstLaptop obj1=new ConstLaptop("RED", 1000);
       ConstLaptop obj1=new ConstLaptop();
       obj1.color="Black";
       obj1.price=500;
       obj1.showDetail();
	}

}
