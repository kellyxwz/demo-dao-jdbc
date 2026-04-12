package org.example;

import org.example.model.Department;
import org.example.model.Seller;

import java.util.Date;

public class Main { public static void main(String[] args) {

        Department obj = new Department(1, "books");
        Seller seller = new Seller(21,"bob", "bob@gmail.com", new Date(), 300.0, obj);
        System.out.println(seller);
    }
}