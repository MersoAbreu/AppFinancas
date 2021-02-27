package br.com.financasapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.financasapp.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
