package pengliu.me.webtest.web;

/**
 * Created by peng on 15-8-3.
 */
import pengliu.me.webtest.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet
{
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException
    {
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

        request.setAttribute("styles", result);
        RequestDispatcher view =
                request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }

}
