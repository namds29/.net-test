package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dal.BlogDAO;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Left.jsp");
    _jspx_dependants.add("/Right.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      dal.BlogDAO top = null;
      synchronized (request) {
        top = (dal.BlogDAO) _jspx_page_context.getAttribute("top", PageContext.REQUEST_SCOPE);
        if (top == null){
          top = new dal.BlogDAO();
          _jspx_page_context.setAttribute("top", top, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      dal.CategoryDAO categories = null;
      synchronized (request) {
        categories = (dal.CategoryDAO) _jspx_page_context.getAttribute("categories", PageContext.REQUEST_SCOPE);
        if (categories == null){
          categories = new dal.CategoryDAO();
          _jspx_page_context.setAttribute("categories", categories, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <title>My Blogs</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"title\">my blogs</div>\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <a href=\"home\">Home</a>\n");
      out.write("                <a href=\"Contact.jsp\">Contact</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"chosen_homepage\">\n");
      out.write("                <img src=\"image/img02.jpg\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"type\">\n");
      out.write("        <div class=\"green\">\n");
      out.write("            Category ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            <div class=\"dot\"> &nbsp; .  &nbsp;</div>\n");
      out.write("        </div> \n");
      out.write("        <em>Full Category</em>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("    <div class=\"timePost\"><div class=\"grey\">Posted on ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.timePost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            <div class=\"dot\"> &nbsp; .  &nbsp;</div></div>\n");
      out.write("\n");
      out.write("        <em>Full Article</em>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"description\">\n");
      out.write("        <div class=\"image-space\">\n");
      out.write("            <img class=\"image\" src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div >\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "LastPost.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"category\">Categories</div>\n");
      out.write("<div class=\"type-category\">\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categories.categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("x");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <div class=\"each-category\">\n");
          out.write("            <img src=\"image/img01.jpg\" alt=\"\"/>&nbsp; &nbsp; &nbsp;\n");
          out.write("            <a style=\"color: black\" href=\"search?category_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("\n");
          out.write("        </div>\n");
          out.write("    ");
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
