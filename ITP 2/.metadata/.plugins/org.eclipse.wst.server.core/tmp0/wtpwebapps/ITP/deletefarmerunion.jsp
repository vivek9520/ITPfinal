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
String id=request.getParameter("id");

DBConnection db = new DBConnection();

Connection con = db.createConnection();
Statement st=con.createStatement();
ResultSet resultSet = null;
try{

 
st.executeUpdate("delete from farmerunion where id='"+id+ "'");
}catch(SQLException e)
{
	e.printStackTrace();
}
 response.sendRedirect("ListFarmerUnion.jsp");
%>






</body>
</html>