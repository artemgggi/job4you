package com.job4you.servlet;

import com.job4you.model.Candidate;
import com.job4you.store.MemStore;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CandidateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        req.setCharacterEncoding("UTF-8");
        MemStore.instOf().saveCandidate(
                new Candidate(
                        Integer.parseInt(req.getParameter("id")),
                        req.getParameter("name")
                )
        );
        resp.sendRedirect(req.getContextPath() + "/candidates.do");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("candidates", MemStore.instOf().findAllCandidates());
        req.getRequestDispatcher("candidates.jsp").forward(req, resp);
    }
}
