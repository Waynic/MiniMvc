/*
 * BeerSelect2.java
 * -----------------------------------------
 * The second version about servlet.
*/

package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {
        // 不需要定义 printwriter 等一系列流操作
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

        // 为请求对象增加一个属性，供JSP使用，注意JSP要寻找styles
        request.setAttribute("styles", result);

        // 为JSP请求一个分派器
        RequestDispatcher view =
                request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
    }
}