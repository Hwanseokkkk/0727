
public class CopyDemo {
   public static void main(String[] args) {
	 int original = 26;
	 int target = original; //값복사 (original에 있는 값을 target에 넣으세요)
	 System.out.println("Before Change");
	 System.out.println("original's value =" + original );
	 System.out.println("target's value =" + target );
	 
     original = 36; 
	 System.out.println("After Change");
	 System.out.println("original's value =" + original );
	 System.out.println("target's value =" + target );
	 // 값복사는 복사하는 시점만 변경된다. (중간에 original 값을 바꾸어도 target과 링크가 되어있지 않으므로 target 값은 바뀌지않는다)
	 
	 
   }
}
