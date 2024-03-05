package br.com.gabrielnunes.demo.categoria.repositores;

import br.com.gabrielnunes.demo.categoria.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
