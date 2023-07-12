public class passByVal {
	public static void main(String[] args) {
		Student s = new Student();
		passByVal val = new passByVal();
		s.setStudentId(10);
		System.out.println(s.getStudentId());
		val.passTheValueMethod(s);
		System.out.println("The sId are" + s.getStudentId());
	}

	private void passTheValueMethod(Student s) {
		// TODO Auto-generated method stub
		s.setStudentId(25);
		System.out.println("The sId are" + s.getStudentId());
	}
}
