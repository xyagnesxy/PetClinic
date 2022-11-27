package pacote;

import java.util.List;

public class Vendedor {

	String email;
	Contato contato;
	
	Vendedor(String email, Contato contato){
		this.email = email;
		this.contato = contato;
	}
	
	void anuncia(Contato c, float valor, String secao, String descricao) {
		//add um anuncio na lista de anuncios
		AnuncioSimples a = new AnuncioSimples(this.email, c, valor , secao, descricao);
		
	}
	

}
