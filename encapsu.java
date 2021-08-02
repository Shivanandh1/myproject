package javap;

public class encapsu {

	public static void main(String[] args)
	{
		Emp e1=new Emp();
		e1.setEmpid(9);
		Emp e2=new Emp();
		e2.setEmpid(7);
         Emp e3=new Emp();
         e3.setEmpname("the great shiva");
         System.out.println(e1.getEmpid());
         System.out.println(e2.getEmpid());
         System.out.println(e3.getEmpname());
               
         
         
	}

}
class Emp
{
     private int Empid;  
	     private String Empname;
	     
		public int getEmpid() {
			return Empid;
		}
		public void setEmpid(int empid) {
			Empid = empid;
		}
		public String getEmpname() {
			return Empname;
		}
		public void setEmpname(String empname) {
			this.Empname = empname;
		}
	     
	
}