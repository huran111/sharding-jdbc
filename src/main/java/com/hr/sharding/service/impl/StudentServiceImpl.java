package com.hr.sharding.service.impl;
import javax.annotation.Resource;

import com.hr.sharding.service.StudentService;
import org.springframework.stereotype.Service;

import com.hr.sharding.entity.Student;
import com.hr.sharding.mapper.StudentMapper;

@Service  
public class StudentServiceImpl implements StudentService {
      
    @Resource  
    public StudentMapper studentMapper;  
  
    public boolean insert(Student student) {  
        return studentMapper.insert(student) > 0 ? true : false;  
    }  
  
}  