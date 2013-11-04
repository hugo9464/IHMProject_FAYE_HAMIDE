<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<sf:form method="POST" modelAttribute="contact">
		<fieldset>
			<table>
			
				<tr>
					<td>nom :</td>
					<td><sf:input path="nom" /></td>
				</tr>
				<tr>
					<td>prenom :</td>
					<td><sf:input path="prenom" /></td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="submit"
						value="Ok, j'ajoute une adresse !" /></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>

