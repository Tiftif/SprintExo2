package com.wildcodeschool.doctor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

	@RequestMapping("/{id}")
	@ResponseBody
	public Doctor returnDoc(@PathVariable int id) {
		List<Doctor> doctors = new ArrayList<Doctor>();

		Doctor doc1 = new Doctor(9, "Christopher Eccleston");
		Doctor doc2 = new Doctor(10, "David Tennant");
		Doctor doc3 = new Doctor(11, "Matt Smith");
		Doctor doc4 = new Doctor(12, "Peter Capaldi");
		Doctor doc5 = new Doctor(13, "Jodie Whittaker");

		doctors.add(doc1);
		doctors.add(doc2);
		doctors.add(doc3);
		doctors.add(doc4);
		doctors.add(doc5);

		if (id >= 1 && id <= 8) {
			throw new ResponseStatusException(HttpStatus.SEE_OTHER, "303 See Other.");
		} else if (id >= 14 || id ==0) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 See Other.");
		}

		switch (id) {
		case 9:
			return doc1;
		case 10:
			return doc2;
		case 11:
			return doc3;
		case 12:
			return doc4;
		case 13:
			return doc5;
		default:
			return doc5;
		}

	}
}
