package week1.day2;

public class LearnSwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Chrome";
		switch (browser) {
			case "Edge":
			System.out.println("Launch Edge Browser");
			break;
		case "Chrome":
			System.out.println("Launch Chrome Browser");
			break;
		case "FireFox":
			System.out.println("Launch FireFox Browser");
			break;
			default: 
				System.out.println("Launch default Browser");
				break;
		}
		//System.out.println("Out of loop");
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
				
	}

}
