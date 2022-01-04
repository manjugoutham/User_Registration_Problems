package com.java.regex.User_Registartion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserLambda {
	boolean validate(String p) throws InvalidUserInputException;
}

public class user_register {

	static Scanner scan = new Scanner(System.in);

	public static boolean firstname() throws InvalidUserInputException {

		System.out.println("Enter first name : ");
		String name = scan.next();
		String regex = "[A-Z]{1}[a-z]{2,6}";
		UserLambda FirstName = (Input) -> (Pattern.compile(regex).matcher(Input).matches());
		if (FirstName.validate(name) && (name != null) == true) 
		{
			System.out.println(" "+name+ "  -> " + FirstName.validate(name));
			return FirstName.validate(name);
		}
		throw new InvalidUserInputException();
	}

	public static boolean lastname() throws InvalidUserInputException {

		System.out.println("Enter last name : ");
		String name = scan.next();
		String regex = "[A-Z]{1}[a-z]{2,6}";
		UserLambda lastName = (Input) -> (Pattern.compile(regex).matcher(Input).matches());
		if (lastName.validate(name) && (name != null) == true) 
		{
			return lastName.validate(name);
		}
		throw new InvalidUserInputException();
	}

	public static boolean email(String email) throws InvalidUserInputException {
//		System.out.println("Enter email address : ");
//		String email = scan.next();
		String regex = "^[A-Za-z0-9.+-]+@[a-z0-9]+[.][a-z]+$";
		UserLambda lastName = (Input) -> (Pattern.compile(regex).matcher(Input).matches());
		if (lastName.validate(email) && (email != null) == true) 
		{
			return lastName.validate(email);
		}
		throw new InvalidUserInputException();
	}

	public static boolean mobilenumber() throws InvalidUserInputException {
		System.out.println("Enter mobile number : ");
		String number = scan.next();
		String regex = "(91)?[6-9][0-9]{9}";
		UserLambda lastName = (Input) -> (Pattern.compile(regex).matcher(Input).matches());
		if (lastName.validate(number) && (number != null) == true) 
		{
			return lastName.validate(number);
		}
		throw new InvalidUserInputException();
	}

//	public static boolean Rule1() throws InvalidUserInputException {
//		System.out.println("Enter the minimum 8 character password : ");
//		String ch = scan.next();
//		String regex = "[A-Za-z]{8,}";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher ma = pattern.matcher(ch);
//		System.out.println("The character password is : " + ch + "->" + ma.matches());
//		if (ch != null) {
//			if (ma.matches() == true) {
//				System.out.println("The character password is : " + ch + "->" + ma.matches());
//				return ma.matches();
//			}
//		}
//		throw new InvalidUserInputException();
//	}
//
//	public static boolean Rule2() throws InvalidUserInputException {
//		System.out.println("Enter the at least 1 Upper case : ");
//		String uc = scan.next();
//		String regex = "(?=.*[a-z])(?=.*[A-Z]){8,}.*";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher ma = pattern.matcher(uc);
//		System.out.println("The Upper case is : " + uc + "->" + ma.matches());
//		if (uc != null) {
//			if (ma.matches() == true) {
//				System.out.println("The Upper case is : " + uc + "->" + ma.matches());
//				return ma.matches();
//			}
//		}
//		throw new InvalidUserInputException();
//	}
//
//	public static boolean Rule3() throws InvalidUserInputException {
//		System.out.println("Enter the at least 1 numeric number in password : ");
//		String numeric = scan.next();
//		final String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){8,}.*";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher ma = pattern.matcher(numeric);
//
//		if (numeric != null) {
//			if (ma.matches() == true) {
//				System.out.println("The numeric number is: " + numeric + "->" + ma.matches());
//				return ma.matches();
//			}
//		}
//		throw new InvalidUserInputException();
//	}

	public static boolean Rule4() throws InvalidUserInputException {
		System.out.println("Enter the 1 special character : ");
		String specialchar = scan.next();
		final String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[-+(){}_!@#$%^&*., ?]){8,}.*";
		UserLambda lastName = (Input) -> (Pattern.compile(regex).matcher(Input).matches());
		if (lastName.validate(specialchar) && (specialchar != null) == true) 
		{
			return lastName.validate(specialchar);
		}
		throw new InvalidUserInputException();
	}

}
