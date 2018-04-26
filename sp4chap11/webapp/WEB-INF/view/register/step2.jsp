<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 2018. 4. 24.
  Time: PM 4:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<h2>회원 정보 입력</h2>
<form:form action="step3" commandName="registerRequest">

    <p>
        <label>이메일: <br>
            <from:input path="email"/>
        </label>
    </p>
    <p>
        <label>이름: <br>
            <from:input path="name"/>
        </label>
    </p>

    <p>
        <label>비밀번호:<br>
            <from:input path="password"/>
        </label>
    </p>
    <p>
        <label>비밀번호확인:<br>
            <from:input path="confirmPassword"/>
        </label>
    </p>
    <input type="submit" value="가입완료"/>
</form:form>
</body>
</html>
