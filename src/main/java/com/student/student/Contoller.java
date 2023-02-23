package com.student.student;


import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class Contoller{

    HashMap<Integer,student> db=new HashMap<>();

    @GetMapping("/get_info/{id}")
    public student getStudent(@PathVariable int id)
    {
        return db.get(id);
    }

    @PostMapping("/add")
    public String addstudent(@RequestBody student newS )
    {
        db.put(newS.getStudentId(),newS);
        return "New Student Added";
    }

    @DeleteMapping("/get_info/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        db.remove(id);
        return "Deleted the student done";
    }
}
