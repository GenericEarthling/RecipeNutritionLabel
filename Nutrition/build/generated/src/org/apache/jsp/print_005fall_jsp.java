package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class print_005fall_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("<title>Recipe</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/main.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"w3-light-grey\">\n");
      out.write("<nav class=\"w3-bar w3-black\">\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">HOME</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">START OVER</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue w3-right\">PRINT</a>\n");
      out.write("</nav>\n");
      out.write("<div class=\"w3-container w3-padding-24\" style=\"margin: auto; width: 800px\">\n");
      out.write("<!--  NUTRITION LABEL  -->\n");
      out.write("<div class=\"w3-card-4 w3-border w3-margin-bottom w3-padding\" style=\"width: 320px; margin: auto;\">\n");
      out.write("\n");
      out.write("    <header class=\"w3-container w3-blue\">\n");
      out.write("        <h3 class=\"nut-facts\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></h3>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"w3-margin-top\">\n");
      out.write("        <h2 class=\"nut-facts\" style=\"font-family:Impact, Charcoal;color: black;\"><b>Nutrition Facts</b></h2>\n");
      out.write("    </div>   <hr class=\"nut-line nut-line-1\" style=\"\">\n");
      out.write("    \n");
      out.write("        <label style=\"display: inline-block;\" >Number of servings in Recipe</label>\n");
      out.write("        <span class=\"display-total\" >0</span>\n");
      out.write("        <hr class=\"nut-line nut-line-1\"  style=\"\">\n");
      out.write("    \n");
      out.write("        <label style=\"display: inline-block;\" >Single Serving Weight (in grams)</label> \n");
      out.write("        <span class=\"display-total\" >0</span>\n");
      out.write("        <hr class=\"nut-line nut-line-3\" >\n");
      out.write("\n");
      out.write("        <label style=\"display: inline-block;\" >Calories\t&emsp;</label> \n");
      out.write("        <span class=\"display-total\" >0</span>\n");
      out.write("        <hr class=\"nut-line nut-line-2\" style=\"\">\n");
      out.write("    \n");
      out.write("        <label style=\"display: inline-block;\" >Fat &emsp;</label> \n");
      out.write("        <span class=\"display-total\" >0</span>\n");
      out.write("        <hr class=\"nut-line nut-line-1\" style=\"\"> \n");
      out.write("    \n");
      out.write("        <label style=\"display: inline-block;\" >Cholesterol &emsp;</label> \n");
      out.write("        <span class=\"display-total\" >0</span>\n");
      out.write("        <hr class=\"nut-line nut-line-1\" style=\"\">\n");
      out.write("    \n");
      out.write("        <label style=\"display: inline-block;\" >Sodium  &emsp;</label> \n");
      out.write("        <span class=\"display-total\" >0</span>\n");
      out.write("        <hr class=\"nut-line nut-line-1\" style=\"\">       \n");
      out.write("    \n");
      out.write("        <label style=\"display: inline-block;\" >Potassium  &emsp;</label> \n");
      out.write("        <span class=\"display-total\" >0</span>\n");
      out.write("        <hr class=\"nut-line nut-line-1\" style=\"\">       \n");
      out.write("\n");
      out.write("        <label style=\"display: inline-block;\" >Carbohydrates  &emsp;</label> \n");
      out.write("        <span class=\"display-total\" >510</span>\n");
      out.write("        <hr class=\"nut-line nut-line-1\" style=\"\">      \n");
      out.write("\n");
      out.write("        <label style=\"display: inline-block;\" >Fiber  &emsp;</label> \n");
      out.write("        <!--<span class=\"display-total\" >0</span>-->\n");
      out.write("        <input class=\"w3-border-0 w3-right display-total\"   \n");
      out.write("                   placeholder=\"0\" name=\"fiber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.totals}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <hr class=\"nut-line nut-line-1\" style=\"\">         \n");
      out.write("\n");
      out.write("        <label style=\"display: inline-block;\" >Protein  &emsp;</label> \n");
      out.write("        <span class=\"display-total\" >0</span>\n");
      out.write("        <hr class=\"nut-line nut-line-2\" style=\"\">         \n");
      out.write("</div><!--  END NUTRITION LABEL  -->\n");
      out.write("\n");
      out.write("<!--  INGREDIENT & DIRECTIONS TABLES  -->\n");
      out.write("<div class=\"w3-margin-top\">       \n");
      out.write("    <!-- INGREDIENT TABLE -->\n");
      out.write("    <table class=\"w3-table-all w3-margin-bottom w3-right-align\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Amount</th>\n");
      out.write("            <th></th>\n");
      out.write("            <th style=\"width: 150px;\">Ingredient</th>\n");
      out.write("            <th>Calories</th>\n");
      out.write("            <th>Cholesterol</th>\n");
      out.write("            <th>Sodium</th>\n");
      out.write("            <th>Potassium</th>\n");
      out.write("            <th>Carbohydrates</th>\n");
      out.write("            <th>Fiber</th>\n");
      out.write("            <th>Protein</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td class=\"w3-right-align\" >3</td>\n");
      out.write("            <td class=\"w3-left-align\" >cups</td>\n");
      out.write("            <td>Sugar by Pubblix</td>\n");
      out.write("            <td>300</td>\n");
      out.write("            <td>100</td>\n");
      out.write("            <td>255</td>\n");
      out.write("            <td>233</td>\n");
      out.write("            <td>80</td>\n");
      out.write("            <td>25</td>\n");
      out.write("            <td>9</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>    \n");
      out.write("</div> <!--  END INGREDIENT TABLE  --> \n");
      out.write("\n");
      out.write("<!--  DIRECTIONS TABLE  -->\n");
      out.write("<div>    \n");
      out.write("    <table class=\"w3-table-all w3-left-align\">\n");
      out.write("        <tr>\n");
      out.write("            <th></th>\n");
      out.write("            <th>Directions</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>mix dry ingredients. mix liquid ingredients and stir it into dry ingredients. Bake in oven.</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>   \n");
      out.write("</div> <!--  END DIRECTIONS TABLE  -->\n");
      out.write("\n");
      out.write("<!--  OVEN TEMP AND TIME  -->\n");
      out.write("<div class=\"w3-margin-top w3-margin-bottom\">\n");
      out.write("    <label style=\"display: inline-block;\" >Cooking/Setting Temperature:   &emsp;</label> \n");
      out.write("    <span class=\"\" >-32</span><br>\n");
      out.write("    <label style=\"display: inline-block;\" >Cooking/Setting Time:   &emsp;</label> \n");
      out.write("    <span class=\"\" >3 hours</span>    \n");
      out.write("</div> <!--  END OVEN TEMP AND TIME  -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
