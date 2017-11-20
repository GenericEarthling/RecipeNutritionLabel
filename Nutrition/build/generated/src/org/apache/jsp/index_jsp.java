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
      out.write("\n");
      out.write("    <div lass=\"w3-container w3-white\" style=\"width: 400px; margin: auto;\">\n");
      out.write("        <form action=\"nutrient\" method=\"post\">\n");
      out.write("            <div class=\"w3-margin-bottom\">\n");
      out.write("                <label style=\"display: inline-block;\" >Amount in recipe &emsp;</label> \n");
      out.write("                <input name=\"amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                <select name=\"measurementType\">\n");
      out.write("                  <option value=\"grams\">grams</option>\n");
      out.write("                  <option value=\"liquid oz\">liquid oz</option>\n");
      out.write("                  <option value=\"dry oz\">dry oz</option>\n");
      out.write("                  <option value=\"teaspoon\">teaspoon</option>\n");
      out.write("                  <option value=\"tablespoon\">tablespoon</option>\n");
      out.write("                  <option value=\"milligram\">milligram</option>\n");
      out.write("                  <option value=\"liquid cup\">liquid cup</option>\n");
      out.write("                  <option value=\"dry cup\">dry cup</option>\n");
      out.write("                  <option value=\"liquid pint\">liquid pint</option>\n");
      out.write("                  <option value=\"dry pint\">dry pint</option>\n");
      out.write("                </select>            \n");
      out.write("            </div>     <hr class=\"nut-line nut-line-2\" style=\"\">           \n");
      out.write("            <!-- SUBMIT & RESET BUTTONS -->\n");
      out.write("            <input class=\"w3-button w3-red\"  type=\"submit\" value=\"Add\">\n");
      out.write("            <input class=\"w3-button w3-gray\" type=\"reset\" value=\"Reset\">            \n");
      out.write("        </form>   \n");
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
