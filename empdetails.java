package week1.day2;

public class empdetails {

		public void getemployeedetails(String empname,int empid) {
			System.out.println(empname+"-"+ empid);
			System.out.println(empname);
			System.out.println(empid);
	}
	public static void main(String[] args) {
		empdetails ed= new empdetails();
		ed.getemployeedetails("Gowtham",1250);
		
		
	}

}
