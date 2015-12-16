
<%@ page isELIgnored="false" %>

<HTML>
<BODY bgcolor=pink>
<center>
<H1>EL OPERATORS

<br><br>
<table border=1 bgcolor=cyan cellpadding=10 cellspacing="5" width="80%" >

	<tr>
		<th>
			Computation
		</th>
		
		<th>
			Result
		</th>
	</tr>
	<tr>
		<td>
			\${1 div 0}
		</td>
	
		<td>
			${1 div 0}
		</td>
	</tr>
	
	<tr>
		<td>
			\${1+3}
		</td>
		
		<td>
			${1+3}
		</td>
	</tr>
	
	<tr>
		<td>
			\${9-3}
		</td>

		<td>
			${9-3}
		</td>
	</tr>
	
	<tr>
		<td>
			\${2*3}
		</td>
		
		<td>
			${2*3}
		</td>
	</tr>
	
	<tr>
		<td>
			\${5%2}
		</td>
		
		<td>
			${5%2}
		</td>
	</tr>
	
	<tr>
		<td>
			\${'a'= ='a'}
		</td>
		
		<td>
			${'a'=='a'}
		</td>
	</tr>
	
	<tr>
		<td></td><td></td>
	</tr>
	
</table>
</H1>
<center>
</BODY>
</HTML>