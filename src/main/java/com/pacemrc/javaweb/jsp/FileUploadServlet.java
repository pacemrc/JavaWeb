package com.pacemrc.javaweb.jsp;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "FileUploadServlet", value = "/FileUploadServlet")
public class FileUploadServlet extends HttpServlet
{
    // 上传文件存储目录
    private static final String UPLOAD_PATH = "D:\\tmp";

    /**
     * 文件上传判断逻辑
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // 判断是否为多媒体上传
        if (!ServletFileUpload.isMultipartContent(request))
        {
            // 如果不是则停止
            PrintWriter writer = response.getWriter();
            writer.println("Error: 表单必须包含 enctype=multipart/form-data");
            writer.flush();
            return;
        }
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
                        PrintWriter writer = response.getWriter();
                        writer.print("FileName is :"+ fileName +"\nFilePath is :"+ filePath);
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

    }
}
