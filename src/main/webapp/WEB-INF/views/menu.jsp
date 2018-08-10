<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./resources/css/menu.css">
<script type="text/javascript" src="./resources/js/menujs.js"></script>
<title>CHASystem Private Limited</title>
</head>
<body>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="#">About</a>
  <a href="./showJobMasterEntryPage" id="jobMasterEntry">Add Job Master</a>
  <a href="./showJobMasterUpdatePage" id="jobMasterUpdate">Update Job Master</a>
  <a href="./showJobReceiptEntryPage" id="jobReceiptEntry">Add Job Receipt(s)</a>
  <a href="./showJobReceiptUpdatePage" id="jobReceiptUpdate">Update Job Receipt(s)</a>
  <a href="./showInvoiceDetailEntryPage" id="invoiceDetailEntry">Add Invoice Detail(s)</a>
  <a href="./showInvoiceDetailUpdatePage" id="invoiceDetailUpdate">Update Invoice Detail(s)</a>
</div>


<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span>
 <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="./resources/images/slide_1.jpg" alt="Slide 1" style="width:100%; height: 400px;">
      </div>

      <div class="item">
        <img src="./resources/images/slide_2.jpg" alt="Slide 2" style="width:100%; height: 400px;">
      </div>
    
      <div class="item">
        <img src="./resources/images/slide_3.jpg" alt="Slide 3" style="width:100%; height: 400px;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

<!-- <script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script> -->
</body>
</html>