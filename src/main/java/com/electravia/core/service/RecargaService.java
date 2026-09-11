package com.electravia.core.service;

import com.electravia.core.model.Recarga;
import com.electravia.core.repository.RecargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RecargaService {

    @Autowired
    private RecargaRepository recargaRepository;

    public List<Recarga> listarTodas() {
        return recargaRepository.findAll();
    }

    public Recarga salvar(Recarga recarga) {
        if (recarga.getDataHoraRecarga() == null) {
            recarga.setDataHoraRecarga(LocalDateTime.now());
        }
        return recargaRepository.save(recarga);
    }
}
