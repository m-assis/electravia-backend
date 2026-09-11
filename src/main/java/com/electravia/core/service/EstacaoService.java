package com.electravia.core.service;

import com.electravia.core.model.Estacao;
import com.electravia.core.repository.EstacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstacaoService {

    @Autowired
    private EstacaoRepository estacaoRepository;

    public List<Estacao> listarTodas() {
        return estacaoRepository.findAll();
    }

    public Estacao salvar(Estacao estacao) {
        return estacaoRepository.save(estacao);
    }
}
