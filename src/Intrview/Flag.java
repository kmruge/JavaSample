package Intrview;

public class Flag {

	public static void main(String[] args) {
		int height=26;
		int width=40;
		int temp=3;
		for(int i=1;i<height;i++) {
			for(int j=1;j<width;j++) {
				 if(i <= 4) {  
	                    if(i == 1 || i == 4) {  
	                        if(j >= 15 && j<= 35) {  
	                            System.out.print("-");  
	                        } else {  
	                            System.out.print(" ");  
	                        }  
	                    } else {  
	                        if(i ==2 || i ==3) {  
	                            if(j == 15 || j == 35) {  
	                                System.out.print("|");  
	                            } else {  
	                                System.out.print(" ");  
	                            }  
	                        }  
	                    }  
	                }  
	                if(i > 4 && i <= 8) {  
	                    // second layer of the flag  
	                    if(i <= 7) {  
	                        if(j == 15 || j == 35) {  
	                            System.out.print("|");  
	                        } else {  
	                            if(j >= 22 && j<= 28) {  
	                                System.out.print("*");  
	                            } else {  
	                                System.out.print(" ");  
	                            }  
	                        }  
	                    } else {  
	                        if(j >= 15 && j<= 35) {  
	                            System.out.print("-");  
	                        } else {  
	                            System.out.print(" ");  
	                        }  
	                    }  
	                }  
	                if(i > 8 && i <= 11) {  
	                    // third layer of the flag  
	                    if(i <= 10) {  
	                        if(j == 15 || j == 35) {  
	                            System.out.print("|");  
	                        } else {  
	                            System.out.print(" ");  
	                        }  
	                    } else {  
	                        if(j>= 15 && j <= 35) {  
	                            System.out.print("-");  
	                        } else {  
	                            System.out.print(" ");  
	                        }  
	                    }  
	                }  
	                if( i>= 12 && i <= 19) {  
	                    // stick of the flag  
	                    if(j== 15) {  
	                        System.out.print("|");  
	                    } else {  
	                        System.out.print(" ");  
	                    }  
	                }  
	                // stairs of the flag  
	                if( i>= 20) {  
	                    if(i% 2 == 0) {  
	                        if(j >= 15 - temp && j <= 15 + temp) {  
	                            System.out.print("-");  
	                        } else {  
	                            System.out.print(" ");  
	                        }  
	                    } else {  
	                        if(j == 15 - temp || j == 15 + temp) {  
	                            System.out.print("|");  
	                        } else {  
	                            System.out.print(" ");  
	                        }  
	                    }  
	                }  
	            }  
	            if(i >= 20) {  
	                if(i % 2 != 0) {  
	                    temp++;  
	                }  
	            }  
	            System.out.print("\n");       
	        }  
		System.out.print("       I N D I A N  F L A G");
	    }  
	}  
			