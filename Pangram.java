import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="We promptly judged antique ivory buckles for the next prize";
		//String s="Wepromptlyjudgedantiqueivorybucklesforthenextprize";
		int n=s.length();
		boolean boo=false;
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			int k=c;
			//boolean boo=false;
			if((k>=65 && k<=90)||(k>=97 && k<=122)){// || (c==' ')) {       //||k==0){
				boo=true;
				//System.out.println("Pangram");
			}
			//else{
			//	System.out.println("Not a Pangram");
			//}
		}	
			if(boo) {
				System.out.println("Pangram");
			}
			else {
				System.out.println("Not a Pangram");
			}
		
		
	}

}
