package br.com.devmedia.alomundo;

import java.math.BigDecimal;

public class ProdutoAloMundo {
	
	private Long idproduto;
	private String nmproduto;
	private BigDecimal vlproduto;
	
	public Long getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(Long idproduto) {
		this.idproduto = idproduto;
	}
	public String getNmproduto() {
		return nmproduto;
	}
	public void setNmproduto(String nmproduto) {
		this.nmproduto = nmproduto;
	}
	public BigDecimal getVlproduto() {
		return vlproduto;
	}
	public void setVlproduto(BigDecimal vlproduto) {
		this.vlproduto = vlproduto;
	}
	@Override
	public String toString() {
		return "ProdutoAloMundo [idproduto=" + idproduto + ", nmproduto=" + nmproduto + ", vlproduto=" + vlproduto
				+ "]";
	}
	

}
