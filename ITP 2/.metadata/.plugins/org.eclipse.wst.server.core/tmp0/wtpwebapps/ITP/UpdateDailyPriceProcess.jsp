<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<%
String DPID = request.getParameter("DPID");
String MarketName=request.getParameter("MarketName");
String ProductName=request.getParameter("ProductName");

String Buying=request.getParameter("Buying");
String Selling=request.getParameter("Selling");

if(DPID != null)
{
	DBConnection db = new DBConnection();
Connection con = db.createConnection();

int personID = Integer.parseInt(DPID);
try
{

String sql="Update DailyPrice set DPID=?,MarketName=?,ProductName=?,Buying=?,Selling=? where DPID="+DPID;
PreparedStatement ps = con.prepareStatement(sql);


ps.setString(1, DPID);
ps.setString(2, MarketName);
ps.setString(3, ProductName);

ps.setString(4, Buying);
ps.setString(5, Selling);


int i = ps.executeUpdate();
if(i > 0){
	out.print("Record Updated Successfully");
	response.sendRedirect("AdminDailyPrice.jsp");
}
else{
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