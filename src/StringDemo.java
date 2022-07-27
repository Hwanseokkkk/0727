//String은 주소값이다.
public class StringDemo {
   public static void main(String[] args) {
//	  String name; //선언, declaration (여기에는 값이아닌 주소만 넣겠다)
//	    name = "한지민"; //할당, Assignment (한지민이라는 주소를 name이라는 주소변수에 넣으세요)
	   //(name에는 한지민이 들어가는게 아니라 한지민이라는 절대주소가 들어가게된다.)
//	    
	    // name = "한지민"; //초기화, initialization (위에 2코드를 한번에 하는 방식)
//	    
//	    System.out.printf("이름 = %s\n", name);
	   
	   String name = new String("한지민"); //생성자,Constructors,  
//	   System.out.printf("이름 = %s\n", name);
	   
	   Student jimin; //선언(지민이라는 변수를 사용하겠다. 지민은 참조이며 값이 아닌 주소입니다.)
	   jimin = new Student(); //할당
	   //스택영역에는 jimin, 힙 영역에는 Student
	 // jimin.hakbun = "2022-001";
	  jimin.name = "한지민";
      jimin.age =26;
     //System.out.printf("%s, %s, %d\n", jimin.hakbun, jimin.name, jimin.age);
      
      Student chulsu = new Student();
      chulsu.name = "김철수";
      chulsu.age = 36;
      
      Student younghee = new Student();
      younghee.name = "이영희";
      younghee.age = 46;
      
      System.out.println("한지민 학생 정보");
      System.out.printf("이름 = %s, 나이 = %d\n", jimin.name, jimin.age);
      
      System.out.println("김철수 학생 정보");
      System.out.printf("이름 = %s, 나이 = %d\n", chulsu.name, chulsu.age);
      
      System.out.println("이영희 학생 정보");
      System.out.printf("이름 = %s, 나이 = %d\n", younghee.name, younghee.age);
   }
}
