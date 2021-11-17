package com.doglab.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.doglab.main.models.Produto;

@Service
public class ProdutoService {

	private static List<Produto> productList = new ArrayList<Produto>();
	
	// A inicialização passa a ser da classe e não do objeto.
	static {
		productList.add(new Produto(1, "Tenis de Futebol", 
				"Ótimo tênis para utilizar em seus jogos de futebol",
				"Nike", 2699.99f));
		productList.add(new Produto(2, "Bola de Golf", 
				"Bola de golf sólida. 20KG.",
				"Golf Studios", 25.60f));
		productList.add(new Produto(3, "Mesa de Plastico", 
				"Mesa de plastico branca para churrasco e lazer.",
				"Mesaria São Jorge", 50.99f));
	}
	
	public List<Produto> allProducts() {
		return productList;
	}
	
	public List<Produto> catchProductsByPrice(float value) {
		List<Produto> productsByPrice = new ArrayList<Produto>();
		for(Produto p : productList) {
			if(p.getValue() < value) {
				productsByPrice.add(p);
			}
		}
		return productsByPrice;
	}
	
}
