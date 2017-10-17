/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kevin Conter
 */
public class ServletStep2 extends HttpServlet {

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
        String numbers = request.getParameter("numbers");
        Integer result;
        
        result = add(numbers);
        
        request.setAttribute("numbers", numbers);
        request.setAttribute("result", result);
        
        RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
        rd.forward(request, response);
    }
    
    private int add(String numbers){
        if(numbers.length() == 0){
            return 0;
        }else{
            String nums[] = numbers.split(",");
            
            Integer res = 0;
            for(int i=0;i<nums.length;i++){
                res += Integer.valueOf(nums[i]);
            }
            return res;
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
