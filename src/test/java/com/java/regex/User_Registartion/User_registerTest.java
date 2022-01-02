package com.java.regex.User_Registartion;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class User_registerTest {
	private String email;
	private Boolean expectedResult;
	private user_register user_reg;

	@Before
	public void initialize() {
		user_reg = new user_register();
	}

	public User_registerTest(String email, Boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection emailaddress() {
		return Arrays.asList(new Object[][] { { "abc+100@gmail.com", true }, { "abc@abc@gmail.com", false },
				{ "abc.100@yahoo.com", true }, { "abc@gmail.com.1a", false } });
	}

	@Test
	public void emailvalidTest() {
		try {
			System.out.println("Parameterized email is : " + email);
			assertEquals(expectedResult, user_reg.email(email));
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}

	}

	
	@Test
	public void firstnameTest() {
		try {
			user_register ur = new user_register();
			boolean result = ur.firstname();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void lastnameTest() {
		try {
			boolean result = user_register.lastname();
			Assert.assertEquals(true, result);
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void emailTest() {
		try {
			boolean emailres = user_register.email("abc+100@gmail.com");
			Assert.assertEquals(true, emailres);
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void mobilenumberTest() {
		try {
			boolean mobile = user_register.mobilenumber();
			Assert.assertEquals(true, mobile);
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void rule4Test() {
		try {
			boolean specialch = user_register.Rule4();
			Assert.assertEquals(true, specialch);
		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

}
