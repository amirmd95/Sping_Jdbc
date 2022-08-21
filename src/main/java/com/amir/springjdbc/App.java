package com.amir.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.amir.dao.StudentDao;
import com.amir.springjdbc.entities.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "springjdbc started-----------" );
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao template=context.getBean("StudentDao", StudentDao.class);
        
        //insert query
       // String query="INSERT INTO STUDENTS(ID,NAME,AGE,ADDRESS) VALUES(?,?,?,?)";
        //String q2="UPDATE STUDENTS SET ADDRESS='Hajipur' where id=101"; 
      // int res= template.update(query,102,"Saif",28,"Gadai");
       // int res=template.update(q2);
   //    Students students=new Students();
     //  students.setID(104);
       //students.setNAME("Raju");
       //students.setAGE(29);
       //students.setADDRESS("Mumbai");
       //int res=template.insertStudent(students);
       //System.out.println("inserted rows is"+res);
       // Students students=template.getStudent(101);
        List<Students> students=template.getAllStudent();
        for(Students student:students)
        System.out.println(student);
    }
}
