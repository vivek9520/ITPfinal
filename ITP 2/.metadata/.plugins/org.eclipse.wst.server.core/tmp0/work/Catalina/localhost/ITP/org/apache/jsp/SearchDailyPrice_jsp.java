/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-03 19:19:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Utility.DBConnection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class SearchDailyPrice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("Utility.DBConnection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/DailyPriceSearchCss.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Search Daily Price</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-black w3-wide w3-padding w3-card\">\n");
      out.write("    <a href=\"#home\" class=\"w3-bar-item w3-button\"><b>AG</b> Agro</a>\n");
      out.write("    <!-- Float links to the right. Hide them on small screens -->\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\n");
      out.write("      <a href=\"#products\" class=\"w3-bar-item w3-button\">Products</a>\n");
      out.write("      <a href=\"#about\" class=\"w3-bar-item w3-button\">About</a>\n");
      out.write("      <a href=\"#slideshow\" class=\"w3-bar-item w3-button\">Contact</a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row pt-1 pb-1\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <h4 class=\"text-center\">Daily Price Search</h4>\n");
      out.write("            <h6 class=\"text-center\">awesome responsive image slider with search bar</h6>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<section>\n");
      out.write("    <div id=\"carouselExampleFade\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"carousel-item active\">\n");
      out.write("                <img src=\"img/img.jpg\" class=\"d-block w-100 h-200\" alt=\"...\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img src=\"img/img.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"prev\">\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#carouselExampleFade\" role=\"button\" data-slide=\"next\">\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"search-sec\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"\" method=\"get\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-9 col-md-9 col-sm-12 p-0\">\n");
      out.write("                            <input type=\"text\" class=\"form-control search-slt\" placeholder=\"Enter Product Name\" name=\"search\" required>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-12 p-0\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-danger wrn-btn\"><i class=\"fa fa-search\">Search</i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	String id = request.getParameter("userID");
	DBConnection db = new DBConnection();


	Connection con = db.createConnection();
	Statement statement = con.createStatement();
	ResultSet resultSet = null;

      out.write('\n');
      out.write('\n');

try{ 
	
	String Search = request.getParameter("search");
	String sql ="SELECT * FROM DailyPrice where ProductName = '"+request.getParameter("search")+"'";

	resultSet = statement.executeQuery(sql);
	
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("    \n");
      out.write("    \t<div class=\"row\">\n");
      out.write("\t");
 
	
	 
	while(resultSet.next()){
	
      out.write("\n");
      out.write("\t       \t\t <div class = \"col-md-3\">\n");
      out.write("\t           \t\t <div class=\"card  align-items-center\" style=\"width:300px height:500px padding:10px\">\n");
      out.write("\t                \t\t<img class=\"card-img-top\" src=\"img/img0.jpg\" alt=\"Card image\" style=\"width:100%\">\n");
      out.write("\t                   \t <div class=\"card-body\">\n");
      out.write("\t                        <h4 class=\"card-title alert alert-success\"><u>Vegetable :");
      out.print(resultSet.getString(3));
      out.write("</h4></u>\n");
      out.write("\t                        <h5 lass=\"card-title\">Market: ");
      out.print(resultSet.getString(2) );
      out.write("</h5>\n");
      out.write("\t                        <h6>Buying : ");
      out.print(resultSet.getString(5) );
      out.write("</h6>\n");
      out.write("\t                        <h6>Selling : ");
      out.print(resultSet.getString(6) );
      out.write("</h6>\n");
      out.write("\t                        <a href=\"#\" class=\" block\">About</a>\n");
      out.write("\t                    </div>\n");
      out.write("\t           \t\t </div>\n");
      out.write("\t           \t\t <br>\n");
      out.write("\t\n");
      out.write("\t       \t\t </div>\n");
      out.write("\t       \t\t\n");
      out.write("\n");
      out.write("\t       \t\t \n");
      out.write("\t       \t\t \n");
      out.write("\t        ");
 
	}

	} catch (Exception e) {
	e.printStackTrace();
	}
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t</div>       \n");
      out.write("<footer class=\"w3-center w3-black w3-padding-16\">\n");
      out.write("  <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" title=\"W3.CSS\" target=\"_blank\" class=\"w3-hover-text-green\">Agro web</a></p>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
