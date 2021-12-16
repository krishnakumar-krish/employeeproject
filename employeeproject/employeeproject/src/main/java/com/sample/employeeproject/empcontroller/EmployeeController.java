package com.sample.employeeproject.empcontroller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sample.employeeproject.empentity.EmployeeEntity;

import com.sample.employeeproject.empservice.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService employeeservice;

 EmployeeController(EmployeeService service) {
	
}



@PostMapping("/saveemployee")

public EmployeeEntity saveinfo (@RequestBody EmployeeEntity info) {
	return employeeservice.saveEmp(info);
	
}
@GetMapping("/findemployee")
  public List<EmployeeEntity> findemployee(){
	return employeeservice.getemEmployeeEntities();
	
	
	
}
@PutMapping("/update/{id}")

public EmployeeEntity update (@RequestBody EmployeeEntity newupdate,@PathVariable int id ) {
	return employeeservice.updateempdata(newupdate,id);
	
}

}
