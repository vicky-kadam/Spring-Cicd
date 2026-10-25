package com.vishra.check;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class SpringCheckCicdApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test void additionShouldReturnCorrectResult() { int result = 10 + 20; assertEquals(40, result); }

}
