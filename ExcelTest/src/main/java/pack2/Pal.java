package pack2;

public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palin = "tester";
		String reverse = "";
		
		char[] arrayPalin = palin.toCharArray();
		
		System.out.println("length ...." + arrayPalin.length);
		
		for (int i = arrayPalin.length - 1; i>=0; i--) {
			reverse = reverse + arrayPalin[i];
			
		}
		
		System.out.println("reverse...." + reverse);
		
		if (palin.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
