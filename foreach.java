package javap;

public class foreach {
        String name;
        int age;
        String address;
        public foreach(String name,int age,String address)
        {
        	this.name=name;
        	this.age=age;
        	this.address=address;
     
        }
        public void Student(String name,int age,String address)
        {
        	
        
        }
        
        public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
        
		public static void main(String[] args) {
	   foreach S=new foreach("john",4,"california");
	   System.out.println(S);

	}

}
