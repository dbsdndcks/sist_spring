/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-07-14 01:35:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>로그인 | 엘리시안호텔</title>\r\n");
      out.write("\r\n");
      out.write("<!-- S head css -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/user/common/head_css.jsp", out, false);
      out.write("\r\n");
      out.write("<link href=\"http://localhost/hotel_prj/static/home/css/ko/pc/common_new.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
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
      out.write("\r\n");
      out.write("<div class=\"skip\"><a href=\"#container\">본문 바로가기</a></div>\r\n");
      out.write("<div class=\"wrapper \">\r\n");
      out.write("\r\n");
      out.write(" <!--S header  -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/user/header.jsp", out, false);
      out.write("\r\n");
      out.write(" <!--E header  -->\r\n");
      out.write("<!--(페이지 URL)-->\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://developers.kakao.com/sdk/js/kakao.min.js\"></script> <!-- 카카오 -->\r\n");
      out.write("<script>\r\n");
      out.write("Kakao.init('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${kakaoAppKey}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'); // 카카오 앱 키\r\n");
      out.write("\r\n");
      out.write(" $(document).ready(function(){\r\n");
      out.write("	 \r\n");
      out.write("    var userInputId = getLoginCookie(\"userInputId\");//저장된 쿠기값 가져오기\r\n");
      out.write("    \r\n");
      out.write("    $(\"#frm_userid\").val(userInputId); \r\n");
      out.write("     \r\n");
      out.write("    if($(\"#frm_userid\").val() != \"\"){ // 그 전에 ID를 저장해서 처음 페이지 로딩\r\n");
      out.write("                                           // 아이디 저장하기 체크되어있을 시,\r\n");
      out.write("        $(\"#idSaveCheck\").prop(\"checked\", true); // ID 저장하기를 체크 상태로 두기.\r\n");
      out.write("    }\r\n");
      out.write("     \r\n");
      out.write("    $(\"#idSaveCheck\").change(function(){ // 체크박스에 변화가 발생시\r\n");
      out.write("        if($(\"#idSaveCheck\").is(\":checked\")){ // ID 저장하기 체크했을 때,\r\n");
      out.write("            var userInputId = $(\"#frm_userid\").val();\r\n");
      out.write("            setLoginCookie(\"userInputId\", userInputId, 7); // 7일 동안 쿠키 보관\r\n");
      out.write("        }else{ // ID 저장하기 체크 해제 시,\r\n");
      out.write("            deleteLoginCookie(\"userInputId\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("     \r\n");
      out.write("    // ID 저장하기를 체크한 상태에서 ID를 입력하는 경우, 이럴 때도 쿠키 저장.\r\n");
      out.write("    $(\"#frm_userid\").keyup(function(){ // ID 입력 칸에 ID를 입력할 때,\r\n");
      out.write("        if($(\"#idSaveCheck\").is(\":checked\")){ // ID 저장하기를 체크한 상태라면,\r\n");
      out.write("            var userInputId = $(\"#frm_userid\").val();\r\n");
      out.write("            setLoginCookie(\"userInputId\", userInputId, 7); // 7일 동안 쿠키 보관\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    window.PageScript = new PageScript();\r\n");
      out.write("});\r\n");
      out.write(" \r\n");
      out.write("function setLoginCookie(cookieName, value, exdays){\r\n");
      out.write("    var exdate = new Date();\r\n");
      out.write("    exdate.setDate(exdate.getDate() + exdays);\r\n");
      out.write("    var cookieValue = escape(value) + ((exdays==null) ? \"\" : \"; expires=\" + exdate.toGMTString());\r\n");
      out.write("    document.cookie = cookieName + \"=\" + cookieValue;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function deleteLoginCookie(cookieName){\r\n");
      out.write("    var expireDate = new Date();\r\n");
      out.write("    expireDate.setDate(expireDate.getDate() - 1);\r\n");
      out.write("    document.cookie = cookieName + \"= \" + \"; expires=\" + expireDate.toGMTString();\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function getLoginCookie(cookieName) {\r\n");
      out.write("    cookieName = cookieName + '=';\r\n");
      out.write("    var cookieData = document.cookie;\r\n");
      out.write("    var start = cookieData.indexOf(cookieName);\r\n");
      out.write("    var cookieValue = '';\r\n");
      out.write("    if(start != -1){\r\n");
      out.write("        start += cookieName.length;\r\n");
      out.write("        var end = cookieData.indexOf(';', start);\r\n");
      out.write("        if(end == -1)end = cookieData.length;\r\n");
      out.write("        cookieValue = cookieData.substring(start, end);\r\n");
      out.write("    }\r\n");
      out.write("    return unescape(cookieValue);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var PageScript = function() {\r\n");
      out.write("    this.init();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("PageScript.prototype = {\r\n");
      out.write("    init: function() {\r\n");
      out.write("        this.bindSnsLinkEvent();\r\n");
      out.write("    },\r\n");
      out.write("    validate: function() {\r\n");
      out.write("        var bResult = true;\r\n");
      out.write("        var frstIdx = \"\";\r\n");
      out.write("        $(\".membersLogin p\").each(function() {\r\n");
      out.write("            var $this = $(this);\r\n");
      out.write("            $this.find(\"input[type='text'],input[type='password']\").each(function(idx) {\r\n");
      out.write("                var validYn = true;\r\n");
      out.write("                var value = jQuery(this).val();\r\n");
      out.write("                var id = jQuery(this).attr(\"id\");\r\n");
      out.write("                if (value == \"\" && id != \"emailType\") {\r\n");
      out.write("                    validYn = false;\r\n");
      out.write("                    if (frstIdx == \"\") {\r\n");
      out.write("                        frstIdx = jQuery(this);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                if (!validYn) {\r\n");
      out.write("                    $this.addClass(\"error\");\r\n");
      out.write("                    $this.find(\".alertMessage\").show();\r\n");
      out.write("                } else {\r\n");
      out.write("                    $this.removeClass(\"error\");\r\n");
      out.write("                    $this.find(\".alertMessage\").hide();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        if (frstIdx != \"\") {\r\n");
      out.write("            bResult = false;\r\n");
      out.write("            frstIdx.focus();\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        return bResult;\r\n");
      out.write("    },\r\n");
      out.write("    fncLogin: function(param_loginSeCode) {\r\n");
      out.write("        console.log(\"fncLogin 호출됨\"); // 디버깅 로그\r\n");
      out.write("        var frm_userid = \"\";\r\n");
      out.write("        var frm_userpw = \"\";\r\n");
      out.write("        var param_nextUrl = decodeURIComponent(\"/intro.do\");\r\n");
      out.write("\r\n");
      out.write("        // 아이디 로그인시\r\n");
      out.write("        if (param_loginSeCode != \"SNS\") {\r\n");
      out.write("            if (PageScript.validate()) {\r\n");
      out.write("                console.log(\"유효성 검사 통과\"); // 디버깅 로그\r\n");
      out.write("\r\n");
      out.write("                frm_userid = jQuery(\"#frm_userid\").val(); // 입력된 아이디\r\n");
      out.write("                frm_userpw = jQuery(\"#frm_userpw\").val(); // 입력된 비밀번호\r\n");
      out.write("\r\n");
      out.write("                // form 데이터 설정\r\n");
      out.write("                jQuery(\"#loginId\").val(frm_userid);\r\n");
      out.write("                jQuery(\"#loginPassword\").val(frm_userpw);\r\n");
      out.write("                jQuery(\"#loginSeCode\").val(param_loginSeCode);\r\n");
      out.write("                jQuery(\"#nextURL\").val(param_nextUrl);\r\n");
      out.write("\r\n");
      out.write("                // 폼 제출\r\n");
      out.write("                console.log(\"폼 제출\"); // 디버깅 로그\r\n");
      out.write("                jQuery(\"#form\").submit();\r\n");
      out.write("            } else {\r\n");
      out.write("                console.log(\"유효성 검사 실패\"); // 디버깅 로그\r\n");
      out.write("            }         \r\n");
      out.write("        }\r\n");
      out.write("    },\r\n");
      out.write("    bindSnsLinkEvent: function() {\r\n");
      out.write("        $('.snsLogin > a').each(function() {\r\n");
      out.write("            $(this).bind('click', function() {\r\n");
      out.write("                var lnkType = $(this).attr('class');\r\n");
      out.write("                switch (lnkType) {\r\n");
      out.write("                    case \"google\":\r\n");
      out.write("                    	window.location.href = 'https://accounts.google.com/o/oauth2/auth?client_id=540622652015-mhtf329rjo58t00he69h3au7gr5uk8s8.apps.googleusercontent.com&redirect_uri=http://localhost/hotel_prj/user/googleLogin.do&response_type=code&scope=email profile openid&prompt=login';\r\n");
      out.write("                        break;\r\n");
      out.write("                    case \"naver\":\r\n");
      out.write("                        window.open('https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=j5rWH8NrB0CABORlvyXa&redirect_uri=http://localhost/hotel_prj/user/naverLogin.do&prompt=login');\r\n");
      out.write("                        break;\r\n");
      out.write("                    case \"kakao\":\r\n");
      out.write("                        Kakao.Auth.authorize({\r\n");
      out.write("                            redirectUri: 'http://localhost/hotel_prj/user/kakaoLogin.do',\r\n");
      out.write("                            prompts: 'login' //자동 로그인 방지\r\n");
      out.write("                        });\r\n");
      out.write("                        break;\r\n");
      out.write("                    default:\r\n");
      out.write("                        break;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    window.PageScript = new PageScript();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function redirectNextPage(nextURL) {\r\n");
      out.write("    window.location.href = nextURL;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function redirectPage() {\r\n");
      out.write("    var nextURL = decodeURIComponent(\"/intro.do\");\r\n");
      out.write("    \r\n");
      out.write("    if (nextURL != '') {\r\n");
      out.write("        window.location.href = nextURL;\r\n");
      out.write("    } else {\r\n");
      out.write("        window.location.href = 'main.do';\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function noMbrLoginPage() {\r\n");
      out.write("    $('#form').attr('action', \"/login/noMbrLoginForm.do\");\r\n");
      out.write("    $('#form').attr('target', \"_self\");\r\n");
      out.write("    $('#form').attr('method', \"post\");\r\n");
      out.write("    $('#form').submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkOrigin(origin) {\r\n");
      out.write("    const josunhotelDomain = \"https://josunhotel.com\";\r\n");
      out.write("    const josunhotelwwwDomain = \"https://www.josunhotel.com\";\r\n");
      out.write("    const appDomain = \"https://app.josunhotel.com\";\r\n");
      out.write("\r\n");
      out.write("    if (origin === josunhotelDomain\r\n");
      out.write("        || origin === josunhotelwwwDomain\r\n");
      out.write("        || origin === appDomain) {\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("    return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("window.addEventListener('message', function(e) {\r\n");
      out.write("    if (typeof e.data == \"string\") {\r\n");
      out.write("        if (checkOrigin(e.origin)) {\r\n");
      out.write("            if (e.data == \"\") {\r\n");
      out.write("                redirectPage();\r\n");
      out.write("            } else {\r\n");
      out.write("                redirectNextPage(e.data);\r\n");
      out.write("            }\r\n");
      out.write("        } else {\r\n");
      out.write("            alert(\"허용되지 않은 도메인\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 휴면해제 본인인증 page form -->\r\n");
      out.write("<form id=\"releaseIdentifyForm\" name=\"releaseIdentifyForm\" method=\"post\">\r\n");
      out.write("	<input type=\"hidden\" name=\"loginId\" value=\"\">\r\n");
      out.write("    <input type=\"hidden\" name=\"email\" value=\"\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form id=\"form\" name=\"form\" method=\"post\" action=\"set_session.do\">\r\n");
      out.write("	<input type=\"hidden\" id=\"loginId\" name=\"userId\" value=\"\" /> \r\n");
      out.write("	<input type=\"hidden\" id=\"loginPassword\" name=\"userPw\" value=\"\" /> \r\n");
      out.write("	<input type=\"hidden\" id=\"loginSeCode\" name=\"loginSeCode\" value=\"\" /> \r\n");
      out.write("	<input type=\"hidden\" id=\"nextURL\" name=\"nextURL\" value=\"/intro.do\" /> \r\n");
      out.write("	<input type=\"hidden\" id=\"hotlSysCode\" name=\"hotlSysCode\" value=\"\" />\r\n");
      out.write("		<!-- //header -->\r\n");
      out.write("		<div id=\"container\" class=\"container login\">\r\n");
      out.write("			<!-- 컨텐츠 S -->\r\n");
      out.write("			<h1 class=\"hidden\"><entry key=\"comm.login.page.msg.0010\"></h1>\r\n");
      out.write("			<div class=\"topArea\">\r\n");
      out.write("				<div class=\"topInner\">\r\n");
      out.write("					<h2 class=\"titDep1\">Sign In</h2>\r\n");
      out.write("					<p class=\"pageGuide\">\r\n");
      out.write("					머무는 모든 순간이 특별해집니다.<!-- 머무는 모든 순간이 특별해집니다. -->\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"inner\"> <!-- 소셜 로그인 추가 시 style 제거 -->\r\n");
      out.write("				<ul class=\"tabType01 tabType02\">\r\n");
      out.write("					<li class=\"on\"><a href=\"#\">\r\n");
      out.write("					엘리시안 회원 로그인<!-- 아이디 로그인 -->\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<!-- 비회원 block\r\n");
      out.write("					<li>\r\n");
      out.write("						<a href=\"javascript:return false;\" target=\"_self\"\r\n");
      out.write("						onclick=\"noMbrLoginPage()\">\r\n");
      out.write("						비회원 예약확인<!-- 비회원 예약확인\r\n");
      out.write("						</a>\r\n");
      out.write("					</li>\r\n");
      out.write("						 -->\r\n");
      out.write("				</ul>\r\n");
      out.write("				<!-- tabCont(아이디 로그인) -->\r\n");
      out.write("				<div id=\"tab01\" class=\"tabCont\" style=\"display: block\">\r\n");
      out.write("					<h3 class=\"hidden\">\r\n");
      out.write("					아이디 로그인<!-- 아이디 로그인 -->\r\n");
      out.write("					</h3>\r\n");
      out.write("					<div class=\"loginBox\"> <!-- 소셜 로그인 추가 시 style 제거 -->\r\n");
      out.write("						<div class=\"membersLogin\"> <!-- 소셜 로그인 추가 시 style 제거 -->\r\n");
      out.write("							<p class=\"loginFrm\">\r\n");
      out.write("								<!-- 필수입력서식에 미입력 발생 시, error 클래스 추가 alertMessage 노출, 포커스가 가면 error 클래스 제거 -->\r\n");
      out.write("								<span class=\"alertMessage\">\r\n");
      out.write("								아이디를 입력해주세요.<!-- 아이디를 입력해주세요. -->\r\n");
      out.write("								</span> \r\n");
      out.write("								<label class=\"hidden\" for=\"frm_userid\">아이디</label> \r\n");
      out.write("								<input type=\"text\" id=\"frm_userid\" placeholder=\"아이디\" aria-required=\"true\" /><!-- 아이디 -->\r\n");
      out.write("							</p>\r\n");
      out.write("							<p class=\"loginFrm\">\r\n");
      out.write("								<span class=\"alertMessage\">비밀번호를 입력해주세요.<!-- 비밀번호를 입력해주세요. --></span> \r\n");
      out.write("								<label class=\"hidden\" for=\"frm_userpw\">비밀번호</label><!-- 비밀번호 --> \r\n");
      out.write("								<input type=\"password\" id=\"frm_userpw\" placeholder=\"비밀번호\" aria-required=\"true\" onkeydown=\"javascript:if(event.keyCode == 13){PageScript.fncLogin('ID');}\" /><!-- 비밀번호 -->\r\n");
      out.write("							</p>\r\n");
      out.write("							<!-- 20200528 수정 : 아이디저장(추가) -->\r\n");
      out.write("							<!-- 아이디 저장 block \r\n");
      out.write("							<span class=\"frm\"> \r\n");
      out.write("								<input type=\"checkbox\" id=\"idSaveCheck\">\r\n");
      out.write("								<label for=\"idSaveCheck\">아이디 저장</label>\r\n");
      out.write("							</span>\r\n");
      out.write("							<!-- //20200528 수정 : 아이디저장(추가) -->\r\n");
      out.write("							<button type=\"button\" class=\"btnSC btnL active btnFull\" onclick=\"PageScript.fncLogin('ID'); return false;\">로그인<!-- 로그인 --></button>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"loginLink\">\r\n");
      out.write("							    <a href=\"http://localhost/hotel_prj/user/join.do\" class=\"btnS icoArr\">회원가입<!-- 회원가입 --></a>\r\n");
      out.write("							    <a href=\"http://localhost/hotel_prj/user/findIdentifyIntro.do\" class=\"btnS icoArr\">아이디 / 비밀번호 찾기<!-- 아이디 / 비밀번호 찾기 --></a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"snsLogin\">\r\n");
      out.write("                            \r\n");
      out.write("                            <!-- 소셜 로그인 -->\r\n");
      out.write("							<a href=\"javascript:void(0);\" class=\"google\">구글 로그인</a> \r\n");
      out.write("							\r\n");
      out.write("							<a href=\"javascript:void(0);\" class=\"naver\">네이버 로그인</a>\r\n");
      out.write("                                \r\n");
      out.write("							<a href=\"javascript:void(0);\" class=\"kakao\">카카오톡 로그인</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<ul class=\"txtGuide\">\r\n");
      out.write("					<li>오프라인 회원의 경우 온라인 회원가입 후 이용이 가능합니다.<!-- 오프라인 회원의 경우 온라인 회원가입 후 계정연동 가능합니다. --></li>\r\n");
      out.write("                    <li>유선 혹은 여행사를 통한 예약은 온라인 조회가 불가하오니 예약실로 문의 부탁드립니다.<!--유선 혹은 여행사를 통한 예약은 온라인 조회가 불가하오니 예약실로 문의 부탁드립니다. --></li>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("					<!-- 20200528 수정 : 가이드(문구변경) -->\r\n");
      out.write("				</ul>\r\n");
      out.write("				<!-- //tabCont(아이디/카드번호 로그인) -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- //inner -->\r\n");
      out.write("			<!-- 컨텐츠 E -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- //container -->\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<div class=\"dimmed\" style=\"display: none\"></div>\r\n");
      out.write("<!--- //Login(Layer Popup) -->\r\n");
      out.write("		<!-- //container -->\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("       <!--S footer  -->\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/user/footer.jsp", out, false);
      out.write("\r\n");
      out.write(" 		<!--E footer  -->\r\n");
      out.write(" 		\r\n");
      out.write(" 		\r\n");
      out.write(" 		\r\n");
      out.write(" 		\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- //wrapper -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"dimmed\"></div>\r\n");
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
