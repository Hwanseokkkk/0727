//멤버변수(인스턴스 변수)
public class HelloWorld2 {
  public static void main(String[] args) {
	  Test t = new Test();
	 System.out.println("str = " + t.str);
  }
}

class Test{
	String str = "Hello, World";
}