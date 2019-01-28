class ExVetor5 {
	public static void main(String[] args){
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);

		int num = vetor.busca("B");
		vetor.remove(num);

		System.out.println(vetor);

	}
}