<%-- 
    Document   : menufilm.jsp
    Created on : Oct 20, 2022, 1:17:17 PM
    Author     : int.thong.nk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../component/setupCss.jsp" %>
    </head>
    <body>
        <!--Header-->
        <%@include file="../component/header.jsp" %>
        <!--Header-->

        <!-- food section -->

        <section class="food_section layout_padding">
            <div class="container">
                <div class="heading_container heading_center">
                    <h2>
                        Menu film
                    </h2>
                </div>

                <ul class="filters_menu">
                    <li class="active" data-filter="*">All</li>
                    <li data-filter=".burger">Burger</li>
                    <li data-filter=".pizza">Pizza</li>
                    <li data-filter=".pasta">Pasta</li>
                    <li data-filter=".fries">Fries</li>
                </ul>

                <div class="filters-content">
                    <div class="row grid">
                        <div class="col-sm-6 col-lg-4 all pizza">
                            <div class="box">
                                <div>
                                    <div class="img-box">
                                        <img src="images/f1.png" alt="">
                                    </div>
                                    <div class="detail-box">
                                        <h5>
                                            Delicious Pizza
                                        </h5>
                                        <p>
                                            Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit, magnam voluptatem repellendus sed eaque
                                        </p>
                                        <div class="options">
                                            <h6>
                                                $20
                                            </h6>
                                            <a href="">

                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4 all burger">
                            <div class="box">
                                <div>
                                    <div class="img-box">
                                        <img src="images/f2.png" alt="">
                                    </div>
                                    <div class="detail-box">
                                        <h5>
                                            Delicious Burger
                                        </h5>
                                        <p>
                                            Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit, magnam voluptatem repellendus sed eaque
                                        </p>
                                        <div class="options">
                                            <h6>
                                                $15
                                            </h6>
                                            <a href="">

                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4 all pizza">
                            <div class="box">
                                <div>
                                    <div class="img-box">
                                        <img src="images/f3.png" alt="">
                                    </div>
                                    <div class="detail-box">
                                        <h5>
                                            Delicious Pizza
                                        </h5>
                                        <p>
                                            Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit, magnam voluptatem repellendus sed eaque
                                        </p>
                                        <div class="options">
                                            <h6>
                                                $17
                                            </h6>
                                            <a href="">

                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="btn-box">
                    <a href="">
                        View More
                    </a>
                </div>
            </div>
        </section>

        <!-- end food section -->

        <!--Footer->
        <%@include file="../component/footer.jsp" %>
        <!--Footer-->

        <!--Script-->
        <%@include file="../component/setupJS.jsp" %>
        <!--Script-->
        <h1>Hello World!</h1>
    </body>
</html>