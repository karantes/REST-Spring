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

import br.com.dio.entity.Pedido;
import br.com.dio.service.PedidoService;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

	@Autowired
	private PedidoService service;

	@PostMapping(value = "/save")
	public ResponseEntity<Pedido> salvaProduto(@RequestBody Pedido produto) {

		produto = service.save(produto);

		return ResponseEntity.ok().body(produto);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> buscaProduto(@PathVariable Long id) {

		Pedido pedido = service.findById(id);

		return ResponseEntity.ok().body(pedido);

	}

	@GetMapping(value = "/busca-todos")
	public ResponseEntity<List<Pedido>> buscaTodosProdutos() {

		List<Pedido> pedidos = service.findAll();

		return ResponseEntity.ok().body(pedidos);

	}

}
