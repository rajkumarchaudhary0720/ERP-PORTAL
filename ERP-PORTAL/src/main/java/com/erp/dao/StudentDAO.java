package com.erp.dao;

import java.sql.*;
import java.util.*;

import com.erp.model.Student;

public class StudentDAO {

    Connection con;

    public StudentDAO() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/erpdb",
                "root",
                "Anurag@2255"
        );

    }

    public void addStudent(Student s) throws Exception{

        PreparedStatement ps = con.prepareStatement(
                "insert into students values(?,?,?,?,?)"
        );

        ps.setString(1,s.getName());
        ps.setString(2,s.getRoll());
        ps.setString(3,s.getCourse());
        ps.setString(4,s.getYear());
        ps.setString(5,s.getSemester());

        ps.executeUpdate();

    }

    public List<Student> getStudents() throws Exception{

        List<Student> list = new ArrayList<>();

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from students");

        while(rs.next()){

            Student s = new Student(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            );

            list.add(s);

        }

        return list;

    }

}