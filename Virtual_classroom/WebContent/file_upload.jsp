<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="model.Faculty" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script>
function checkFile() {
    var fileElement = document.getElementById("file");
    var fileExtension = "";
    if (fileElement.value.lastIndexOf(".") > 0) {
        fileExtension = fileElement.value.substring(fileElement.value.lastIndexOf(".") + 1, fileElement.value.length);
    }
    if (fileExtension.toLowerCase()=="pptx" || fileExtension.toLowerCase()=="ppt" || fileExtension.toLowerCase()=="pdf" || fileExtension.toLowerCase()=="doc" || fileExtension.toLowerCase()=="docx" || fileExtension.toLowerCase()=="txt") 
    {
        return true;
    }
    else
    {
        alert("You must select a pptx/ppt/pdf/doc/docx/txt file for upload");
        return false;
    }
}
</script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> FACULTY | UPLOAD_FILES </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<style type="text/css" rel="stylesheet">
	body{
		background-image:url(1.jpg);
		background-repeat:no-repeat;
	 	font-family:sans-serif;
		background-size:cover;
	}
	#MyClockDisplay{
		font-color:red;
		font-style:oblique;
		font-size:17px;
		z-index:2;
		position:absolute;
		top:94.5%;
		left:78%;
	}
	h2{
		color:#800000;
	}
	#up{
	width: 600px;
	background-color:white;
	border-radius:2px;
	opacity:0.9;
	padding:10px 0px;
}
	.menu nav{
		position:relative;
		float:right;
	}
	.menu nav ul{
		margin: 0px;
		padding: 0px;
		list-style: none;
	}
	.menu nav ul li {
		float:left;
		width: 200px;
		height: 40px;
		background-color: black;
		border:1px  solid white;
		opacity: .8;
		line-height: 40px;
		text-align: center;
		font-size: 20px;
		position:relative;
		border-radius:3px;	
	}
	.menu nav ul li a {
		text-decoration: none;
		color:white;
		display:block;
	}
	.menu nav ul li a:hover {
		background-color: green;
		border-radius: 3px;
	}
	.menu nav ul ul  {
		position:absolute;
		display: none;
	}
	.menu nav ul li:hover > ul {
		display: block;
	
	}
	.menu nav ul ul ul{
		margin-left: 200px;
		top:0px;
	}
	.menu1 nav{
		position:absolute;
		top:82%;
		left:38%;
		
	}
	.menu1 nav ul{
		margin: 0px;
		padding: 0px;
		list-style: none;
	}
	.menu1 nav ul li {
		float:left;
		width: 120px;
		height: 70px;
		border:1px  solid white;
		opacity: .8;
		line-height: 15px;
		text-align: center;
		font-size: 17px;
		position:relative;
		border-radius:3px;
	
	}
	.menu1 nav ul li.home{
		background-color: red;
	}
	.menu1 nav ul li.profile{
		background-color: #00ff00;
	}
	.menu1 nav ul li.view{
		background-color:#ff0080;
	}
	.menu1 nav ul li a {
		text-decoration: none;
		color:white;
		display:block;
	}
	
	</style>
</head>
<body>
<div id="MyClockDisplay"></div>
	<script type="text/javascript">
		function showTime()
		{
			//Date
			var mydate=new Date();
			var year=mydate.getYear(); //get the year.
				if(year <1000)
					{
						year+=1900;
					}
			var day=mydate.getDay(); //get the day.
			var month=mydate.getMonth(); //get the month.
			var daym=mydate.getDate(); //day of the month.
			var dayarray= new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
			var montharray=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
			
			//Time
			var date = new Date();
			var h= date.getHours(); //0-23
			var m= date.getMinutes(); //0-59
			var s=date.getSeconds(); //0-59
			var session="AM";
			if(h==0){
				h=12;
			}
			if(h>12){
				h=h-12;
				session="PM";
			}
			h=(h<10) ? "0"+ h : h;
			m=(m<10) ? "0"+ m : m;
			s=(s<10) ? "0"+ s : s;
			
			var date1="" +dayarray[day]+ " " +daym+ " " +montharray[month]+ " " +year+   "  |  "   +h + ":" + m + ":" + s + " " + session;
			
			document.getElementById("MyClockDisplay").innerText = date1;
			document.getElementById("MyClockDisplay").textContent = date1;
			
			setTimeout(showTime,1000);
		}
		showTime();
		
	</script>
	<div class="menu">
	<nav>
	<ul>
		<li><a href="Faculty_logged.jsp">Home</a></li>
		<li><a>Profile</a>
			<ul>
				<li><a href="fac_pro">View Profile</a></li>
			</ul>
		</li>
		<li><a href="file_upload.jsp">Upload File</a></li>
		<li><a>View Files</a>
		<ul>
				<li><a href="disp_files">View Uploaded Files</a></li>
			</ul>
		</li>
		<li><a href="LogoutServlet2">Logout</a></li>		
	</ul>
	</nav>
	</div>
	<%Faculty currentFaculty=(Faculty)session.getAttribute("currentFaculty");
	if ( currentFaculty == null) 
    {
 	   response.sendRedirect("Faculty_login1.jsp?error=Please Login First !!");
    }
    else{%>
	<h2>Welcome to Virtual Classroom</h2>
	<br><br><br><br><br><br><br><br><br><br>
	<center>
	<form action="upload" method="post" id="up" encType="multipart/form-data" onsubmit="return checkFile();">
		<input type="file" name="file" id="file" multiple/> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<input type="submit" value="Upload File">
	</form>
	</center>
	<br>
	<div class="menu1">
		<nav>
			<ul>
				<li class="home"><a href="Faculty_logged.jsp"><br><i class="fa fa-home" aria-hidden="true"></i><br>Home</a></li>
				<li class="profile"><a href="fac_pro"><br><i class="fa fa-user" aria-hidden="true"></i><br>View Profile</a></li>
				<li class="view"><a href="disp_files"><br><i class="fa fa-files-o" aria-hidden="true"></i><br>View Uploaded Files</a></li>
			</ul>
		</nav>
	</div>
	<%} %>

</body>
</html>