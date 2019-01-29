class ExVetor7 {
	public static void main(String[] args){

		//VetorObjetos vetor = new VetorObjetos(3);
		Lista<Contato> vetor = new Lista<Contato>(3);

		Contato c1 = new Contato("Contato 1", "95959-6323", "contato1@email.com");

		//vetor.adiciona(1);
		//vetor.adiciona("Elemento");
		vetor.adiciona(c1);

		System.out.println("Tamanho = " + vetor.tamanho());

		System.out.println(vetor);

	}
}