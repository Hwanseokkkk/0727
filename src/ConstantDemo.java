
public class ConstantDemo {
   public static void main(String[] args) {
	  final int age = 26;
	  System.out.println("age = " + age);
	  //age = 36;  //final을 사용하였는데 값을 바꾸면 에러가 발생함.
	  System.out.println("age = " + age);
}
}
