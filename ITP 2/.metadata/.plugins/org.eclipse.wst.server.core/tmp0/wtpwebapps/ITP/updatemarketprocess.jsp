<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>


<%
String Mid = request.getParameter("Mid");
String name = request.getParameter("name");
String district=request.getParameter("district");
String province=request.getParameter("province");

if(Mid != null)
{
	DBConnection db = new DBConnection();
	Connection con = db.createConnection();

int personID = Integer.parseInt(Mid);
try
{

String sql="Update market set Mid=?,name=?,district=?,province =? where Mid="+Mid;
PreparedStatement ps = con.prepareStatement(sql);

ps.setString(1,Mid);
ps.setString(2, name);
ps.setString(3, district);
ps.setString(4, province);

int i = ps.executeUpdate();
if(i > 0)
{

request.getRequestDispatcher("/ListMarket.jsp").forward(request, response);
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