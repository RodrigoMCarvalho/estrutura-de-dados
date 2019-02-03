import java.util.ArrayList;

class Ex2 {
	public static void main(String[] args){

		ArrayList<String> arrayList = new ArrayList<String>(5);
		Lista<String> lista = new Lista<String>(5);

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");

		System.out.println(arrayList.lastIndexOf("C"));
		System.out.println(arrayList.lastIndexOf("D"));

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");

		System.out.println(lista.ultimoIndice("C"));
		System.out.println(lista.ultimoIndice("D"));
	}
}