package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import jdbcpackage.SqlUtil;
import java.sql.ResultSet;

public final class getSubjectOption_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

             String course_id=request.getParameter("course_id");
                String sem_id=request.getParameter("sem_id");
                SqlUtil.connectDatabase();
                String query="select * from course_subject,subject where course_subject.subject_id=subject.subject_id and course_id="+course_id+" and semester="+sem_id+"";
                 ResultSet rs=SqlUtil.read(query);
                JSONArray jsonArray = new JSONArray();
                System.out.println("hellohhj");  
                while(rs.next())
                {
                    System.out.println("hepology");     
                    JSONObject json=new JSONObject();
                    System.out.println(query);     
                 json.put("subject_id",rs.getString("subject_id"));
                 System.out.println(query);     
                 json.put("subject_name",rs.getString("subject_name"));
                 System.out.println(query);     
                 jsonArray.add(json);
                 System.out.println(jsonArray);
                        }
         out.println(jsonArray);
            
      out.write("\n");
      out.write("   \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
