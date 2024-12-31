package com.training.exception;

public class UserDefinedException {
	
	public static void validaAge(int age)throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age Should be greater or equal to 18 to caste a vote");
		}else {
			System.out.println("Valida Age to caste a vote");
		}
			
	}
	
	public static void main(String[] args) {
		try {
		UserDefinedException.validaAge(17);
		}catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	

}
