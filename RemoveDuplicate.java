package week3.day2;

import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0;
		String[] sp = text.split(" ");
		for (int i = 0; i < sp.length; i++) {
			for (int j= i+1; j < sp.length; j++) {
				
				if (sp[i].equalsIgnoreCase(sp[j])) {
					sp[j]="";
					count++;
				}
			}
			
		}
		if (count>1) {
			
			for (int k = 0; k < sp.length; k++) {
				System.out.println(sp[k]+" ");
			}
		}
		}
		
	}


