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
<title>Search Daily Price</title>

<style>


body{
	background-image:url(img/bb.jpg);	
}

.canvas_div_pdf{
	
}
</style>

</head>
<body>

<br><br>

<div class="container">
    <div class="row pt-1 pb-1">
        <div class="col-lg-12">
            <h4 class="text-center">Daily Vegetable Price Report</h4>
            
        </div>
    </div>
</div>
<section>
    <div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel">
        <div class="carousel-inner">
          
            
        <a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</section>

<section class="search-sec">
    <div class="container">
        <form action="" method="get">
            <div class="row">
                <div class="col-lg-12">
                    <div class="row">
                        <div class="col-lg-9 col-md-9 col-sm-12 p-0">
                            <input type="text" class="form-control search-slt" placeholder="Enter Product Name" name="search" required>
                        </div>
                      
                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
                            <button type="submit" class="btn btn-danger wrn-btn"><i class="fa fa-search">Search</i></button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</section>

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
	String sql ="SELECT * FROM DailyPrice where ProductName = '"+request.getParameter("search")+"'";

	resultSet = statement.executeQuery(sql);
	%>


    
    <div class="container">
    <div class="canvas_div_pdf">
	<button id="cmd" onClick="getPDF()" class="btn btn-primary active">generate PDF</button>

	
    
 <div class="">
  <h1 class="text-center">VEGETABLE REPORT</h1>      
  <p>Vegetable Name:<%=request.getParameter("search")%></p>  
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