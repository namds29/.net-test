package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Left_jsp extends org.apache.jasper.runtime.HttpJspBase
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
