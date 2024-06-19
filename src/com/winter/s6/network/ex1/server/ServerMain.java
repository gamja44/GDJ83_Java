package com.winter.s6.network.ex1.server;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerConnect serverConnect = new ServerConnect();
		try {
			serverConnect.getConnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
