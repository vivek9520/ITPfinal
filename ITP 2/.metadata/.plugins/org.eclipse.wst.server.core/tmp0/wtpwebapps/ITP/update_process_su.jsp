<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<%
String Cid = request.getParameter("Cid");
String province=request.getParameter("province");
String product=request.getParameter("product");

String cost=request.getParameter("cost");

if(Cid != null)
{
	DBConnection db = new DBConnection();
	Connection con = db.createConnection();

int personID = Integer.parseInt(Cid);
try
{

String sql="Update costguide set Cid=?,province=?,product=?,cost=? where Cid="+Cid;
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1,Cid);
ps.setString(2, province);
ps.setString(3, product);

ps.setString(4, cost);

int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
response.sendRedirect("viewCostGuide.jsp");
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