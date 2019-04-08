<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include.inc.jsp"%>

<link href="../styles/dwz/themes/css/login.css" rel="stylesheet" type="text/css" />
<%--<script src="<c:url value='/styles/dwz/js/dwz.alertMsg.js'/>" type="text/javascript"></script>--%>

<div id="login">
    <div id="login_header">
        <h1 class="login_logo">
            <a href="#"><img src="../styles/dwz/themes/default/images/login_logo.gif" /></a>
        </h1>
        <div class="login_headerContent">
            <div class="navList">
                <ul>
                    <li><a href="#">设为首页</a></li>
                    <li><a href="#">反馈</a></li>
                    <li><a href="#" target="_blank">帮助</a></li>
                </ul>
            </div>
            <h2 class="login_title"><img src="../styles/dwz/themes/default/images/login_title.png" /></h2>
        </div>
    </div>
    <div id="login_content">
        <div class="loginForm">
            <form action="<c:url value='/login'/>">
                <p>
                    <label>用户名：</label>
                    <input type="text" name="name" size="20" class="login_input" />
                </p>
                <p>
                    <label>密码：</label>
                    <input type="password" name="password" size="20" class="login_input" />
                </p>
                <%--<p>--%>
                    <%--<label>验证码：</label>--%>
                    <%--<input class="code" type="text" size="5" />--%>
                    <%--<span><img src="../styles/dwz/themes/default/images/header_bg.png" alt="" width="75" height="24" /></span>--%>
                <%--</p>--%>
                <c:if test="${!empty message}">
                    <p style="color: #ff0000">${message}</p>
                    <%--<% alertMsg.error('登录失败！');%>--%>
                </c:if>
                <div class="login_bar">
                    <input class="sub" type="submit" value=" " />
                </div>
            </form>
        </div>
        <div class="login_banner"><img src="../styles/dwz/themes/default/images/login_banner.jpg" /></div>
        <div class="login_main">
            <ul class="helpList">
                <li><a href="#">下载驱动程序</a></li>
                <li><a href="#">如何安装密钥驱动程序？</a></li>
                <li><a href="#">忘记密码怎么办？</a></li>
                <li><a href="#">为什么登录失败？</a></li>
            </ul>
            <div class="login_inner">
                <p>您可以使用 网易网盘 ，随时存，随地取</p>
                <p>您还可以使用 闪电邮 在桌面随时提醒邮件到达，快速收发邮件。</p>
                <p>在 百宝箱 里您可以查星座，订机票，看小说，学做菜…</p>
            </div>
        </div>
    </div>
    <div id="login_footer">
        Copyright &copy; 2009 Inc. All Rights Reserved.
    </div>
</div>