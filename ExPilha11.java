class ExPilha11 {
	public static void main(String[] args) {

		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("A + B + C - D)");
		imprimeResultado("{[()]}[]{()}");
		imprimeResultado("{[(]}[]{()}");
	}

	public static void imprimeResultado(String expressao){
		System.out.println(expressao + " esta balanceada? " + verificaSimbolosBalanceados(expressao));
	}

	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolosBalanceados(String expressao){

		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;

		while(index < expressao.length()){
			simbolo = expressao.charAt(index);

			if(ABRE.indexOf(simbolo) > -1){
				pilha.empilha(simbolo);

			} else if(FECHA.indexOf(simbolo) > -1){

				if(pilha.isVazio()){
					return false;
				} else {
					topo = pilha.desempilha();

					if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) { //se o indice que abre é diferente do indice que fecha
						return false; // está desbalanceada
					}
				}
			}
			index++;
		}
		return true;
	}
}










