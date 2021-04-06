package loja.situacao;

import loja.PedidoInterface;

public class Aberto extends Situacao {

	@Override
	public void abrirChamado() {
		new ChamadoFacade().abrir();
		System.out.println("chamado para financeiro");
	}

	@Override
	public void pagar(PedidoInterface pedido) {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());
	}
}