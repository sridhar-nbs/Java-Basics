package arrays;

class Testarray{ 
	public static void min(int[] a){
		for(int i=0;i<a.length;i++)//length is the property of array  
			a[i]=a[i]+5;
	}
public static void main(String args[]){  
  
int a[]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
 
int b[]={33,3,4,5,1};//declaration, instantiation and initialization  
int c=5;
String d=""+c;
System.out.println(d);

//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
  

//printing array  
for(int i=0;i<b.length;i++)//length is the property of array  
System.out.println(b[i]);  

System.out.println("after changing");
min(b);
//printing array  
for(int i=0;i<b.length;i++)//length is the property of array  
System.out.println(b[i]);  

}}


class Testarray3{  
public static void main(String args[]){  
  
//declaring and initializing 2D array  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
  
//printing 2D array  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
  
}}


class Testarray4{  
public static void main(String args[]){  
  
int arr[]={4,4,5};  
  
Class c=arr.getClass();  
String name=c.getName();  
  
System.out.println(name);  
  
}}



class TestArrayCopyDemo {  
    public static void main(String[] args) {  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        char[] copyTo = new char[7];  
  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        System.out.println(new String(copyTo));  
    }  
}  



class Testarray5{  
public static void main(String args[]){  
//creating two matrices  
int a[][]={{1,3,4},{3,4,5}};  
int b[][]={{1,3,4},{3,4,5}};  
  
//creating another matrix to store the sum of two matrices  
int c[][]=new int[2][3];  
  
//adding and printing addition of 2 matrices  
for(int i=0;i<2;i++){  
for(int j=0;j<3;j++){  
c[i][j]=a[i][j]+b[i][j];  
System.out.print(c[i][j]+" ");  
}  
System.out.println();//new line  
}  
  
}}  