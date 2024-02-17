package com.belval.crudreact.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belval.crudreact.model.Produto;

@RestController
public class ProdutoController {
		
	private static List<Produto> listaProdutos = new ArrayList<>() {
		{
			Produto p = new Produto();
			p.setId(1);
			p.setNome("Pão");
			p.setDescricao("Pão Francês");
			p.setPreco(1.5);
			add(p);
			
			p = new Produto();
			p.setId(2);
			p.setNome("Mortadela");
			p.setDescricao("Mortadela Cerati");
			p.setPreco(15.75);
			add(p);
		}
	};

	@GetMapping("/produtos")
	public List<Produto> produtos() {
		return listaProdutos;
	}
}

