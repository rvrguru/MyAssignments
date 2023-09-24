package week1.day2;

public class LearnArrayStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Scores = {98, 99, 87, 100, 98};
		String[] Subjects = { "Tamil", "English", "Maths", "Science", "SScience" };
		for(int i=0;i<Subjects.length;i++)
		{
			System.out.println(Subjects[i]);
			
		}
		for(int j=0;j<Scores.length;j++)
		{
			System.out.println("  " +Scores[j]);
		}

	}

}
