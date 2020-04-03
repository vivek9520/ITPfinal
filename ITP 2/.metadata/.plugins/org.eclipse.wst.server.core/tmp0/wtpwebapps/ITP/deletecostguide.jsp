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
String Cid=request.getParameter("Cid");

DBConnection db = new DBConnection();
Connection con = db.createConnection();

Statement st=con.createStatement();
ResultSet resultSet = null;
try{

 
st.executeUpdate("delete from costguide where Cid='"+Cid+ "'");
}catch(SQLException e)
{
	e.printStackTrace();
}
 response.sendRedirect("viewCostGuide.jsp");
%>






</body>
</html>