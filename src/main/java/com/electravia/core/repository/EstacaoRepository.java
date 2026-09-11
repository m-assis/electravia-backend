package com.electravia.core.repository;

import com.electravia.core.model.Estacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacaoRepository extends JpaRepository<Estacao, Long> {
}