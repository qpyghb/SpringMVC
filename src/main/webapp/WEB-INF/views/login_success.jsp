<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/include.inc.jsp"%>
<html>
<head>
    <title>SSM 框架整合</title>
</head>
<body>
${path}
<c:url value='/' />
    <a href="<c:url value='/WEB-INF/views/admin/login.jsp' />" >登录成功~${adminInfo.id} : ${adminInfo.name} : ${adminInfo.password}</a>

</body>
</html>
