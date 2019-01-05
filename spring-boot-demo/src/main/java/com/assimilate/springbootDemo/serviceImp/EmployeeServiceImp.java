package com.assimilate.springbootDemo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.assimilate.springbootDemo.Dao.EmployeeDao;
import com.assimilate.springbootDemo.Dao.EmployeeDaoImp;
import com.assimilate.springbootDemo.controller.ResponseConst;
import com.assimilate.springbootDemo.entity.Registration;
import com.assimilate.springbootDemo.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	@Override
	public ResponseConst registration(Registration regi) {
		String msg = empDao.addUser(regi);
		ResponseConst res=new ResponseConst();
		res.setMsg(msg);
		return res;
	}
}
