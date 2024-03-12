package br.com.gabrielnunes.demo.categoria.resources;

import br.com.gabrielnunes.demo.categoria.domain.Categoria;
import br.com.gabrielnunes.demo.categoria.services.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Categoria>> listarCategoria(){
        List<Categoria> categorias = categoriaServices.listarCategoria();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity buscarCategoria(@PathVariable Integer idCategoria){
        return categoriaServices.buscarCategoria(idCategoria)
                .map(categoria -> new ResponseEntity(categoria, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{idCategoria}")
    public ResponseEntity<Void> deletarCategoria(@PathVariable Integer idCategoria){
        categoriaServices.deletarCategoria((idCategoria));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{idCategoria}")
    public ResponseEntity<Categoria> atualizarCategoria(
            @PathVariable Integer idCategoria,
            @RequestBody Categoria categoria){
        if (!categoriaServices.buscarCategoria(idCategoria).isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        categoria.setIdCategoria(idCategoria);
        Categoria novaCategoria = categoriaServices.atualizarCategoria((categoria));
        return new ResponseEntity<>(novaCategoria, HttpStatus.OK);
    }

}
