package com.electravia.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_estacao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codigoEstacao; // Ex: ET-SP-001

    @Column(nullable = false)
    private String localizacao; // Ex: Av. Paulista, 1000 - São Paulo

    @Column(nullable = false)
    private String statusOperacional; // Ex: ONLINE, MANUTENCAO, OFFLINE
}
