package com.electravia.core.controller;

import com.electravia.core.model.Recarga;
import com.electravia.core.service.RecargaService;
import com.electravia.core.service.GeminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recargas")
public class RecargaController {

    @Autowired
    private RecargaService recargaService;

    @Autowired
    private GeminiService geminiService;

    @GetMapping
    public ResponseEntity<List<Recarga>> listar() {
        return ResponseEntity.ok(recargaService.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Recarga> criar(@RequestBody Recarga recarga) {
        Recarga novaRecarga = recargaService.salvar(recarga);
        return ResponseEntity.status(201).body(novaRecarga);
    }

    @GetMapping("/analise-ia")
    public ResponseEntity<String> analisarRecargasComIA() {
        List<Recarga> recargas = recargaService.listarTodas();
        if (recargas.isEmpty()) {
            return ResponseEntity.ok("Não há recargas cadastradas para análise no momento.");
        }

        String dadosResumidos = recargas.toString();
        String analise = geminiService.analisarConsumoEnergia(dadosResumidos);

        return ResponseEntity.ok(analise);
    }
}
