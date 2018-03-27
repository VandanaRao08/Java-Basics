package JavaOOP;

public class LaptopSpeed implements InterfLaptop, interfTouchScreen
{
	String color;
	int price;
	String brand;
	int speed;
	Boolean touchscreen;

	@Override
	public void showcolor() {
		System.out.println("Color is:" +color);
		
	}

	@Override
	public void showprice() {
        System.out.println("price is :" +price);		
	}

	@Override
	public void showbrand() 
	{
        System.out.println("Brand is:" +brand);		
	}
	
   public void showSpeed()
   {
	    System.out.println("Speed is:" +speed);
   }

   @Override
   public void showScreen() 
   {
    System.out.println("TouchScree Availability:" +touchscreen);	
   }
}
