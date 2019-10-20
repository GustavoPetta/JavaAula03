package br.usjt_prvisao.USJT_Prvisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt_prvisao.USJT_Prvisao.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
public Usuario findOneByLoginAndSenha (String login, String senha);
}
