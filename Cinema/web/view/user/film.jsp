<%-- 
    Document   : film
    Created on : Oct 20, 2022, 1:37:31 PM
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
        <section class="bg-light">
            <div class="container pb-5">
                <div class="row">
                    <div class="col-lg-5 mt-5">
                        <div class="card mb-3">
                            <img class="card-img img-fluid" src="https://m.media-amazon.com/images/M/MV5BYjUyN2VlZGEtNGEyZC00YjViLTgwYmQtZDJiM2FlOTU3Mjg2XkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_FMjpg_UX1000_.jpg" alt="Card image cap"
                                 id="product-detail">
                        </div>
                        <div class="row">
                            <!--Start Carousel Wrapper-->

                            <!--End Carousel Wrapper-->

                        </div>
                    </div>
                    <!-- col end -->
                    <div class="col-lg-7 mt-5">
                        <div class="card">
                            <div class="card-body">
                                <h1 class="h2">Active Wear</h1>
                                <p class="py-2">
                                    <i class="fa fa-star text-warning"></i>
                                    <i class="fa fa-star text-warning"></i>
                                    <i class="fa fa-star text-warning"></i>
                                    <i class="fa fa-star text-warning"></i>
                                    <i class="fa fa-star text-secondary"></i>
                                    <span class="list-inline-item text-dark">Rating 4.8</span>
                                </p>
                                <ul class="list-inline">
                                    <li class="list-inline-item">
                                        <h6>Brand:</h6>
                                    </li>
                                    <li class="list-inline-item">
                                        <p class="text-muted"><strong>Easy Wear, Horor, Actions.</strong></p>
                                    </li>
                                </ul>

                                <h6>Description:</h6>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod temp incididunt
                                    ut labore et dolore magna aliqua. Quis ipsum suspendisse. Donec condimentum elementum
                                    convallis. Nunc sed orci a diam ultrices aliquet interdum quis nulla.</p>
                                <ul class="list-inline">
                                    <li class="list-inline-item">
                                        <h6>Author :</h6>
                                    </li>
                                    <li class="list-inline-item">
                                        <p class="text-muted"><strong>Michalen Jonhat</strong></p>
                                    </li>
                                </ul>

                                <ul class="list-inline d-flex">
                                    <li class="list-inline-item">
                                        <h6>Casts:</h6>
                                    </li>
                                    <li class="list-inline-item">
                                        <p class="text-muted">
                                            <strong>Michalen Jonhat, </strong>
                                            <strong>Michalen Jonhat, </strong>
                                            <strong>Michalen Jonhat, </strong>
                                            <strong>Michalen Jonhat, </strong>
                                            <strong>Michalen Jonhat, </strong>
                                        </p>
                                    </li>
                                </ul>

                                <h6>Movie duration: 120 minute</h6>
                                <h6>Language: English</h6>

                                <form action="" method="GET">
                                    <input type="hidden" name="product-title" value="Activewear">
                                    <div class="row pb-3">
                                        <div class="col d-grid">
                                            <button type="submit" class="btn btn-success btn-lg" name="submit"
                                                    value="buy">Buy Ticket</button>
                                        </div>
                                    </div>
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- end food section -->

        <!--Footer-->
        <%@include  file="../component/footer.jsp"%>
        <!--Footer-->
    </body>
</html>
