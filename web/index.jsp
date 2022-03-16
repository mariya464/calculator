<%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 15.03.2022
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculator</title>
  </head>
  <body>
  <form action="Result" method="post" name="f1">
    <table>
      <tr><td>
        First Number:-   <input type="text" name="p1"  /></td>
      </tr>
      <tr><td>
        Second Number:-  <input type="text" name="p2"  /></td>
      </tr>
      <tr>
        <td>
          <select name="math">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
          </select>
        </td>
      </tr>
      <tr><td><input type="submit" value="Submit" /></td></tr>
    </table>
  </form>
  </body>
</html>
