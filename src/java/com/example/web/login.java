package com.example.web;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;  
import java.io.PrintWriter;  

import com.uthldap.Uthldap;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Georgio
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String hidden = request.getParameter("hidden1");
        
        Uthldap ldap = new Uthldap(username,password);

        if(ldap.auth()){
            //out.println("<html><body>Autheticated Youre name is:" + ldap.getName() +"</body></html>");
            HttpSession session = request.getSession();
            session.setAttribute("username", ldap.getName());
            session.setAttribute("birthyear", ldap.getBirthYear());
            session.setAttribute("mail", ldap.getMail());
            RequestDispatcher view = request.getRequestDispatcher("beerselection.jsp");
            view.forward(request, response);
        }
        else{
             
            RequestDispatcher view = request.getRequestDispatcher("failed.jsp");
            view.forward(request, response);
            
        }
        
        
    }
}
    
