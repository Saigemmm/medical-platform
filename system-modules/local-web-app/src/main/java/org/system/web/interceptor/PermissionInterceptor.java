package org.system.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class PermissionInterceptor extends MethodFilterInterceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		if(invocation.getInvocationContext().getSession().get("loginedUser")==null) {
			return "login";
		}else {
			return invocation.invoke();
		}
	}

}
