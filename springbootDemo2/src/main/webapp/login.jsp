<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>留言板</title>
   <link href="static/css/bootstrap.min.css" rel="stylesheet">
   <link href="static/css/style.css" rel="stylesheet">        
     <script src="static/js/jquery.min.js"></script>
     <script src="static/js/bootstrap.min.js"></script> 
</head>
<body>
     <div class="login-container">
    <form name="form1" action="GoLogin.action" method="post" onSubmit="return mycheck()">
      <div class="login-box">
          <h2>留言板</h2>
          <span style="color:red;">
                <%if(request.getAttribute("Msg")!=null){%>
                <%=request.getAttribute("Msg")%>
                <%}%>
          </span>
          <div class="form-group">
            <input type="text" class="form-control" placeholder="用户名">
          </div>
          <div class="form-group">
             <input type="password" class="form-control" placeholder="密码">
          </div>
           <select name="Type" id="Type" class="form-control">
                <option value="">--请选择登录身份--</option>
                <option value="系统管理员">系统管理员</option>
                <option value="楼宇管理员">楼宇管理员</option>
                <option value="学生">学生</option>
           </select>
          <div class="checkbox">
            <label>
              <input type="checkbox">记住密码
            </label>
          </div> 
         <div class="login-box-btn">
              <button type="submit" class="btn btn-info">登录</button>
              <button type="button" class="btn btn-info">重置</button>
         </div>
      </div>
  </form>
  </div>
     
</body>
</html>