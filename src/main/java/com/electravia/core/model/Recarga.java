package com.electravia.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_recarga")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recarga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String idCliente; // Identificação do motorista

    @Column(nullable = false)
    private Double kwhConsumido; // Quantidade de energia fornecida

    @Column(nullable = false)
    private Double valorTotal; // Custo da recarga

    @Column(nullable = false)
    private LocalDateTime dataHoraRecarga = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "estacao_id", nullable = false)
    private Estacao estacao; // Relacionamento com o eletroposto
}
