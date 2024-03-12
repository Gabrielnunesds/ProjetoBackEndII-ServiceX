package br.com.gabrielnunes.demo.servico.repositores;

import br.com.gabrielnunes.demo.servico.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
