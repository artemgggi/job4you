package com.job4you.servlet;

import com.job4you.model.User;
import com.job4you.store.DbStore;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

public class AuthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        String email = req.getParameter("email");
//        String password = req.getParameter("password");
//        User user = DbStore.instOf().findByEmailUser(email, password);
//        if (Objects.equals(user.getEmail(), email)
//                & Objects.equals(user.getPassword(), password)) {
//            HttpSession sc = req.getSession();
//            sc.setAttribute("user", user);
//            resp.sendRedirect(req.getContextPath() + "/posts.do");
//        } else {
//            req.setAttribute("error", "Не верный email или пароль");
//            req.getRequestDispatcher("login.jsp").forward(req, resp);
//        }
//    }
    }
}

