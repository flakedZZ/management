package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class LogoutAction {
	private String execute() {
		// TODO Auto-generated method stub
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        session.clear();
		return "success";
	}

}
