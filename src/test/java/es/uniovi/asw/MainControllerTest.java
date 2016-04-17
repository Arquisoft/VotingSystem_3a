package es.uniovi.asw;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class MainControllerTest {

  @Autowired
  private WebApplicationContext context;

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
  public void adminIndexGet() throws Exception {
    mvc.perform(post("/admin_index")).andExpect(status().isOk()).andExpect(content().string(containsString("elecciones")));
  }
  
  @Test
  public void showVotings() throws Exception {
	  mvc.perform(post("/").param("get_cand", "")).andExpect(status().isOk()).andExpect(content().string(containsString("elecciones")));
  }
  
  @Test
  public void adminIndexActivate() throws Exception {
	  mvc.perform(post("/admin_index").param("action", "1")).andExpect(status().isOk()).andExpect(content().string(containsString("Panel de")));
  }
  
  @Test
  public void adminIndexConfOptions() throws Exception {
	  mvc.perform(post("/admin_index").param("conf", "1")).andExpect(status().isOk()).andExpect(content().string(containsString("de candidaturas")));
  }
  
  @Test
  public void adminIndexConfPollings() throws Exception {
	  mvc.perform(post("/admin_index").param("pollingStation", "")).andExpect(status().isOk()).andExpect(content().string(containsString("de configuración de colegios")));
  }
}