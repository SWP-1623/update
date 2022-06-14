package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class job_005flisting4_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
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
      out.write("<html class=\"no-js\" lang=\"zxx\">\n");
      out.write("    <head>\n");
      out.write("        ");
      sample.office.OfficeDAO of = null;
      synchronized (request) {
        of = (sample.office.OfficeDAO) _jspx_page_context.getAttribute("of", PageContext.REQUEST_SCOPE);
        if (of == null){
          of = new sample.office.OfficeDAO();
          _jspx_page_context.setAttribute("of", of, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      sample.jobcategory.JobcategoryDAO jo = null;
      synchronized (request) {
        jo = (sample.jobcategory.JobcategoryDAO) _jspx_page_context.getAttribute("jo", PageContext.REQUEST_SCOPE);
        if (jo == null){
          jo = new sample.jobcategory.JobcategoryDAO();
          _jspx_page_context.setAttribute("jo", jo, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      sample.position.PositionDAO po = null;
      synchronized (request) {
        po = (sample.position.PositionDAO) _jspx_page_context.getAttribute("po", PageContext.REQUEST_SCOPE);
        if (po == null){
          po = new sample.position.PositionDAO();
          _jspx_page_context.setAttribute("po", po, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      sample.job.JobDAO job = null;
      synchronized (request) {
        job = (sample.job.JobDAO) _jspx_page_context.getAttribute("job", PageContext.REQUEST_SCOPE);
        if (job == null){
          job = new sample.job.JobDAO();
          _jspx_page_context.setAttribute("job", job, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("            <meta charset=\"utf-8\">\n");
      out.write("            <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("            <title>Job board HTML-5 Template </title>\n");
      out.write("            <meta name=\"description\" content=\"\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("            <link rel=\"manifest\" href=\"site.webmanifest\">\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("\n");
      out.write("            <!-- CSS here -->\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/price_rangs.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/flaticon.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/animate.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/fontawesome-all.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("            <!-- Preloader Start -->\n");
      out.write("            <div id=\"preloader-active\">\n");
      out.write("                <div class=\"preloader d-flex align-items-center justify-content-center\">\n");
      out.write("                    <div class=\"preloader-inner position-relative\">\n");
      out.write("                        <div class=\"preloader-circle\"></div>\n");
      out.write("                        <div class=\"preloader-img pere-text\">\n");
      out.write("                            <img src=\"assets/img/logo/logo.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Preloader Start -->\n");
      out.write("            <header>\n");
      out.write("                <!-- Header Start -->\n");
      out.write("                <div class=\"header-area header-transparrent\">\n");
      out.write("                    <div class=\"headder-top header-sticky\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row align-items-center\">\n");
      out.write("                                <div class=\"col-lg-3 col-md-2\">\n");
      out.write("                                    <!-- Logo -->\n");
      out.write("                                    <div class=\"logo\">\n");
      out.write("                                        <a href=\"index.jsp\"><img src=\"assets/img/logo/logo.png\" alt=\"\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-9 col-md-9\">\n");
      out.write("                                    <div class=\"menu-wrapper\">\n");
      out.write("                                        <!-- Main-menu -->\n");
      out.write("                                        <div class=\"main-menu\">\n");
      out.write("                                            <nav class=\"d-none d-lg-block\">\n");
      out.write("                                                <ul id=\"navigation\">\n");
      out.write("                                                    <li><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Tìm việc theo</a>\n");
      out.write("                                                        <ul class=\"submenu\">\n");
      out.write("                                                            <li><a href=\"#\">Khối văn văn phòng</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Kho, bãi</a></li>\n");
      out.write("                                                            <li><a href=\"#\">Việc theo hình thức</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    <li><a href=\"about.jsp\">Kinh nghiệm việc làm</a></li>\n");
      out.write("\n");
      out.write("                                                    <li><a href=\"contact.jsp\">Hỗ trợ</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </nav>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- Header-btn -->\n");
      out.write("                                        <div class=\"header-btn d-none f-right d-lg-block\">\n");
      out.write("                                            <a href=\"#\" class=\"btn head-btn2\">Kết quả ứng tuyển</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Mobile Menu -->\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"mobile_menu d-block d-lg-none\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Header End -->\n");
      out.write("            </header>\n");
      out.write("            <main>\n");
      out.write("\n");
      out.write("                <!-- Hero Area Start-->\n");
      out.write("                <div class=\"slider-area \">\n");
      out.write("                    <div class=\"single-slider section-overly slider-height2 d-flex align-items-center\"\n");
      out.write("                         data-background=\"assets/img/hero/about.jpg\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xl-8\">\n");
      out.write("                                    <!-- form -->\n");
      out.write("                                    <form action=\"#\" class=\"search-box\">\n");
      out.write("                                        <div class=\"input-form\">\n");
      out.write("                                            <input type=\"text\" placeholder=\"Bạn tìm việc gì\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"search-form\">\n");
      out.write("                                            <a href=\"#\">Tìm việc</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Hero Area End -->\n");
      out.write("                <!-- Job List Area Start -->\n");
      out.write("                <div class=\"job-listing-area pt-120 pb-120\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <!-- Left content -->\n");
      out.write("                            <div class=\"col-xl-4 col-lg-4 col-md-4\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-12\">\n");
      out.write("                                        <div class=\"small-section-tittle2 mb-45\">\n");
      out.write("                                            <div class=\"ion\"> <svg xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                                                   xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"20px\" height=\"12px\">\n");
      out.write("                                                <path fill-rule=\"evenodd\" fill=\"rgb(27, 207, 107)\"\n");
      out.write("                                                      d=\"M7.778,12.000 L12.222,12.000 L12.222,10.000 L7.778,10.000 L7.778,12.000 ZM-0.000,-0.000 L-0.000,2.000 L20.000,2.000 L20.000,-0.000 L-0.000,-0.000 ZM3.333,7.000 L16.667,7.000 L16.667,5.000 L3.333,5.000 L3.333,7.000 Z\" />\n");
      out.write("                                                </svg>\n");
      out.write("                                            </div>\n");
      out.write("                                            <h4>Lọc</h4>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Job Category Listing start -->\n");
      out.write("                                <div class=\"job-category-listing mb-50\">\n");
      out.write("                                    <!-- single one -->\n");
      out.write("                                    <div class=\"single-listing\">\n");
      out.write("                                        <!-- Select job items start -->\n");
      out.write("                                        <div class=\"accordion\" id=\"accordionExample\">\n");
      out.write("                                            <div class=\"card\">\n");
      out.write("                                                <div class=\"card-header\" id=\"headingOne\">\n");
      out.write("                                                    <h2 class=\"mb-0\">\n");
      out.write("                                                        <button class=\"btn btn-link btn-block text-left\" type=\"button\"\n");
      out.write("                                                                data-toggle=\"collapse\" data-target=\"#collapseOne\"\n");
      out.write("                                                                aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("                                                            Khối văn phòng\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </h2>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div id=\"collapseOne\" class=\"collapse show\" aria-labelledby=\"headingOne\"\n");
      out.write("                                                     data-parent=\"#accordionExample\">\n");
      out.write("                                                    <div class=\"card-body\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card\">\n");
      out.write("                                            <div class=\"card-header\" id=\"headingTwo\">\n");
      out.write("                                                <h2 class=\"mb-0\">\n");
      out.write("                                                    <button class=\"btn btn-link btn-block text-left collapsed\" type=\"button\"\n");
      out.write("                                                            data-toggle=\"collapse\" data-target=\"#collapseTwo\"\n");
      out.write("                                                            aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n");
      out.write("                                                        Việc làm theo kho bãi\n");
      out.write("                                                    </button>\n");
      out.write("                                                </h2>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\"\n");
      out.write("                                                 data-parent=\"#accordionExample\">\n");
      out.write("                                                <div class=\"card-body\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card\">\n");
      out.write("                                            <div class=\"card-header\" id=\"headingThree\">\n");
      out.write("                                                <h2 class=\"mb-0\">\n");
      out.write("                                                    <button class=\"btn btn-link btn-block text-left collapsed\" type=\"button\"\n");
      out.write("                                                            data-toggle=\"collapse\" data-target=\"#collapseThree\"\n");
      out.write("                                                            aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("                                                        Việc theo hình thức\n");
      out.write("                                                    </button>\n");
      out.write("                                                </h2>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"collapseThree\" class=\"collapse\" aria-labelledby=\"headingThree\"\n");
      out.write("                                                 data-parent=\"#accordionExample\">\n");
      out.write("                                                <div class=\"card-body\">\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--  Select job items End-->\n");
      out.write("                                    <!-- select-Categories start -->\n");
      out.write("\n");
      out.write("                                    <!-- Range Slider End -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Job Category Listing End -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Right content -->\n");
      out.write("                        <div class=\"col-xl-8 col-lg-8 col-md-8\">\n");
      out.write("                            <!-- Featured_job_start -->\n");
      out.write("                            <section class=\"featured-job-area\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <!-- Count of Job list Start -->\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-lg-12\">\n");
      out.write("                                            <div class=\"count-job mb-35\">\n");
      out.write("                                                <!-- Select job items start -->\n");
      out.write("                                                <span>Có ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.listJob.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" công việc :</span>\n");
      out.write("                                                <div class=\"select-job-items\">\n");
      out.write("                                                    <span>Sắp xếp theo</span>\n");
      out.write("                                                    <select name=\"select\">\n");
      out.write("                                                        <option value=\"\">Độ ưu tiên</option>\n");
      out.write("                                                        <option value=\"\">Ngày tạo</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!--  Select job items End-->\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Count of Job list End -->\n");
      out.write("                                    <!-- single-job-content -->\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </section>\n");
      out.write("                            <!-- Featured_job_end -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Job List Area End -->\n");
      out.write("            <!--Pagination Start  -->\n");
      out.write("            <div class=\"pagination-area pb-115 text-center\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-12\">\n");
      out.write("                            <div class=\"single-wrap d-flex justify-content-center\">\n");
      out.write("                                <nav aria-label=\"Page navigation example\">\n");
      out.write("                                    <ul class=\"pagination justify-content-start\">\n");
      out.write("                                        <li class=\"page-item active\"><a class=\"page-link\" href=\"job_listing.jsp\">01</a></li>\n");
      out.write("                                        <li class=\"page-item\"><a class=\"page-link\" href=\"job_listing1.jsp\">02</a></li>\n");
      out.write("                                        <li class=\"page-item\"><a class=\"page-link\" href=\"job_listing2.jsp\">03</a></li>\n");
      out.write("                                        <li class=\"page-item\"><a class=\"page-link\" href=\"job_listing3.jsp\">04</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--Pagination End  -->\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("        <footer>\n");
      out.write("            <!-- Footer Start-->\n");
      out.write("            <div class=\"footer-area footer-bg footer-padding\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row d-flex justify-content-between\">\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-6\">\n");
      out.write("                            <div class=\"single-footer-caption mb-50\">\n");
      out.write("                                <div class=\"single-footer-caption mb-30\">\n");
      out.write("                                    <div class=\"footer-tittle\">\n");
      out.write("                                        <h4>About Us</h4>\n");
      out.write("                                        <div class=\"footer-pera\">\n");
      out.write("                                            <p>Heaven frucvitful doesn't cover lesser dvsays appear creeping seasons so\n");
      out.write("                                                behold.</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <div class=\"single-footer-caption mb-50\">\n");
      out.write("                                <div class=\"footer-tittle\">\n");
      out.write("                                    <h4>Contact Info</h4>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <p>Address :Your address goes\n");
      out.write("                                                here, your demo address.</p>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Phone : +8880 44338899</a></li>\n");
      out.write("                                        <li><a href=\"#\">Email : info@colorlib.com</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <div class=\"single-footer-caption mb-50\">\n");
      out.write("                                <div class=\"footer-tittle\">\n");
      out.write("                                    <h4>Important Link</h4>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\"> View Project</a></li>\n");
      out.write("                                        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                                        <li><a href=\"#\">Testimonial</a></li>\n");
      out.write("                                        <li><a href=\"#\">Proparties</a></li>\n");
      out.write("                                        <li><a href=\"#\">Support</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <div class=\"single-footer-caption mb-50\">\n");
      out.write("                                <div class=\"footer-tittle\">\n");
      out.write("                                    <h4>Newsletter</h4>\n");
      out.write("                                    <div class=\"footer-pera footer-pera2\">\n");
      out.write("                                        <p>Heaven fruitful doesn't over lesser in days. Appear creeping.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Form -->\n");
      out.write("                                    <div class=\"footer-form\">\n");
      out.write("                                        <div id=\"mc_embed_signup\">\n");
      out.write("                                            <form target=\"_blank\"\n");
      out.write("                                                  action=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\"\n");
      out.write("                                                  method=\"get\" class=\"subscribe_form relative mail_part\">\n");
      out.write("                                                <input type=\"email\" name=\"email\" id=\"newsletter-form-email\"\n");
      out.write("                                                       placeholder=\"Email Address\" class=\"placeholder hide-on-focus\"\n");
      out.write("                                                       onfocus=\"this.placeholder = ''\"\n");
      out.write("                                                       onblur=\"this.placeholder = ' Email Address '\">\n");
      out.write("                                                <div class=\"form-icon\">\n");
      out.write("                                                    <button type=\"submit\" name=\"submit\" id=\"newsletter-submit\"\n");
      out.write("                                                            class=\"email_icon newsletter-submit button-contactForm\"><img\n");
      out.write("                                                            src=\"assets/img/icon/form.png\" alt=\"\"></button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"mt-10 info\"></div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--  -->\n");
      out.write("                    <div class=\"row footer-wejed justify-content-between\">\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-6\">\n");
      out.write("                            <!-- logo -->\n");
      out.write("                            <div class=\"footer-logo mb-20\">\n");
      out.write("                                <a href=\"index.jsp\"><img src=\"assets/img/logo/logo2_footer.png\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <div class=\"footer-tittle-bottom\">\n");
      out.write("                                <span>5000+</span>\n");
      out.write("                                <p>Talented Hunter</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <div class=\"footer-tittle-bottom\">\n");
      out.write("                                <span>451</span>\n");
      out.write("                                <p>Talented Hunter</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("                            <!-- Footer Bottom Tittle -->\n");
      out.write("                            <div class=\"footer-tittle-bottom\">\n");
      out.write("                                <span>568</span>\n");
      out.write("                                <p>Talented Hunter</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- footer-bottom area -->\n");
      out.write("            <div class=\"footer-bottom-area footer-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"footer-border\">\n");
      out.write("                        <div class=\"row d-flex justify-content-between align-items-center\">\n");
      out.write("                            <div class=\"col-xl-10 col-lg-10 \">\n");
      out.write("                                <div class=\"footer-copy-right\">\n");
      out.write("                                    <p>\n");
      out.write("                                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                        Copyright &copy;\n");
      out.write("                                        <script>document.write(new Date().getFullYear());</script> All rights reserved |\n");
      out.write("                                        This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a\n");
      out.write("                                            href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-2 col-lg-2\">\n");
      out.write("                                <div class=\"footer-social f-right\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fas fa-globe\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fab fa-behance\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer End-->\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- JS here -->\n");
      out.write("\n");
      out.write("        <!-- All JS Custom Plugins Link Here here -->\n");
      out.write("        <script src=\"./assets/js/vendor/modernizr-3.5.0.min.js\"></script>\n");
      out.write("        <!-- Jquery, Popper, Bootstrap -->\n");
      out.write("        <script src=\"./assets/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Jquery Mobile Menu -->\n");
      out.write("        <script src=\"./assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Jquery Slick , Owl-Carousel Range -->\n");
      out.write("        <script src=\"./assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/slick.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/price_rangs.js\"></script>\n");
      out.write("        <!-- One Page, Animated-HeadLin -->\n");
      out.write("        <script src=\"./assets/js/wow.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/animated.headline.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.magnific-popup.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Scrollup, nice-select, sticky -->\n");
      out.write("        <script src=\"./assets/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.sticky.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- contact js -->\n");
      out.write("        <script src=\"./assets/js/contact.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.form.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/mail-script.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Jquery Plugins, main Jquery -->\n");
      out.write("        <script src=\"./assets/js/plugins.js\"></script>\n");
      out.write("        <script src=\"./assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${of.listOffice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <li><a id=\"backa\" href=\"office?oid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.oid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.nameOffice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></a></li>\n");
          out.write("                                                                ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jo.listJobcate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("y");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <li><a id=\"backa\" href=\"#\"><p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${y.nameJobcate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></a></li>\n");
          out.write("                                                                ");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${po.listPosition}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("x");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <li><a id=\"backa\" href=\"#\"><p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.namePosition}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></a></li>\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.listJob1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("z");
    _jspx_th_c_forEach_3.setBegin(0);
    _jspx_th_c_forEach_3.setEnd(18);
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"single-job-items mb-30 border\">\n");
          out.write("                                                <div class=\"job-items\">\n");
          out.write("                                                    <div class=\"job-tittle job-tittle2\">\n");
          out.write("                                                        <a href=\"job_details.jsp\">\n");
          out.write("                                                            <h5><a id=\"backa\" href=\"#\"><p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${z.nameJob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></a></h5>\n");
          out.write("                                                        </a>\n");
          out.write("                                                        <ul>\n");
          out.write("                                                            <li><i class=\"fas fa-map-marker-alt\"></i>Hồ Chí Minh</li>\n");
          out.write("                                                            <li><i class=\"fas fa-money-bill-alt\"></i>Thỏa thuận</li>\n");
          out.write("                                                            <li>Số lượng: 10000</li>\n");
          out.write("                                                        </ul>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"items-link items-link2 f-right\">\n");
          out.write("                                                    <span>Hạn tuyển: 23/3/20022</span>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
