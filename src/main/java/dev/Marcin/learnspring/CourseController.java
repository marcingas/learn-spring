package dev.Marcin.learnspring;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Naucz się Spring Boot",  "dev.Marcin" ),
                new Course(2,"Naucz się Java z dev.Marcin", "dev.Marcin" ),
                new Course(3,"Naucz się Collections z dev.Marcin", "dev.Marcin" )
        );
    }
}
