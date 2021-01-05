<%-- 
    Document   : tickets
    Created on : 02-Dec-2019, 15:40:55
    Author     : amar_
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Ticket Page</title>
    </head>
    <body>
        <h1>Create a ticket</h1>
        <form action="addBug" method="POST">
            Bug Name: <input type="text" name="name"  />
            Bug Description: <input type="text" name="description" />
            <input type="submit" value="Submit" />

        </form>
        <c:if test="${bug.id != 0}">
            <span>${bug.id}</span>
            <span>${bug.name}</span>
            <span>${bug.description}</span>
        </c:if>

        <form action="addTicket" method="POST">
            Ticket Type:<select name="ticket_type">
                <option value="development">Development</option>
                <option value="test">Testing</option>
                <option value="production">Production</option>
            </select>
            Level of Priority: <select name="priority">
                <option value="low">Low</option>
                <option value="medium">Medium</option>
                <option value="high">High</option>
            </select><br>
            
        </form>
    </body>
</html>
