<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@ page import="java.io.File" %>
<%@ page import="org.apache.commons.fileupload.FileItem" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>demo08</title>
</head>

<body>
<h1>Jsp文件上传-测试实例</h1>
<h3>通过Servlet处理文件上传</h3>
<form action="/JavaWeb/FileUploadServlet" method="post" enctype="multipart/form-data">
    <input type="file" name="file" size="60"/>
    <input type="submit" value="上传"/>
</form>
<br>
<h3>通过Jsp处理文件上传</h3>
<form action="demo08.jsp" method="post" enctype="multipart/form-data">
    <input type="file" name="file" size="60"/>
    <input type="submit" value="上传"/>
</form>
</body>
<%
    // 上传文件存储目录
    String UPLOAD_PATH = "D:\\tmp";
    // 判断是否为多媒体上传
    String header = (String) request.getHeader("Content-Type");
    if (header == null){
        out.println(header);
    }
    else
        if (header.contains("multipart/form-data")){
            // 配置fileItem工厂
            DiskFileItemFactory factory = new DiskFileItemFactory();
            // 设置临时存储目录
            factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
            // 创建文件上传处理器
            ServletFileUpload upload = new ServletFileUpload(factory);
            // 防止上传文件名称乱码
            upload.setHeaderEncoding("UTF-8");
            // 如果目录不存在则创建
            File uploadDir = new File(UPLOAD_PATH);
            if (!uploadDir.exists())
            {
                uploadDir.mkdir();
            }
            try
            {
                // 解析请求的内容提取文件数据
                @SuppressWarnings("unchecked")
                List<FileItem> formItems = upload.parseRequest(request);
                if (formItems != null && formItems.size() > 0)
                {
                    // 迭代表单数据
                    for (FileItem item : formItems)
                    {
                        // 处理表单中不存在的字段
                        if (!item.isFormField())
                        {
                            String fileName = new File(item.getName()).getName();
                            String filePath = UPLOAD_PATH + File.separator + fileName;
                            File storeFile = new File(filePath);
                            // 在页面输出文件的上传路径
                            out.println("文件 "+ fileName + " 上传成功。");
                            out.println("文件路径："+ filePath);
                            // 保存文件到硬盘
                            item.write(storeFile);

                        }
                    }
                }
            }
            catch (Exception ex)
            {
                request.setAttribute("message", "错误信息: " + ex.getMessage());
            }
        }else {
        // 如果不是则停止
        out.println("Error: 上传的文件不是多媒体数据。");
    }


%>
</html>