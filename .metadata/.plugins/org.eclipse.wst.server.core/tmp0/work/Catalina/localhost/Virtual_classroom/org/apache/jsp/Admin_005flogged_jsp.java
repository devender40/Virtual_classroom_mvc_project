/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.2
 * Generated at: 2019-01-10 19:53:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Admin;

public final class Admin_005flogged_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Admin");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title> ADMIN | HOME </title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<style type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\tbody{\n");
      out.write("\t\tbackground-image:url(pic1.jpg);\n");
      out.write("\t\tbackground-repeat:no-repeat;\n");
      out.write("\t \tfont-family:sans-serif;\n");
      out.write("\t\tbackground-size:cover;\n");
      out.write("\t}\n");
      out.write("\t#MyClockDisplay{\n");
      out.write("\t\tfont-color:red;\n");
      out.write("\t\tfont-style:oblique;\n");
      out.write("\t\tfont-size:17px;\n");
      out.write("\t\tz-index:2;\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\ttop:94.5%;\n");
      out.write("\t\tleft:78%;\n");
      out.write("\t}\n");
      out.write("\th2{\n");
      out.write("\t\tcolor:#800000;\n");
      out.write("\t}\n");
      out.write("\t.menu nav{\n");
      out.write("\t\tposition:relative;\n");
      out.write("\t\tfloat:right;\n");
      out.write("\t}\n");
      out.write("\t.menu nav ul{\n");
      out.write("\t\tmargin: 0px;\n");
      out.write("\t\tpadding: 0px;\n");
      out.write("\t\tlist-style: none;\n");
      out.write("\t}\n");
      out.write("\t.menu nav ul li {\n");
      out.write("\t\tfloat:left;\n");
      out.write("\t\twidth: 200px;\n");
      out.write("\t\theight: 40px;\n");
      out.write("\t\tbackground-color: black;\n");
      out.write("\t\tborder:1px  solid white;\n");
      out.write("\t\topacity: .8;\n");
      out.write("\t\tline-height: 40px;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("\t\tposition:relative;\n");
      out.write("\t\tborder-radius:3px;\t\n");
      out.write("\t}\n");
      out.write("\t.menu nav ul li a {\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tdisplay:block;\n");
      out.write("\t}\n");
      out.write("\t.menu nav ul li a:hover {\n");
      out.write("\t\tbackground-color: green;\n");
      out.write("\t\tborder-radius: 3px;\n");
      out.write("\t}\n");
      out.write("\t.menu nav ul ul  {\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t}\n");
      out.write("\t.menu nav ul li:hover > ul {\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t.menu nav ul ul ul{\n");
      out.write("\t\tmargin-left: 200px;\n");
      out.write("\t\ttop:0px;\n");
      out.write("\t}\n");
      out.write("\t.menu1 nav{\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\ttop:42%;\n");
      out.write("\t\tleft:25%;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t.menu1 nav ul{\n");
      out.write("\t\tmargin: 0px;\n");
      out.write("\t\tpadding: 0px;\n");
      out.write("\t\tlist-style: none;\n");
      out.write("\t}\n");
      out.write("\t.menu1 nav ul li {\n");
      out.write("\t\tfloat:left;\n");
      out.write("\t\twidth: 232px;\n");
      out.write("\t\theight: 145px;\n");
      out.write("\t\tborder:1px  solid white;\n");
      out.write("\t\topacity: .8;\n");
      out.write("\t\tline-height: 30px;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tfont-size: 30px;\n");
      out.write("\t\tposition:relative;\n");
      out.write("\t\tborder-radius:3px;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t.menu1 nav ul li.profile{\n");
      out.write("\t\tbackground-color: #00ff00;\n");
      out.write("\t}\n");
      out.write("\t.menu1 nav ul li.add{\n");
      out.write("\t\tbackground-color: #0000ff;\n");
      out.write("\t}\n");
      out.write("\t.menu1 nav ul li.view{\n");
      out.write("\t\tbackground-color:#ff0080;\n");
      out.write("\t}\n");
      out.write("\t.menu1 nav ul li a {\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tdisplay:block;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"MyClockDisplay\"></div>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction showTime()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t//Date\n");
      out.write("\t\t\tvar mydate=new Date();\n");
      out.write("\t\t\tvar year=mydate.getYear(); //get the year.\n");
      out.write("\t\t\t\tif(year <1000)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tyear+=1900;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\tvar day=mydate.getDay(); //get the day.\n");
      out.write("\t\t\tvar month=mydate.getMonth(); //get the month.\n");
      out.write("\t\t\tvar daym=mydate.getDate(); //day of the month.\n");
      out.write("\t\t\tvar dayarray= new Array(\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\");\n");
      out.write("\t\t\tvar montharray=new Array(\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\");\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//Time\n");
      out.write("\t\t\tvar date = new Date();\n");
      out.write("\t\t\tvar h= date.getHours(); //0-23\n");
      out.write("\t\t\tvar m= date.getMinutes(); //0-59\n");
      out.write("\t\t\tvar s=date.getSeconds(); //0-59\n");
      out.write("\t\t\tvar session=\"AM\";\n");
      out.write("\t\t\tif(h==0){\n");
      out.write("\t\t\t\th=12;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(h>12){\n");
      out.write("\t\t\t\th=h-12;\n");
      out.write("\t\t\t\tsession=\"PM\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\th=(h<10) ? \"0\"+ h : h;\n");
      out.write("\t\t\tm=(m<10) ? \"0\"+ m : m;\n");
      out.write("\t\t\ts=(s<10) ? \"0\"+ s : s;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar date1=\"\" +dayarray[day]+ \" \" +daym+ \" \" +montharray[month]+ \" \" +year+   \"  |  \"   +h + \":\" + m + \":\" + s + \" \" + session;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tdocument.getElementById(\"MyClockDisplay\").innerText = date1;\n");
      out.write("\t\t\tdocument.getElementById(\"MyClockDisplay\").textContent = date1;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tsetTimeout(showTime,1000);\n");
      out.write("\t\t}\n");
      out.write("\t\tshowTime();\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("\t<div class=\"menu\">\n");
      out.write("\t<nav>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a href=\"Admin_logged.jsp\">Home</a></li>\n");
      out.write("\t\t<li><a>Profile</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"adm_pro\">View Profile</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li><a href=\"Add_Faculty.jsp\">Add Faculty</a></li>\n");
      out.write("\t\t<li><a href=\"display_faculty\">View Faculty</a></li>\n");
      out.write("\t\t<li><a href=\"LogoutServlet1\">Logout</a></li>\t\t\n");
      out.write("\t</ul>\n");
      out.write("\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\t");
Admin currentAdmin=(Admin)session.getAttribute("currentAdmin");
	if ( currentAdmin == null) 
    {
 	   response.sendRedirect("Admin_login1.jsp?error=Please Login First !!");
    }
    else{
      out.write("\n");
      out.write("\t<h2>Hi ");
      out.print( currentAdmin.getName() );
      out.write("</h2>\n");
      out.write("\t<h2>Welcome to Virtual Classroom</h2>\n");
      out.write("\t<br>\n");
      out.write("\t\n");
      out.write("\t<div class=\"menu1\">\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"profile\"><a href=\"adm_pro\"><br><i class=\"fa fa-user\" aria-hidden=\"true\"></i><br>View Profile</a></li>\n");
      out.write("\t\t\t\t<li class=\"add\"><a href=\"Add_Faculty.jsp\"><br><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i><br>Add Faculty</a></li>\n");
      out.write("\t\t\t\t<li class=\"view\"><a href=\"display_faculty\"><br><i class=\"fa fa-users\" aria-hidden=\"true\"></i><br>View Faculty</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t");
} 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
