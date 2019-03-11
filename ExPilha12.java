import java.util.Stack;

class ExPilha12 {
	public static void main(String[] args) {
		imprimeResultado(2);
		imprimeResultado(4);
		imprimeResultado(12);
		imprimeResultado(25);
	}

	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em binario eh " + decimalBinario(numero));
	}

	//converter decimal para binario
	public static String decimalBinario(int numero) {

		Stack<Integer> pilha = new Stack<>();
		String numeroBinario = "";
		int resto;

		while(numero > 0) {
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2; // numero = numero /2
		}

		while(!pilha.isEmpty()){
			numeroBinario += pilha.pop();   //enquanto a pilha não estiver vazia, desempilha
		}

		return numeroBinario;
	}
}