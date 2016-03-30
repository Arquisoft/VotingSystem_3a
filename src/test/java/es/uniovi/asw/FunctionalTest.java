package es.uniovi.asw;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.CandidacyRepository;
import es.uniovi.asw.persistence.dbManagement.adminDBManagement.impl.VotingRepository;
import es.uniovi.asw.view.systemConfiguration.administratorManagement.ConfCand;
import es.uniovi.asw.view.systemConfiguration.administratorManagement.ConfVT;
import es.uniovi.asw.view.systemConfiguration.administratorManagement.GetCand;
import es.uniovi.asw.view.systemConfiguration.administratorManagement.GetVT;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class FunctionalTest {

  @Autowired
  private WebApplicationContext context;
  @Autowired
  private VotingRepository vRep;
  @Autowired
  private CandidacyRepository cRep;

  private MockMvc mvc;

  @Before
  public void setUp() throws Exception {
    mvc = MockMvcBuilders.webAppContextSetup(context).build();
  }

  @Test
  public void testLanding() throws Exception {
    mvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string(containsString("Log-in")));
  }
  
  @Test
  public void testGetCand() throws Exception {
    GetCand gc = new GetCand(vRep, cRep, new Long(1));
    gc.getCandidacys();
  }
  
  @Test
  public void testGetVT() throws Exception {
	GetVT gvt = new GetVT(vRep);
	gvt = new GetVT(vRep, cRep, new Long(1));
    gvt.getActiveVotings();
    gvt.getById();
  }
  
  @Test
  public void testConfVT() throws Exception {
	Eleccion e = new Eleccion("Eleccion1", new Date(System.currentTimeMillis()), 
			new Date(System.currentTimeMillis()), new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()));
	List<Candidatura> c = new ArrayList<Candidatura>();
	c.add(new Candidatura("c1", e));
	c.add(new Candidatura("c2", e));
	e.setOpciones(c);
	ConfVT cv = new ConfVT(vRep, cRep, e);
	cv.saveEleccion();
	cv = new ConfVT(vRep, new Long(2));
	cv.updateEleccion();
  }
  
  @Test
  public void testConfCand() throws Exception {
	  List<Candidatura> cands = new ArrayList<Candidatura>();
	  cands.add(new Candidatura("A"));
	  cands.add(new Candidatura("B"));
	  ConfCand cc = new ConfCand(vRep, cRep, cands, new Long(1));
	  cc.saveCandidaturas();
  }
}