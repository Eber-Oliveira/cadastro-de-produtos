package com.eberoliveira.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean (name = "produtos")
public class ProdutosBean {
	private List<ProdutoBean> produtos;
	
	public ProdutosBean(){
		produtos = new ArrayList<>();
		
	}

	public List<ProdutoBean> getProdutos() {
		return produtos;
	}
}