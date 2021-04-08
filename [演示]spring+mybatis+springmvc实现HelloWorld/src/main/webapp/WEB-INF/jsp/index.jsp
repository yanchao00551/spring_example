<%--
  Created by IntelliJ IDEA.
  User: 10947
  Date: 2021/4/7
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>My JSP</title>
</head>
<body>
这是一个JSP。
Hello World.
<img src="/statics/image/java.jpg"/>

用户列表：

<c:forEach items="${list}" var="node">
    <c:out value="${node}"></c:out>
</c:forEach>

</body>
</html>
