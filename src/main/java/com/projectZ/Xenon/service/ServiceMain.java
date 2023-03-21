package com.projectZ.Xenon.service;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.simple.JSONArray;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ServiceMain {

	public static void main(String[] args) {

		System.out.println("Hello World");
		//printing hello world
		//calculating sum of two numbers
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum of two numbers is: "+c);
		buildJSONForXenon();

	}

	@SuppressWarnings("unchecked")
	private static void buildJSONForXenon() {
		//Determining the JSON structure for Xenon
		//Creating a JSON object
		//Creating a JSON array
		//Creating a JSON array of objects
		//Creating a JSON array of objects with array of objects
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "John");
		jsonObject.put("age", 30);
		jsonObject.put("city", "New York");

	}

}
