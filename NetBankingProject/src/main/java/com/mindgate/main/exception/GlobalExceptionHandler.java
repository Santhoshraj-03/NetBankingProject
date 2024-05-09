package com.mindgate.main.exception;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotAddedException.class)
	public ResponseEntity<ProblemDetail> userNotAddedException(UserNotAddedException userNotAddedException) {
		ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		problemDetail.setTitle("User details not added");
		problemDetail.setType(URI.create("http://localhost:8080/user/add-user"));
		problemDetail.setProperty("host", "localhost");
		problemDetail.setProperty("port", "8080");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
	}

	@ExceptionHandler(AccountNotAddedException.class)
	public ResponseEntity<ProblemDetail> accountNotAddedException(AccountNotAddedException accountNotAddedException) {
		ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		problemDetail.setTitle("Account not added");
		problemDetail.setType(URI.create("http://localhost:8080/account/add-account"));
		problemDetail.setProperty("host", "localhost");
		problemDetail.setProperty("port", "8080");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
	}

	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<ProblemDetail> accountNotFoundException(AccountNotFoundException accountNotFoundException) {
		ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		problemDetail.setTitle("Account not found");
		problemDetail.setType(URI.create("http://localhost:8080/account/get-account"));
		problemDetail.setProperty("host", "localhost");
		problemDetail.setProperty("port", "8080");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ProblemDetail> userNotFoundException(UserNotFoundException userNotFoundException) {
		ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		problemDetail.setTitle("User not found");
		problemDetail.setType(URI.create("http://localhost:8080/user/get-user"));
		problemDetail.setProperty("host", "localhost");
		problemDetail.setProperty("port", "8080");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
	}
}
