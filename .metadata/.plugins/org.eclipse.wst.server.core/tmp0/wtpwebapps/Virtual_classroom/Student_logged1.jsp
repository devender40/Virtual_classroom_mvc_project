<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="model.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> STUDENT | HOME </title>
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
		position:absolute;
		top:94.5%;
		left:80%;
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
	<%Student currentUser=(Student)session.getAttribute("currentSessionUser");%>
	<nav>
	<ul>
		<li><a href="Student_logged.jsp">Home</a></li>
		<li><a href="#">About</a></li>
		<li><a>Profile</a>
			<ul>
				<li><a href="stud_pro">View Profile</a></li>
			</ul>
		</li>
		<li><a href="stud_view_fac">Lecture Notes</a></li>
		<li><a href="LogoutServlet">Logout</a></li>		
	</ul>
	</nav>
	</div>
</body>
</html>