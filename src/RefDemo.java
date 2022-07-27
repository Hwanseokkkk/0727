import java.util.Scanner;

public class RefDemo {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("이름 : ");
	  String name = sc.nextLine();
	  
	  System.out.print("나이 : ");
	  int age = sc.nextInt();
	  
	  Student hojun = new Student();
	  hojun.name = name;
	  hojun.age = age;
	  
	  System.out.println("호준의 이름 :" + hojun.name);
	  System.out.println("호준의 나이 : " + hojun.age);
	  
	  Student jimin = hojun; //호준의 주소를 지민의 주소에 주소통째로 복사하자
//	  Student jimin = new Student();
//	  jimin.name = hojun.name; //지민의 네임에 호준의 네임을 넣자 (주소복사라고함)
//	  jimin.age = hojun.age; //지민의 에이지에 호준의 에이지 26을 복사했음(값 복사)
	  
	  System.out.println("지민의 이름 :" + jimin.name);
	  System.out.println("지민의 나이 : " + jimin.age);
	  
}
}
