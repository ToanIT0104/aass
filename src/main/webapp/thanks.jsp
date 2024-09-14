<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="styles/thanks.css" type="text/css"/>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="thanks.css" type="text/css"/>
</head>

<body>
    <h1>Thank you for completing the survey</h1>

    <p>Here is the information that you entered:</p>

    <div class="form-group">
    <label>Email:</label>
    <span>${user.email}</span><br>
    </div>

    <div class="form-group">
    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    </div>

    <div class="form-group">
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    </div>

    <div class="form-group">
    <label>Date:</label>
    <span>${user.date}</span><br>
    </div>

    <div class="form-group">
    <label>Hear about us:</label>
    <span>${hear}</span><br>
    </div>

    <div class="form-group">
        <label>Announcements:</label>
        <c:if test="${empty checkBoxs}">
            <span>No announcements selected</span><br>
        </c:if>
        <c:if test="${not empty checkBoxs}">
            <ul class="list-unstyled">
                <c:forEach var="item" items="${checkBoxs}">
                    <li>${item}</li>
                </c:forEach>
            </ul>
        </c:if>
    </div>

    <div class="form-group">
    <label>Contact:</label>
    <span>${user.contact}</span><br>
    </div>

    <p>To enter another email address, click on the Back
        button in your browser or the Return button shown
        below.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>