package com.userValidation1;

import org.junit.Assert;
import org.junit.Test;

public class UserValidation1Test {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validateFirstName("Ashu");
		Assert.assertTrue(result);
	}
	@Test
	public void givenFirstName_When2char_ShouldReturnFalse() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validateFirstName("Ash");
		Assert.assertFalse(result);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validateLastName("Mary");
		Assert.assertTrue(result);
	}
	@Test
	public void givenLastName_When2char_ShouldReturnFalse() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validateLastName("Mar");
		Assert.assertFalse(result);
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validateEmail("Ashwani@gmail.com");
		Assert.assertTrue(result);
	}
	@Test
	public void givenEmail_WhenMultipleEmailstld_ShouldReturnFalse() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validateEmail("sai@gmail.com.1a");
		Assert.assertFalse(result);
	}
	@Test
	public void givenMobileFormat_WhenProper_ShouldReturnTrue() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validateMobileFormat("91 8500907412");
		Assert.assertTrue(result);
	}
	@Test
	public void givenMobileFormat_WhenNormalFormat_ShouldReturnFalse() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validateMobileFormat("89514627848");
		Assert.assertFalse(result);
	}
	@Test
	public void givenPasswordRules_WhenProperRules_ShouldReturnTrue() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validatePasswordRules("AShuu@14");
		Assert.assertTrue(result);
	}
	@Test
	public void givenPasswordRules_WhenNoRule_ShouldReturnFalse() {
		UserValidation1 regExp = new UserValidation1();
		boolean result = regExp.validatePasswordRules("Madhu@123");
		Assert.assertFalse(result);
	}


}
