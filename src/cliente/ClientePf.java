package cliente;

public class ClientePf extends Cliente {
	
	public ClientePf() {
		super.setTaxa(0.0);
		super.setRendimento(0.01);
	}
	
	private String cpf;
	

	String getCpf() {
		return cpf;
	}

	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
