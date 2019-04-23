public class Av1 {

	private static void trocaB(String a, String b) {
		String tmp = a;
		a = b;
		b = tmp;
	}
	
	private static void trocaC(int[] array, String a) {
		for (int x = 0; x < array.length; x++) {
			array[x] = array[x] * Integer.valueOf(a);
			System.out.print(array[x] + " ");
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		String a = "2", b = "5";
		trocaB(a, b);
		trocaC(array, a);
		//System.out.print(a + " " + b + " ");
		/*for (int x = 0; x < array.length; x++) {
			System.out.print(array[x] + " ");
		}*/
	}

}