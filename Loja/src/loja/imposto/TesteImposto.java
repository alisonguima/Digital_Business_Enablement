package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;
import loja.PedidoInterface;
import loja.PedidoProxy;

public class TesteImposto {

	public static void main(String[] args) {
		
		Imposto impostoDecorator = new ICMS(new IPI(new ISS(null)));
		
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto(impostoDecorator);
		
		PedidoInterface pedido = new PedidoProxy(new Pedido(new BigDecimal("100")));
		
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
	
		System.out.println(imposto);
		
	}
}
