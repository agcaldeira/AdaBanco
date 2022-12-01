package cliente;

public class ClientePj extends Cliente {

	private String cnpj;
	
	public ClientePj() {
		super.setTaxa(0.05);
		super.setRendimento(0.03);
	}

	String getCnpj() {
		return cnpj;
	}

	void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
