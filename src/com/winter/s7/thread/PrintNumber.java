package com.winter.s7.thread;

public class PrintNumber extends Thread{
	//오버라이딩
	public void run() {
		this.info();
	}
	
	public synchronized void info() {
		
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
