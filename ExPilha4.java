class ExPilha4 {
	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();

		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);

		System.out.println(pilha);
		System.out.println(pilha.topo());

		pilha.desempilha();

		System.out.println(pilha);
		System.out.println(pilha.topo());
	}
}