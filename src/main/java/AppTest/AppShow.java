package AppTest;

import httpServer.booter;
import nlogger.nlogger;

public class AppShow {
	public static void main(String[] args) {
		booter booter = new booter();
		try {
			System.out.println("GrapeMenu");
			System.setProperty("AppName", "GrapeMenu");
			booter.start(1006);
		} catch (Exception e) {
			nlogger.logout(e);
		}
	}
}