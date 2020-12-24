package com.poc.nexware;

import com.poc.nexware.controller.PalindromeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PalindromeApplicationTests {

	@Autowired
	PalindromeController palindromeController;

	@Test
	void contextLoads() throws Exception {
		assertThat(palindromeController).isNotNull();
	}

}
