package br.usjt_prvisao.USJT_Prvisao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt_prvisao.USJT_Prvisao.model.Usuario;
import br.usjt_prvisao.USJT_Prvisao.repository.UsuarioRepo;

@Service
public class LoginService {
@Autowired
UsuarioRepo usuarioRepo;
public boolean logar (Usuario usuario) {
return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
usuario.getSenha()) != null;
}
}
