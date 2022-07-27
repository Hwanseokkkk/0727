
public class CopyDemo3 {
   public static void main(String[] args) {
	  Product mouse = new Product();
	  mouse.price = 20000;
	  Product keyboard = mouse; //주소 복사 (Demo2와 다르게 price를 복사한게 아니라 Product를 복사한 것임)
	  
	  System.out.println("Before Change");
	  System.out.println("mouse's price = " + mouse.price);
	  System.out.println("keyboard's price = " + keyboard.price);
	  
	  mouse.price = 100000;
	  System.out.println("After Change");
	  System.out.println("mouse's price = " + mouse.price);
	  System.out.println("keyboard's price = " + keyboard.price);
  }
}
class Product{
	int price;
}
