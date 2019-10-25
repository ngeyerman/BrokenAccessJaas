package jaas.security;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("java.security.auth.login.config", "jaastutorial.config");
		LoginContext loginContext = null;
		try {
			loginContext = new LoginContext("JaasTutorial", new JaasCallbackHandler());
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(0);
		}
		while (true) {
			try {
				loginContext.login();
				System.exit(0);
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

}
