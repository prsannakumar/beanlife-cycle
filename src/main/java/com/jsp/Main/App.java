package com.jsp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.jsp.dao.*;
import com.jsp.entity.Jdbcspringstudent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    
          
        System.out.println( "Application Execution Started..!!!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("com/jsp/Main/ormconfig.xml");
         StudentDao bean=con.getBean("studentDao",StudentDao.class);
         System.out.println(bean);
         System.out.println("===============================");
         
         Jdbcspringstudent student=new Jdbcspringstudent();
         student.setStudentUsn(11);
         student.setStudentName("prasanna");
         student.setStudentCity("podili");
		bean.insertStudent(student);
         System.out.println("Application Execution Ennded..!!!");
    }
    
}
