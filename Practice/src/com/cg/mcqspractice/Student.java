package com.cg.mcqspractice;


class Student {
	String name, status;
	int[] scores;

	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
	}

}

class Validator {
	public String validateScore(Student s) throws Exception {
		int[] scores = s.scores;
		for (int i = 0; i < scores.length; i++) {
			if (!(scores[i] >= 0 && scores[i] <= 100)) {
				return "Invalid score";
			}
		}
		return "Valid score";
	}

	public double getPercentage(Student s) {
		int sum = 0;
		int[] scores = s.scores;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		return sum / scores.length;
	}
}

class InvalidScoreException extends Exception {
	String s = "";

	public InvalidScoreException(String s) {
		this.s = s;
	}
}

class Source {
	public static void main(String arhs[]) {
		int score[] = { 50, 40, 80, 67, 69 };
		Student s = new Student("Aman", score);
		Validator val = new Validator();
		String ans = "";
		try {
			ans = val.validateScore(s);
		} catch (Exception e) {
			System.out.print(e);
		}
		double per = val.getPercentage(s);
		System.out.println(ans);
		System.out.println(per);
	}
}
