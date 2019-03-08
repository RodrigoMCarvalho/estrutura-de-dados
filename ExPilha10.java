//Palíndromo
class ExPilha10 {
	public static void main(String[] args) {

		imprimeResultado("Teste");
		imprimeResultado("adcda");
		imprimeResultado("reviver");
	
	}

	public static void imprimeResultado(String palavra){
		System.out.println(palavra + " eh palindroma? " + testePalindromo(palavra));
	}

	public static boolean testePalindromo(String palavra){

		Pilha<Character> pilha = new Pilha<Character>();

		for(int i = 0; i < palavra.length(); i++){
			pilha.empilha(palavra.charAt(i));
		}

		String palavraInversa = "";
		while(!pilha.isVazio()){
			palavraInversa += pilha.desempilha();
		}

		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}
}