import javax.sound.sampled.SourceDataLine;

// import java.net.SocketTimeoutException;

// class Box{
//     double width,height,depth;
//     Box(double w,double h,double d) {
//         width=w;
//         height=h;
//         depth=d;
    
//     }
// }

// public class Constractor {
    
// }

// class box{
//     box(){
//         System.out.println("i'm a not paramitarized constructor");
//     }
//     box(int a){
//         System.out.println("i'm a paramitarized constructor\n perameter is: "+a);
//     }
// }
// class Constractor2 {
//     public static void main(String[] args) {
//         box a= new box();
//         box a1  = new box(9);
//     }   
// }

// //PALINDROMS
// class Palindroms {
//     public  static void main (String[] args)  {
//         String s = "madam";
//         String rev = "";
//         String ls=s.toLowerCase();
//         int count=0;
       
       
//         for(int i=s.length()-1;i>=0;i--) {
//             rev = rev+s.charAt(i);
//         }
        
//         if(s.equals(rev)) {
//             System.out.println("PALINDROM STRING");
//         }else{
//             System.out.println("NOT A PALINDROM STRING");
//         }
//         for( int i=0;i<s.length();i++) {
//             char c=ls.charAt(i);
//             if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){

//             count++;
//     }
//     }
//        System.out.println("numer of vowels is: " +count); 
// }
// }


// class Poly {
//     static int multiply (int a, int b) {
//         return a*b; 

//     }
//     static double multiply (double a, double b) {
//         return a*b;
//     }
// }
// class Example {
//     public static void main(String args[]) {
//         System.out.println(Poly.multiply(2, 5));
//         System.out.println(Poly.multiply(2.5, 5.7));
//     }
// }


// class student{
//     student() {
//         System.out.println("non-paramiterized constractor");
//     }
//     student(int a) {
//         System.out.println("paramiterized constractor \n my parameter is" +a);
//     }
// }
// class example{
//     public static void main(String args[]) {
//         student c=new student();
//         student c1=new student(5);
//     }
// }

//  class GuruThread1 implements Runnable
// {
//        public static void main(String[] args) {
//         Thread multiThread1 = new Thread("multi1");
//         Thread multiThread2 = new Thread("multi2");
//         multiThread1.start();
//         multiThread2.start();
//         System.out.println("Thread names are following:");
//         System.out.println(multiThread1.getName());
//         System.out.println(multiThread2.getName());
//     }
  
//     public void run() {
//     }
// }

// class ArrayReverse {
//     public static void main (String args[]) {
//         int[] OARR= new int[] {4,5,6,7,8};
//         System.out.println("original Array: ");
//         for(int i=0;i<OARR.length;i++) {
//             System.out.println(OARR[i]+"");
            
//         }
//         System.out.println("The Reverse Array: ");
//             for(int j = OARR.length-1; j>=0;j--) {
//                 System.out.println(OARR[j]+"");
//             }
//     }
// } 

// class Alpha {
//     public static void main (String args[]) {
//         int n = 4;
//         String names[] = {"Amit", "Tamalika", "Bubai", "Sanjib"};
//         String temp;

//         for(int i=0;i<n;i++) {
//             for(int j=i+1;j<i;i++){
//                 if(names[i].compareTo(names[j])>0){
//                     temp = names[i];
//                     names[i] = names[j];
//                     names[j] = temp;
//                 }
//             }
//         }
//         System.out.println("The names in Alphabetical order are: ");
//         for(int i=0;i<n;i++) {
//             System.out.println(names[i]);
//         }
//     }


// }


//  class Papa {
//  public static void main(String[] args) {
//  int[] arr = {1,2,3,4,5};
//  int sum=0;
//  for (int i=2;i<arr.length;i+=2) {
//  sum += i ;
// }
//  double aveg = (double)sum/arr.length;
//  System.out.println("The value of the aveg is: "+aveg);;
// }
// }


// class Average {

//     public static void main(String[] args) {
//         double[] numArray = { 1,2,3,4,5 };
//         double sum = 0.0;

//         for (double num: numArray) {
//            sum += num;
//         }

//         double average = sum / numArray.length;
//         System.out.format("The average is: %.2f", average);
//     }
// }   


// class Student{
//     int id;
//     String name;
//     int age;
    
//     public Student(int i, String n, int a) {
//         id=i;
//         name=n;
//         age=a;
//     }
// public void display(){
//     System.out.println("ID: "+id+", NAME: "+name+"AGE: "+age);
// }
// public void display(message){
//     System.out.println(message+"ID: "+id+", NAME: "+name+"AGE: "+age);
//     Student student1=new Student(1, Amit, 19);
//     Student student2=new Student(2, Ronit, 18)
//     student1.display();
//     student2.display();
// }

// }

class Factorial{
    public static void main (String args[])  {
        int num1=5;
    
        long factorialResult =  calculateFactorial(num1);
        System.out.println("factorial of "+num1+"= "+factorialResult);
    }
}