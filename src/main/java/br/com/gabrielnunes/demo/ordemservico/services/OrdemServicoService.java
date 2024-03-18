package br.com.gabrielnunes.demo.ordemservico.services;

import br.com.gabrielnunes.demo.ordemservico.repositores.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

}
