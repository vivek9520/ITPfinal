<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="CSS/DailyPriceSearchCss.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<meta charset="UTF-8">
<title>All Daily Report</title>

<style>


body{
	background-image:url(img/bb.jpg);	
}

.canvas_div_pdf{
	
}
</style>

</head>
<body>

<div class="w3-top">
  <div class="w3-bar w3-black w3-wide w3-padding w3-card">
    <a href="#home" class="w3-bar-item w3-button"><b>AG</b> Agro</a>
    <!-- Float links to the right. Hide them on small screens -->
    <div class="w3-right w3-hide-small">
      <a href="#products" class="w3-bar-item w3-button">Products</a>
      <a href="#about" class="w3-bar-item w3-button">About</a>
      <a href="#slideshow" class="w3-bar-item w3-button">Contact</a>
      
    </div>
  </div>
</div>

<br><br>

<div class="container">
    <div class="row pt-1 pb-1">
        <div class="col-lg-12">
            <h4 class="text-center">Daily All Vegetable Price Report</h4>
            
        </div>
    </div>
</div>




<%
	String id = request.getParameter("userID");
	DBConnection db = new DBConnection();


	Connection con = db.createConnection();
	Statement statement = con.createStatement();
	ResultSet resultSet = null;
%>

<%
try{ 
	
	String Search = request.getParameter("search");
	String sql ="SELECT * FROM DailyPrice";

	resultSet = statement.executeQuery(sql);
	%>


    
    <div class="container">
    <div class="canvas_div_pdf">
	<button id="cmd" onClick="getPDF()" class="btn btn-primary active">generate PDF</button>

	
    
 <div class="">
  <h1 class="text-center">ALL DAILY REPORT</h1>      
   
</div>            
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Market Name</th>
        <th>Buying Price</th>
        <th>Selling Price</th>
      </tr>
    </thead>
   

				
	<% 
	
	 
	while(resultSet.next()){
	%>
	
	<tbody>
      <tr>
        <td><%=resultSet.getString(2) %></td>
        <td><%=resultSet.getString(5) %></td>
        <td><%=resultSet.getString(6) %></td>
      </tr>
     
    </tbody>
	
			
	
			
	       		
	       		 
	       		 
	        <% 
	}

	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
	
	  </table>
</div>
	
	</div>

	</div>   
	
	<script>
	
	function getPDF(){
		 
		var HTML_Width = $(".canvas_div_pdf").width();
		var HTML_Height = $(".canvas_div_pdf").height();
		var top_left_margin = 15;
		var PDF_Width = HTML_Width+(top_left_margin*2);
		var PDF_Height = (PDF_Width*1.5)+(top_left_margin*2);
		var canvas_image_width = HTML_Width;
		var canvas_image_height = HTML_Height;
		
		var totalPDFPages = Math.ceil(HTML_Height/PDF_Height)-1;
		
		$(document).ready(function(){
		    $("#cmd").hide();
		});

		html2canvas($(".canvas_div_pdf")[0],{allowTaint:true}).then(function(canvas) {
			canvas.getContext('2d');
			
			console.log(canvas.height+"  "+canvas.width);
			
			
			var imgData = canvas.toDataURL("image/jpeg", 1.0);
			var pdf = new jsPDF('p', 'pt',  [PDF_Width, PDF_Height]);
		    pdf.addImage(imgData, 'JPG', top_left_margin, top_left_margin,canvas_image_width,canvas_image_height);
			
			
			for (var i = 1; i <= totalPDFPages; i++) { 
				pdf.addPage(PDF_Width, PDF_Height);
				pdf.addImage(imgData, 'JPG', top_left_margin, -(PDF_Height*i)+(top_left_margin*4),canvas_image_width,canvas_image_height);
			}
			
		    pdf.save("PriceSummary.pdf");
	    });
		
		$(document).ready(function(){
		    $("#cmd").showq1();
		});
	};
	
	</script>    
	
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.3/jspdf.min.js"></script>
	<script src="https://html2canvas.hertzen.com/dist/html2canvas.js"></script>

</body>
</html>