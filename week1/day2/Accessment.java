package week1.day2;

public class Accessment {
	static int i = 'a';//This will give ASCII VALUE 97 for letter 'a'
	char c = 65;   // This will give ASCII Character 'A' for value 65
	/*
	 * "this" 'KEYWORD' used to use static variable and call static method from non
	 * static method inside same Class
	 */	public void print() {
		 System.out.println("ASCII: "+c);
		System.out.println("ASCII: "+this.i);
		int num	=	this.mod();
		int mul	=	this.mul();
	}

	public static int mod() {
		int i = 5, j = 2;//local variable
		System.out.println("MOD: "+ i % j );
		return i % j;
	}
	
	public static int mul() {
		String xz = "abc";
		String y = "abc";
		xz.concat(y);
		System.out.println("Concat: "+xz);
		
		int x = 10*20-20;

		System.out.println("MUL: "+x);
		return x;
	}

	public static void main(String[] args) {
		/*
		 * int odd = 1; if (odd) { System.out.println("odd"); } else {
		 * System.out.println("even"); }
		 */
		//int x = 10*20-20;
		//System.out.println("MUL: "+x);
		Accessment t = new Accessment();
		t.print();

	}
}
