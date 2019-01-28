class ExVetor6 {
	public static void main(String[] args){

		VetorObjetos vetor = new VetorObjetos(3);
		Contato c1 = new Contato("Contato 1", "95959-6323", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "98475-5554", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "96874-2014", "contato3@email.com");

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);

		System.out.println("Tamanho = " + vetor.tamanho());

		System.out.println(vetor);

	}
}