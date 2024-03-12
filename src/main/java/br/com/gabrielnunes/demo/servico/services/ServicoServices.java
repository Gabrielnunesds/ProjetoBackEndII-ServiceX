package br.com.gabrielnunes.demo.servico.services;

import br.com.gabrielnunes.demo.servico.domain.Servico;
import br.com.gabrielnunes.demo.servico.repositores.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServicoServices {

    @Autowired
    private ServicoRepository servicoRepository;
    public Servico criarServico(Servico servico){
        return servicoRepository.save(servico);

    }

    public List<Servico> listarServico(){
        return servicoRepository.findAll();

    }

    public Optional<Servico> buscarServico(Integer idServico){
        return servicoRepository.findById(idServico);
    }

    public Servico atualizarServico(Servico servico){
        return servicoRepository.save(servico);
    }

    public void deletarServico(Integer idServico){
        servicoRepository.deleteById(idServico);
    }

}
