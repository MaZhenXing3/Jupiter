package com.laioffer.job.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laioffer.job.entity.ExampleCoordinates;
import com.laioffer.job.entity.ExampleJob;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ExampleJobServlet", urlPatterns = {"/example_job"})
public class ExampleJobServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ExampleCoordinates coordinates = new ExampleCoordinates(37.38, -122.12);
        ExampleJob job = new ExampleJob("SDE", 123456, "aug 1", false, coordinates);
        response.getWriter().print(mapper.writeValueAsString(job));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
