package com.winter.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Client {

	public static void main(String[] args) {
		
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		String a= null;
		try {

			socket = new Socket("192.168.7.115", 8282);
			System.out.println("서버와 연결 성공");

			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);

			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			while (true) {
				System.out.println("서버로 보낼 메세지 입력");
				String str = sc.next();

				if(str.equals("1")) {
					
					ow.write(str + "\r\n");
					ow.flush();
					
					a = br.readLine();
					System.out.println(a);
					
					StringTokenizer s = new StringTokenizer(a, ",");
					
					while(s.hasMoreTokens()) {
					String num = s.nextToken();
					String name = s.nextToken();
					String n1 = s.nextToken();
					String n2 = s.nextToken();
					String n3 = s.nextToken();
					String n4 = s.nextToken();
					String n5 = s.nextToken();
					System.out.println(num+name+n1+n2+n3+n4+n5);
					}
					
				}else if(str.equals("2")) {
					a = br.readLine();
					System.out.println(a);
					
					ow.write(str + "\r\n");
					ow.flush();
					
					
				}else if(str.equals("3")) {
					System.out.println("종료");
					break;
					
				}				
				
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ow.close();
				os.close();
				is.close();
				ir.close();
				br.close();
				socket.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
