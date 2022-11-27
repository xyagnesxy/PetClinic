package pacote;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato c = new Contato("fulano", "1234-4321", "produto massa");
		Vendedor v = new Vendedor("email.com", c);
		Anuncio a = new AnuncioSimples(v.email, c, 123, "computadores", "descricao massa");
		
		//classificados
		List<Anuncio> anuncios;
		List<Cliente> clientes;
		List<Vendedor> vendedores;
		
		Classificados classificados = new Classificados();
		classificados.cadastraVendedor(v);
		classificados.cadastrarAnuncio(a);
		classificados.mostrarAnuncios();

	}

}
