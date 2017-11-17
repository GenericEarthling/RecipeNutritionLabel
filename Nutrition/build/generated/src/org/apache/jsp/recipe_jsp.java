package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recipe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<body class=\"w3-light-grey\">\n");
      out.write("<nav class=\"w3-bar w3-black\">\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">HOME</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">START OVER</a>\n");
      out.write("<!--  <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue w3-right\">PRINT</a>-->\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("<!-- CONTAINER FOR BOTH TABLES  -->\n");
      out.write("<div class=\"w3-container w3-padding-24\" style=\"margin: auto; width: 800px\">\n");
      out.write("    \n");
      out.write("    <!-- CONTAINER FOR RECIPE  -->    \n");
      out.write("    <div class=\"w3-container w3-blue\">\n");
      out.write("        <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recipeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <!-- Trigger/Open The Modal -->\n");
      out.write("    <div class=\"w3-margin-top w3-margin-bottom\">\n");
      out.write("        <button id=\"modal-1-btn\" class=\"w3-button w3-red\">Add Ingredient</button>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- MODAL FORM FOR INGREDIENT INPUT -->\n");
      out.write("    <div id=\"modal-1\" class=\"modal w3-animate-top\">\n");
      out.write("    <!-- Modal content -->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <form action=\"ingredient\" method=\"post\" >\n");
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
      out.write("                <input class=\"w3-border\" style=\"float: right;\" type=\"text\" \n");
      out.write("                   placeholder=\"0\" name=\"ingredientName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.ingredientName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" > \n");
      out.write("            </div> <hr class=\"nut-line nut-line-1\" >\n");
      out.write("            \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Serving Size from Label (in grams)</label> \n");
      out.write("                <input class=\"w3-border\"  style=\"float: right;\" type=\"number\" min=\"1\" max=\"100\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"servingSizeInGrams\" value=\"ingredient.servingSizeInGrams\" >\n");
      out.write("            </div> <hr class=\"nut-line nut-line-3\" >\n");
      out.write("                       \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Calories\t&emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"0\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"calories\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.calories}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>   <hr class=\"nut-line nut-line-2\" >\n");
      out.write("            \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Fat &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"0\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"fat\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.fat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div> <hr class=\"nut-line nut-line-1\" style=\"\"> \n");
      out.write("            \n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Cholesterol &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"0\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"cholesterol\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.cholesterol}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>  <hr class=\"nut-line nut-line-1\" style=\"\">          \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Sodium  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"0\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"sodium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.sodium}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>    <hr class=\"nut-line nut-line-1\" style=\"\">        \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Potassium  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"0\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"potassium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.potassium}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>     <hr class=\"nut-line nut-line-1\" style=\"\">       \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Carbohydrates  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"0\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"carbohydrates\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.carbohydrates}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>      <hr class=\"nut-line nut-line-1\" style=\"\">      \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Fiber  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"0\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"fiber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.fiber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>   <hr class=\"nut-line nut-line-1\" style=\"\">         \n");
      out.write("\n");
      out.write("            <div class=\"\">\n");
      out.write("                <label style=\"display: inline-block;\" >Protein  &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"0\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"protein\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredient.protein}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            </div>   <hr class=\"nut-line nut-line-2\" style=\"\">         \n");
      out.write("\n");
      out.write("            <div class=\"w3-margin-bottom\">\n");
      out.write("                <label style=\"display: inline-block;\" >Amount in recipe &emsp;</label> \n");
      out.write("                <input class=\"w3-border\" type=\"number\" min=\"1\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"amount\" value=\"");
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
      out.write("            </div>     <hr class=\"nut-line nut-line-2\" style=\"\">             \n");
      out.write("            <input class=\"w3-button w3-red\"  type=\"submit\" value=\"Add\">\n");
      out.write("            <input id=\"closeModal\" class=\"w3-button w3-gray\"  type=\"submit\" value=\"Cancel\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </div>   <!-- END OF MODAL FORM   -->\n");
      out.write("    \n");
      out.write("    <!-- INGREDIENT TABLE -->\n");
      out.write("    <table class=\"w3-table-all\">\n");
      out.write("        <tr>\n");
      out.write("            <th></th>\n");
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
      out.write("            <td>edit delete</td>\n");
      out.write("            <td>3</td>\n");
      out.write("            <td>cups</td>\n");
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
      out.write("            <td>edit delete</td>\n");
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
      out.write("        <tr>\n");
      out.write("            <td>edit delete</td>\n");
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
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <!-- Trigger/Open The DIRECTIONS Modal -->\n");
      out.write("    <div class=\"w3-margin-top w3-margin-bottom\">\n");
      out.write("        <button id=\"modal-2-btn\" class=\"w3-button w3-red\">Add Directions</button>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- MODAL FORM FOR DIRECTION INPUT -->\n");
      out.write("    <div id=\"modal-2\" class=\"modal w3-animate-top\">\n");
      out.write("    <!-- Modal content -->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <form>\n");
      out.write("            <!-- cancel button -->\n");
      out.write("            <div class=\"\">            \n");
      out.write("                <!--<span class=\"close\">cancel</span>-->\n");
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
      out.write("    </div>   <!-- END OF MODAL-2 FORM   -->    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- DIRECTIONS TABLE -->\n");
      out.write("    <table class=\"w3-table-all w3-left-align\">\n");
      out.write("        <tr>\n");
      out.write("            <th></th>\n");
      out.write("            <th class=\"w3-left\">Directions</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>edit delete</td>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>edit delete</td>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>edit delete</td>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>  <!-- END DIRECTIONS TABLE -->\n");
      out.write("\n");
      out.write("<!-- NUTRITION LABEL BUTTON -->\n");
      out.write("    <div class=\"w3-container w3-grey w3-padding-16 w3-margin-top\">\n");
      out.write("        <h2>Nutrition Label</h2>\n");
      out.write("        <label> servings &emsp;</label>\n");
      out.write("        <input class=\"w3-border\" type=\"number\" min=\"1\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"servings\" value=\"recipe.servings\" required>\n");
      out.write("        <label>Total weight after cooking (in oz) &emsp;</label>\n");
      out.write("        <input class=\"w3-border\" type=\"number\" size=\"5\"\n");
      out.write("                       placeholder=\"0\" name=\"weight\" value=\"recipe.weight\">        \n");
      out.write("        <button class=\"w3-button w3-red\">Get Nutrition Label</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<!-- NUTRITION LABEL BUTTON -->\n");
      out.write("<div>\n");
      out.write("    <h1>Cookies</h1>\n");
      out.write("    <p>Cookies used for this web application that are sent to the server through the browser.</p>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Value</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("// INGREDIENT Modal\n");
      out.write("var modal_1 = document.getElementById('modal-1');\n");
      out.write("var modal_2 = document.getElementById('modal-2'); \n");
      out.write("\n");
      out.write("// Get the button that opens the modal\n");
      out.write("var modal_1_btn = document.getElementById('modal-1-btn');\n");
      out.write("var modal_2_btn = document.getElementById(\"modal-2-btn\");\n");
      out.write("\n");
      out.write("// Get the <span> element that closes the modal\n");
      out.write("//var cancel = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("// When the user clicks on the button, open the modal \n");
      out.write("modal_1_btn.onclick = function() {\n");
      out.write("    modal_1.style.display = \"block\";\n");
      out.write("}\n");
      out.write("modal_2_btn.onclick = function() {\n");
      out.write("    modal_2.style.display = \"block\";\n");
      out.write("}\n");
      out.write("// When the user clicks on <span> (x), close the modal\n");
      out.write("//cancel.onclick = function() {\n");
      out.write("//    modal.style.display = \"none\";\n");
      out.write("//}\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
}
