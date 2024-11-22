package com.ssafy.fitpass.interceptor;

import com.ssafy.fitpass.user.RetUser;
import com.ssafy.fitpass.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HttpSession session = request.getSession(false);

        if (session != null) {
            RetUser user = (RetUser) session.getAttribute("user");
            if (user != null) {
                System.out.println("logined 상태입니다.");
                return true;
            }
        }
        System.out.println("logined 상태가 아닙니다.");
        // 한글 메시지 처리
        response.setContentType("text/plain;charset=UTF-8");
        response.getWriter().write("로그인해주세요.");
        return false;
    }
}
