package br.com.financasapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.financasapp.domain.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
