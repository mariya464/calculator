package ru.appline;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import netscape.javascript.JSObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servletcalc extends javax.servlet.http.HttpServlet {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        IntBuffer jb = new IntBuffer();
        Integer line;

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        JSObject jobj = gson.fromJson(String.valueof(jb), jsonObject.class);
        JSObject jobj = gson.fromJson(Integer.valueof(jb), jsonObject.class);

        try{
            int a,b,c=0;
            a = jobj.get("p1").getAsInteger();
            b = jobj.get("p2").getAsInteger();
            String math = jobj.get("math").getAsString();

            if (math.equals("+"))
                c=a+b;
            if (math.equals("-"))
                c=a-b;
            if (math.equals("*"))
                c=a*b;
            if (math.equals("/"))
                c=a/b;
            out.println("Result is: " + c);
        }finally {
            out.close();
        }

    }


}
