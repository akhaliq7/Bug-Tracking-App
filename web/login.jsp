<%-- 
    Document   : login
    Created on : 02-Dec-2019, 22:30:11
    Author     : amar_
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.jsp" />
<div class="container m-5">
  <h2>Login Form</h2>
  
  <span><c:out value="${errorMessage}" /></span><br>
  <form action="LoginServlet" method="POST"> 
    <div class="form-group">
      <label class="mt-3">Enter Username:</label>
      <input type="text" class="form-control" name="username" required>
    </div>
    <div class="form-group">
      <label class="mt-1">Enter Password:</label>
      <input type="password" class="form-control" name="password" required>
    </div>
      <input type="radio" name="role" value="Tester" />Tester
      <input type="radio" name="role" value="Developer" />Developer
      <input type="radio" name="role" value="Client" />Client <br><br>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
<c:import url="/includes/footer.jsp" />  
