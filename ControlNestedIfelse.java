package HomePageDemo;

 class ControlNestedIfelse {
	public static void decideGrading(int marks) {
		if (marks<35) {
			System.out.println("Your result is fail");
			
		}
		else if (marks>=35 && marks<=60) {
			System.out.println("Your result is pass with second class");
		}
		else if (marks<=60 && marks<=80) {
			System.out.println("Your result is pass with first class");
		}
		else if (marks<=80 && marks<=100) {
			System.out.println("Your result is first class with Distingtion");
		}
		else {
			System.out.print("Please enter correct Percentage");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
