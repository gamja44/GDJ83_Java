package com.winter.study3.ex2;

public class Study {
	
	public int[] remove(int[] ar) {
		int[] re = new int[ar.length-1];//배열을 하나씩 제거하기
		for(int i=0;i<ar.length;i++) {
			re[i]=ar[i];
		}
		return re;
		
	}
	
	public int[] add(int[]ar) {
		System.out.println(ar.length);
		//ar=new int[4]; //배열은 한번만들어진것은 변경불가능 변경하려면 새로운 배열을 만들어야한다
		//결과값이 1,2,3,0이 나오도록 코드를 만들어준다.
		//int[]ar ={1,2,3};값을 받았고 이것을 int[4]라는 배열에 어떻게 넣어줄것인가?
		int[] ar2 =new int[ar.length+1];  //배열을 새로운 배열객체로 생성해야한다
			for(int i=0;i<ar.length;i++) {//그리고 for문을 만들어서 같은 인덱스 번호로 동일하게 만들어줘서 만들어야한다
				ar2[i]=ar[i];
			}
		
		
		
		
		return ar2;//4개짜리 배열을 만들어주기위해서 ar을 리턴해준다 그래서 리턴타입을 int[]타입으로 변경해준다 
	}
	
}
