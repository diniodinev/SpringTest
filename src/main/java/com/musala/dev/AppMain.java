package com.musala.dev;

import com.musala.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Cannibal on 22.11.2014 г..
 */
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
    }
}
