//Lektion 1

public class StakTest {
	
	public static void main(String[] args) {		
		
		Stak as = new ArrayStak();
		as.push("Dette");
		as.push("er");
		as.push("en");
		as.push("m�rkelig");
		as.push("s�tning");
		as.show();
		
		for(int i = 0; i < 6; i++) {
			System.out.println(as.pop());
		}
		
		
	}

}
