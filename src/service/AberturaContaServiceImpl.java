package service;

import conta.Conta;

public class AberturaContaServiceImpl implements AberturaContaService {

	@Override
	public Conta abrirConta(Conta conta) {
		
		if ("poupanca".equals(conta.getTipoConta()) && "PF".equals(conta.getCliente().getTipo())){
			return null;
		}
		
		return null;
	}

}
