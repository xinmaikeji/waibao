<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<style>
</style>
<body>
<h1 style="color: red">代理情况</h1>
<div id="show">
    <table border="1" cellpadding="50">
        <tr>
            <td style="font-size: 20px"><strong>玩家</strong></td>
            <td style="font-size: 20px"><strong>代理人</strong></td>
        </tr>
        <c:forEach items="${requestScope.daiLis}" var="daili">
            <tr>
                <td>${daili.zhanghao }</td>
                <td>${daili.daili_id}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
