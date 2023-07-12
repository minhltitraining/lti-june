public class class1 {
	
	public static void main(String[] args) {
		int i = 22;
		int j = 14000;
		class1 class1 = new class1();
		boolean k = class1.Method1(i);
		boolean l = class1.Method2(j);
		
		if (k && l) {
			System.out.println("Is a new employee");
		} else {
			System.out.println("Is not a new employee");
		}
	}
	
	public boolean Method1(int i) {
		return (i > 20 && i < 30);
	}
	
	public boolean Method2 (int j) {
		return (j >=14000 && j < 20000);
	}
}
