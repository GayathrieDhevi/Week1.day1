package jan22.day1;

public class LearnAccessModifier {
	public static void main(String[] args) {
		//create object
		LearnAccessModifier obj = new LearnAccessModifier();
		int a2 = obj.a;
		obj.method(1);
		
		//Access Private number
		int b2 = obj.b;
		obj.method(2);
		
		//Access Default number
		int c2 = obj.c;
		obj.method(3);
		
		public int a = 6; //public variable
		private int b = 7; //private variable
		int c = 8; //default variable
		
		//public method
		
		public void method() {
			System.out.println("TestLeaf");
		}
		
		//private method
		
		private int method() {
			int pin = 1234;
		}
		//default method
		
		
	}

}
