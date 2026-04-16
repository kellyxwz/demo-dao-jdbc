package org.example;

import org.example.model.Department;
import org.example.model.Seller;
import org.example.model.dao.DaoFactory;
import org.example.model.dao.SellerDao;

import java.util.Date;

public class Main { public static void main(String[] args) {

    SellerDao sellerDao = DaoFactory.createSellerDao();

    Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}