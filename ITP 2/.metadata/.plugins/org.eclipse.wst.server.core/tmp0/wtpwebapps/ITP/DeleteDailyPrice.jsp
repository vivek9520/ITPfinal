<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<%
String id=request.getParameter("d");

DBConnection db = new DBConnection();
Connection con = db.createConnection();

Statement st=con.createStatement();
ResultSet resultSet = null;
try{

 
st.executeUpdate("DELETE FROM DailyPrice WHERE DPID='"+id+ "'");
}catch(SQLException e)
{
	e.printStackTrace();
}
 response.sendRedirect("AdminDailyPrice.jsp");
%>



</body>
</html>