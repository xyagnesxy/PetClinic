package pacote;

import java.util.ArrayList;

public class Cliente {
	
	String email;
	ArrayList<String> secao;
	boolean recebeDiariamente;
	
	void cadastrarSecao(String secao) {
		this.secao.add(secao);
		
	}
	void receberDiariamente() {
		this.recebeDiariamente = true;
	}
	void naoReceberDiariamente() {
		this.recebeDiariamente=false;
	}

}
