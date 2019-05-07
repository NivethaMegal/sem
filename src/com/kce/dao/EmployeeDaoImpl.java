package com.kce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("EmployeeDaoImpl")
public class EmployeeDaoImpl implements EmployeeDao{
@Autowired
private SessionFactory sessionfactory;
@Override
private String doregister(employee){
	sessionfactory.getcurrentsession().save(employee);
	return employee;
}
@Override
private String doupdate(employee){
	sessionfactory.getcurrentsession().update(employee);
	return login;
}
@Override
private String dologin(employee){
	if(employee.getname==employeebean.getname() && employee.getpassword()==employeebean.getpassword()){
   return login;
   }
}
}
