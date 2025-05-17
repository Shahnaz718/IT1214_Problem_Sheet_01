class Student{
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	boolean validateMarks(int marks){
		if(marks>=0 && marks<=100){
			return true;
		}
		else{
			return false;
		}
	}


 Student(String name,int exam1,int exam2,int exam3)throws Exception{
	this.name=name;

		if(validateMarks(exam1)&& validateMarks(exam2) && validateMarks(exam3)){
			this.exam1=exam1;
			this.exam2=exam2;
			this.exam3=exam3;
		}
		else{
			System.out.println("Setting the marks to 0");
			throw new Exception("Invalid marks");
		}
	
	}
 
	
 String getName(){
	return name;
}

 int getExam1(){
	return exam1;
}

 int getExam2(){
	return exam2;
}

int getExam3(){
	return exam3;
}
} 
class StudentDemo{
	public static void main(String[] args){
		try{
		Student s1=new Student("Adam",99,99,55);
		Student s2=new Student("eve",99,88,95);
		
		
		System.out.println("Name of the student 1 is: "+s1.getName());
		System.out.println("Marks of the student 1 of exam1 is: "+s1.getExam1());
		System.out.println("Marks of the student 1 of exam2 is: "+s1.getExam2());
		System.out.println("Marks of the student 1 of exam2 is: "+s1.getExam3());
		
		System.out.println("Name of the student 2 is: "+s2.getName());
		System.out.println("Marks of the student 2 of exam1 is: "+s2.getExam1());
		System.out.println("Marks of the student 2 of exam2 is: "+s2.getExam2());
		System.out.println("Marks of the student 2 of exam3 is: "+s2.getExam3());
		
	} catch(Exception e){
			System.out.println("Exception is: "+e.getMessage());
		}
}
}

