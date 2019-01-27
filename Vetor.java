import java.util.Arrays;

class Vetor {

	private String[] elementos;
	int tamanho;

	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
	}

	/*
	public void adiciona(String elemento) { //adiciona no primeiro campo vazio
		for(int i=0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/

	public boolean adiciona(String elemento){

		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}

	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida!");
		} 
			return this.elementos[posicao];
	}

	public int busca(String elemento) {
		for(int i = 0; i < this.tamanho; i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public int tamanho(){
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i = 0; i < this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
		//return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}
}