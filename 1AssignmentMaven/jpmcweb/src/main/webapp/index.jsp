<html>
<body>
<h2>Hello World!</h2>
<% out.println("===>"+(new jav.util.Date()).toString()); %>
<% 
    package com.jpmc.util.*;
    Student s1=new Student();
    s1.setName("pawan");
    s1.setAge(24);
    s1.setId(56799);
    System.out.println(s1.getId()+" "+s1.getname()+" "+s1.getAge());
}
%>
<form action="process.jsp">  
    <input type="submit" value="register"/>  
</form>  

</body>
</html>
