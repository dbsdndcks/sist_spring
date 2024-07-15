package kr.co.sist.admin.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

//1. HandlerInterceptor ����
public class AdminInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean flag = false;
		System.out.println("1. preHandle");
		
		// ������ �� �ޱ�
		Object adminId = WebUtils.getSessionAttribute(request, "admin_id");
		System.out.println("����" + adminId);
		flag = adminId !=null; //������ �ִٸ� true, ���ٸ� false
		if(!flag) { //������ ������ �α��� ������ �̵�
			response.sendRedirect("http://localhost/interceptor_prj/admin/login_frm.do");
		}
		return flag; //true - �������� ����, false - ����!
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("2. postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("3. afterCompletion");

	}
	
}
