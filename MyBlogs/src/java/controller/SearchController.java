/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BlogDAO;
import dal.CategoryDAO;
import entity.Blog;
import entity.Category;
import java.io.IOException;

import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class SearchController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public String getShortDescription(String txt){
        String shortDescription = txt.substring(0, 250);
        return shortDescription;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int pageSize = Integer.parseInt(request.getServletContext().getInitParameter("PageSize"));
        String pageIndex = request.getParameter("pageIndex");
        int id = Integer.parseInt(request.getParameter("category_id"));
        if(pageIndex == null){
            pageIndex = "1";
        }
        int index = Integer.parseInt(pageIndex);
        ArrayList<Blog> listBlog = new BlogDAO().getListBlog(id, index, pageSize);
        for (int i = 0; i < listBlog.size(); i++) {
            listBlog.get(i).setShortDescription(getShortDescription(listBlog.get(i).getDescription()));
        }
        int total = new BlogDAO().getTotal(id);
        int maxPage = total/pageSize;
        if(total  % pageSize  != 0 ){
            maxPage++;
        }
        Category category = new CategoryDAO().getOne(id);
        request.setAttribute("pageIndex", index);
        request.setAttribute("maxPage", maxPage);
        request.setAttribute("listBlog", listBlog);
        request.setAttribute("category", category);
        request.getRequestDispatcher("SearchCategory.jsp").forward(request, response);
        
        
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
            throws ServletException, IOException {
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
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
