<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" enctype="multipart/form-data"
              action="http://localhost:8181/cxf/crm/customerservice/upload">
            File to upload: <input type="file" name="upfile"><br/>
            <input type="submit" value="Press"> to upload the file!
        </form>

    </body>
</html>