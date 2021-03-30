package com.cz.myspringboot.controller;

import com.cz.myspringboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;


@Controller
@RequestMapping("/cz")
public class StudentController {

    @Resource
    StudentService studentService;
@RequestMapping("/out")
@ResponseBody
    public  ArrayList out(){
        int id = 1;
        ArrayList list = studentService.getStudent(id);
        return list;
    }




}
