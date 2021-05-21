package GitHub;
//import org.apache.commons.lang3.StringUtils;

public class printDesign {
	public String starPattern = "*";


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
			;
		
		}
	
	}
		
	}
	public void patternThree() {
		for(int i = 0;i<=5;i++){
			if(i<4) {
				//starPattern = StringUtils.center(starPattern, 12);
				System.out.println(starPattern);
				starPattern = starPattern+"**";
				
			
			}
		if(i==5) {
		System.out.println("...........");
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
			System.out.println(starPattern);
			;
		
		}
	
	}
		
		}
	
	
		
	
}
