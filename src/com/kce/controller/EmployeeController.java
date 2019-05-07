package com.kce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class EmployeeController {
 @Autowired
 private EmployeeService employeeservice;
 @RequestMapping(value="/start")
 private String init(){
	return employee;
 }
 @RequestMapping(Model model,value="/employee",model(employeebean Employee),RequestMethod.get)
 private String doregister(){
	if(employeebean!=0 && employeebean.getemployeeid()!=null && employeebean.getemployeename()!=null&& employeebean.getemailid()!=null &&employeebean.getphno()!=null  ){
	model.addAttribute(employeeservice.doregister(employeebean));
	}
	return employee;
}
 @RequestMapping(Model model,value="/login",model(employeebean Employee),RequestMethod.get)
 private String dologin(){
	 if(employeebean.getname()!=null && employeebean.getpassword()!=null){
		 model.addAtrribute(employeeservice.dologin(employeebean)));
	 }
	 return login;
 }
 @RequestMapping(Model model,value="/employee",model(employeebean Employee),RequestMethod.get)
 private String doregister(){
	if(employeebean!=0 && employeebean.getemployeeid()!=null && employeebean.getemployeename()!=null&& employeebean.getemailid()!=null &&employeebean.getphno()!=null  ){
	model.addAttribute(employeeservice.doupdate(employeebean));
	}
	return employee;
}

}