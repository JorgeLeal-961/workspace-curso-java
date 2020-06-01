package br.com.devmedia.alomundo;

import java.math.BigDecimal;

public class ExecutarAloMundo {

	public static void main(String[] args) {
		
		ProdutoAloMundo produto1 = new ProdutoAloMundo();
		produto1.setIdproduto(1L);
		produto1.setNmproduto("Modulo Orientação objeto");
		produto1.setVlproduto(BigDecimal.valueOf(100));
		
		ProdutoAloMundo produto2 = new ProdutoAloMundo();
		produto2.setIdproduto(2L);
		produto2.setNmproduto("Modulo de Spring Boot API");
		produto2.setVlproduto(BigDecimal.valueOf(300));
		
		ProdutoAloMundo produto3 = new ProdutoAloMundo();
		produto3.setIdproduto(3L);
		produto3.setNmproduto("Modulo de Angulat 8");
		produto3.setVlproduto(BigDecimal.valueOf(200));
		
		ProdutoAloMundo produto4 = new ProdutoAloMundo();
		produto4.setIdproduto(5L);
		produto4.setNmproduto("Modulo de Hibernate");
		produto4.setVlproduto(BigDecimal.valueOf(500));
		
		VendaAloMundo venda = new VendaAloMundo();
		venda.setDescricaoVenda("Venda Curso Java");
		venda.setEnderecoEntrega("Entrega por email");
		venda.setId(10L);
		venda.setNomeCliente("Jorge");
//		venda.setValorTotal(BigDecimal.valueOf(197.00));

		venda.getListProdutoAloMundo().add(produto1);
		venda.getListProdutoAloMundo().add(produto2);/*nesta lista não consigo fazer validações*/
		venda.addProduto(produto3);/*nesta lista pode fazer validações antes de adicionar na lista*/
		venda.getListProdutoAloMundo().add(produto4);
		

		System.out.println("Valor da variavel total venda: "+ venda.getValorTotal());
		
	}

}
