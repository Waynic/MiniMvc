<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>

<% 
  ArrayList styles = (ArrayList)request.getAttribute("styles");

  Iterator it = styles.iterator();
    out.print("We suggest the most popular beers under the follwing");
  while(it.hasNext()) {
    out.print("<br>try: " + it.next());
  }
%>
</p>
</body>
</html>