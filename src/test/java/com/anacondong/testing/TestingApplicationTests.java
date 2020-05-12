package com.anacondong.testing;

import com.anacondong.testing.config.SampleConfigurationProperties;
import com.anacondong.testing.services.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingApplicationTests {

	@Autowired
	ApplicationContext ctx;

	@Autowired
	HelloWorldService helloWorldService;

	@Autowired
	SampleConfigurationProperties sampleConfigurationProperties;

	@Test
	public void testContextLoads() {
		assertThat(this.ctx).isNotNull();
	}

	@Test
	public void helloWorldServiceTest() {
		assertThat(this.helloWorldService.getHelloMessage()).isEqualTo("Hello @ValueDongNameTest");
	}

	@Test
	public void sampleConfigurationPropertiesTest() {
		assertThat(this.sampleConfigurationProperties.getName()).isEqualTo("@ConfigurationPropertiesDongNameTest");
	}




}
