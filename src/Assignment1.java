
 class Student {
    public int avg(int sub1,int sub2){  ///Method Overloading
    	return (sub1+sub2)/2;
    }
    public int avg(int sub1,int sub2,int sub3){  ////Method Overloading
    	return (sub1+sub2+sub3)/3;
    }
    public String result(){
    	String r="Fail";
    	return r;
    }
}

 public class Assignment1 extends Student{
	 String Standard;
	 int sub1,sub2,sub3;
	 public int resultSet(String s){
		 if(s=="Nineth"){
			 return avg(sub1,sub2);
		 }
		 else if(s=="Tenth"){
			 return avg(sub1,sub2,sub3);
		 }
		 else
			 return 0;
	 }
	 public String result(int num){   ////Method Overriding
		 String r="Fail";
		 if(num>=60){
			 r="Pass";
			 return r;
		 }
		 else
		 return r;
	 }
	 public static void main(String args[]){
		 Assignment1 a=new Assignment1();
		 a.sub1=60;
		 a.sub2=40;
		 a.sub3=80;
		 int n=a.resultSet("Tenth");
		 String s=a.result(n);
		 System.out.println(s);
		 
	 }
 }