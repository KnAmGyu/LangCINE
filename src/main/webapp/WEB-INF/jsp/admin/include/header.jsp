<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<div id="header-section">
	<h1 class="logo">랑씨네관리자</h1>
	<c:if test="${not empty managerId }" >
		<div class="mr-3">${managerName } 님 <a href="/manager/logout">로그아웃</a></div>
	</c:if>
</div>