/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Acer
 */
@WebServlet(name = "displaycart", urlPatterns = {"/displaycart"})
public class displaycart extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie arr[] = request.getCookies();
        out.print("<h1 align='center'> Pako");
        out.print("</h1>");
        System.out.println("hutt");
        System.out.println(arr[1].getValue());
        System.out.println(arr[2].getValue());
        System.out.println(arr[3].getValue());
        System.out.println(arr[4].getValue());
        System.out.println(arr[5].getValue());
        System.out.println(arr[6].getValue());
        System.out.println(arr[7].getValue());
        System.out.println(arr[8].getValue());
        System.out.println(arr[9].getValue());
        System.out.println(arr[10].getValue());
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }



}
