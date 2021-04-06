package loja.situacao;

import java.math.BigDecimal;

import loja.Pedido;
import loja.PedidoInterface;
import loja.PedidoProxy;

public class TestaSituacao {
	
	public static void main(String[] args) {
		PedidoInterface pedido = new PedidoProxy(new Pedido(new BigDecimal("100")));
		
		System.out.println(pedido.getValor());
		
		pedido.pagar();
		pedido.entregar();
		pedido.abrirChamado();
		System.out.println(pedido.getValor());
	}

}