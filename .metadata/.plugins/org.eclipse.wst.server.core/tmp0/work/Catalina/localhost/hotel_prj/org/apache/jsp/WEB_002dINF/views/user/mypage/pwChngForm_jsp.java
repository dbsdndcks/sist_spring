/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-07-12 04:52:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pwChngForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/dev/workspace_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hotel_prj/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1716336001598L));
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("\r\n");
      out.write("<title>개인정보관리 - 비밀번호변경 | 엘리시안호텔</title>\r\n");
      out.write("\r\n");
      out.write("<!-- S head css -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/user/common/head_css.jsp", out, false);
      out.write("\r\n");
      out.write("<link href=\"http://localhost/hotel_prj/static/home/css/ko/pc/contents.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!-- E head css -->\r\n");
      out.write("\r\n");
      out.write("<!-- S head script -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/user/common/head_script.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- E head script -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"skip\"><a href=\"#container\">본문 바로가기</a></div>\r\n");
      out.write("<div class=\"wrapper \">\r\n");
      out.write("\r\n");
      out.write("<!-- S header -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/user/header.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- E header -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //패스워드 변경버튼 \r\n");
      out.write(" 	function fnChngPwApi() {\r\n");
      out.write(" 		/*\r\n");
      out.write("		사용자 입력정보 VALIDATION 체크\r\n");
      out.write("		해당 열  input, select 박스가 하나라도 미기재 된 경우 validation false\r\n");
      out.write("		최초 미입력 된 element로 focus 이동됨\r\n");
      out.write("		*/\r\n");
      out.write("		var frstIdx = \"\";\r\n");
      out.write("		$(\".intList span\").each(function(){\r\n");
      out.write("			var $this = $(this);\r\n");
      out.write("			var validYn = true;\r\n");
      out.write("			$this.find(\"input[type='text'],input[type='password']\").each(function(idx){\r\n");
      out.write("				var value = $(this).val();\r\n");
      out.write("				var id = $(this).attr(\"id\");\r\n");
      out.write("				if(value == \"\" && id != \"emailType\"){\r\n");
      out.write("					validYn = false;\r\n");
      out.write("					if(frstIdx == \"\"){\r\n");
      out.write("						frstIdx = $(this);\r\n");
      out.write("					} // end if\r\n");
      out.write("				} // end if\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			if(!validYn) {\r\n");
      out.write("				$this.addClass(\"error\");\r\n");
      out.write("				$this.find(\".alertMessage\").show();\r\n");
      out.write("			} else{\r\n");
      out.write("				$this.removeClass(\"error\");\r\n");
      out.write("				$this.find(\".alertMessage\").hide();\r\n");
      out.write("			} // end if\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		if(frstIdx != \"\"){\r\n");
      out.write("			frstIdx.focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		} // end if\r\n");
      out.write("    	\r\n");
      out.write("        //--------비밀번호 형식검증------------		\r\n");
      out.write("		 var userPw 	= $.trim($(\"#newLoginPassword\").val());		// 비밀번호 입력\r\n");
      out.write("		 var userPwRe 	= $.trim($(\"#loginPasswordRe\").val());		// 비밀번호 재입력 확인\r\n");
      out.write("		 var userId = $(\"#userId\").val();\r\n");
      out.write("		 \r\n");
      out.write("		 	// 비밀번호1 형식 검증\r\n");
      out.write("			if(!gfncPatternCheck(userPw, 8, 12)) {\r\n");
      out.write("				alert('비밀번호는 영문/숫자/특수문자 조합 8~12자리까지 입력 가능합니다.');\r\n");
      out.write("				$(\"#newLoginPassword\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			} // end if\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호2 형식 검증\r\n");
      out.write("			if(!gfncPatternCheck(userPwRe, 8, 12)) {\r\n");
      out.write("				alert('비밀번호는 영문/숫자/특수문자 조합 8~12자리까지 입력 가능합니다.');\r\n");
      out.write("				$(\"#loginPasswordRe\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			} // end if\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호1 아이디 포함 검증\r\n");
      out.write("			if(userPw.includes(userId)) {\r\n");
      out.write("				alert(\"비밀번호에 아이디를 포함할 수 없습니다.\");\r\n");
      out.write("				$(\"#newLoginPassword\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			} // end if\r\n");
      out.write("\r\n");
      out.write("			// 비밀번호2 아이디 포함 검증\r\n");
      out.write("			if(userPwRe.includes(userId)) {\r\n");
      out.write("				alert(\"비밀번호에 아이디를 포함할 수 없습니다.\");\r\n");
      out.write("				$(\"#loginPasswordRe\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			} // end if\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호1 연속된 숫자 또는 문자 검증\r\n");
      out.write("			if(containsSameCharMaxCnt(userPw) >= 3 || containsContinuosCharMaxCnt(userPwRe) >= 3) {\r\n");
      out.write("				alert(\"비밀번호에 연속된 숫자 또는 문자를 사용할 수 없습니다.\");\r\n");
      out.write("				$(\"#newLoginPassword\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			} // end if\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호2 연속된 숫자 또는 문자 검증\r\n");
      out.write("			if(containsSameCharMaxCnt(userPwRe) >= 3 || containsContinuosCharMaxCnt(userPwRe) >= 3) {\r\n");
      out.write("				alert(\"비밀번호에 연속된 숫자 또는 문자를 사용할 수 없습니다.\");\r\n");
      out.write("				$(\"#loginPasswordRe\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			} // end if\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호 확인 일치 검증\r\n");
      out.write("			if(userPw != userPwRe) {\r\n");
      out.write("				alert('비밀번호 확인이 일치하지 않습니다.');\r\n");
      out.write("				$(\"#loginPasswordRe\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			} // end if\r\n");
      out.write("		\r\n");
      out.write("    	//-----------------패스워드 변경API 호출-------------------\r\n");
      out.write(" 		var formData =  $(\"#formPwChng\").serialize();\r\n");
      out.write(" 		$.ajax({\r\n");
      out.write("			type : \"POST\",\r\n");
      out.write("			url : \"modifyMemberpw.do\",\r\n");
      out.write("		    data : formData, \r\n");
      out.write("			dataType : \"json\",\r\n");
      out.write("			success : function(jsonObj) {\r\n");
      out.write("				//신규회원 \r\n");
      out.write("				if(jsonObj.resultCode=='SUCCESS' ) { \r\n");
      out.write("					alert('비밀번호가 변경되었습니다. 다시 로그인해주세요.');\r\n");
      out.write("					location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/logout.do\";\r\n");
      out.write("				} else if(jsonObj.resultCode=='NOTCURPASS'){\r\n");
      out.write("					alert('현재 사용중인 비밀번호가 아닙니다.');\r\n");
      out.write("				\r\n");
      out.write("				}else if(jsonObj.resultCode=='SAMEASCUR'){\r\n");
      out.write("					alert('변경 할 비밀번호가 이전 비밀번호와 동일합니다.');\r\n");
      out.write("					\r\n");
      out.write("				}else{\r\n");
      out.write("					alert('처리가 실패하였습니다. 잠시 후 재시도 해주세요. 지속적으로 문제발생 시 관리자에게 문의해 주세요.');\r\n");
      out.write("				}\r\n");
      out.write("			},\r\n");
      out.write("			error:function(){\r\n");
      out.write("				alert('처리가 실패하였습니다. 잠시 후 재시도 해주세요. 지속적으로 문제발생 시 관리자에게 문의해 주세요.');\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write(" 	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<form id=\"formPwChng\" >\r\n");
      out.write("<input type=\"hidden\" id=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<div id=\"container\" class=\"container mypage\">\r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		fncLnbInfoApi();\r\n");
      out.write("	}); \r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("<h1 class=\"hidden\">마이페이지</h1>\r\n");
      out.write("<div class=\"topArea\">\r\n");
      out.write("	<div class=\"topInner\">\r\n");
      out.write("	<h2 class=\"titDep1\">My Page</h2>\r\n");
      out.write("	<p class=\"pageGuide\">회원을 위한 다양한 혜택이 준비되어 있습니다.</p>\r\n");
      out.write("	</div>\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("<div class=\"inner\">\r\n");
      out.write("	<!-- LNB -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/user/mypage/lnb.jsp", out, false);
      out.write("\r\n");
      out.write("	<!-- LNB -->\r\n");
      out.write(" \r\n");
      out.write("	<!-- myContents -->\r\n");
      out.write("	<div class=\"myContents\">\r\n");
      out.write("	<h3 class=\"titDep2\">비밀 번호 변경</h3>\r\n");
      out.write("	<p class=\"pageGuide tleft\">현재 비밀번호를 올바르게 입력해야만 비밀번호 변경이 가능합니다.</p>\r\n");
      out.write("		<div class=\"frmInfo\">\r\n");
      out.write("			<ul class=\"intList\">\r\n");
      out.write("				<li><!-- 필수입력서식에 미입력 발생 시, error 클래스 추가 alertMessage 노출, 포커스가 가면 error 클래스 제거 -->\r\n");
      out.write("				<div class=\"intWrap\">\r\n");
      out.write("					<span class=\"tit\">\r\n");
      out.write("						<label for=\"userpw\">CURRENT PASSWORD</label>\r\n");
      out.write("						<span class=\"essential\">필수</span>\r\n");
      out.write("					</span>\r\n");
      out.write("				</div>\r\n");
      out.write("                                \r\n");
      out.write("				<div class=\"intInner\">\r\n");
      out.write("					<span class=\"intArea\">\r\n");
      out.write("						<input type=\"password\" id=\"curLoginPassword\" name=\"curLoginPassword\" placeholder=\"현재 비밀번호를 입력해주세요.\" style=\"width:487px\" aria-required=\"true\" onkeydown=\"javascript: if(event.keyCode == 13) {fnChngPwApi();}\">\r\n");
      out.write("						<span class=\"alertMessage\">비밀번호를 입력해주세요.</span>\r\n");
      out.write("					</span>\r\n");
      out.write("				</div>\r\n");
      out.write("				</li>\r\n");
      out.write("\r\n");
      out.write("				<li>\r\n");
      out.write("				<div class=\"intWrap\">\r\n");
      out.write("					<span class=\"tit\">\r\n");
      out.write("						<label for=\"userpw\">NEW PASSWORD</label>\r\n");
      out.write("						<span class=\"essential\">필수</span>\r\n");
      out.write("					</span>\r\n");
      out.write("				</div>\r\n");
      out.write("                               \r\n");
      out.write("     			<div class=\"intInner\">\r\n");
      out.write("					<span class=\"intArea\">\r\n");
      out.write("						<input type=\"password\" id=\"newLoginPassword\" name=\"newLoginPassword\" placeholder=\"영문, 숫자, 특수문자 조합 8~12자리를 입력해주세요.\" style=\"width:487px\" aria-required=\"true\" onkeydown=\"javascript: if(event.keyCode == 13) {fnChngPwApi();}\">\r\n");
      out.write("						<span class=\"alertMessage\">비밀번호를 입력해주세요.</span>\r\n");
      out.write("					</span>\r\n");
      out.write("				</div>   \r\n");
      out.write("				                             \r\n");
      out.write("				<p class=\"txtGuide\">비밀번호 내 ID가 포함되거나, 연속되는 문자 또는 숫자는 3자리 이상 사용할 수 없습니다.</p>\r\n");
      out.write("				</li>\r\n");
      out.write("                            \r\n");
      out.write("				<li class=\"intList-repwd\">\r\n");
      out.write("				<div class=\"intWrap\">\r\n");
      out.write("					<span class=\"tit\">\r\n");
      out.write("						<label for=\"userpw-re\">CONFIRM PASSWORD</label>\r\n");
      out.write("						<span class=\"essential\">필수</span>\r\n");
      out.write("					</span>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"intInner\">\r\n");
      out.write("					<span class=\"intArea\">\r\n");
      out.write("						<input type=\"password\" id=\"loginPasswordRe\" name=\"loginPasswordRe\" placeholder=\"동일한 비밀번호를 입력해주세요.\" style=\"width:487px\" aria-required=\"true\" onkeydown=\"javascript: if(event.keyCode == 13) {fnChngPwApi();}\">\r\n");
      out.write("						<span class=\"alertMessage\">동일한 비밀번호를 입력해주세요.</span>\r\n");
      out.write("					</span>\r\n");
      out.write(" 				</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("                    \r\n");
      out.write("		<div class=\"btnArea\">\r\n");
      out.write("			<button type=\"button\" class=\"btnSC btnL active\" onclick=\"fnChngPwApi(); return false;\">확인</button>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- inner -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //container -->\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!--S footer  -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/user/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<!--E footer  -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //wrapper -->\r\n");
      out.write("\r\n");
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
