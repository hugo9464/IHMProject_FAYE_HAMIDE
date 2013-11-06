<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

	<sf:form method="POST" modelAttribute="adresse">
		<fieldset>
			<table>
			
				<tr>
					<td>numero :</td>
					<td><sf:input path="numero" /></td>
				</tr>
				<tr>
					<td>rue :</td>
					<td><sf:input path="rue" /></td>
				</tr>
								<tr>
					<td>CP :</td>
					<td><sf:input path="codepostal" /><br/>
						
					</td>
				</tr>
								<tr>
					<td>ville :</td>
					<td><sf:input path="ville" /></td>
				</tr>
				
								
				<tr>
					<td colspan="2"><input type="submit"
						value="Ajouter cette adresse " /></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>


