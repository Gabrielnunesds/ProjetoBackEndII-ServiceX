package br.com.gabrielnunes.demo.categoria.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "CATEGORIA")

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria;
    @Column(name = "NOME_CATEGORIA")
    private String nomeCategoria;
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<br.com.gabrielnunes.demo.servico.domain.Servico> servicos;

    public Categoria(){

    }

    public Categoria(Integer idCategoria, String nomeCategoria, List<br.com.gabrielnunes.demo.servico.domain.Servico> servicos) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
        this.servicos = servicos;
    }

}
