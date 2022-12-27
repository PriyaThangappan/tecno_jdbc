package com.WebApp.Boot.WebApp.Com.response;

import java.util.List;
import java.util.Map;


import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import WebApp.Com.Entity.UserEntity;



@Component
public class ResponseGenerator {

	private static final Logger logger = Logger.getLogger(ResponseGenerator.class);

	public ResponseEntity<?> successGetResponse(Map<String, Object> response, HttpStatus ok) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		Response response1 = new Response();
		logger.debug("response status is " + HttpStatus.OK);
		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>(response1, ok);	
		return responseEntity;
	}

	public List<UserEntity> errorResponse(HttpStatus badRequest) {
		HttpHeaders headers = new HttpHeaders();
		Error error = new Error();
		Response response = new Response();
		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>(badRequest);
		return (List<UserEntity>) responseEntity;
	}

	public List<UserEntity> successResponse(HttpStatus ok) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		Response response = new Response();
		logger.debug("response status is " + HttpStatus.OK);
		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>( response, ok);
		return (List<UserEntity>) responseEntity;
	}

	public ResponseEntity<?> successGetResponse(List<UserEntity> list, HttpStatus ok) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		Response response = new Response();
		logger.debug("response status is " + HttpStatus.OK);
		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>(response, ok);	
		return responseEntity;
	}

	public List<UserEntity> successGetResponse(HttpStatus ok) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		Response response = new Response();
		logger.debug("response status is " + HttpStatus.OK);
		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>(response, ok);	
		return (List<UserEntity>) responseEntity;
	}
	}