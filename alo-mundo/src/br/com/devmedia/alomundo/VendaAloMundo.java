package br.com.devmedia.alomundo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class VendaAloMundo {
	private Long id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	private List<ProdutoAloMundo> listaProdutos = new ArrayList<ProdutoAloMundo>();
	
	public List<ProdutoAloMundo> getListProdutoAloMundo() {
		return listaProdutos;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "VendaAloMundo [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}

	public void addProduto(ProdutoAloMundo produto3) {
		/*pode fazer validações*/
		this.listaProdutos.add(produto3);
	}
	
	private double totalVenda() {
		double total = 0.0;
		for (ProdutoAloMundo produtoAloMundo : listaProdutos) {
			total += produtoAloMundo.getVlproduto().doubleValue();
		}
		return total;
	}
	
	
	
}
