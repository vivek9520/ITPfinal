/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-03 19:18:53 UTC
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

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("form.example input[type=text] {\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  border: 2px solid black;\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 80%;\r\n");
      out.write("  background: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form.example button {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 20%;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  background: #0dd661;\r\n");
      out.write("  color: white;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  border: 2px solid black;\r\n");
      out.write("  border-left: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form.example button:hover {\r\n");
      out.write("  background:  #282e33;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form.example::after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  clear: both;\r\n");
      out.write("  display: table;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<section  >\r\n");
      out.write(" <div class=\"w3-content w3-section\" style=\"max-width:500px\">\r\n");
      out.write("  <img class=\"mySlides\" src=\"img/fpr1.jpg\" style=\"width:1260px\" height=\"500px\">\r\n");
      out.write("  <img class=\"mySlides\" src=\"img/fpr2.jpg\" style=\"width:1260px\" height=\"500px\">\r\n");
      out.write("  <img class=\"mySlides\" src=\"img/fpr3.jpg\" style=\"width:1260px\" height=\"500px\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var myIndex = 0;\r\n");
      out.write("carousel();\r\n");
      out.write("\r\n");
      out.write("function carousel() {\r\n");
      out.write("  var i;\r\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("  for (i = 0; i < x.length; i++) {\r\n");
      out.write("    x[i].style.display = \"none\";  \r\n");
      out.write("  }\r\n");
      out.write("  myIndex++;\r\n");
      out.write("  if (myIndex > x.length) {myIndex = 1}    \r\n");
      out.write("  x[myIndex-1].style.display = \"block\";  \r\n");
      out.write("  setTimeout(carousel, 2000); // in seconds change slides\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("</section >\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("    <form action=\"home1.jsp\" method=\"get\" class=\"example\">\r\n");
      out.write("      <input type=\"text\" placeholder=\"Search farmer's name...\" name=\"search\">\r\n");
      out.write("      <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("</br> </br>\r\n");
      out.write("  <center><h1>   Farmer's Products  Details </h1> </center>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");

String id = request.getParameter("userId");
DBConnection db = new DBConnection();

Connection con = db.createConnection();
Statement statement = con.createStatement();
ResultSet resultSet = null;

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("        <div>\r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("      <table class=\"table table-dark table-striped\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>FarmerProduct Id</th>\r\n");
      out.write("                <th>Farmer's Name</th>\r\n");
      out.write("                <th>Farmer's Product</th>\r\n");
      out.write("                <th>Amount of seeds</th>\r\n");
      out.write("                <th>Harvesting Time</th>\r\n");
      out.write("                <th>Harvesting Land Acre</th>\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </tr>\r\n");
      out.write("                     </thead>\r\n");
      out.write("                     \r\n");
      out.write("                      ");

try{ 

String a = request.getParameter("search");
String sql ="SELECT * FROM farmersproducts";

resultSet = statement.executeQuery(sql);
 
while(resultSet.next()){
	
	
      out.write("\r\n");
      out.write("<tr>           \r\n");
      out.write("                \r\n");
      out.write("                <td>");
      out.print(resultSet.getString("fid") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(resultSet.getString("fname") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(resultSet.getString("fproduct") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(resultSet.getString("amountofseeds") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(resultSet.getString("harvesttime") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(resultSet.getString("harvestland") );
      out.write("</td>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("       \r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\r\n");
      out.write(" \r\n");
      out.write("       </div>\r\n");
      out.write("    </section >\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("  </section>\r\n");
      out.write("    \r\n");
      out.write("  </div>  \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
