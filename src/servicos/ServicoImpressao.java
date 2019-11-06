package servicos;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao <Tipo> {
	
	private List<Tipo> lista = new ArrayList<>();
	
public void adicinarValor(Tipo valor) {
	lista.add(valor);
}
	
public void removerValor(Tipo valor) {
	lista.remove(valor);
}

public Tipo PrimeiroValor() {
	if (lista.isEmpty()) {
		throw new IllegalStateException("A lista está vazia");
	}
	return lista.get(0);
}

public Tipo PenultimoValor() {
	if (lista.isEmpty()) {
		throw new IllegalStateException("A lista está vazia");
	}
	return lista.get(lista.size()-2);
}


public void imprimir() {
	System.out.print("[");
	if (!lista.isEmpty()){
		System.out.print(lista.get(0));
	}
	for(int i=1 ; i<lista.size(); i++ ) {
		System.out.print("," + lista.get(i));
	}
	System.out.println("]");
}

}
