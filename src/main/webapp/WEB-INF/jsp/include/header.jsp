<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

		<div id="header-section" class="normal-header">
			<h1 id=logo><a href="/langcine/main-view">LangCINE</a></h1>
			<div class="gnb">
				<c:choose> 
				<c:when test="${not empty userId }">
				${userName } 님 <a href="/user/logout"> 로그아웃</a>
				</c:when>
				<c:otherwise>
				<a href="/user/login-view">로그인</a>
				</c:otherwise>
			</c:choose>	
			</div>	
			<div id="nav">
				<ul>
					<li><a>예매</a></li>
					<li><a href="/langcine/info-view">영화</a></li>
				</ul>
			</div>
		</div>