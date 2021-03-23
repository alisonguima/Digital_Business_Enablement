package loja.situacao;

import loja.PedidoInterface;

public class Cancelado extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("chamado para comercial");
	}

	@Override
	public void reabrir(PedidoInterface pedido) {
		pedido.setSituacao(new Aberto());
	}
}