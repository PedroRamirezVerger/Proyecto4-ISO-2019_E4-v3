/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2019-11-24 17:13:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calendarioGlobal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.rawgit.com/nizarmah/calendar-javascript-lib/master/calendarorganizer.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.rawgit.com/nizarmah/calendar-javascript-lib/master/calendarorganizer.min.js\"></script>\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark bg-dark fixed-top\">\r\n");
      out.write("\t<a class=\"navbar-brand\" href=\"#\">THE GOOD HEALTH</a>\r\n");
      out.write("\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\tdata-target=\"#navbarsExampleDefault\"\r\n");
      out.write("\t\taria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\"\r\n");
      out.write("\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t</button>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\r\n");
      out.write("\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/gestor\"\r\n");
      out.write("\t\t\t\ttabindex=\"-1\" aria-disabled=\"true\">Funcionalidades </a></li>\r\n");
      out.write("\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#\">Calendario<span\r\n");
      out.write("\t\t\t\t\tclass=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t</a></li>\r\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown01\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Cuenta</a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Mi Perfil</a> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">Información</a> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-item\" href=\"/\">Cerrar sesión</a>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("\t\t\t<input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Buscar\"\r\n");
      out.write("\t\t\t\taria-label=\"Search\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Buscar</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div>\r\n");
      out.write("\t<br></br>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\t<br></br>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\t<br></br>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container center\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"calendarContainer\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul id=\"listaCitas\" class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-7\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tvar calendar = new Calendar(\"calendarContainer\",   \r\n");
      out.write("\t\"small\",\r\n");
      out.write("\t[ \"Lunes\", 3 ],\r\n");
      out.write("\t[ \"#ab2a3e\", \r\n");
      out.write("\t\"641c34\", \r\n");
      out.write("\t\"#ffffff\", \r\n");
      out.write("\t\"#ffecb3\" ], \r\n");
      out.write("\t{ \r\n");
      out.write("\t\tdays : [\"Domingo\", \"Lunes\", \"Martes\", \"Miercoles\", \"Jueves\", \"Viernes\", \"Sabado\" ],\r\n");
      out.write("\t\tmonths : [ \"Enero\", \"Febrero\", \"Marzo\", \"Abril\", \"Mayo\", \"Junio\", \"Julio\", \"Agosto\", \"Septiembre\", \"Octubre\", \"Noviembre\", \"Diciembre\" ],\r\n");
      out.write("\t\tindicator : true, \r\n");
      out.write("\t\tindicator_type : 1, \r\n");
      out.write("\t\tindicator_pos : \"bottom\", \r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tcalendar.setOnClickListener('days-blocks',\r\n");
      out.write("\tfunction() {\r\n");
      out.write("\t\tconsole.log(calendar);\r\n");
      out.write("\t\tconsole.log(calendar.date.toDateString());\r\n");
      out.write("\t\tvar fecha = calendar.date.toDateString();\r\n");
      out.write("\t\tvar array = fecha.split(\" \");\r\n");
      out.write("\t\tconsole.log(array);\r\n");
      out.write("\t\tconsole.log(array[0]);\r\n");
      out.write("\t\tswitch(array[0]) {\r\n");
      out.write("\t\tcase \"Mon\":\r\n");
      out.write("\t\t\tarray[0]=\"Lunes\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Tue\":\r\n");
      out.write("\t\t\tarray[0]=\"Martes\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Wed\":\r\n");
      out.write("\t\t\tarray[0]=\"Miércoles\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Thu\":\r\n");
      out.write("\t\t\tarray[0]=\"Jueves\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Fri\":\r\n");
      out.write("\t\t\tarray[0]=\"Viernes\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Sat\":\r\n");
      out.write("\t\t\tarray[0]=\"Sábado\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Sun\":\r\n");
      out.write("\t\t\tarray[0]=\"Domingo\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tswitch(array[1]) {\r\n");
      out.write("\t\tcase \"Jan\":\r\n");
      out.write("\t\t\tarray[1]=\"01\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Feb\":\r\n");
      out.write("\t\t\tarray[1]=\"02\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Mar\":\r\n");
      out.write("\t\t\tarray[1]=\"03\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Apr\":\r\n");
      out.write("\t\t\tarray[1]=\"04\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"May\":\r\n");
      out.write("\t\t\tarray[1]=\"05\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Jun\":\r\n");
      out.write("\t\t\tarray[1]=\"06\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Jul\":\r\n");
      out.write("\t\t\tarray[1]=\"07\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Aug\":\r\n");
      out.write("\t\t\tarray[1]=\"08\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Sep\":\r\n");
      out.write("\t\t\tarray[1]=\"09\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Oct\":\r\n");
      out.write("\t\t\tarray[1]=\"10\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Nov\":\r\n");
      out.write("\t\t\tarray[1]=\"11\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Dec\":\r\n");
      out.write("\t\t\tarray[1]=\"12\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tconsole.log(array);\r\n");
      out.write("\t\t//Esta es la fecha que hay que mandar para comprobar con las citas\r\n");
      out.write("\t\tvar fechaMontada = array[2]+\"/\"+array[1]+\"/\"+array[3];\r\n");
      out.write("\t\tconsole.log(fechaMontada);\r\n");
      out.write("\t\t//Este es el día que voy a mirar por si hay que ver el horario\r\n");
      out.write("\t\tvar diaSemana = array[0];\r\n");
      out.write("\t\tconsole.log(diaSemana);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tpedirCitas(fechaMontada);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction pedirCitas(fecha) {\r\n");
      out.write("\t\tconsole.log(fecha);\r\n");
      out.write("\t\tvar data = {\r\n");
      out.write("\t\t\t\tfecha : fecha,\r\n");
      out.write("\t\t\t\ttipo : \"getCitas\"\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\tvar url = \"/calendarioGlobal\";\r\n");
      out.write("\t\t\tvar type = \"POST\";\r\n");
      out.write("\t\t\tvar success;\r\n");
      out.write("\t\t\tvar xhrFields;\r\n");
      out.write("\t\t\tvar headers = {\r\n");
      out.write("\t\t\t\t'Content-Type' : 'application/json'\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdata = JSON.stringify(data);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype: type,\r\n");
      out.write("\t\t\t\turl: url,\r\n");
      out.write("\t\t\t\tdata: data,\r\n");
      out.write("\t\t        headers : headers,\r\n");
      out.write("\t\t        xhrFields: {\r\n");
      out.write("\t\t            withCredentials: true\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        success : CitasOK,\r\n");
      out.write("\t\t        error : CitasError\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction CitasOK(respuesta) {\r\n");
      out.write("\t\tconsole.log(respuesta);\r\n");
      out.write("\t\tvar jsoCitas = JSON.parse(respuesta);\r\n");
      out.write("\t\tconsole.log(jsoCitas);\r\n");
      out.write("\t\tconsole.log(jsoCitas.Citas.length);\r\n");
      out.write("\t\tif(document.getElementById(\"filas\")!= null)\r\n");
      out.write("\t\t\t$('#listaCitas').empty();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(jsoCitas.Citas.length == 0)\r\n");
      out.write("\t\t\t$('#listaCitas').append(\"<a id=filas class=list-group-item list-group-item-action flex-column align-items-start active><div class=d-flex w-100 justify-content-between></div><p class=mb-1><b>No hay citas pendientes para este día.</b></p></a>\");\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\tfor(var i=0; i<jsoCitas.Citas.length; i++){\r\n");
      out.write("\t\t\t\tvar fecha = jsoCitas.Citas[i].dia;\r\n");
      out.write("\t\t\t\tvar hora = jsoCitas.Citas[i].hora;\r\n");
      out.write("\t\t\t\tvar nombreMedico = jsoCitas.Citas[i].nombreMedico;\r\n");
      out.write("\t\t\t\tvar nombrePaciente = jsoCitas.Citas[i].nombrePaciente;\r\n");
      out.write("\t\t\t\tvar apellidosMedico = jsoCitas.Citas[i].apellidosMedico;\r\n");
      out.write("\t\t\t\tvar apellidosPaciente = jsoCitas.Citas[i].apellidosPaciente;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$('#listaCitas').append(\"<a id=filas class=list-group-item list-group-item-action flex-column align-items-start active><div class=d-flex w-100 justify-content-between><h5 class=mb-1>Día: \"+fecha+\", Hora: \"+hora+\"</h5></div><p class=mb-1>Dr. \"+nombreMedico+\" \"+apellidosMedico+\" tiene una cita con el/la paciente \"+nombrePaciente+\" \"+apellidosPaciente+\".</p></a>\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction CitasError(respuesta) {\r\n");
      out.write("\t\tconsole.log(respuesta);\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>");
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
