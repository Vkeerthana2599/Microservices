package com.keethi.practice;

public class Test {
	public static void main(String args[]) {
		for(int i=100; i<1000;i++)
		{
			check(i);
		}
	}
	public  static void check(int n) {
		int count=0;
		int temp=n;
		int p=0;
		while(n>0) {
			p++;
			n=n/10;
		
	}
		n=temp;
		int[]a=new int[p];
		for(int i=0;i<a.length;i++) {
			int d=n%10;
			a[i]=d;
			n=n/10;
			
		}
		for(int j=0;j<p;j++) {
			if(a[0]==a[j])
				count++;
		}
		if(count==p)
			System.out.println(temp);
	}

}
