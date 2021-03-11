package jj.main;

import jj.object.UserLazy;

public class SingletonMain01 {

	/**
	 * @param args
	 * 
	 * */
	public static void main(String[] args) {
		/*
		User usr = new User();
		System.out.println("## 1 ## 유저 생성 HashCode : " + usr.hashCode());
		System.out.println("########");
		
		// 테스트
		
		usr = new User();
		System.out.println("## 2 ## 유저 생성 HashCode : " + usr.hashCode());
		*/
		UserLazy usr = UserLazy.getInstance();
		System.out.println("## 1 ## 유저 생성 HashCode : " + usr.hashCode());
		System.out.println("########");
		usr = UserLazy.getInstance();
		System.out.println("## 2 ## 유저 생성 HashCode : " + usr.hashCode());
		
	}

}
