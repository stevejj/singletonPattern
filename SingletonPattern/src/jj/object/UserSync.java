package jj.object;

/**
 * Synchronized 를 이용하여 동기화 시키기
 * 
 * @author stevejj
 * @version 1.0
 * 
 * */
public class UserSync {
	
	private static UserSync usr = null;
	
	private UserSync() {
		System.out.println("## UserSync.java ## 유저 생성");
	}
	
	public static synchronized UserSync getInstance() {
		if(usr == null) {
			usr = new UserSync();
		}
		return usr;
	}
	
}