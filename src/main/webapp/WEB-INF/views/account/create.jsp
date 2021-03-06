<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:wrapper>
    <h2>Rejestracja</h2>
    <form:form action="${spring:mvcUrl('AC#accountCreate').build()}" modelAttribute="accountDTO" class="form-horizontal" method="post" role="form"><input name="__RequestVerificationToken" type="hidden"/>
        <h4>Utwórz nowe konto.</h4>
        <hr />
        <div class="validation-summary-valid text-danger" data-valmsg-summary="true"><ul><li style="display:none"></li>
        </ul></div>    <div class="form-group">
            <label class="col-md-2 control-label" for="username">Login</label>
            <div class="col-md-5">
                <form:input class="form-control" data-val="true" data-val-email="The Email field is not a valid e-mail address." data-val-required="The Email field is required." id="username" name="username" path="username" type="text" value="" />
                <form:errors path="username" cssClass="text-danger"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label" for="password">Hasło</label>
            <div class="col-md-5">
                <form:password class="form-control" data-val="true" data-val-length="The Password must be at least 6 characters long." data-val-length-max="100" data-val-length-min="6" data-val-required="The Password field is required." id="password" name="password" path="password"/>
                <form:errors path="password" cssClass="text-danger"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-2 control-label" for="matchingPassword">Potwierdź hasło</label>
            <div class="col-md-5">
                <form:password class="form-control" data-val="true" data-val-equalto="The password and confirmation password do not match." data-val-equalto-other="*.Password" id="matchingPassword" name="matchingPassword" path="matchingPassword"/>
                <form:errors object-error="accountDTO" cssClass="text-danger"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
                <input type="submit" class="btn btn-default" value="Zarejestruj" />
            </div>
        </div>
    </form:form>
</t:wrapper>
