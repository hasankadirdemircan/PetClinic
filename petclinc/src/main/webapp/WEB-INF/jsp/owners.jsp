<%--
  Created by IntelliJ IDEA.
  User: hkdemircan
  Date: 3/2/19
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>FirstName</td>
                <td>LastName</td>
            </tr>
        </thead>
        <c:forEach items="${owners}" var="owner">
            <tr>
                <td>${owner.id}</td>
                <td>${owner.firstName}</td>
                <td>${owner.lastName}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
