package br.usjt_prvisao.USJT_Prvisao.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt_prvisao.USJT_Prvisao.model.Previsao;
import br.usjt_prvisao.USJT_Prvisao.model.Usuario;
import br.usjt_prvisao.USJT_Prvisao.repository.PrevisaoRepo;
import br.usjt_prvisao.USJT_Prvisao.service.LoginService;

@Controller
public class MainController {
	@Autowired
	private PrevisaoRepo previsaoRepo;

	@GetMapping("/previsao")
	public ModelAndView listarPrevisao() {
		ModelAndView mv = new ModelAndView("listprevisao");
		List<Previsao> previsao = previsaoRepo.findAll();
		mv.addObject("previsao", previsao);
		return mv;
	}

	

	@Controller
	public class LoginController {
		@Autowired
		private LoginService loginService;
		@GetMapping(value = { "/login", "/" })
		public ModelAndView login() {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject(new Usuario());
			return mv;
		}

		@PostMapping("/fazerLogin")
		public String fazerLogin(HttpServletRequest request,Usuario usuario) {
			if (loginService.logar(usuario)) {
				request.getSession().setAttribute("usuarioLogado", usuario);
				return "redirect:previsao";
			} else {
				return "login";
			}
		}
	}
}
