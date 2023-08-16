package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
 class jenkinsTest {

	@InjectMocks
	Jenkins jenkins;
	
	@Test
	void test1()
	{
		String a=jenkins.returnString();
		assertEquals(a, "sreeja");
	}
}
