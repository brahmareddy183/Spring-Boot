<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="continer">
		<div class="card bg-light">
			<div class="card-header bg-primary text-white" align="center">
				<h3>Currency Conversion</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="POST"
					modelAttribute="currencyConversionFormBean">
					<div class="row">
					<div class="col-2"></div>
						<div class="col-3">
							<label for="cfrom"><b>FROM:</b> </label>
						</div>
						<div class="col-3">
							<form:input path="cfrom" class="form-control" />
						</div>
					</div>
					<br>

					<div class="row">
					<div class="col-2"></div>
						<div class="col-3">
							<label for="cto"><b>TO:</b> </label>
						</div>
						<div class="col-3">
							<form:input path="cto" class="form-control" />
						</div>
					</div>
					<br>

					<div class="row">
					<div class="col-2"></div>
						<div class="col-3">
							<label for="cvalue"><b>QUANTITY :</b></label>
						</div>
						<div class="col-3">
							<form:input path="cvalue" class="form-control" />
						</div>
					</div><br>

					<div class="row">
					<div class="col-2"></div>
						<div class="col-3"></div>
						<div class="col-3">
							<input type="submit" class="btn btn-success"  value="ConvertAmount" /> 
							<input type="reset" class="btn btn-danger" value="CLEAR"/>
						</div>
					</div><br>

					<div class="row">
					<div class="col-2"></div>
						<div class="col-3"><b>Converted Amount :</b></div>
						<div class="col-3">
						<input type="text" value= "${responseBean.cvalue}">
					</div></div>

				</form:form>
			</div>
			<div class="card-footer bg-info">
				<b>@Currency Conversion Happy to hope you......</b>
			</div>
		</div>
	</div>

	<%-- <form:form action="save" method="POST"
					modelAttribute="currencyConversionFormBean">
				FROM: <form:input path="cfrom"/><br>	
				TO :<form:input path="cto"/><br>
				Quantity:<form:input path="cvalue"/><br> 
				<input type="submit" value="ConvertAmount"/>
				<input type="reset" value="Clear"/>
	   </form:form> --%>

	<%-- Converted Amount: ${responseBean.cvalue} --%>
</body>
</html>