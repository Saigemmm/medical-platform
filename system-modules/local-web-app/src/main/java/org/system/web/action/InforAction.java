package org.system.web.action;

import org.system.domain.User;
import org.system.domain.UserInfor;
import org.system.service.UserInforService;
import org.system.web.BaseAction;

import com.opensymphony.xwork2.ModelDriven;

public class InforAction extends BaseAction implements ModelDriven<UserInfor>{
	UserInfor userInfor=new UserInfor();
	UserInforService userInforService;
	
	public void setUserInforService(UserInforService userInforService) {
		this.userInforService = userInforService;
	}
	
	public String toInfor() {
		return "infor";
	}
	
	public String submitInfor() {
		User u=(User) session.getAttribute("loginedUser");
		if(session.getAttribute("userInfor")==null) {
			userInfor=userInforService.getUserInforById(u.getUserInforId());
			session.setAttribute("userInfor", userInfor);
		}else {
			userInfor.setUserId(u.getUserId());
			userInforService.register(userInfor);
		}
		return "submit";
	}
	
	public UserInfor getModel() {
		// TODO Auto-generated method stub
		return userInfor;
	}
}
