package problem7;

public class SemesterMarksAverager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.2f",calculateAverage(85, 79, 91, 76, 88, 95, 80, 85));

	}
	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	}

}
