<%-- 
    Document   : result
    Created on : 17-ott-2017, 15.57.53
    Author     : Kevin Conter &lt;k dot conter at enginsoft dot com&gt;
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Risultato</title>
    </head>
    <body>
        <h1>Risultato</h1>
        <p>Stringa numbers: ${requestScope.numbers}</p>
        <p>Risultato calcolato: ${requestScope.result}</p>
        <a href="index.html">Index</a>
    </body>
</html>
