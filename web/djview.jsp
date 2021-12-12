<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DJ View</title>
</head>
<body>

<h1>DJ View</h1>
Beats per minutes = <jsp:getProperty name="beatModel" property="BPM"/>
<br/>
<hr/>
<br/>

<form method="get" action="${pageContext.request.contextPath}/servlet/DJViewServlet">
    BPM: <input type="text" name="bpm" value="<jsp:getProperty name="beatModel" property="BPM"/>"/>

    &nbsp;

    <input type="submit" name="set" value="set"/><br/>
    <input type="submit" name="decrease" value="<<"/><br/>
    <input type="submit" name="increase" value=">>"/><br/>
    <input type="submit" name="on" value="on"/><br/>
    <input type="submit" name="off" value="off"/><br/>
</form>

</body>
</html>
