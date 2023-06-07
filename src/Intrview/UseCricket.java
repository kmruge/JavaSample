package Intrview;

import java.util.ArrayList;

public class UseCricket {

	public static void main(String[] args) {
		Cricket cricket1=new Cricket("MSD",true,100,39,2);
		Cricket cricket2=new Cricket("RAINA",true,105,38,1);
		Cricket cricket3=new Cricket("KOHLI",true,450,32,2);
		Cricket cricket4=new Cricket("R.ASWIN",false,84,31,2);
		Cricket cricket5=new Cricket("JADEJA",false,59,34,2);
		Cricket cricket6=new Cricket("HARDIK",false,9,33,2);
		ArrayList<Cricket> cricket=new ArrayList<>();
		cricket.add(cricket1);
		cricket.add(cricket2);
		cricket.add(cricket3);
		cricket.add(cricket4);
		cricket.add(cricket5);
		cricket.add(cricket6);
		System.out.print(cricket);
		int max=0;
		for(Cricket c:cricket) {
			if(c.getPlayerScore()>max) {
			
			}
			
		}
		
	}

}
