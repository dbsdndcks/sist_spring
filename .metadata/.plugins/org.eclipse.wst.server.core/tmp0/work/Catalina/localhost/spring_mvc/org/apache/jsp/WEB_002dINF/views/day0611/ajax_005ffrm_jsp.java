/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-11 05:15:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.day0611;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajax_005ffrm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "AJAX요청";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1716336001598L));
    _jspx_dependants.put("jar:file:/C:/dev/workspace_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring_mvc/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"icon\" href=\"http://192.168.10.231/spring_mvc/common/favicon.ico\">\r\n");
      out.write("<!-- bootstrap 시작 -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- bootstrap 끝 -->\r\n");
      out.write("<!--sist스타일시트 시작-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://192.168.10.231/spring_mvc/common/css/main.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://192.168.10.231/spring_mbv/common/css/board.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--sist스타일시트 끝-->\r\n");
      out.write("<!-- JQUERY CDN 시작-->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
      out.write("<!--JQUERY CDN 끝-->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(function(){\r\n");
      out.write("		$(\"#btn\").click(function(){\r\n");
      out.write("		\r\n");
      out.write("			$.ajax({\r\n");
      out.write("			url: \"http://localhost");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/day0611/ajax_result.do\",\r\n");
      out.write("			type:\"GET\",\r\n");
      out.write("			dataType:\"JSON\",\r\n");
      out.write("			error: function(xhr){\r\n");
      out.write("				console.log(xhr.status);\r\n");
      out.write("				alert(\"서비스 원할하지 못해서 ㅈㅅㅈㅅ\")\r\n");
      out.write("			},\r\n");
      out.write("			success: function(jsonObj){\r\n");
      out.write("				alert(jsonObj);\r\n");
      out.write("				var output=\"응답결과<br>\";\r\n");
      out.write("				output+=jsonObj.msg+\"<br/>\";\r\n");
      out.write("				output+=jsonObj.msg2+\"<br/>\";\r\n");
      out.write("				$(\"#output\").html(output);\r\n");
      out.write("				\r\n");
      out.write("				var sel =$(\"#sel\")[0];\r\n");
      out.write("				sel.options[1] = new Option(jsonObj.msg);\r\n");
      out.write("				sel.options[2] = new Option(jsonObj.msg2);\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("		});//ajax\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(\"#btn2\").click(function(){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url: \"http://localhost");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/day0611/ajax_responsebody.do\",\r\n");
      out.write("				type: \"GET\",\r\n");
      out.write("				dataType: \"JSON\",\r\n");
      out.write("				error: function(xhr){\r\n");
      out.write("					console.log(xhr.status + \":\" + xhr.statusText);\r\n");
      out.write("					alert(\" wt\");\r\n");
      out.write("				},\r\n");
      out.write("				success:function(jsonObj){\r\n");
      out.write("					var output=\"\";\r\n");
      out.write("					\r\n");
      out.write("					output += \"<strong>\"+jsonObj.name+\"</strong>\";\r\n");
      out.write("					\r\n");
      out.write("					output += \"<ul>\";\r\n");
      out.write("					$.each(jsonObj.lunchList,function(i,jsonTemp){\r\n");
      out.write("						output+= \"<li>\" + jsonTemp.lunch +\"</li>\";	\r\n");
      out.write("					});\r\n");
      out.write("					\r\n");
      out.write("					output += \"</ul>\"\r\n");
      out.write("					$(\"#output\").html(output);\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("	}); //ready\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("<h2>AJAX요청</h2>\r\n");
      out.write("<div>\r\n");
      out.write("<input type=\"button\" id=\"btn\"  value=\"ajax요청\" class=\"btn btn-success btn-sm\">\r\n");
      out.write("<input type=\"button\" id=\"btn2\"  value=\"ajax요청 @ResponseBody\" class=\"btn btn-info btn-sm\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"output\"></div>\r\n");
      out.write("<select id=\"sel\">\r\n");
      out.write("	<option>------선택------</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
