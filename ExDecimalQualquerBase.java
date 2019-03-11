import java.util.Stack;

class ExDecimalQualquerBase {
	public static void main(String[] args) {

		imprimeResultado(4, 2);
		imprimeResultado(12542, 16);
		imprimeResultado(25, 16);
		imprimeResultado(25, 8);
	}

	public static void imprimeResultado(int numero, int base) {
		System.out.println(numero + " na base " + base + " eh " + decimalQualquerBase(numero, base));
	}

	//converter decimal para binario
	public static String decimalQualquerBase (int numero, int base) {

		if(base > 16) {
			throw new IllegalArgumentExcepction();
		}

		Stack<Integer> pilha = new Stack<>();
		String numBase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		//obtem os restos da divisão
		while(numero > 0) {
			resto = numero % base;
			pilha.push(resto);
			numero /= base; // numero = numero /base
		}

		while(!pilha.isEmpty()){
			numBase += bases.charAt(pilha.pop());  
		}

		return numBase;
	}
}