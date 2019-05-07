package com.kce.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kce.dao.EmployeeDao;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeedao;
	@Override
	@Transactional
	private String doregister(employee){
		return employeedao.doregister(employee);
	}
	@Override
	@Transactional
	private String doupdate(employee){
		return employeedao.doupdate(employee);
	}
	@Override
	@Transactional
	private String dologin(employee){
		return employeedao.dologin(employee);
	}

}
