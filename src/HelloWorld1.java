//8가지중 1번째
public class HelloWorld1 {
	String str = "Hello, World"; //str 은 멤버 ex)아파트 방안 //멤버변수는 반드시 주소로 접근해야한다.
	
	
   public static void main(String[] args) { //main은 공유 ex)아파트 놀이터
	  //Local Variable
	   //String str = "Hello, World"; //지역변수
	   //String str; //지역변수는 초기화를 하지않으면 에러가 발생한다.(유일한 단점)
	   HelloWorld1 hw = new HelloWorld1();
	   
	   System.out.println("str = " + hw.str);  //main이라는 블록이 생성될때 str은 만들어지고 main이라는 블록이 끝날때 사라진다.
	   
	   
	   //int age; //지역변수
   }
}
