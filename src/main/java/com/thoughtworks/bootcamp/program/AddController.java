package com.thoughtworks.bootcamp.program;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("add")
@CrossOrigin(origins = "*")
public class AddController {

	@Autowired
	Addservice addservice;
	
	@PostMapping
	 public ResponseEntity<Integer> addtion(@RequestBody Add add) {
		System.err.println(add.toString());
		int result= addservice.addition(add);
		return  ResponseEntity.status(HttpStatus.OK).body(result);
	}
	@GetMapping("/get")
	 public ResponseEntity<Employee> getEmp() {
		Employee emp=addservice.printemp();
		return  ResponseEntity.status(HttpStatus.OK).body(emp);
	}
	@GetMapping("/getemps")
	 public List<Employee> getEmps() {
		 return addservice.getemps();
	}
	@GetMapping("/getdoc")
	 public List<DocumentsData> getdoc() {
		 return addservice.documentGen();
	}
}
