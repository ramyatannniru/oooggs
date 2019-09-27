<body>
  <jsp:useBean id="u" class="jsp_javabean.ValidateJavaBean" scope="request">


  <jsp:setProperty name="u" property="*" />
  
  </jsp:useBean>
  You entered user name as <jsp:getProperty name="u" property="user" /> <br>

  You entered user password as <jsp:getProperty name="u" property="pass" /> <br>

  <br>

  You are a <%= u.validate("Admin", "Admin") %> user.  <br>

  <b>Thank You</b>
</body>