package org.example;

import org.example.model.Department;
import org.example.model.Seller;
import org.example.model.dao.DaoFactory;
import org.example.model.dao.SellerDao;


import java.util.List;

public class Main { public static void main(String[] args) {

    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("\n=== TEST 1: seller finById ====" );
    Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    System.out.println("\n=== TEST 2: seller finByDepartment ====" + sellerDao);
    Department department = new Department(2, null);
    List<Seller> list = sellerDao.findByDepartment(department );

    for(Seller obj : list){
        System.out.println(obj);
    }

    }
}