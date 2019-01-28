class ExVetor5 {
	public static void main(String[] args){
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);

		vetor.remove(1);

		System.out.println(vetor);

	}
}