package hello.servlet.web.servletmvc;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//controller에 해당

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override //고객 요청 오면 이게 호출됨
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB_INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath); //컨트롤러에서 뷰로 이동
        dispatcher.forward(request, response); //다른 서블릿이나 jsp로 이동할 수 있는 기능. 서버 내부에서 다시 호출이 발생한다.
    }
}

// WEB_INF는 외부에서 호출되지 않음 (컨트롤러를 통해서만 가능)
// 단순히 다른 곳으로 가서 view를 보여주는 클래스

