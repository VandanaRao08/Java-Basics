package JavaOOP;
public class Laptop 
{
	String color;
    int price;
	String brand;
	
	public void ShowDetails()
	{
		System.out.println(brand + " laptop with color " + color + " is for $" +price + " in price ");
	}

	public static void main(String[] args) 
	{
        Laptop obj=new Laptop();
        obj.color="GREY";
        obj.price=1000;
        obj.brand="APPLE";
        obj.ShowDetails();
        
        Laptop obj1=new Laptop();
        obj1.color="RED";
        obj1.price=600;
        obj1.brand="ACER";
        obj1.ShowDetails();
	}

}

