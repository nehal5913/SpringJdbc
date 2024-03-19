package com.springcore.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springjdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);   
    
        //Initializing a query
        String query = "insert into student(id,name,city) values(?,?,?)";
        
        //Firing a query
        int result = template.update(query,4,"Vikas","Jaipur");
        System.out.println("No of rows inserted: " + result);
    }
}

