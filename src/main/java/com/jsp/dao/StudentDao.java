package com.jsp.dao;



import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.jsp.entity.Jdbcspringstudent;

public class StudentDao 
{
	 private HibernateTemplate hibernateTemplate;
       @Transactional
      public int insertStudent(Jdbcspringstudent Student)
     {
    	 int i =  (Integer) this.hibernateTemplate.save(Student);
    	 return i;
     }
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public StudentDao(HibernateTemplate hibernateTemplate) {
		
		this.hibernateTemplate = hibernateTemplate;
	}
	public StudentDao() {
		
		// TODO Auto-generated constructor stub
	}
	
}
