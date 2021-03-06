package com.cz.myspringboot.dao;

import com.cz.myspringboot.model.Student;

import java.util.ArrayList;


public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    ArrayList getStudent(int id);
}