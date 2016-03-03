package object_cloning;

class Student18 implements Cloneable{  
int rollno;  
String name;  
  
Student18(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Student18() {
	
}

public Object clone() throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
Student18 s1=new Student18(101,"sridhar");  
  
Student18 s2=(Student18)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  

/*Student18 s3=new Student18();
s3=s2;

System.out.println(s2.rollno+" "+s2.name);  
System.out.println(s3.rollno+" "+s3.name);  */


}catch(CloneNotSupportedException c){}  
  
}  
}  