
public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
	}

	public Fila(int capacidade){
		super(capacidade);
	}

	public void enfileira(T elemento) {
		//this.elementos[this.tamanho] = elemento;
		//this.tamanho++;
		this.adiciona(elemento);
	}

	public T espiar() {
		if (this.isVazio()) {
			return null;
		}

		return this.elementos[0];
	}

}