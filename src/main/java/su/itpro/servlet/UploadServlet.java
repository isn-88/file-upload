package su.itpro.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/upload")
@MultipartConfig(maxFileSize = 16000000)
public class UploadServlet extends HttpServlet {


  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    getServletContext().getRequestDispatcher("/upload.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    Collection<Part> parts = req.getParts();
    parts.forEach(this::save);

    getServletContext().getRequestDispatcher("/upload.jsp").forward(req, resp);
  }

  private void save(Part part) {
    try (FileOutputStream fos =
        new FileOutputStream("C:\\upload\\" + part.getSubmittedFileName())) {
      fos.write(part.getInputStream().readAllBytes());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
