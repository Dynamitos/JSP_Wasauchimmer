/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e103;

import e102.FiboBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sabrina
 */
public class CalcFiiboServlet extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        switch (checkRequestCommando(request, "Submit"))
        {
            case "SUBMIT":
                FiboBean cb = new FiboBean();
                int startNum = Integer.parseInt(request.getParameter("startNum"));
                int turnsNum = Integer.parseInt(request.getParameter("turnsNum"));
                cb.setNums(calcFibo(startNum, turnsNum));
                request.setAttribute("fiboBean", cb);
                
                request.getRequestDispatcher("/e102_View.jsp").forward(request, response);
                break;
            case "EMPTY":
                
                break;
        }
    }
    
    private String checkRequestCommando(HttpServletRequest request, String... names)
    {
        for (String name : names)
        {
            String value = request.getParameter(name);
            //Wenn ein Wet (Value) für den Parameter (key) vorhanden ist, dann ist dieser Button (Form-Submit) gedrückt worden
            if (!(value.isEmpty()))
            {
                return name.toUpperCase();
            }
        }
        return "EMPTY";

    }
    
    private List<Integer> calcFibo(int start, int turns)
    {
        List<Integer> l = new ArrayList<>();
        int z1 = start, z2 = start, z3; 
        l.add(z1); l.add(z2);
        for(int i = 0; i < turns; i++)
        {
            z3 = z2 + z1;
            z1 = z2;
            z2 = z3;
            
            l.add(z3);
        }
        
        return l;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
