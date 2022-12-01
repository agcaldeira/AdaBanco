package conta;

import cliente.Cliente;

public abstract class Conta implements MovimentacaoConta {
	
	private Integer agencia;
	private Integer numero;
	private Double saldo;
	private Cliente cliente;
	private String tipoConta;
	
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	@Override
	public Boolean sacar(double valor) {
		if (valor < getSaldo()) {
			setSaldo(getSaldo()-valor-(valor * this.getCliente().getTaxa()));
			return true;
		}
		return false;
	}
	
	@Override
	public Double depositar(double valor) {
		setSaldo(getSaldo() + valor);
		return getSaldo();
	}
	
	@Override
	public Boolean transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
		return true;
	}
	
	@Override
	public double consultarSaldo() {
		return getSaldo();
	}
	
	

}
