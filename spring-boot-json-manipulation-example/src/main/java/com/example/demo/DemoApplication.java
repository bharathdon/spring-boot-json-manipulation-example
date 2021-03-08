package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Map.Entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(path = "/", produces = "application/json")
	public User abc() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

//		JsonNode readValue2 = objectMapper.readValue(new File("abc.json"), JsonNode.class);
		
//		JsonNode jsonNode = readValue2.path("Address").path("Address1");
//		System.out.println(jsonNode);

//		InputStream resourceAsStream = DemoApplication.class.getClassLoader().getResourceAsStream("abc.json");
//		JsonNode readTree = objectMapper.readTree(resourceAsStream);
//
//		// System.out.println(readTree);
//
//		JsonNode path = readTree.findPath("Address1");
//
//		System.out.println(path);
//
//		JsonNode path2 = readTree.findPath("Address2");
//		System.out.println(path2);
//
//		return readTree;
		
		
		
		
byte[] bs = Files.readAllBytes(Paths.get("abc.json"));

User[] users = objectMapper.readValue(bs, User[].class);

System.out.println("user object "+users);


User user = createUser();

objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

StringWriter stringWriter = new StringWriter();
objectMapper.writeValue(stringWriter, user);

System.out.println("user json is :   "+ stringWriter);
		
	return user;			
	}

	private User createUser() {

		User user = new User();
		user.setSalutation("Mr");
		user.setRole("675765");
		user.setSPcorporateType("Individual");
		user.setAgentTypeID(0);
		user.setPhone("54647578");
		
		
		
		Address address = new Address();
		address.setAddress1("B-35-A");
		address.setAddress2("OLD DLF COLONY GURGAON");
		address.setPinCode("9000s");
		address.setState("haryana");
		user.setAddress(address);
		
		return user;
	}
	
	

}
