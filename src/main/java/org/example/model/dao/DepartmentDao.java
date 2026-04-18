package org.example.model.dao;

import org.example.model.Department;
import org.example.model.Seller;

import java.util.List;

public interface DepartmentDao {

    void insert (Department obj);
    void update (Department obj);
    void deleteById (Integer id);
    Department findById (Integer id);
    List<Department> findAll ();


}
