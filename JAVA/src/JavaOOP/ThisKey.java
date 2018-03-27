package JavaOOP;

public class ThisKey 
{
	int price;
	String color;
	String shape;
	int weight;
	
	ThisKey(int price, String color, String shape)
	{
		this.price=price;
		this.color=color;
		this.shape=shape;
		
	}
	ThisKey(int price, String color, String shape, int weight)
	{
		this(price,color,shape);
		this.weight=weight;
	}
	void showkeys()
	{
		System.out.println(price+"  "+color+"  "+shape+"  "+weight);
	}

	public static void main(String[] args)
	{
//                 new ThisKey().color="REd";
//                 new ThisKey().price=10;
//                 new ThisKey().shape="CIRCLE";
                 ThisKey obj=new ThisKey(10,"RED","CIRCLE",20);
                 
                 obj.showkeys();
	}

}
