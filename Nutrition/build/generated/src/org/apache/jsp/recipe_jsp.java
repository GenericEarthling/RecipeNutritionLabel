package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recipe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>Recipe</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/main.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("    textarea {\n");
      out.write("        font-size: 12px;\n");
      out.write("        columns: 60;\n");
      out.write("        rows: 4;        \n");
      out.write("    }\n");
      out.write("    .input-small {\n");
      out.write("        width: auto;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-light-grey\">\n");
      out.write("    \n");
      out.write("<!-- CONTAINER FOR ALL  -->\n");
      out.write("<div class=\"w3-container w3-padding-24\" style=\"margin: auto; width: 800px\">\n");
      out.write("    \n");
      out.write("    <!-- CONTAINER FOR RECIPE  -->    \n");
      out.write("    <div class=\"w3-container w3-gray w3-block\">\n");
      out.write("        <h1>Create Your Recipe Label</h1>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <!-- Trigger/Open The Modal -->\n");
      out.write("    <div class=\"w3-container w3-blue w3-padding-16 w3-margin-top w3-margin-bottom\">\n");
      out.write("        <h2><b>Step 1:</b> Enter Ingredients</h2>        \n");
      out.write("        <button id=\"modal-1-btn\" class=\"w3-button w3-red\">Add Ingredient</button>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- MODAL FORM FOR INGREDIENT INPUT -->\n");
      out.write("    <div id=\"modal-1\" class=\"modal w3-animate-top\">\n");
      out.write("    <!-- Modal content -->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <form action=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" method=\"post\" >\n");
      out.write("            <!-- for servlet to process post method  -->\n");
      out.write("            <input type=\"hidden\" name=\"ingredientId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.ingredientId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <!-- Modal Cancel button -->\n");
      out.write("            <div class=\"\">            \n");
      out.write("                <span class=\"close\">cancel</span>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"w3-margin-top\">\n");
      out.write("                <h2 class=\"nut-facts\" style=\"font-family:Impact, Charcoal;\"><b>Nutrition Facts</b></h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Ingredient </label>\n");
      out.write("                <input class=\"w3-border\" style=\"float: right;\" type=\"text\" name=\"ingredientName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.ingredientName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" > \n");
      out.write("            </div> <hr class=\"nut-line nut-line-1\" >\n");
      out.write("            \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Serving Size from Label (in grams)</label> \n");
      out.write("                <input class=\"w3-border\"  style=\"float: right;\" type=\"number\" name=\"servingSizeInGrams\" value=\"ingredient.servingSizeInGrams\" >\n");
      out.write("            </div> <hr class=\"nut-line nut-line-3\" >\n");
      out.write("                       \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Calories\t&emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" type=\"number\" name=\"calories\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.calories}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>   <hr class=\"nut-line nut-line-2\" >\n");
      out.write("            \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Fat &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" name=\"fat\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.fat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div> <hr class=\"nut-line nut-line-1\" style=\"\"> \n");
      out.write("            \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Cholesterol &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" name=\"cholesterol\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.cholesterol}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>  <hr class=\"nut-line nut-line-1\" style=\"\">          \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Sodium  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" name=\"sodium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.sodium}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>    <hr class=\"nut-line nut-line-1\" style=\"\">        \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Potassium  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" name=\"potassium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.potassium}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>     <hr class=\"nut-line nut-line-1\" style=\"\">       \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Carbohydrates  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" name=\"carbohydrates\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.carbohydrates}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>      <hr class=\"nut-line nut-line-1\" style=\"\">      \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Fiber  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" name=\"fiber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.fiber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>   <hr class=\"nut-line nut-line-1\" style=\"\">         \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Protein  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" name=\"protein\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.protein}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>   <hr class=\"nut-line nut-line-2\" style=\"\">         \n");
      out.write("\n");
      out.write("            <div class=\"w3-margin-bottom\">\n");
      out.write("                <label style=\"display: inline-block;\" >Amount in recipe &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" name=\"amount\" value=\"");
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
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </div>   <!-- END OF MODAL FORM   -->\n");
      out.write("    \n");
      out.write("    <!-- INGREDIENT TABLE -->\n");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <!-- NUTRITION LABEL BUTTON -->\n");
      out.write("    <div class=\"w3-container w3-blue w3-padding-16 w3-margin-top w3-margin-bottom\">\n");
      out.write("        <h2><b>Step 2:</b> Prepare Nutrition Label</h2>\n");
      out.write("        <form action=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <div class=\"w3-cell-row\">\n");
      out.write("                Recipe Name &emsp; <input class=\"w3-input w3-border\" type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">                       \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"w3-cell-row\">\n");
      out.write("                Preparation Directions &emsp; <br><textarea class=\"w3-input w3-border\" type=\"text\" name=\"directions\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.directions}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></textarea>                       \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"w3-cell-row w3-block w3-margin-top\">    \n");
      out.write("                <div class=\"w3-container w3-cell\">\n");
      out.write("                    <label> Number of servings &emsp;</label>\n");
      out.write("                    <input class=\"w3-input w3-border\" type=\"number\" min=\"1\" name=\"servings\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.servings}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-container\">\n");
      out.write("                    <label>Weight after cooking (in oz) &emsp;</label>\n");
      out.write("                    <input class=\"w3-input w3-border\" type=\"number\" name=\"weight\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.weight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">  \n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"w3-cell-row w3-block w3-margin-top\">    \n");
      out.write("                <div class=\"w3-container w3-cell\">\n");
      out.write("                    <label> Cook/Setting Temperature  &emsp;</label>\n");
      out.write("                    <input class=\"w3-input w3-border\" type=\"number\" name=\"weight\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.temperature}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                </div>    \n");
      out.write("                <div class=\"w3-container w3-cell\">\n");
      out.write("                    <label> Cook/Setting Time &emsp;</label>\n");
      out.write("                    <input class=\"w3-input w3-border\" type=\"number\" name=\"weight\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipe.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <input class=\"w3-button w3-red w3-margin-top\" name=\"\" value=\"Get Nutrition Label\">         \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("<!-- END NUTRITION LABEL BUTTON -->\n");
      out.write("\n");
      out.write("<!-- COOKIE INFORMATION TABLE -->\n");
      out.write("<div>\n");
      out.write("    <h1>Cookies</h1>\n");
      out.write("    <h4>Cookies used for this web application:</h4>\n");
      out.write("    <ul>\n");
      out.write("        <li>Are sent to the server through the browser.</li>\n");
      out.write("        <li>They only access this particular session.</li>\n");
      out.write("        <li>They will remain in your browser until you close your browser.</li>\n");
      out.write("    </ul>\n");
      out.write("    <table class=\"w3-table-all w3-left-align\" >\n");
      out.write("        <tr>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Value</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </table>    \n");
      out.write("</div>\n");
      out.write("<!-- END COOKIE INFORMATION TABLE -->\n");
      out.write("</div> <!-- END CONTAINER FOR ALL  -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// INGREDIENT Modal\n");
      out.write("var modal_1 = document.getElementById('modal-1');\n");
      out.write("\n");
      out.write("// Get the button that opens the modal\n");
      out.write("var modal_1_btn = document.getElementById('modal-1-btn');\n");
      out.write("\n");
      out.write("// Get the <span> element that closes the modal\n");
      out.write("var cancel = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("// When the user clicks on the button, open the modal \n");
      out.write("modal_1_btn.onclick = function() {\n");
      out.write("    modal_1.style.display = \"block\";\n");
      out.write("}\n");
      out.write("// When the user clicks on <span> (x), close the modal\n");
      out.write("cancel.onclick = function() {\n");
      out.write("    modal_1.style.display = \"none\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!-- Trigger/Open The DIRECTIONS Modal \n");
      out.write("    <div class=\"w3-margin-top w3-margin-bottom\">\n");
      out.write("        <button id=\"modal-2-btn\" class=\"w3-button w3-red\">Add Directions</button>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<!-- MODAL FORM FOR DIRECTION INPUT \n");
      out.write("    <div id=\"modal-2\" class=\"modal w3-animate-top\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <form>\n");
      out.write("<!-- cancel button \n");
      out.write("            <div class=\"\">            \n");
      out.write("                <span class=\"close\">cancel</span>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"w3-margin-top\">\n");
      out.write("                <h2 style=\"font-family:Impact, Charcoal;\"><b>Directions</b></h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"\">\n");
      out.write("                <textarea class=\"\" cols=\"40\" rows=\"8\" name=\"directions\" > </textarea>\n");
      out.write("            </div>   <hr class=\"nut-line nut-line-2\" style=\"\">                  \n");
      out.write("                         \n");
      out.write("            <input class=\"w3-button w3-red\"  type=\"submit\" value=\"Add\">\n");
      out.write("            <input id=\"closeModal2\" class=\"w3-button w3-gray\"  type=\"submit\" value=\"Cancel\">            \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </div>   -->\n");
      out.write("<!-- END OF MODAL-2 FORM   -->   ");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/MainControl/addIngredient");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emptyList != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <p>Your ingredient list is empty.</p>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("        \n");
        out.write("        <table class=\"w3-table-all\">\n");
        out.write("        <tr>\n");
        out.write("            <th></th>\n");
        out.write("            <th>Amount</th>\n");
        out.write("            <th></th>\n");
        out.write("            <th style=\"width:150px;\">Ingredient</th>\n");
        out.write("            <th>Calories</th>\n");
        out.write("            <th>Fat</th>\n");
        out.write("            <th>Cholesterol</th>\n");
        out.write("            <th>Sodium</th>\n");
        out.write("            <th>Potassium</th>\n");
        out.write("            <th>Carbohydrates</th>\n");
        out.write("            <th>Fiber</th>\n");
        out.write("            <th>Protein</th>\n");
        out.write("        </tr>\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        \n");
        out.write("        </table>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td><!-- REMOVE INGREDIENT BUTTON -->\n");
          out.write("                    <form action=\"");
          if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\" method=\"post\">\n");
          out.write("                    <input type=\"hidden\" name=\"ingredientId\" value=\"");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">\n");
          out.write("                    <input type=\"submit\" value=\"Delete\">\n");
          out.write("                    </form>\n");
          out.write("                    <!-- This form will need to open the modal and populate the values -->\n");
          out.write("                    <!--<form action=\"POINTY-BRACKET-LEFTc:url value='/main/updateIngredient'/POINTY-BRACKET-RIGHT\" method=\"post\">\n");
          out.write("                    <input type=\"hidden\" name=\"ingredientId\" value=\"POINTY-BRACKET-LEFTc:out value='DOLLAR-SIGN{item.ingredient.ingredientId}'/POINTY-BRACKET-RIGHT\">\n");
          out.write("                    <input type=\"submit\" value=\"Edit\">\n");
          out.write("                    </form>-->\n");
          out.write("                </td>\n");
          out.write("<!-- it seems like these need to access the the ChartLineItems.getCalorieSum() \n");
          out.write("I think this is grabbing the input values from the modal\n");
          out.write("Maybe the values should be saved to a variable in eiter\n");
          out.write("ChartLineItems file or the mainControl servlet -->\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.ingredientAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.measurement}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.ingredientName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.calories}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.fat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.sodium}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.potassium}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.carbohydrates}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.fiber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value.protein}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            </tr>            \n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_1.setValue("/main/removeIngredient");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.ingredient.ingredientId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/main/showLabel");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("c");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.value.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.value.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
