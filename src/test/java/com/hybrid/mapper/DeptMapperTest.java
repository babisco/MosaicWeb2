package com.hybrid.mapper;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hybrid.MosaicWeb2Application;
import com.hybrid.domain.Dept;

public class DeptMapperTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MosaicWeb2Application.class, args);

		try {
			DeptMapper mapper = ctx.getBean(DeptMapper.class);
			
			mapper.delete(75);
	//		1.insert
			mapper.insert(new Dept(75, "총무부", "Seoul"));
			
			Dept d = mapper.selectByDeptno(75);
			System.out.println("Insert =>>" + d);
			
			List<Dept> depts = mapper.selectAll();
			depts.forEach(dept -> {
				System.out.println(dept);
			});
			
	//		2. Update
			mapper.update(new Dept(75, "총무부2", "Busan"));
			d = mapper.selectByDeptno(55);
			System.out.println("Update =>>" + d);
	
			depts = mapper.selectAll();
			depts.forEach(dept -> {
				System.out.println(dept);
			});
			
	//		3.Delete
			d = mapper.selectByDeptno(75);
			System.out.println("Delete =>>" + d);
			mapper.delete(55);
			
			depts = mapper.selectAll();
			depts.forEach(dept -> {
				System.out.println(dept);
			});
	} finally {
		
		ctx.close();
	
	}
	
	}
}
