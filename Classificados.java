package pacote;

import java.util.ArrayList;
import java.util.List;

public class Classificados {
	List<Vendedor> vendedores = new ArrayList();
	List<Cliente> clientes = new ArrayList();
	List<Anuncio> anuncios = new ArrayList();
	
	Classificados(){
		
	}
	void cadastraVendedor(Vendedor v) {
		this.vendedores.add(v);
	}
	void cadastrarAnuncio(Anuncio a) {
		this.anuncios.add(a);
	}
	void mostrarAnuncios() {
		Anuncio a =anuncios.get(0); 
		System.out.println("valor: "+a.valor+"\ncontato: "+a.contato.toString()+"\nseção: "+a.secao);
		
	}
}
