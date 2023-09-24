package week1.day2;

public class LearnMethods {
	int sum = 0;
	int sub = 0;

	public int add(int a, int b) {
		sum = a + b;
		return sum;
	}

	public int sub(int a, int b) {
		sub = a - b;
		return sub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethods learbmethodsObj = new LearnMethods();
		System.out.println(learbmethodsObj.add(1, 2));
		System.out.println(learbmethodsObj.sub(42, 32));
	}

}
