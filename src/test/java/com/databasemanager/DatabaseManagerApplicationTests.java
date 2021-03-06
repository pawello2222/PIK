package com.databasemanager;

import com.databasemanager.web.Application;
import com.databasemanager.web.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class DatabaseManagerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void helloTest() {
		HomeController homeController = new HomeController();
		String expected = "home";
		String actual = homeController.home();
		assertEquals("HomeController niepoprawna wartość",expected, actual);
	}

	/*@Test
	public void helloBadTest() {
		HomeController homeController = new HomeController();
		String expected = "IncorrectTextHere";
		String actual = homeController.home();
		assertEquals("HomeController niepoprawny testowy test",expected, actual);
	}*/
}
