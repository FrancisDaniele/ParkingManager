package servlet;

import java.io.IOException;

import dao.UsuarioDao;
import dto.Usuario;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationService {
    private static final long serialVersionUID = 1L;

    public AuthenticationService() {
        super();
    }


    public static void returnToIndex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    public static void loginUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Usuario usuario = new UsuarioDao().loginUserPass(new Usuario(email, password));

        System.out.println(usuario);

        if (usuario.getNombre().equals("admin")) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario",usuario);
            response.sendRedirect("mantenimiento.jsp");
        } else if (usuario.getNombre() != null) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            response.sendRedirect("reserva.jsp");
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Usuario o contraseÃ±a incorrectos");
        }

    }

    public static void closeUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("user", null);
        response.sendRedirect("index.jsp");
    }
    
     public static void createUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Usuario usuario = new Usuario(email, password);

        int registrosModificados = new UsuarioDao().create(usuario);
        System.out.println("Registros modificados:" + registrosModificados);

        AuthenticationService.returnToIndex(request, response);
    }


   
}