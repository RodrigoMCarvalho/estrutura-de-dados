import java.util.Stack;

class ExTorreHanoi {
	public static void main(String[] args) {
		Stack<Integer> original = new Stack<>();
		Stack<Integer> destino = new Stack<>();
		Stack<Integer> aux = new Stack<>();

		original.push(3);
		original.push(2);
		original.push(1);

		System.out.println("Orignal: " + original);

		torreHanoi(original.size(), original, destino, aux);
	}

	public static void torreHanoi(int n,Stack<Integer> original,
				Stack<Integer> destino,Stack<Integer> aux ){
		if(n > 0) {
			torreHanoi(n-1, original, aux, destino);
			destino.push(original.pop());
			System.out.println("=========");
			System.out.println("Orignal: " + original);
			System.out.println("Destino: " + destino);
			System.out.println("Auxiliar: " + aux);

			torreHanoi(n-1, aux, destino, original);
		}

	}
}