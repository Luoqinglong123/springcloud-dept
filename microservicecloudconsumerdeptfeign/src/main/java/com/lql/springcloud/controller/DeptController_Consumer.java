package com.lql.springcloud.controller;

import java.util.List;

import com.lql.springcloud.entities.Dept;
import com.lql.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeptController_Consumer
{

	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept)
	{
		return deptClientService.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id)
	{
		return deptClientService.get(id);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list()
	{
		return deptClientService.list();
	}


	// 测试@EnableDiscoveryClient,消费端可以调用服务发现
	@RequestMapping(value = "/consumer/dept/discovery")
	public Object discovery()
	{
		return deptClientService.discovery();
	}


}
