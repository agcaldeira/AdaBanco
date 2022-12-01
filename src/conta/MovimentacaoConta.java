package conta;

public interface MovimentacaoConta {

	public Boolean sacar(double valor);

	public Double depositar(double valor);

	public Boolean transferir(Conta destino, double valor);

	public double consultarSaldo();

}
