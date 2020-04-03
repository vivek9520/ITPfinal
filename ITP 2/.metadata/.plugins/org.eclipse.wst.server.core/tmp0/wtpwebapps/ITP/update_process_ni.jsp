<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<%
String pid = request.getParameter("pid");
String product=request.getParameter("product");
String season=request.getParameter("season");
String category=request.getParameter("category");
String places=request.getParameter("places");
String details=request.getParameter("details");
if(pid != null)
{
DBConnection db = new DBConnection();
Connection con = db.createConnection();

int personID = Integer.parseInt(pid);
try
{

String sql="Update product set pid=?,product=?,season=?,category=?,places=?,details=? where pid="+pid;
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1,pid);
ps.setString(2, product);
ps.setString(3, season);
ps.setString(4, category);
ps.setString(5, places);
ps.setString(6, details);

int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
response.sendRedirect("viewProduct.jsp");
}
else
{
out.print("There is a problem in updating Record.");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>