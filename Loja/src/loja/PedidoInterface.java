package loja;

import java.math.BigDecimal;

import loja.situacao.Situacao;

public interface PedidoInterface {

	void abrirChamado();

	BigDecimal getValor();

	int getTotalDeItens();

	void setSituacao(Situacao situacao);

	void pagar();

	void entregar();

	void cancelar();

	void reabrir();

}