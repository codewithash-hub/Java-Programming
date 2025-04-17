package com.amigoscode;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Passport rsaPassport = new Passport("1234", "South Africa", LocalDate.of(2025, 1, 27));
		Passport ukPassport = new Passport("12399", "United Kindom", LocalDate.of(2026, 07, 20));
		
		System.out.println("RSA Passport");
		System.out.println(rsaPassport.number);
		System.out.println(rsaPassport.country);
		System.out.println(rsaPassport.expiryDate);
		System.out.println();
		
		System.out.println("RSA Passport");
		System.out.println(ukPassport.number);
		System.out.println(ukPassport.country);
		System.out.println(ukPassport.expiryDate);
		System.out.println();
	}

	static class Passport {
		String number;
		String country;
		LocalDate expiryDate;
		
		Passport(String number, String country, LocalDate expiryDate) {
			this.number = number;
			this.country = country;
			this.expiryDate = expiryDate;
		}

	}

}
