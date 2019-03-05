<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- <%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld" %> --%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--<%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>--%>
<%--去除jsp生成的多余的空行--%>
<%@ page trimDirectiveWhitespaces="true" %>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>
<c:set var="path" value="${pageContext.request.contextPath}"/>

