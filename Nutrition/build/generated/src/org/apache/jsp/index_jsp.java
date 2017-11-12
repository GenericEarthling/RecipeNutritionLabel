package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>    \n");
      out.write("    <title>Nutrition App</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"w3-light-grey\">\n");
      out.write("    \n");
      out.write("<nav class=\"w3-bar w3-black\">\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">HOME</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">START OVER</a>\n");
      out.write("<!--  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue w3-right\">PRINT</a>-->\n");
      out.write("</nav> \n");
      out.write("    \n");
      out.write("    <div class=\"w3-container w3-padding\" style=\"width: 400px; margin: auto;\">\n");
      out.write("    <!-- FORM BOX FOR SIGNING IN OR SIGNING UP OR GUEST  -->\n");
      out.write("    <div class=\"w3-container w3-blue\">\n");
      out.write("        <h1>Nutrition Generator</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-container w3-white w3-padding-16\">\n");
      out.write("        <form action=\"SignInServlet\" method=\"post\">\n");
      out.write("            <p>Enter your email and password to start creating your own nutrition label for your favorite recipe.</p>\n");
      out.write("            <p><i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</i></p> \n");
      out.write("        <div class=\"w3-row-padding w3-margin-bottom\" style=\"margin:8px -16px;\">\n");
      out.write("          <div class=\"w3-margin-bottom\">\n");
      out.write("            <label>User Name</label>\n");
      out.write("            <input class=\"w3-input w3-border w3-left\" type=\"text\" \n");
      out.write("                   placeholder=\"0\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <div class=\"w3-row-padding\" style=\"margin:0 -16px;\">\n");
      out.write("          <div class=\"w3-margin-bottom\">\n");
      out.write("            <label>E-mail address</label>\n");
      out.write("            <input class=\"w3-input w3-border\" type=\"email\" \n");
      out.write("                   placeholder=\"Enter email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("          </div>          \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"w3-row-padding\" style=\"margin:8px -16px;\">\n");
      out.write("          <div class=\"w3-margin-bottom\">\n");
      out.write("              <label>Choose one: </label><br>\n");
      out.write("            <input type=\"radio\" name=\"user_status\" value=\"Member\" > Member \n");
      out.write("            <input type=\"radio\" name=\"user_status\" value=\"New Member\" > Sign Up \n");
      out.write("            <input type=\"radio\" name=\"user_status\" value=\"Guest\" checked> Guest <br>\n");
      out.write("          </div>  \n");
      out.write("        </div>    \n");
      out.write("        <input class=\"w3-button w3-red\"  type=\"submit\" value=\"Continue\">\n");
      out.write("      </form>\n");
      out.write("      <!-- END OF FORM BOX FOR SIGN-IN  -->   \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
