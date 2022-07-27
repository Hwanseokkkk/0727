import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Employee hw = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사원번호 : "  );
		hw.empno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원이름 : "  );
		hw.ename = sc.nextLine();
		
		System.out.print("사원나이 : "  );
		hw.birthYear = sc.nextInt();
		
		System.out.print("사원월급 : "  );
		hw.salary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원이메일 : "  );
		hw.email = sc.nextLine();
		//sc.nextLine();    //정수 뒤에 String이 올때는 엔터를 정수 다음으로(이메일 밑에 엔터를 넣으면 출력이 제대로안됨)
		
		System.out.print("사원전화번호 : "  );
		hw.tel = sc.nextLine();
		
		System.out.print("정규직 : "  );
		hw.flag = sc.nextBoolean();
		
    System.out.println("<<사원정보>>");
	System.out.println("사원번호 : " + hw.empno);
	System.out.println("사원이름 : " + hw.ename);
	System.out.println("사원나이 : " + (2022-hw.birthYear + 1));
	System.out.println("사원월급 : " + hw.salary + "만원");
	System.out.println("사원이메일 : " + hw.email);
	System.out.println("사원전화번호 : " + hw.tel);
	System.out.println("정규직여부 : " + hw.flag);
		
	}
}
