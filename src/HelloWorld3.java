
public class HelloWorld3 {
	  //String str = "Hello, World";  //멤버변수
	static String str = "Hello, World"; //같은 static이라는 공간에 있어서 주소값이 필요가 없다. (Static 변수 or Class 변수)
	//main이 시작하기전에 먼저 static이 올라옴
	
  public static void main(String[] args) {
	  //String str = "Hello, World"; //지역변수
	  
	  System.out.println("str = " + str);
}
}
