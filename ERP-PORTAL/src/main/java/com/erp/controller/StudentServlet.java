package com.erp.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

import com.erp.dao.StudentDAO;
import com.erp.model.Student;

@WebServlet("/addStudent")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException{

        String name = req.getParameter("name");
        String roll = req.getParameter("roll");
        String course = req.getParameter("course");
        String year = req.getParameter("year");
        String sem = req.getParameter("semester");

        Student s = new Student(name,roll,course,year,sem);

        try{

            StudentDAO dao = new StudentDAO();

            dao.addStudent(s);

            resp.sendRedirect("viewStudents.jsp");

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}