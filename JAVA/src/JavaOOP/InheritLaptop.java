package JavaOOP;
class Laptops
{
  // String brand;
   int speed;
   String color;
   
   public void ShowSpeed()
   {
	   System.out.println("Speed of this laptop is:" + " " +speed);
   }
}

class LaptopColor extends Laptops
{

   public void ShowColor()
   {
        System.out.println("Color of laptop is:" +" "+color);	
   }
}

class LaptopBrand extends LaptopColor
{
	String brand;
    public void ShowBrand()
    {
    	System.out.println("The brand of laptop is:" +" "+brand);
    }
}

public class InheritLaptop {

	public static void main(String[] args)
	{
       LaptopBrand obj1=new LaptopBrand();
       obj1.brand="APPLE";
       obj1.color="GREY";
       obj1.speed=100;
       obj1.ShowBrand();
       obj1.ShowColor();
       obj1.ShowSpeed();
	}
}


