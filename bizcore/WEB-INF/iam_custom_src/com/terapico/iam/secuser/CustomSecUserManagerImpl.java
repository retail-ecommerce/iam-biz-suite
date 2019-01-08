
package com.terapico.iam.secuser;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Enumeration;
import java.util.HashMap;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import com.skynet.infrastructure.CacheService;
import com.skynet.infrastructure.ESClient;
import com.skynet.infrastructure.EventService;
import com.skynet.infrastructure.GraphService;
import com.skynet.infrastructure.SMTPService;
import com.skynet.infrastructure.MessageService;


import com.terapico.iam.IamUserContextImpl;
import com.terapico.iam.LoginForm;
import com.terapico.iam.BaseEntity;
import com.terapico.iam.CommonError;
import com.terapico.iam.DAOGroup;
import com.terapico.iam.ManagerGroup;

import com.terapico.iam.UserContextImpl;
import com.terapico.iam.userapp.UserApp;
import com.terapico.iam.IamUserContext;
import com.terapico.iam.userapp.*;
import com.terapico.iam.listaccess.*;
import com.terapico.iam.objectaccess.*;
import com.terapico.iam.IamChecker;
import com.terapico.iam.loginhistory.LoginHistory;
import com.terapico.iam.Message;



import com.terapico.uccaf.BaseUserContext;
import com.terapico.uccaf.UserContextProvider;
import com.terapico.caf.BeanFactory;
import com.terapico.utils.TextUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public class CustomSecUserManagerImpl extends SecUserManagerImpl implements
        UserContextProvider {
       protected String environmentName;
    protected Boolean productEnvironment;
    protected DAOGroup daoGroup;
    protected ManagerGroup managerGroup;
    protected EventService eventService;
    protected String checkerBeanName = "checker";
    public String getCheckerBeanName() {
		return checkerBeanName;
	}
	public void setCheckerBeanName(String checkerBeanName) {
		this.checkerBeanName = checkerBeanName;
	}
    public EventService getEventService() {
        return eventService;
    }
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }
    public String getEnvironmentName() {
        return environmentName;
    }
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    public DAOGroup getDaoGroup() {
        return daoGroup;
    }
    public void setDaoGroup(DAOGroup daoGroup) {
        this.daoGroup = daoGroup;
    }
    public ManagerGroup getManagerGroup() {
        return managerGroup;
    }
    public void setManagerGroup(ManagerGroup managerGroup) {
        this.managerGroup = managerGroup;
    }
    public Boolean getProductEnvironment() {
        return productEnvironment;
    }

    public void setProductEnvironment(Boolean productEnvironment) {
        this.productEnvironment = productEnvironment;
    }
    
    public CustomSecUserManagerImpl() {
        // TODO Auto-generated constructor stub
    }
    
    public String confirmSession(IamUserContext userContext){
        SecUser user = cachedUser(userContext);
        if(user==null){
            return "FAIL";
        }
        return "OK";
    }
    
    public Object resetPassword(IamUserContext userContext, String mobile, int verifycationCode, String newPassword) {
        
        
        SecUser user;
        try {
            user = this.loadUserWith(userContext, "mobile", mobile);
            if(isVerificationCodeExpired(user)){
                return "VERIFIICATION_CODE_EXPIRED";
            }
            if(verifycationCode != user.getVerificationCode()){
                return "VERIFIICATION_CODE_NOT_MATCH";
            }

            String hasedPassword = this.hashStringWithSHA256(newPassword, user.getId());
            user.setPwd(hasedPassword);
            this.saveSecUser(userContext, user, SecUserTokens.withoutLists());
            return this.loginWithMobile(userContext, mobile, newPassword);
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return "FAIL";
        }
        
        //return this.getSecUserDAO().clone(fromSecUserId, this.allTokens());
    }
    
    public Object resetPasswordWithoutLogin(IamUserContext userContext, String loginType, String loginKey, int verifycationCode, String newPassword) {
        SecUser user;
        try {
            user = this.loadUserWith(userContext, loginType, loginKey);
            if(isVerificationCodeExpired(user)){
                return "VERIFIICATION_CODE_EXPIRED";
            }
            if(verifycationCode != user.getVerificationCode()){
                return "VERIFIICATION_CODE_NOT_MATCH";
            }

            // String hasedPassword = this.hashStringWithSHA256(newPassword, user.getId());
            user.updatePwd(newPassword);
            return this.saveSecUser(userContext, user, SecUserTokens.empty());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return "FAIL";
 <html>
<body>
<h1>500 Servlet Exception</h1>
<code><pre>
<script language='javascript' type='text/javascript'>
function show() { document.getElementById('trace').style.display = ''; }
</script>
<a style="text-decoration" href="javascript:show();">[show]</a> java.lang.NullPointerException
<span id="trace" style="display:none">
java.lang.NullPointerException
	at com.terapico.system.ObjectCollection.getFieldByKey(ObjectCollection.java:849)
	at _jsp._javaweb._java_0user_0base_0function__jsp._jspService(javaweb/java_user_base_function.jsp:563)
	at com.caucho.jsp.JavaPage.service(JavaPage.java:61)
	at com.caucho.jsp.Page.pageservice(Page.java:578)
	at com.caucho.server.dispatch.PageFilterChain.doFilter(PageFilterChain.java:195)
	at com.caucho.server.webapp.DispatchFilterChain.doFilter(DispatchFilterChain.java:112)
	at com.caucho.server.dispatch.ServletInvocation.service(ServletInvocation.java:265)
	at com.caucho.server.webapp.RequestDispatcherImpl.include(RequestDispatcherImpl.java:504)
	at com.caucho.server.webapp.RequestDispatcherImpl.include(RequestDispatcherImpl.java:368)
	at com.caucho.jsp.PageContextImpl.include(PageContextImpl.java:1009)
	at _jsp._javaweb._java_0app_0index__jsp._jspService(javaweb/java_app_index.jsp:61)
	at com.caucho.jsp.JavaPage.service(JavaPage.java:61)
	at com.caucho.jsp.Page.pageservice(Page.java:578)
	at com.caucho.server.dispatch.PageFilterChain.doFilter(PageFilterChain.java:195)
	at com.caucho.server.webapp.WebAppFilterChain.doFilter(WebAppFilterChain.java:187)
	at com.caucho.server.dispatch.ServletInvocation.service(ServletInvocation.java:265)
	at com.caucho.server.http.HttpRequest.handleRequest(HttpRequest.java:273)
	at com.caucho.server.port.TcpConnection.run(TcpConnection.java:682)
	at com.caucho.util.ThreadPool$Item.runTasks(ThreadPool.java:743)
	at com.caucho.util.ThreadPool$Item.run(ThreadPool.java:662)
	at java.lang.Thread.run(Thread.java:745)
</span>
</pre></code>
</body></html>
