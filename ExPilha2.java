class ExPilha2 {
	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.isVazio());

		for(int i = 1; i <= 10; i++) {
			pilha.empilha(i);
		}
		System.out.println(pilha);

		System.out.println(pilha.isVazio());
	}
}