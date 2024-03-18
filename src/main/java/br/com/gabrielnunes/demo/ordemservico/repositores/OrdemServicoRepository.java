package br.com.gabrielnunes.demo.ordemservico.repositores;

import br.com.gabrielnunes.demo.ordemservico.domain.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer> {

}
