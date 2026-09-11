package com.electravia.core.controller;

import com.electravia.core.model.Estacao;
import com.electravia.core.service.EstacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/estacoes")
public class EstacaoController {

    @Autowired
    private EstacaoService estacaoService;

    @GetMapping
    public ResponseEntity<List<Estacao>> listar() {
        return ResponseEntity.ok(estacaoService.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Estacao> criar(@RequestBody Estacao estacao) {
        Estacao novaEstacao = estacaoService.salvar(estacao);
        return ResponseEntity.status(201).body(novaEstacao);
    }
}
