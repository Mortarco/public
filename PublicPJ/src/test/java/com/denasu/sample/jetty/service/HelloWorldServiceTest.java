package com.denasu.sample.jetty.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HelloWorldServiceTest
{
	@Test
    public void checkMessage() throws Exception
    {
		HelloWorldService service = new HelloWorldService();　
		assertThat(service.getHelloMessage()).isEqualTo("Test Message");
    }
}
