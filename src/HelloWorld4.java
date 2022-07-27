
public class HelloWorld4 {
  public static void main(String[] args) {
	 System.out.println("msg = " + Demo.msg); //msg는 Demo라는 클래스에 있다 //클래스 변수
	 //out도 api를 확인해보면 static변수이다 결론 : 주소값이 필요없다.
   }
}

class Demo{
	static String msg = "Hello, World";
}