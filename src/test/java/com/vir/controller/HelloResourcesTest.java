package com.vir.controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@SpringBootTest
public class HelloResourcesTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks
	private HelloResources helloResources;
	
	@Test
		public void Testhelloworld() throws Exception {
		mockMvc=MockMvcBuilders.standaloneSetup(helloResources)
				.build();
           mockMvc.perform(get("/"))
           .andExpect(status().isOk())
           .andExpect(content().string("****Hello World..****"));
		
	}

}
