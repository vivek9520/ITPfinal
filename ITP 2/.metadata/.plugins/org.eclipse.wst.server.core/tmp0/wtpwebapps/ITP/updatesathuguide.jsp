<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<%
String id = request.getParameter("id");
String name = request.getParameter("name");

String days=request.getParameter("days");
String tools=request.getParameter("tools");
String steps=request.getParameter("steps");

if(id != null)
{
	DBConnection db = new DBConnection();
    Connection con = db.createConnection();

int personID = Integer.parseInt(id);
try
{

String sql="Update fguide set gid=?,name=?,days=?,tools=?,steps =? where gid='"+id+"'";
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1,id);
ps.setString(2, name);

ps.setString(3, days);
ps.setString(4, tools);
ps.setString(5, steps);

int i = ps.executeUpdate();
if(i > 0)
{
	 request.getRequestDispatcher("/listsathu.jsp").forward(request, response);
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




