package com.Indium.java.mircroservicesvamsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Indium.java.mircroservicesvamsi.model.Employee;
import com.Indium.java.mircroservicesvamsi.service.ClassService;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
/* @ResponseBody */
public class DummyController {

	@Autowired
	private ClassService s;

	@GetMapping("/{id}")
	public String value(@PathVariable int id, @RequestParam("type") boolean type) {
		if (type) {
			if (id % 2 == 0) {
				return "ping";
			} else {
				return "pong";
			}
		} else {
			return "null";
		}
	}
	
//	  @GetMapping("/{vamsi}")
//	  
//	  public String value1(@PathVariable String vamsi) 
//	  { 
//		  return vamsi;
//	  }
	 

	@PostMapping()
	public Employee save(@RequestBody Employee p) {
		p.setEmpName("Vamsi");
		p.setEmpid(245);
		return p;
	}

}
