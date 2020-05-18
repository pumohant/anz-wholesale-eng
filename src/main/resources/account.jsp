<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List Users Records</title>
</head>
<body>    
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Accounts</h2></caption>
            <tr>
                <th>Account Number</th>
                <th>Account Name</th>
                <th>Account Type</th>
                <th>Balance Date</th>
                <th>Currency</th>
                <th>Opening Available Balance</th>
                
            </tr>
            <c:forEach var="acc" items="${accountList.rows}">
                <tr>
                    <td><c:out value="${acc.accountNumber}" /></td>
                    <td><c:out value="${acc.accountName}" /></td>
                    <td><c:out value="${acc.accountType}" /></td>
                    <td><c:out value="${acc.balanceDate}" /></td>
                    <td><c:out value="${acc.currency}" /></td>
                    <td><c:out value="${acc.openingAvailableBalance}" /></td>
                    
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>