/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-05 07:25:19 UTC
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

public final class update_005fsu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String Cid = request.getParameter("Cid");
DBConnection db = new DBConnection();
Connection con = db.createConnection();
Statement statement = con.createStatement();
ResultSet resultSet = null;
      out.write('\r');
      out.write('\n');

try{

String sql ="select * from costguide where Cid='"+Cid+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<title>  Update page </title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Update_Pri.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"w3-top\">\r\n");
      out.write("  <div class=\"w3-bar w3-black w3-wide w3-padding w3-card\">\r\n");
      out.write("    <a href=\"#home\" class=\"w3-bar-item w3-button\"><b>AG</b> Agro</a>\r\n");
      out.write("    <!-- Float links to the right. Hide them on small screens -->\r\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\r\n");
      out.write("      <a href=\"#products\" class=\"w3-bar-item w3-button\">Products</a>\r\n");
      out.write("      <a href=\"#about\" class=\"w3-bar-item w3-button\">About</a>\r\n");
      out.write("      <a href=\"#slideshow\" class=\"w3-bar-item w3-button\">Contact</a>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"jumbotron jumbotron-fluid\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"bod\" >\r\n");
      out.write("<center><h2><font color=\"#02075d\">UPDATE PRODUCT</font></h2></center>\r\n");
      out.write("<form  method=\"post\" action=\"update_process_su.jsp\">\r\n");
      out.write("<h3>\r\n");
      out.write("<pre>\r\n");
      out.write("\tCID : \t\t<input class=\"form-control\"type=\"number\" name=\"Cid\" value=\"");
      out.print(resultSet.getString("Cid") );
      out.write("\" /></br>\r\n");
      out.write("\tProvince : \t<select class=\"form-control\"type=\"text\" name=\"province\" value=\"");
      out.print(resultSet.getString("province") );
      out.write("\" >\r\n");
      out.write("\t\t\t\t<option value=\"western\">Western Province</option>\r\n");
      out.write("                 <option value=\"southern\">Southern Province</option>\r\n");
      out.write("                 <option value=\"eastern\">Eastern Province</option>\r\n");
      out.write("                  <option value=\"northern\">Northern Province</option>\r\n");
      out.write("                <option value=\"central\">Central Province</option>\r\n");
      out.write("                <option value=\"northCentral\">North Central Province</option>\r\n");
      out.write("                <option value=\"northWestern\">North Western</option>\r\n");
      out.write("                <option value=\"uva\">Uva Province </option>\r\n");
      out.write("                <option value=\"sabaragamuwa\"> Sabaragamuwa Province </option>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\r\n");
      out.write("\tProduct : \t<input class=\"form-control\"type=\"text\" name=\"product\"  value=\"");
      out.print(resultSet.getString("product") );
      out.write("\" ></br>\r\n");
      out.write("\tCost : \t    <input class=\"form-control\"type=\"text\" name=\"cost\" value=\"");
      out.print(resultSet.getString("cost") );
      out.write("\" /></br>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t</pre>\r\n");
      out.write("\t</h3>\r\n");
      out.write("\t\r\n");
      out.write("\t<center><input class=\"btn btn-primary\" type=\"submit\" class=\"submit\" value=\"UPDATE\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"jumbotron jumbotron-fluid\">\r\n");
      out.write("  <div class=\"container\">\r\n");

}
con.close();
} catch (Exception e) {
e.printStackTrace();
}

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
