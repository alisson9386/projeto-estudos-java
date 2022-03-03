package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Recebe apenas quem tem o contrato da interface de PermitirAcesso e chamar o autenticar */
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
