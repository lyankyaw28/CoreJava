package main.exception_handling.custom_exception;

public class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}
