package org.system.web.action;

import org.system.domain.User;
import org.system.service.PayerAccountService;
import org.system.service.ProductService;
import org.system.service.UserInforService;
import org.system.service.UserService;
import org.system.web.BaseAction;

import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends BaseAction implements ModelDriven<User>{
	private User user = new User();

	private UserService userService;
	private PayerAccountService payerAccountService;
	private ProductService productService;
	private UserInforService userInforService;	

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setPayerAccountService(PayerAccountService payerAccountService) {
		this.payerAccountService = payerAccountService;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	public void setUserInforService(UserInforService userInforService) {
		this.userInforService = userInforService;
	}	

	public String toLogin() {
		return "login";
	}

	public String doLogin() {
		User u = userService.login(user.getUserName(), user.getPassword());
		if (u != null) {
			// 将登录信息放到session中
			// ActionContext.getContext().getSession().put("loginedUser", u);
			session.setAttribute("productName", productService.getProductByProdcutId(u.getProductId()).getProductName());
			session.setAttribute("price", productService.getProductByProdcutId(u.getProductId()).getPrice());
			session.setAttribute("bankType", payerAccountService.getPayerAccountById(u.getPayerId()).getBankType());
			session.setAttribute("accountId", payerAccountService.getPayerAccountById(u.getPayerId()).getAccountId());
			session.setAttribute("inforName", userInforService.getUserInforById(u.getUserInforId()).getUserInforName());
			session.setAttribute("medicalResult", userInforService.getUserInforById(u.getUserInforId()).getMedicalResult());
			session.setAttribute("loginedUser", u);
			return "index";
		} else {
			return "login";
		}
	}

	public String toRegister() {
		return "register";
	}

	public String doRegister() {
		System.out.println("《》"+user.getUserName()+" >>>>><<<"+user.getPassword());
		if((userService.register(user))==1) {
			return "registerSuccess";
		}else {
			return "register";
		}
		
	}
	
	public String toProfile() {
		return "profile";
	}
	
	public String toEditProfile() {
		return "editProfile";
	}

	public String doEditProfile() {
		User u = (User) session.getAttribute("loginedUser");
		u.setPhoneNumber(user.getPhoneNumber());
		u.setAddress(user.getAddress());
		userService.updateUser(u);
		return "profile";
	}
	
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
