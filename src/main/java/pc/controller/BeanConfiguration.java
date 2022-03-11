package pc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pc.beans.Hardware;
/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Hardware hardware() {
		Hardware pc = new Hardware("RTX 2070 Super","AMD 3800X", 16, 4250);
		return pc;
	}
}
