package com.hr.sharding.mapper;

import java.util.List;

import com.hr.sharding.entity.Student;

/**
 * 处理学生的数据操作接口
 * @author liuyazhuang
 *
 */
public interface StudentMapper {  
      
    Integer insert(Student s);
      
    List<Student> findAll();  
      
    List<Student> findByStudentIds(List<Integer> studentIds);  

}  

