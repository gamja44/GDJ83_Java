package com.winter.s6.network.ex1.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnect {
	
	private ServerSocket ss;
	private Socket socket;
	private InputStream is; 
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;
	
	public BufferedReader getBr() {
		return br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}
	
	public void getConnect() throws Exception{
		ss = new ServerSocket(8282);
		
		socket = ss.accept();
		

		//input
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		//output
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		
		
	}
	
	//2.자원해제
		public void disConnect() throws Exception {
			br.close();
			ir.close();
			is.close();
			ow.close();
			os.close();
			socket.close();
			
		}
	
}
