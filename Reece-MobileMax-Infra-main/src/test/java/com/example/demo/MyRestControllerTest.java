package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

public class MyRestControllerTest {

	@Test
	public void testHello() {
		MyRestController controller = new MyRestController();
		Map<String, String> result = controller.hello();
		assertNotNull(result.get("datetime"));
	}
}
