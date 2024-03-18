package br.com.gabrielnunes.demo.pagamento.repositores;

import br.com.gabrielnunes.demo.pagamento.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
