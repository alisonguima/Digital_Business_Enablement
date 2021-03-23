package loja;

public class LogListener implements EventListener{

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Gravando log do pedido " + pedido);
	}

}