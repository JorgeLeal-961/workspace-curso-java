package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente alguem que tenha o contrato da interface permitir acesso e chamar o autenticado*/
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
}
