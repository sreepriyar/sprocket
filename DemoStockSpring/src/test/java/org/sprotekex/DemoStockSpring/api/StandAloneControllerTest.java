package org.sprotekex.DemoStockSpring.api;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath; 



import org.junit.Test;
import org.springframework.http.MediaType;

public class StandAloneControllerTest {
	private final MockMvc mvc=standaloneSetup(new SprocketController()).build();
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));
	
	@Test
	public void testCreateGreeting() throws Exception {
 
		
		this.mvc.perform(get("/Sprocket/user1")
		.header("host", "localhost:80"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(contentType));
		//.andExpect(jsonPath("$.content",is("hello")));
	}
}
