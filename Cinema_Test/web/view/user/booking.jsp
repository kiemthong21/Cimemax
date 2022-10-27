<%-- 
    Document   : booking
    Created on : Oct 27, 2022, 10:49:34 AM
    Author     : int.thong.nk
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../component/setupCss.jsp" %>
        <link href="view/css/seat.css" rel="stylesheet" />

    </head>
    <body>
        <!--Header-->
        <%@include file="../component/header.jsp" %>
        <!--Header-->

        <section class="about_section layout_padding">
            <div class="container  ">

                <div class="row">
                    <div class="col-md-12 movie-container">
                        <h4 class="text-center" style="margin-top: -200px; margin-bottom: 100px;">
                            Avenger: End Game / Slot: 15:30 / Duration: 120 minute
                        </h4>
                        <div class="showcase">
                            <div class="status">
                                <div class="seat"></div>
                                <small>Available</small>
                            </div>
                            <div class="status">
                                <div class="seat sold"></div>
                                <small>Sold</small>
                            </div>
                        </div>

                        <div class="containers">
                            <div class="screen"></div>
                            <c:forEach var="s" begin="1" end="6" step="1">
                                <c:set var="index" value="0"/>
                                <div class="row">
                                    <c:forEach var="a" begin="1" end="8" step="1">
                                        <c:if test=" ${(s-1)*a +a == requestScope.slot.get(index).slotId}">
                                            <c:if test="${index <  requestScope.slot.size()}">
                                                <c:set var="index" value="${index + 1}"/>
                                            </c:if>          
                                            <div class="seat sold"></div>
                                        </c:if>
                                        <c:if test=" ${(s-1)*a +a != requestScope.slot.get(index).slotId}">
                                            <div class="seat"></div>
                                        </c:if>

                                    </c:forEach>
                                </div>
                            </c:forEach>

                        </div>
                        <p class="text">
                            You have selected <span id="count">0</span> seat for a price of RS.<span id="total">0</span>
                        </p>

                    </div>
                </div>
            </div>
        </section>

        <!--Footer->
        <%@include file="../component/footer.jsp" %>
        <!--Footer-->

        <!--Script-->
        <%@include file="../component/setupJS.jsp" %>
        <!--Script-->
    </body>
</html>
