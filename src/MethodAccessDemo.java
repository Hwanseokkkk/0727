
public class MethodAccessDemo {
	public static void main(String[] args) {
//		int su = 345678; // 10진수
//		String result = Integer.toBinaryString(su); //toBinaryString은 static이므로 주소값이 필요없다. (10진수를 2진수로 바꾸어주는 api)
//		System.out.println(result);
//		result = Integer.toHexString(su); //16진수로 변경
//		System.out.println(result);
		
		String msg = "Hello";
		char ch =msg.charAt(1);  //charAt은 static이 아니기때문에 주소로 접근해야한다. 
		System.out.println("ch = " + ch);
	}

}
