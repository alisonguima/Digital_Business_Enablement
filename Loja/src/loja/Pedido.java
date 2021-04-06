package loja;

import java.math.BigDecimal;

import loja.situacao.Aberto;
import loja.situacao.Situacao;

public class Pedido implements PedidoInterface {
	private BigDecimal valor;
	private int totalDeItens;
	private Situacao situacao;
	public PedidoHandler handler;
	
	@Override
	public void abrirChamado() {
		this.situacao.abrirChamado();	
	}

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.totalDeItens = 1;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	public Pedido(BigDecimal valor, int totalDeItens) {
		this.valor = valor;
		this.totalDeItens = totalDeItens;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	@Override
	public BigDecimal getValor(){
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		return valor;
	}

	@Override
	public int getTotalDeItens() {
		return totalDeItens;
	}

	@Override
	public void setSituacao(Situacao situacao) {
		this.handler.notify(this);
		this.situacao = situacao;
	}
	
	@Override
	public void pagar() {
		this.situacao.pagar(this);
	}
	
	@Override
	public void entregar() {
		this.situacao.entregar(this);
	}
	
	@Override
	public void cancelar() {
		this.situacao.cancelar(this);
	}
	
	@Override
	public void reabrir() {
		this.situacao.reabrir(this);
	}	
}