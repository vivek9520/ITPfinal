/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-03 17:22:51 UTC
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

public final class update_005fhar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String fid = request.getParameter("fid");
DBConnection db = new DBConnection();
Connection con = db.createConnection();
Statement statement = con.createStatement();
ResultSet resultSet = null;


      out.write('\r');
      out.write('\n');

try{

String sql ="select * from farmersproducts where fid='"+fid+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>  AGRO  </title>\r\n");
      out.write("<style>\r\n");
      out.write(".form-style-9{\r\n");
      out.write("\tmax-width: 450px;\r\n");
      out.write("\tbackground: #FAFAFA;\r\n");
      out.write("\tpadding: 30px;\r\n");
      out.write("\tmargin: 50px auto;\r\n");
      out.write("\tbox-shadow: 1px 1px 25px rgba(0, 0, 0, 0.35);\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\tborder: 6px solid #305A72;\r\n");
      out.write("}\r\n");
      out.write(".form-style-9 ul{\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tlist-style:none;\r\n");
      out.write("}\r\n");
      out.write(".form-style-9 ul li{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\tmin-height: 35px;\r\n");
      out.write("}\r\n");
      out.write(".form-style-9 ul li  .field-style{\r\n");
      out.write("\tbox-sizing: border-box; \r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box; \r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tborder: 1px solid #B0CFE0;\r\n");
      out.write("\t-webkit-transition: all 0.30s ease-in-out;\r\n");
      out.write("\t-moz-transition: all 0.30s ease-in-out;\r\n");
      out.write("\t-ms-transition: all 0.30s ease-in-out;\r\n");
      out.write("\t-o-transition: all 0.30s ease-in-out;\r\n");
      out.write("\r\n");
      out.write("}.form-style-9 ul li  .field-style:focus{\r\n");
      out.write("\tbox-shadow: 0 0 5px #B0CFE0;\r\n");
      out.write("\tborder:1px solid #B0CFE0;\r\n");
      out.write("}\r\n");
      out.write(".form-style-9 ul li .field-full{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write(".form-style-9 ul li input[type=\"button\"], \r\n");
      out.write(".form-style-9 ul li input[type=\"submit\"] {\r\n");
      out.write("\t-moz-box-shadow: inset 0px 1px 0px 0px #3985B1;\r\n");
      out.write("\t-webkit-box-shadow: inset 0px 1px 0px 0px #3985B1;\r\n");
      out.write("\tbox-shadow: inset 0px 1px 0px 0px #3985B1;\r\n");
      out.write("\tbackground-color: #216288;\r\n");
      out.write("\tborder: 1px solid #17445E;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tpadding: 8px 18px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont: 12px Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".form-style-9 ul li input[type=\"button\"]:hover, \r\n");
      out.write(".form-style-9 ul li input[type=\"submit\"]:hover {\r\n");
      out.write("\tbackground: linear-gradient(to bottom, #2D77A2 5%, #337DA8 100%);\r\n");
      out.write("\tbackground-color: #28739E;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center><h2><font color=\"#02075d\">UPDATE FARMERS PRODUCTS </font></h2></center>\r\n");
      out.write("<form method=\"post\" action=\"update_process_har.jsp\" class=\"form-style-9\">\r\n");
      out.write("<ul>\r\n");
      out.write("    <li>\r\n");
      out.write("\tFAMER ID : \t\t<input type=\"number\" name=\"fid\" class=\"field-style field-full align-none\" value=\"");
      out.print(resultSet.getString("fid") );
      out.write("\" />\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\tFAMER NAME : \t<input type=\"text\" name=\"fname\" class=\"field-style field-full align-none\" value=\"");
      out.print(resultSet.getString("fname") );
      out.write("\"  />\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\tFAMER PRODUCT : \t<input type=\"text\" name=\"fproduct\" class=\"field-style field-full align-none\"  value=\"");
      out.print(resultSet.getString("fproduct") );
      out.write("\"  />\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\tAMOUNT OF SEEDS : \t<input type=\"text\" name=\"amountofseeds\" class=\"field-style field-full align-none\" value=\"");
      out.print(resultSet.getString("amountofseeds") );
      out.write("\" />\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\tHARVEST TIME : \t<input type=\"text\" name=\"harvesttime\" class=\"field-style field-full align-none\" value=\"");
      out.print(resultSet.getString("harvesttime") );
      out.write("\" />\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\tHARVEST LAND : <input type=\"text\" name=\"harvestland\" class=\"field-style field-full align-none\" value=\"");
      out.print(resultSet.getString("harvestland") );
      out.write("\"/>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\r\n");
      out.write("\t<center><input type=\"submit\" class=\"submit\" value=\"UPDATE\">\r\n");
      out.write("\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

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
