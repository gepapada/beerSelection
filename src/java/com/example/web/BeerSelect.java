/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Papadakis Gewrgios
 */

import com.example.model.*;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/BeerSelection"})
public class BeerSelect extends HttpServlet {

 @Override
 public void doPost( HttpServletRequest request,
                      HttpServletResponse response)
                      throws IOException, ServletException {

    String c = request.getParameter("color");
    BeerExpert be = new BeerExpert();
    List result = be.getBrands(c);
    
    request.setAttribute("styles", result);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
    }
 
} 
