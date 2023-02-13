package dev.Marcin.learnspring;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retriveAllCoursese(){
        return Arrays.asList(
                new Course(1,"Naucz się", "dev Martin"),
                new Course(2, "How to learn Java", "dev Martin"),
                new Course(3, "How to learn Spring", "dev Martin"),
                new Course(4, "How to learn learning", "dev Martin"),
                new Course(4, "How to learn learning", "dev Martin")
        );
    }



}
