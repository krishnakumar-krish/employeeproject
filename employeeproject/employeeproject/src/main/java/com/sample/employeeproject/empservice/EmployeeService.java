package com.sample.employeeproject.empservice;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.employeeproject.empentity.EmployeeEntity;
import com.sample.employeeproject.emprepository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository emp;
public EmployeeEntity saveEmp (EmployeeEntity employee)
{
	return emp.save(employee);
	
}
//public EmployeeEntity updateemp(EmployeeEntity update,int id) {
	//return  (update,id);
	

public List<EmployeeEntity>getemEmployeeEntities() {
	return emp.findAll();
}

public EmployeeEntity updateempdata(EmployeeEntity newupdate, int id) {
	EmployeeEntity updateemp=emp.findById(id).get();
	updateemp.setName(newupdate.getName());
	updateemp.setEmail(newupdate.getEmail());
	return emp.save(updateemp);
}
	
//}


}