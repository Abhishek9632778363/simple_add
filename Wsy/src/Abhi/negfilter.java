package Abhi;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class ngfilters
 */
@WebFilter("/add")
public class negfilter implements Filter {

    private ServletResponse respond;

	/**
     * Default constructor. 
     */
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpServletRequest req = (HttpServletRequest) request;
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		if(i>0 && j>0) {
		chain.doFilter(request, response);}
		else
			{System.out.println("invalid");
			 response.getWriter().println("invalid");}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
