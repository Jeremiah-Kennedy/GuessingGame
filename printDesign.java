// This file requires the Apache Commons Lang for the centering effect. Which can be downloaded here.
//http://commons.apache.org/proper/commons-lang/download_lang.cgi
// Otherwise functions perfectly


package GitHub;
import org.apache.commons.lang3.*;

public class printDesign {
	public String starPattern = "*";
	public String centerizer;


	public static void main(String[] args) {
		//

	}
	public void patternOne(){
	for(int i = 0;i<=5;i++){
		if(i<4) {
			System.out.println(starPattern);
			starPattern = starPattern+"*";
		
		}
	if(i==5) {
	System.out.println(".........");
	}
	}
	}
	
	public void patternTwo(){
		
		for(int i = 0;i<5;i++){
			if(i==0) {
				System.out.println("..........");
				}
		if(i<4) {
			starPattern = starPattern.substring(0, starPattern.length()-1);
			System.out.println(starPattern);
			
		
		}
	
	}
		
	}
	public void patternThree() {
		for(int i = 0;i<=5;i++){
			
			if(i<4) {
				centerizer = StringUtils.center(starPattern, 12);
				System.out.println(centerizer);
				starPattern = starPattern+"**";
				

				
			
			}
		if(i==5) {
		
		System.out.println("............");
		}
		}
			
		
		
	}
	public void patternFour() {
		for(int i = 0;i<5;i++){
			if(i==0) {
				System.out.println("............");
				}
		if(i<4) {
			starPattern = starPattern.substring(0, starPattern.length()-2);
			centerizer = StringUtils.center(starPattern, 12);
			System.out.println(centerizer);
			;
		
		}
	
	}
		
		}
	
	
		
	
}
