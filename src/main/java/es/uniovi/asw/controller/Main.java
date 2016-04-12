package es.uniovi.asw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.uniovi.asw.business.login.Authenticate;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.votingDBManagement.impl.repository.VoterRepository;

@Controller
public class Main {
	

	@Autowired
	private VoterRepository vtRep;

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		LOG.info("Página de Login");
		model.addAttribute("voter", new Voter());
		model.addAttribute("error", null);
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView adminIndex(@ModelAttribute Voter voter, Model model) {
		LOG.info("Panel de administración");
		String resultado = Authenticate.authenticate(voter.getEmail(), voter.getPassword(),  vtRep, voter);
		if (resultado.equals("admin")) {
			return new ModelAndView("admin_index");
		} else if (resultado.equals("voter")) {
			model.addAttribute("voter", voter);
			model.addAttribute("voter");
			return new ModelAndView("voter_index");
		} else if (resultado.equals("president")) {
			return new ModelAndView("president_index");
		} else {
			model.addAttribute("error", "Usuario o contraseña incorrectos");
			return new ModelAndView("index");
		}
	}

}