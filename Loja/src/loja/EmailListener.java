package loja;

public class EmailListener implements EventListener{

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Enviando email para o pedido " + pedido);
	}
	
}