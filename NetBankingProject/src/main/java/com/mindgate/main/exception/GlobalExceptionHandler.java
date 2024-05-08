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
		problemDetail.setType(URI.create("http://localhost:8080/user-details/add-user-details"));
		problemDetail.setProperty("host", "localhost");
		problemDetail.setProperty("port", "8080");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);

	}
}
