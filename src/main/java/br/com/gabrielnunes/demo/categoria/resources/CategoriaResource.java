package br.com.gabrielnunes.demo.categoria.resources;

import br.com.gabrielnunes.demo.categoria.domain.Categoria;
import br.com.gabrielnunes.demo.categoria.services.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaServices categoriaServices;

    @PostMapping
    public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria categoria){

        Categoria novaCategoria = categoriaServices.criarCategoria(categoria);
        return new ResponseEntity<>(novaCategoria, HttpStatus.CREATED);
    }


}
