package com.winter.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		Socket socket = null;
		OutputStream os =null;
		OutputStreamWriter ow = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		try {
			
			socket = new Socket("127.0.0.1", 8282);
			System.out.println("서버와 연결 성공");
			//서버전송
			//0,1를 처리하는 친구가 필요하다
			//outputStreand은 0,1을 처리하는 친구
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			//내보낼 준비만 완료
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			while(true) {
			System.out.println("서버로 보낼 메세지를 입력");
			String str = sc.next();
			
			ow.write(str+"\r\n");
			ow.flush();
			
			if(str.toUpperCase().equals("EXIT")) {
				break;
			}
			String s = br.readLine();
			
			if(str.toUpperCase().equals("EXIT")) {
				break;
			}
			
			System.out.println(s);
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ow.close();
				os.close();
				socket.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
