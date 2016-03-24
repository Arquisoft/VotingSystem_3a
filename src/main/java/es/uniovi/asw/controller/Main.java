package es.uniovi.asw.controller;

import java.sql.Time;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import es.uniovi.asw.business.login.Authenticate;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.AddVotingTypeImpl;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;


@RestController
public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	@Autowired
	private VotingRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		LOG.info("Página de Login");
		model.addAttribute("voter", new Voter());
		model.addAttribute("error", null);
		new AddVotingTypeImpl().addVotingType(repository, new Eleccion("nombre", 
				new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), 
				new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis())));
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView adminIndex(@ModelAttribute Voter voter, Model model) {
		LOG.info("Panel de administración");
		if (Authenticate.authenticate(voter.getEmail(), voter.getPassword()).equals("correcto")) {
			return new ModelAndView("admin_index");
		}
		model.addAttribute("error", "Usuario o contraseña incorrectos");
		return new ModelAndView("index");
	}

}