# myproject
public class poragallu {

	public static void main(String[] args)
	{ 
		Student s1=new Student();
		s1.setStudentid(3);
		s1.setStudentName("shiva");
		System.out.println(s1.getStudentName);
	}
}
	class Student
		{ 
		public char[] getStudentName;
		private int Studentid;
		private String StudentName;
		public char[] getGetStudentName() {
			return getStudentName;
		}
		public void setGetStudentName(char[] getStudentName) {
			this.getStudentName = getStudentName;
		}
		public int getStudentid() {
			return Studentid;
		}
		public void setStudentid(int studentid) {
			Studentid = studentid;
		}
		public String getStudentName() {
			return StudentName;
		}
		public void setStudentName(String studentName) {
			StudentName = studentName;
		}
		
		}
