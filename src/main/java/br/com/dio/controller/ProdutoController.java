package br.com.dio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.entity.Produto;
import br.com.dio.service.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;

	@PostMapping(value = "/save")
	public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto) throws Exception {

		produto = service.save(produto);

		return ResponseEntity.ok().body(produto);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> buscaProduto(@PathVariable Long id) {

		Produto produto = service.findById(id);

		return ResponseEntity.ok().body(produto);

	}

	@GetMapping(value = "/busca-todos")
	public ResponseEntity<List<Produto>> buscaTodosProdutos() {

		List<Produto> produtos = service.findAll();

		return ResponseEntity.ok().body(produtos);

	}

}
