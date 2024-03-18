package br.com.gabrielnunes.demo.servico.domain;

import br.com.gabrielnunes.demo.categoria.domain.Categoria;
import br.com.gabrielnunes.demo.ordemservico.domain.OrdemServico;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SERVIÇOS")

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Integer idServico;
    @Column(name = "NOME_SERVICO")
    private String nomeServico;
    @Column(name = "VALOR_SERVICO")
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
    @JsonIgnore
    @ManyToMany(mappedBy = "servicos")
    private List<OrdemServico> ordemServico;
}