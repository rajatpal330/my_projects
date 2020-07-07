package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbcpackage.SqlUtil;

public final class question_005fmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("             <title> JSP Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("              <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/brands.min.css\" integrity=\"sha256-u8123o+sLy8uk0Du9H0Ub+KinAoHanzGsBqDkWHY1f8=\" crossorigin=\"anonymous\" >\n");
      out.write("              <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("              <link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Material Design Bootstrap -->\n");
      out.write("              <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("               <link  rel=\"stylesheet\"  type=\"text/css\" href=\"compiled.css\">\n");
      out.write("               <link  rel=\"stylesheet\" type=\"text/css\" href=\"dropdown.css\">\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("     <ul id=\"slide-out\" class=\"side-nav fixed custom-scrollbar \" style=\"background-color:#4b3e8a; transform: translateX(0%);\">\n");
      out.write("           \n");
      out.write("          \n");
      out.write("            <li>\n");
      out.write("                <ul class=\"collapsible collapsible-accordion\">\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-home  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Home<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-chalkboard-teacher  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Instruction<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-question  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Question<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                          \n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </li>  <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-graduation-cap  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Course<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-swatchbook white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Subject<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                      <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-book white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Units<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                      <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-file-alt white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Papers<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <!--/. Side navigation links -->\n");
      out.write("            <div class=\"sidenav-bg mask-strong\"></div>\n");
      out.write("        </ul>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <nav class=\"navbar fixed-top navbar-toggleable-md white navbar-expand-lg scrolling-navbar double-nav \">\n");
      out.write("            <!-- SideNav slide-out button -->\n");
      out.write("            \n");
      out.write("                <a href=\"#\" data-activates=\"slide-out\" class=\"button-collapse \" style=\"width:18%; color: #4b3e8a\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("            &nbsp &nbsp &nbsp\n");
      out.write("         \n");
      out.write("                <a class=\"navbar-brand  \" style=\"color:#4b3e8a \"  href=\"#\"><i class=\"fas fa-book-reader  prefix   fa-lg  \">&nbsp &nbsp</i> \n");
      out.write("                         Question management</a>\n");
      out.write("    \n");
      out.write("                        <button type=\"button\" class=\"btn   btn-rounded ml-auto\"style=\"background-color:#4b3e8a;width: 133px; height: 35px; color:white\"><i class=\"fas fa-sign-out-alt \"></i>Logout</button>\n");
      out.write("            \n");
      out.write("            <!-- Breadcrumb-->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"container\" style=\"height: 49px;\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\"> \n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("               \n");
      out.write("               <div class=\"col-lg-9\">\n");
      out.write("                         <div style=\"height: 33px;\">\n");
      out.write("            \n");
      out.write("                         </div>\n");
      out.write("                    <br>\n");
      out.write("                      <ul class=\"nav nav-tabs nav-justified md-tabs\" style=\"background-color: #4b3e8a\" id=\"myTabJust\" role=\"tablist\">\n");
      out.write("                           <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active \" id=\"home-tab-just\" data-toggle=\"tab\" href=\"#home-just\" role=\"tab\" aria-controls=\"home-just\"\n");
      out.write("                                aria-selected=\"true\">view Questions</a>\n");
      out.write("                          </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" id=\"profile-tab-just\" data-toggle=\"tab\" href=\"#profile-just\" role=\"tab\" aria-controls=\"profile-just\"\n");
      out.write("                                  aria-selected=\"false\">add Questions</a>\n");
      out.write("                              </li>\n");
      out.write("                    </ul>\n");
      out.write("                            <div style=\"height:5px;\">\n");
      out.write("    \n");
      out.write("                            </div>\n");
      out.write("                 <div class=\"tab-content card pt-5\" id=\"myTabContentJust\">\n");
      out.write("    \n");
      out.write("                     <div class=\"tab-pane fade show active\" id=\"home-just\" role=\"tabpanel\" aria-labelledby=\"home-tab-just\">\n");
      out.write("      <!-- Editable table -->\n");
      out.write("                       <div class=\"card \"  >\n");
      out.write("                                             <h5 style=\"background-color:#4b3e8a\" class=\"card-header  text-center white-text font-weight-bold text-uppercase py-4 \">View Questions </h5>\n");
      out.write("                              <div class=\"card-body\">\n");
      out.write("                                        <div id=\"table\" class=\"table-editable\">\n");
      out.write("                            <form class=\"text-center\"  style=\"color: #757575\" method=\"get\" >\n");
      out.write("                                                <table class=\"table table-bordered table-responsive-md table-striped text-center\">\n");
      out.write("                                                        <thead>\n");
      out.write("                                                                     <tr>\n");
      out.write("                                                                                   <th class=\"text-center\">Question</th>\n");
      out.write("                                                                                   \n");
      out.write("                                                                     </tr>\n");
      out.write("                                                        </thead>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("   <tbody>\n");
      out.write("       <tr class=\"row\">\n");
      out.write("                  <td class=\"col-lg-3\" >\n");
      out.write("                    <select  class=\"browser-default\" id=\"course_select\" name=\"\">\n");
      out.write("                        <option value=\"\" >select course</option>\n");
      out.write(" ");
 
               SqlUtil.connectDatabase();
                String qry="select * from course";
                ResultSet rs=SqlUtil.read(qry);
                while(rs.next()){
 
      out.write("\n");
      out.write("                        <option  value=\"");
      out.print(rs.getString("course_id"));
      out.write("\" selected=\"\">");
      out.print(rs.getString("course_name"));
      out.write("</option>\n");
      out.write("               ");
  
                        }
               
      out.write("    \n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td class=\"col-lg-3\">\n");
      out.write("                         <select class=\"browser-default\" id=\"semester_select\" name=\"\">\n");
      out.write("                          <option value=\"\" >select semester</option> \n");
      out.write("                         </select>\n");
      out.write("                </td>\n");
      out.write("                <td class=\"col-lg-3\">\n");
      out.write("                     <select class=\"browser-default\" id=\"subject_select\" name=\"\">\n");
      out.write("                          <option value=\"\" >select subject</option> \n");
      out.write("                         </select>\n");
      out.write("                 </td>\n");
      out.write("                 <td class=\"col-lg-3\">\n");
      out.write("                     <select class=\"browser-default\" id=\"unit_select\" name=\"\">\n");
      out.write("                          <option value=\"\" >select unit</option> \n");
      out.write("                         </select>\n");
      out.write("                 </td>\n");
      out.write("              </tr>\n");
      out.write("             <tr id=\"question_print\"> \n");
      out.write("             </tr>  \n");
      out.write("                    </tbody>\n");
      out.write("                               \n");
      out.write("        </table>\n");
      out.write("                            </form>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("</div>\n");
      out.write("               \n");
      out.write("<!-- Editable table --> \n");
      out.write("    \n");
      out.write("     </div>\n");
      out.write(" <div class=\"tab-pane fade\" id=\"profile-just\" role=\"tabpanel\" aria-labelledby=\"profile-tab-just\">\n");
      out.write("            \n");
      out.write("      <!-- Material form subscription -->\n");
      out.write("        <div class=\"card\">\n");
      out.write("\n");
      out.write("                    <h5 class=\"card-heade  white-text text-center py-4  \" style=\"background-color: #4b3e8a\">\n");
      out.write("                    <strong>Add Questions here</strong>\n");
      out.write("                    </h5>\n");
      out.write("         <div class=\"card-body px-lg-5\">\n");
      out.write("\n");
      out.write("  <!-- Form -->      \n");
      out.write("  <form class=\"text-center\" id=\"loginform\" action=\"question_add.jsp\" style=\"color: #757575\" method=\"get\" >\n");
      out.write("      <table class=\"table table-hover\">\n");
      out.write("                <tr class=\"row\">\n");
      out.write("                  <td class=\"col-lg-3\" >\n");
      out.write("                    <select  class=\"browser-default\" id=\"courses_select\" name=\"selectCourse\">\n");
      out.write("                        <option value=\"\" >select course</option>\n");
      out.write(" ");
 
               SqlUtil.connectDatabase();
                String qry1="select * from course";
                ResultSet rs1=SqlUtil.read(qry1);
                while(rs1.next()){
 
      out.write("\n");
      out.write("                        <option  value=\"");
      out.print(rs1.getString("course_id"));
      out.write("\" selected=\"\">");
      out.print(rs1.getString("course_name"));
      out.write("</option>\n");
      out.write("               ");
}
      out.write("    \n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td class=\"col-lg-3\">\n");
      out.write("                         <select class=\"browser-default\" id=\"semesters_select\" name=\"selectSemester\">\n");
      out.write("                          <option value=\"\" >select semester</option> \n");
      out.write("                         </select>\n");
      out.write("                </td>\n");
      out.write("                 <td class=\"col-lg-3\">\n");
      out.write("                     <select class=\"browser-default\" id=\"subjects_select\" name=\"selectSubject\">\n");
      out.write("                          <option value=\"\" >select subject</option> \n");
      out.write("                         </select>\n");
      out.write("                 </td>\n");
      out.write("                 <td class=\"col-lg-3\">\n");
      out.write("                     <select class=\"browser-default\" id=\"units_select\" name=\"selectUnit\">\n");
      out.write("                          <option value=\"\" >select unit</option> \n");
      out.write("                         </select>\n");
      out.write("                 </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td>\n");
      out.write("                      <div class=\"md-form input-group mb-3\">\n");
      out.write("                      <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text md-addon\" id=\"inputGroupMaterial-sizing-default\">enter the no of questions you want to enter</span>\n");
      out.write("                      </div>\n");
      out.write("                      <input type=\"text\" class=\"form-control\" id=\"textField\" name=\"questions\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroupMaterial-sizing-default\" onkeyup=\"generate()\">\n");
      out.write("                      </div>\n");
      out.write("                   </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td>\n");
      out.write("                  <span id=\"container\"></span>\n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td>\n");
      out.write("           <div>\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <button type=\"submit\" name=\"btnSubmit\"  class=\"btn white-text btn-rounded btn-sm my-0 btn-lg\" style=\"background-color: #4b3e8a; width:20%;\">Add</button>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("                 </td>\n");
      out.write("            </tr>\n");
      out.write("      </table>\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("                                         </div>\n");
      out.write("                                </div>\n");
      out.write("                          </div>\n");
      out.write("                    </div>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <!-- JQuery -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- MDB core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js\"></script>\n");
      out.write("<!--    <script type=\"text/javascript\" src=\"./test_files/compiled.min.js.download\"></script>-->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("   \n");
      out.write("    <script>\n");
      out.write("        $(\".button-collapse\").sideNav();\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    new WOW().init();\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("     $(document).ready(function(){\n");
      out.write("         $('#course_select').change(function(){\n");
      out.write("          $('#semester_select').find('option').not(':first').remove();\n");
      out.write("                var course_id = $('#course_select').val();\n");
      out.write("                var datastring=\"course_id=\"+course_id;\n");
      out.write("                  $.ajax({\n");
      out.write("      type:\"POST\",\n");
      out.write("      url:\"getSemester.jsp\",\n");
      out.write("      data:datastring,\n");
      out.write("      success:function(result)\n");
      out.write("      {\n");
      out.write("        console.log(result);\n");
      out.write("        var obj=JSON.parse(result);\n");
      out.write("       console.log(obj);\n");
      out.write("       var end= $('#semester_select').find('option').remove().end();\n");
      out.write("       end.append('<option value=\"\" selected disabled>Semester</option>');\n");
      out.write("            for (var i=0;i<obj.length;i++){\n");
      out.write("       end.append('<option value=\"'+obj[i].semid+'\">'+obj[i].sem+'</option>');\n");
      out.write("   }\n");
      out.write("       }\n");
      out.write("     });\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("     });\n");
      out.write("     </script>\n");
      out.write("     <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("         $('#semester_select').change(function(){\n");
      out.write("          $('#subject_select').find('option').not(':first').remove();\n");
      out.write("                var course_id = $('#course_select').val();\n");
      out.write("                var sem_id = $('#semester_select').val();\n");
      out.write("                var datastring={course_id:course_id,sem_id:sem_id};\n");
      out.write("                  $.ajax({\n");
      out.write("      type:\"POST\",\n");
      out.write("      url:\"getSubjectOption.jsp\",\n");
      out.write("      data:datastring,\n");
      out.write("      success:function(result)\n");
      out.write("      {\n");
      out.write("        console.log(result);\n");
      out.write("        var obj=JSON.parse(result);\n");
      out.write("       console.log(obj);\n");
      out.write("       var end= $('#subject_select').find('option').remove().end();\n");
      out.write("       end.append('<option value=\"\" selected disabled>Subject</option>');\n");
      out.write("            for (var i=0;i<obj.length;i++){\n");
      out.write("       end.append('<option value=\"'+obj[i].subject_id+'\">'+obj[i].subject_name+'</option>');\n");
      out.write("     }\n");
      out.write("       }\n");
      out.write("     });\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("     });\n");
      out.write("   </script>\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("     $(document).ready(function(){\n");
      out.write("         $('#courses_select').change(function(){\n");
      out.write("          $('#semesters_select').find('option').not(':first').remove();\n");
      out.write("                var course_id = $('#courses_select').val();\n");
      out.write("                var datastring=\"course_id=\"+course_id;\n");
      out.write("                  $.ajax({\n");
      out.write("      type:\"POST\",\n");
      out.write("      url:\"getSemester.jsp\",\n");
      out.write("      data:datastring,\n");
      out.write("      success:function(result)\n");
      out.write("      {\n");
      out.write("        console.log(result);\n");
      out.write("        var obj=JSON.parse(result);\n");
      out.write("       console.log(obj);\n");
      out.write("       var end= $('#semesters_select').find('option').remove().end();\n");
      out.write("       end.append('<option value=\"\" selected disabled>Semester</option>');\n");
      out.write("            for (var i=0;i<obj.length;i++){\n");
      out.write("       end.append('<option value=\"'+obj[i].semid+'\">'+obj[i].sem+'</option>');\n");
      out.write("   }\n");
      out.write("       }\n");
      out.write("     });\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("     });\n");
      out.write("     </script>\n");
      out.write("     <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("         $('#semesters_select').change(function(){\n");
      out.write("          $('#subjects_select').find('option').not(':first').remove();\n");
      out.write("                var course_id = $('#courses_select').val();\n");
      out.write("                var sem_id = $('#semesters_select').val();\n");
      out.write("                var datastring={course_id:course_id,sem_id:sem_id};\n");
      out.write("                  $.ajax({\n");
      out.write("      type:\"POST\",\n");
      out.write("      url:\"getSubjectOption.jsp\",\n");
      out.write("      data:datastring,\n");
      out.write("      success:function(result)\n");
      out.write("      {\n");
      out.write("        console.log(result);\n");
      out.write("        var obj=JSON.parse(result);\n");
      out.write("       console.log(obj);\n");
      out.write("       var end= $('#subjects_select').find('option').remove().end();\n");
      out.write("       end.append('<option value=\"\" selected disabled>Subject</option>');\n");
      out.write("            for (var i=0;i<obj.length;i++){\n");
      out.write("       end.append('<option value=\"'+obj[i].subject_id+'\">'+obj[i].subject_name+'</option>');\n");
      out.write("     }\n");
      out.write("       }\n");
      out.write("     });\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("     });\n");
      out.write("     </script>\n");
      out.write("    \n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("         $('#subject_select').change(function(){\n");
      out.write("          $('#unit_select').find('option').not(':first').remove();\n");
      out.write("                var subject_id = $('#subject_select').val();\n");
      out.write("                var datastring={subject_id:subject_id};\n");
      out.write("                  $.ajax({\n");
      out.write("      type:\"POST\",\n");
      out.write("      url:\"getUnitOption.jsp\",\n");
      out.write("      data:datastring,\n");
      out.write("      success:function(result)\n");
      out.write("      {\n");
      out.write("        console.log(result);\n");
      out.write("        var obj=JSON.parse(result);\n");
      out.write("       console.log(obj);\n");
      out.write("       var end= $('#unit_select').find('option').remove().end();\n");
      out.write("       end.append('<option value=\"\" selected disabled>Unit</option>');\n");
      out.write("            for (var i=0;i<obj.length;i++){\n");
      out.write("       end.append('<option value=\"'+obj[i].unit_id+'\">'+obj[i].unit_name+'</option>');\n");
      out.write("     }\n");
      out.write("       }\n");
      out.write("     });\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("     });\n");
      out.write("     </script>\n");
      out.write("     <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("         $('#subjects_select').change(function(){\n");
      out.write("          $('#units_select').find('option').not(':first').remove();\n");
      out.write("                var subject_id = $('#subjects_select').val();\n");
      out.write("                var datastring={subject_id:subject_id};\n");
      out.write("                  $.ajax({\n");
      out.write("      type:\"POST\",\n");
      out.write("      url:\"getUnitOption.jsp\",\n");
      out.write("      data:datastring,\n");
      out.write("      success:function(result)\n");
      out.write("      {\n");
      out.write("        console.log(result);\n");
      out.write("        var obj=JSON.parse(result);\n");
      out.write("       console.log(obj);\n");
      out.write("       var end= $('#units_select').find('option').remove().end();\n");
      out.write("       end.append('<option value=\"\" selected disabled>Unit</option>');\n");
      out.write("            for (var i=0;i<obj.length;i++){\n");
      out.write("       end.append('<option value=\"'+obj[i].unit_id+'\">'+obj[i].unit_name+'</option>');\n");
      out.write("     }\n");
      out.write("       }\n");
      out.write("     });\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("     });\n");
      out.write("     </script>\n");
      out.write("   <script>\n");
      out.write("       function generate(){\n");
      out.write("           \n");
      out.write("            // Number of inputs to create\n");
      out.write("            var number = document.getElementById(\"textField\").value;\n");
      out.write("            // Container <div> where dynamic content will be placed\n");
      out.write("            var container = document.getElementById(\"container\");\n");
      out.write("            // Clear previous contents of the container\n");
      out.write("            while (container.hasChildNodes()) {\n");
      out.write("                container.removeChild(container.lastChild);\n");
      out.write("            }\n");
      out.write("            for (i=1;i<=number;i++){\n");
      out.write("                // Append a node with a random text\n");
      out.write("                container.appendChild(document.createTextNode(\"enter question\"));\n");
      out.write("                var input1 = document.createElement(\"input\");\n");
      out.write("                input1.type = \"text\";\n");
      out.write("                input1.name = \"questionField\"+i;\n");
      out.write("                container.appendChild(input1);\n");
      out.write("                // Create an <input> element, set its type and name attributes\n");
      out.write("                container.appendChild(document.createTextNode(\"marks\"));\n");
      out.write("                var input2 = document.createElement(\"input\");\n");
      out.write("                input2.type = \"text\";\n");
      out.write("                input2.name = \"marksField\"+i;\n");
      out.write("                container.appendChild(input2);\n");
      out.write("                // Append a line break \n");
      out.write("                container.appendChild(document.createTextNode(\"level\"));\n");
      out.write("                var input3 = document.createElement(\"input\");\n");
      out.write("                input3.type = \"text\";\n");
      out.write("                input3.name = \"levelField\"+i;\n");
      out.write("                container.appendChild(input3);\n");
      out.write("                container.appendChild(document.createElement(\"br\"));\n");
      out.write("                container.appendChild(document.createElement(\"br\"));\n");
      out.write("                container.appendChild(document.createTextNode(\"category\"));\n");
      out.write("                var input4 = document.createElement(\"input\");\n");
      out.write("                input4.type = \"text\";\n");
      out.write("                input4.name = \"categoryField\"+i;\n");
      out.write("                container.appendChild(input4);\n");
      out.write("                container.appendChild(document.createElement(\"br\"));\n");
      out.write("                container.appendChild(document.createElement(\"br\"));\n");
      out.write("            }\n");
      out.write("       }\n");
      out.write("       </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("     $(document).ready(function(){\n");
      out.write("         $('#unit_select').change(function(){\n");
      out.write("          $('#question_print').find('td').remove();\n");
      out.write("                var subject_id = $('#subject_select').val();\n");
      out.write("                console.log(subject_id);\n");
      out.write("                var unit_id = $('#unit_select').val();\n");
      out.write("                console.log(unit_id);\n");
      out.write("                var datastring={subject_id:subject_id,unit_id:unit_id};\n");
      out.write("                  $.ajax({\n");
      out.write("      type:\"POST\",\n");
      out.write("      url:\"getQuestion.jsp\",\n");
      out.write("      data:datastring,\n");
      out.write("      success:function(result)\n");
      out.write("      {\n");
      out.write("        console.log(result);\n");
      out.write("        var end= $('#question_print').find('td').remove().end();\n");
      out.write("       end.append(result);\n");
      out.write("   }\n");
      out.write("        \n");
      out.write("     })\n");
      out.write("     ;\n");
      out.write(" });\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("           \n");
      out.write("                <div class=\"drag-target\" style=\"left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"hiddendiv common\"></div>\n");
      out.write(" \n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>");
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
