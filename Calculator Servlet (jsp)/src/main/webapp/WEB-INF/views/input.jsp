
<html>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<H1>DATE CALCULATOR </H1>
	<p> *format for date input is MM/DD/YYYY and for phrase u can input simple phrase like today , 5 days after</p>
	
	<H2>SUB TWO DATES</H2>
  
		<form  class="form-inline" method="post" action="twodate">
		<div class="form-group">
  <label for="date1">First Date:</label><br>
  <input type="text" id="date1" name="date1" value="date" required="required" ><br>
  <label for="date2">Second Date to Sub or simple phrase</label><br>
  <input type="text" id="date2" name="date2" value="date" required="required" ><br><br>
  <input type="submit"  class="btn btn-success" value="Submit">
  </div>
</form> 


<H2>PHRASE CALCULATOR</H2>

<form  class="form-inline" method="post" action="Simplephrase">
<div class="form-group">
  <label for="date1">Evaluate date Phrase:</label><br>
  <input type="text" id="date1" name="date1" value="today" required="required" ><br><br>
    <input type="submit"  class="btn btn-success" value="Submit">
  </div>
  
 
</form> 

<H2>WEEK CALCULATOR</H2>
<form  class="form-inline" method="post" action="Week">
  <label for="date1">Determine the Week number for a given a date:</label><br>
  <input type="text" id="date1" name="date1" value="date" required="required" ><br><br>
 
  <input type="submit"  class="btn btn-success" value="Submit">
</form> 
<H2>N DATE SUBTRACT</H2>
		<form  class="form-inline" method="post" action="SubNdays">
  <label for="date1">First Date:</label><br>
  <input type="text" id="date1" name="date1" value="date" required="required" ><br>
  <label for="date2">Enter N days or N weeks or N years to subtract</label><br>
  <input type="text" id="date2" name="date2" value="date" required="required" ><br><br>
  <input type="submit"  class="btn btn-success" value="Submit">
</form> 
	<H2>N DATE ADD</H2>
		<form  class="form-inline" method="post" action="AddNdays">
  <label for="date1">First Date:</label><br>
  <input type="text" id="date1" name="date1" value="date" required="required" ><br>
  <label for="date2">Enter N days or N weeks or N years to Add</label><br>
  <input type="text" id="date2" name="date2" value="date" required="required" ><br><br>
  <input type="submit"  class="btn btn-success" value="Submit">
</form> 
		
</div>

</html>