package com.winter.s6.network.ex1;

public class ClientMain {

	public static void main(String[] args) {
		ClientConnect clientConnect = new ClientConnect();
		ClientService clientService = new ClientService();
		try {
			//clientConnect.getConnection();
			String info ="1,50,iu";
			clientService.getInfo(info);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
