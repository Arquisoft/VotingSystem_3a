package es.uniovi.asw.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import es.uniovi.asw.business.login.Authenticate;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Voter;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.AddCandidacyCImpl;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;
import es.uniovi.asw.view.systemConfiguration.administratorManagement.ConfVT;
import es.uniovi.asw.view.systemConfiguration.administratorManagement.GetVT;


@RestController
public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	@Autowired
	private VotingRepository vRep;
	@Autowired
	private CandidacyRepository cRep;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		LOG.info("Página de Login");
		model.addAttribute("voter", new Voter());
		model.addAttribute("error", null);
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView indexGoTo(Model model) {
		LOG.info("Página de Login");
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView adminIndex(@ModelAttribute Voter voter, Model model) {
		LOG.info("Panel de administración");
		if (Authenticate.authenticate(voter.getEmail(), voter.getPassword()).equals("correcto")) {
			model.addAttribute("eleccion", new Eleccion());
			model.addAttribute("elecciones", new GetVT(vRep).getActiveVotings());
			return new ModelAndView("admin_index");
		}
		model.addAttribute("error", "Usuario o contraseña incorrectos");
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/admin_index", method = RequestMethod.POST)
    public ModelAndView adminIndexGet(@ModelAttribute Eleccion eleccion, Model model){
		if(eleccion.getNumeroOpciones().intValue() < 2){
			model.addAttribute("error", "El número mínimo de opciones es 2");
			return new ModelAndView("admin_index");
		}
		model.addAttribute("eleccion", eleccion);
        return new ModelAndView("new_votation"); 
    }
	
	@RequestMapping(value="/admin_index", method = RequestMethod.POST,  params="action")
    public ModelAndView adminIndexActivate(@RequestParam(value="action", required=true) String id, Model model){
		new ConfVT(vRep, Long.parseLong(id)).updateEleccion();
		model.addAttribute("eleccion", new Eleccion());
		model.addAttribute("elecciones", new GetVT(vRep).getActiveVotings());
        return new ModelAndView("admin_index"); 
    }
	
	@RequestMapping(value="/admin_index", method = RequestMethod.POST,  params="conf")
    public ModelAndView adminIndexConfOptions(@RequestParam(value="conf", required=true) String id, Model model){
		model.addAttribute("eleccion", new GetVT(vRep, cRep, Long.parseLong(id)).getById());
        return new ModelAndView("conf_options"); 
    }
	
	@RequestMapping(value="/conf_options", method = RequestMethod.POST,  params="save_conf")
    public ModelAndView adminConfOptions(@RequestParam(value="save_conf", required=true) String id, @ModelAttribute Eleccion eleccion, Model model){
		model.addAttribute("eleccion", new Eleccion());
		new AddCandidacyCImpl().saveCandidacys(vRep, cRep, eleccion.getOpciones(), Long.parseLong(id));
		model.addAttribute("elecciones", new GetVT(vRep).getActiveVotings());
        return new ModelAndView("admin_index"); 
    }
	
	@RequestMapping(value="/new_votation", method = RequestMethod.POST)
    public ModelAndView newVotingPost(@ModelAttribute @Valid Eleccion eleccion, BindingResult bindingResult, Model model){
		if(bindingResult.hasErrors()){
			model.addAttribute("error", "Existen campos obligatorios vacíos");
			return new ModelAndView("new_votation");
		}
		new ConfVT(vRep, cRep, eleccion).saveEleccion();
		model.addAttribute("elecciones", new GetVT(vRep).getActiveVotings());
        return new ModelAndView("admin_index"); 
    }    
}