package loja;

import java.math.BigDecimal;

import loja.situacao.Situacao;

public class PedidoProxy implements PedidoInterface {

	private Pedido pedido;
	private BigDecimal valor;
	
	public PedidoProxy(Pedido pedido) {
		this.pedido = pedido;
	}

	public void abrirChamado() {
		pedido.abrirChamado();
	}

	public BigDecimal getValor() {
		if (valor == null) {
			valor = pedido.getValor();
		}
		return valor;
	}

	public int getTotalDeItens() {
		return pedido.getTotalDeItens();
	}

	public void setSituacao(Situacao situacao) {
		pedido.setSituacao(situacao);
	}

	public void pagar() {
		pedido.pagar();
	}

	public void entregar() {
		pedido.entregar();
	}

	public void cancelar() {
		pedido.cancelar();
	}

	public void reabrir() {
		pedido.reabrir();
	}
}
