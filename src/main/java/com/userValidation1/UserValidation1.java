package com.userValidation1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation1 {
	public boolean validateFirstName(String firstName) {
		String regExp = "^[A-Z][a-zA-Z]{3,3}";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public boolean validateLastName(String lastName) {
		Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,3}");
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("^([^\\.][a-zA-Z]+[\\.+_-]{0,1}[0-9]*[^\\.]@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}[\\.]*[a-z^la]*)$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean validateMobileFormat(String mobileFormat) {
		Pattern pattern = Pattern.compile("^(91\\s*[7-9][0-9]{9})$");
		Matcher matcher = pattern.matcher(mobileFormat);
		return matcher.matches();
	}

	public boolean validatePasswordRules(String passwordRules) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()-[{}]:;',?/~$^+=<>]).{8,8}$");
		Matcher matcher = pattern.matcher(passwordRules);
		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration system to ensure all Validations");
		System.out.println("Enter your first name");
		String firstName = scanner.nextLine();

		System.out.println("Enter your last name");
		String lastName = scanner.nextLine();

		System.out.println("Enter your email");

		String email = scanner.nextLine();

		System.out.println("Enter your mobile format");
		String mobileFormat = scanner.nextLine();

		System.out.println("Enter your password rules");
		String passwordRules = scanner.nextLine();

		boolean result = new UserValidation1().validateFirstName(firstName);
		boolean result1 = new UserValidation1().validateLastName(lastName);
		boolean result2 = new UserValidation1().validateEmail(email);
		boolean result3 = new UserValidation1().validateMobileFormat(mobileFormat);
		boolean result4 = new UserValidation1().validatePasswordRules(passwordRules);

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
