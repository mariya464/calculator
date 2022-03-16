package ru.appline;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ru.appline.servletcalculate.logic.Calculator;
import ru.appline.servletcalculate.logic.Model;



@WebServlet(name = "ServletCalculate", value = "/ServletCalculate")
public class Servletcalculate extends javax.servlet.http.HttpServlet {

    Model model = Model.getInstance();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
}

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        StringBuffer jb = new StringBuffer();
        String line;

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        }catch (Exception e) {
            System.out.println("Error");
        }

        JSObject jobj = gson.fromJson(String.valueof(jb), jsonObject.class);
        request.setCharacterEncoding("UTF-8");


        int a = jobj.get("p1").getAsInteger();
        int b = jobj.get("p2").getAsInteger();
        String math = jobj.get("math").getAsString();

        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();

        pw.print(gson.toJson(model.calculate(a, b, math)));
    }
}



}
