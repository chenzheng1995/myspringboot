package com.cz.myspringboot.service;

import com.cz.myspringboot.dao.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;


@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;
    @Override
    public ArrayList getStudent(int id) {
        ArrayList list = studentMapper.getStudent(id);
        return list;
    }
}
