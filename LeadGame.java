package com.myjavapractce;

import java.util.Scanner;

public class LeadGame {
	
	public int[] winnerLead(int subscore1[],int subscore2[]) {
		int sub=Integer.MIN_VALUE;
		int sub1;
		int player;
		int[] playerscore=new int[2];
		for(int i=0;i<subscore1.length;i++) {
			sub1=subscore1[i]-subscore2[i];
			if(Math.abs(sub1)>sub && subscore1[i]>subscore2[i]) {
				sub=sub1;
				player=1;
				playerscore[0]=player;
				playerscore[1]=Math.abs(sub);
			}
			else if(Math.abs(sub1)>sub && subscore1[i]<subscore2[i]){
				sub=sub1;
				player=2;
				playerscore[0]=player;
				playerscore[1]=Math.abs(sub);
			}
		}
		return  playerscore;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rounds=sc.nextInt();
		int si[]=new int[rounds];
		int ti[]=new int[rounds];
		
		
		for(int i=0;i<rounds;i++) {
			
			si[i]=sc.nextInt();
			ti[i]=sc.nextInt();
		}
			
		LeadGame l=new LeadGame();
		int[] result=l.winnerLead(si, ti);
		System.out.print(result[0]+" "+result[1]);
	}

}
