
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html>
<body>
<div style="margin: 2%">
	<h1>
		<a href="http://localhost:9090/getAllFeedbacks">Click here : To
			See All the Feedbacks</a>
	</h1>


	<hr>

	<h1>Get a Feedback By User Id:</h1>
	<form action="getFeedback" method="GET">
		ID Number: <input type="number" name="id"> <input
			type="submit" value="Submit" />
	</form>


	<hr>

	<h1>Get a Feedback By Username :</h1>
	<form action="getFeedbackbyname" method="GET">
		User Name: <input type="text" name="username"> <input
			type="submit" value="Submit" />
	</form>
	<hr>

	<h1>Submit A New Feedback :</h1>
	<form action="sendFeedback" method="Post">
		User Name: <input type="text" name="username">
		<div style="display: block;">
			<textarea name="comment" rows="4" cols="50"
				placeholder="Please add your comments here .."></textarea>
		</div>
		<input type="submit" value="Submit" />

	</form>

</div>

</body>
</html>




</body>
</html>




<!-- 
<form id="feedbackform" method="post" action="getFeedback">

<label>id</label>
<input type="text" id="id" name="id"/>
<input type="submit" value="submit"/>
</form>

 -->

<!-- 
<form:form action="getFeedback/" method="post">
            <div class="row">
                <div class="col-md-3">                  
                    <div class="input-group">
                    <div class="input-group-addon" style="background-color: transparent; border-right:0 solid transparent;"><span class="glyphicon glyphicon-search"></span></div>

                    <input type="text" class="form-control" placeholder="search by ID #" name="id" id="id" />
                    <div class="input-group-btn">
                    <input type="submit" class="btn btn-info" value="Go" />
                    <button class="btn btn-info" onclick="location.href='id'">Go</button>
                    </div>  
                    </div>              
                </div>
                    <br><br>
            </div>

        </form:form>
        
        
        
        <br />
        <form method="post" action="getFeedback/">
            ID: <input type="text" name="name" id="name" /><br />
            <input type="submit" value="Submit" />
        </form> -->