

//          System.out.println("Number is: "+dup);
//             System.out.println("Sum is: "+sum);
//         }
// }



//find the product of number entered by user...
// class program{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.print("Enter a Number :");//1234
//             int num=sc.nextInt();
//             int dup=num;
//             int product=1;

//             int rem=num%10;//4
//             product=product*rem;//4
//             num=num/10;

//             rem=num%10;//3
//             product=product*rem;//4*3=12
//             num=num/10;

//             rem=num%10;//2
//             product=product*rem;//12*2=24
//             num=num/10;

//             rem=num%10;//1
//             product=product*rem;//24*1=24
//             num=num/10;

//             System.out.println("Number is: "+dup);
//             System.out.println("product is: "+product);
//         }
// }



//program to find area and primeter of circle that has radius of 5.5 using following formula...
// class program{
//         public static void main(String[] args) {
//             java.util.Scanner sc=new java.util.Scanner(System.in);
//             System.out.print("Enter the radius of Circle: ");
//             float radius=sc.nextFloat();
//             final float PI=3.14f;

//             float area=PI*(radius*radius);
//             float primeter=2*PI*radius;

//             System.out.println("area of circle: "+area);
//             System.out.println("Perimeter of circle: "+primeter);

//         }
// }



//Population Problem...
// class program{
//         public static void main(String[] args) {
//             int currentPop=312032486;

//             long second=(365*24*60*60)*5;

//             long birth=second/7;
//             long death=second/13;
//             long immigrant=second/45;

//             long newPop=currentPop+birth-death+immigrant;

//             System.out.println("current Population: "+currentPop);
//             System.out.println("New Population: "+newPop);
//         }
// }



//convert celsius to farrenheit...
// class program{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.print("Enter the celsius degree: ");
//             double celsius=sc.nextDouble();

//             double fahrenheit=(9.0/5)*celsius+32;

//             System.out.println(celsius+" celsius is "+fahrenheit+" fahrenheit");
            
//         }
// }



// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         int num=sc.nextInt();//1234
        
//         int dup=num;//1234
//         int rev=0;

//         int rem=num%10;//4
//         rev=rev*10+rem;//0*10+4 = 4
//         num/=10;//123

//         rem=num%10;//3
//         rev=rev*10+rem;//4*10+3 = 43
//         num/=10;//12

//         rem=num%10;//2
//         rev=rev*10+rem;//43*10+2 = 430+2 = 432
//         num/=10;//1

//         rem=num%10;//1
//         rev=rev*10+rem;//432*10+1 = 4320+1 = 4321
//         num/=10;//0

//         System.out.println("Number is: "+dup);
//         System.out.println("Reverse Number is: "+rev);

//     }
// }





//finacial application:calculate tips...
// class program{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the subtotal: ");
//         float subTotal=sc.nextFloat();
//         System.out.print("Enter the gratuity: ");
//         int gratuity=sc.nextInt();

//         float finalGratuity=(15/subTotal);

//         float total=finalGratuity+10;

//         System.out.println("The tip is "+finalGratuity+" and total is "+total);
//     }
// }




//find the no of years...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the minutes: ");
//         long minutes=sc.nextLong();

//         long year=minutes/(60*24*365);
//         long days=(minutes/(60*24))%365;

//         System.out.println(minutes+" minutes is approximately "+year+" years and "+days);

//     }
// }



//covert feet to meter...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the Number in feet: ");
//         double feet=sc.nextDouble();

//         double meter=feet*0.305;
//         System.out.println(feet+" feet is "+meter+" meters");
//     }
// }




//Health application:computing BMI
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the weight in ponds: ");
//         double weight=sc.nextDouble();
//         System.out.print("Enter the Height in inches: ");
//         double height=sc.nextDouble();

//         double finalWight=weight*0.45359237;
//         double finalHeight=height*0.0254;

//         double bmi=finalWight/(finalHeight*finalHeight);

//         System.out.println("BMI is: "+bmi);

//     }
// }



//Financial application...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter balance: ");
//         long balance=sc.nextLong();
//         System.out.print("Enter intrest rate: ");
//         float annualInterestRate=sc.nextFloat();

//         float interest=balance*(annualInterestRate/1200);

//         System.out.println("The interest is: "+interest);


//     }
// }



//cost of driving...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the driving distance: ");
//         float distance=sc.nextFloat();
//         System.out.print("Enter miles per gallon: ");
//         float milesPerGallon=sc.nextFloat();
//         System.out.print("Enter the price per gallon: ");
//         float pricePerGallon=sc.nextFloat();

//         float cost=(distance/milesPerGallon)*pricePerGallon;

//         System.out.println("The cost of driving is: $"+cost);
//     }
// }



//Average speed in km...
// class program{
//     public static void main(String[] args) {
//         double distanceInKm=24*1.6f;
//         double totalTime=1+(40.0/60)+(35.0/3600);

//         double avgSpeed=distanceInKm/totalTime;

//         System.out.println("average speed in Km/hr is: "+avgSpeed);
//     }
// }



//Finacial application:compound value...
// class program{
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.print("Enter the montly saving amount: ");
//       int saving=sc.nextInt();
//       float interestRate=0.00417f;

//       float firstMonth=saving*(1+interestRate);
//       float secondMonth=(saving+firstMonth)*(1+interestRate);
//       float thirdMonth=(saving+secondMonth)*(1+interestRate);
//       float fourthMonth=(saving+thirdMonth)*(1+interestRate);
//       float fifthMonth=(saving+fourthMonth)*(1+interestRate);
//       float sixthMonth=(saving+fifthMonth)*(1+interestRate);


//       System.out.println("After the sixth month,the account value is Rs:- "+sixthMonth);

//     }
// }




//Convert pounds into kilograms...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number in pounds: ");
//         double pounds=sc.nextDouble();

//         double kilogram=pounds*0.454;

//         System.out.println(pounds+" pounds is "+kilogram+" kilograms");

//     }
// }




//03/07/2025 Assignment
//program to check the given charcter is A-Z or a_z...
//class program{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the char: ");
//         char ch=sc.next().charAt(0);

//         boolean op=(ch>='A' && ch<='Z')||(ch>='a' && ch<='z');

//         System.out.println(op);
//     }
// }



//program to check special character...
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);

//         boolean op=(ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>=48 && ch<=57);

//         System.out.println(!op);
//     }
// }




//program to check vowels...
// class program{
//     public static void main(String[] args) {
//         char ch=new java.util.Scanner(System.in).next().toUpperCase().charAt(0);
//         System.out.println(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');

//     }
// }




//program to check even number...
// class program{
//     public static void main(String[] args) {
//         int num=new java.util.Scanner(System.in).nextInt();
//         System.out.println(num%2==0);
//     }
// }



//program for odd number
// class program{
//     public static void main(String[] args) {
//         int num=new java.util.Scanner(System.in).nextInt();
//         System.out.println(!(num%2==0));
//     }
// }



//program to check for consonent...
// class program{
//     public static void main(String[] args) {
//         char ch=new java.util.Scanner(System.in).next().toUpperCase().charAt(0);
//         boolean op=(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
//         System.out.println(!op);
//     }
// }




//program to find leap year...
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int year=sc.nextInt();

//         boolean isLeap=(year%4==0)&&((year%100!=0)||(year%400==0));

//         System.out.println(isLeap);
//     }
// }




//program to find user enterd digit is present in 0 to 9
// class program{
//     public static void main(String[] args) {
//         char ch=new java.util.Scanner(System.in).next().charAt(0);
//         System.out.println(ch>=48 && ch<=57);
//     }
// }



//program to check leap year or not
// class program{
//     public static void main(String []args){
//         int year=new java.util.Scanner(System.in).nextInt();

//         boolean isLeap=(year%4==0)&&(year%100!=0 ||year%400==0);

//         System.out.println("isLeap: "+isLeap);

         // System.out.println(year%4);
         // System.out.println(year%100);
         // System.out.println(year%400);
//     }
// }





//Assignment 03/07/2025
//write a java program to find number is even or odd without using modulus operator...
// class program{
//     public static void main(String[] args) {
//         int num=new java.util.Scanner(System.in).nextInt();
//         int num1=num/2;
//         String op=(num1*2==num)?"even":"odd";

//         System.out.println(op);
        
        
//     }
// }




//alternate method to find even or odd without using modulud operator...
// class program{
//     public static void main(String[] args) {
//         int num=new java.util.Scanner(System.in).nextInt();

//         String op=(num/2==num/2.0) ? (num+" is even number") : (num+" is odd number");
//         System.out.println(op);
//     }
// }



//program to find the largest number among two...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the num1: ");
//         int num1=sc.nextInt();
//         System.out.print("Enter the num2: ");
//         int num2=sc.nextInt();

//         int greaterNumber=(num1>num2) ? (num1) : (num2);

//         System.out.println("Greater num among "+num1+" and "+num2+" is: "+greaterNumber);
//     }
// }






//program to find the smallest number among two...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the num1: ");
//         int num1=sc.nextInt();
//         System.out.print("Enter the num2: ");
//         int num2=sc.nextInt();

//         int smallerNumber=(num1<num2) ? (num1) : (num2);

//         System.out.println("smallest num among "+num1+" and "+num2+" is: "+smallerNumber);
//     }
// }



//program to find smallest number among three...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the num1: ");
//         int num1=sc.nextInt();
//         System.out.println("Enter the num2: ");
//         int num2=sc.nextInt();
//         System.out.println("Enter the num3: ");
//         int num3=sc.nextInt();

//         // int smallerNum=(num1<num2) ? (num1) : (num2);

//         // int finalSmall=(smallerNum<num3) ? (smallerNum) :(num3);

//         int finalSmall=(num1<num2) ? ((num1<num3) ? num1:num3) :((num2<num3) ? num2 :num3);

//         System.out.println("Smallest Number is: "+finalSmall);

//     }
// }



//program to find Biggest number among three...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the num1: ");
//         int num1=sc.nextInt();
//         System.out.print("Enter the num2: ");
//         int num2=sc.nextInt();
//         System.out.print("Enter the num3: ");
//         int num3=sc.nextInt();

//         // int biggerNum=(num1>num2) ? (num1) : (num2);

//         // int finalbig=(smallerNum>num3) ? (smallerNum) :(num3);

//         int finalBig=(num1>num2) ? ((num1>num3) ? num1:num3) :((num2>num3) ? num2 :num3);

//         System.out.println("Smallest Number is: "+finalBig);

//     }
// }



//program to find vowel and consonent...
// class program{
//     public static void main(String[] args) {
//         char ch=new java.util.Scanner(System.in).next().toUpperCase().charAt(0);

//         String op=((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ? "Vowel" :"Consonent");

//         System.out.println(op);
//     }
// }




//program to find character is lowercase or uppercase...
// class program{
//     public static void main(String[] args) {
//         char ch=new java.util.Scanner(System.in).next().charAt(0);

//         String op=(ch>=65 && ch<=90) ? "UpperCase" : "LowerCase";

//         System.out.println(op);
//     }
// }




//program to check for specil character...
// class program{
//     public static void main(String[] args) {
//         char ch=new java.util.Scanner(System.in).next().charAt(0);

//         String op=!((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57)) ? "Special Character" : "Not Special Character";

//         System.out.println(op);


//     }
// }




//SimpleCalculator Program...
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter num1: ");
//         float num1=sc.nextFloat();
//         System.out.print("Enter num2: ");
//         float num2=sc.nextFloat();

//         System.out.print("Enter which operation want to perform you: ");
//         char ch=sc.next().charAt(0);
//         String op="";

//          op=(ch=='+')?
//                     (op+=num1+num2):
//                     ((ch=='-')?
//                     (op+=num1-num2):
//                     (ch=='*')?               
//                     (op+=num1*num2):
//                     (ch=='/')?
//                     (op+=num1/num2):
//                     (ch=='%')?
//                     (op+=num1%num2):
//                     (op+="Invalid"));

//                     if((op.equals("Invalid"))){
//                         System.out.println("U have entered Invalid operator");
//                         return;

//                     }
//                     System.out.println(num1+" "+ch+" "+num2+" is = "+op);

                    


//     }
// }




//program to check prime number or not...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n=sc.nextInt();

//         boolean op=(n>1)?
//                     ((n==2||n==3||n==5||n==7)?
//                     (true):
//                     ((n%2==0||n%3==0||n%5==0||n%7==0)?
//                     (false):
//                     (true))):
//                     (false);
//         System.out.println(n+" is prime= "+op);

//     }
// }





//simple calculator program...
// import java.util.Scanner;
//  public class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the num1: ");
//         float num1=sc.nextFloat();
//         System.out.print("Enter the num2: ");
//         float num2=sc.nextFloat();
//         System.out.print("Enter which operation you want to perform: ");
//         char opr=sc.next().charAt(0);

//         String op="";
//         op=(opr=='+')?
//         (op+=num1+num2):
//         ((opr=='-')?
//         (op+=num1-num2):
//         ((opr=='*')?
//         (op+=num1*num2):
//         ((opr=='/')?
//         (op+=num1/num2):
//         (opr=='%')?
//         (op+=num1%num2):
//         (op+="Invalid"))));


//         if((op.equals("Invalid"))){
//             System.out.println("Plz Perform valid operation");
//             return;
//         }

//     System.out.println(num1+" "+opr+" "+num2+" is = "+op);

//     }
// }




//we can write our java program also like this...
// @SuppressWarnings("strictfp")
// strictfp class program{
//      static public final synchronized    void main(String ... sahil) {
//         System.out.println("Sahil panmand");
//     }
// }




// class program{
//     public static void main(String[] args) {
//         String a=Integer.toBinaryString(10);
//         System.out.println(a);
//     }
// }




//08/07/2025
// class program{
//     public static void main(String[] args) {
//         byte a=10;
//         byte b=120;
//         byte c=(byte)(a+b);
//         System.out.println(c);
//     }
// }
//     public static void main(String []args){
//         System.out.print("Shopping Starts: ");
//         System.out.println("Enter the bill Amouunt: ");
//         double billAmount=new Scanner(System.in).nextDouble();
//         double disc=15;
//         if(billAmount>=5000){
//             System.out.println("You got "+disc+" off");
//             billAmount=(billAmount)-(billAmount/100)*disc;
//             System.out.println(billAmount);

//         }
//         System.out.println("Total bill: "+billAmount+" rs");
//         System.out.println("Shopping ends");
//     }
// }





// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num%2==0 && num%5!=0){
//             System.out.println("Hi Two");
//         }
//         if (num%5==0 && num%2!=0) {
//             System.out.println("Hi five");
//         }
//         if (num%2==0 && num%5==0) {
//             System.out.println("Hi Two...Hi Five");
//         }
//     }
// }



//program for even odd using if statment...
// class program{
//     public static void main(String[] args) {
//         int num=new java.util.Scanner(System.in).nextInt();
//         if(num%2==0){
//             System.out.println("Number is Even Number");
//         }
//         if(num%2!=0){
//             System.out.println("Number is Odd Number");
//         }
//     }
// }



//program to check the number is positive or negative...
// class program{
//     public static void main(String[] args) {
//         int num=new java.util.Scanner(System.in).nextInt();
//         if(num>0){
//             System.out.println("Number is Positive");
//         }
//         if(num<0){
//             System.out.println("Number is Negative Number");
//         }
//         if(num==0){
//             System.out.println("Number is Nutral");
//         }
//     }
// }





//program to check vowel or consonent using if statment...
// class program{
//     public static void main(String[] args) {
//         char ch=new java.util.Scanner(System.in).next().toUpperCase().charAt(0);
//         if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')){
//             System.out.println(ch+" It is a vowel");
//         }
//         if(!((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))){
//             System.out.println(ch+" It is a Consonent");
//         }
//     }
// }





//09/07/2025
//if else
// import java.util.Scanner;
// class program{
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age=sc.nextInt();
//         System.out.print("Enter your property: ");
//         long property=sc.nextLong();
//         System.out.print("Enter your Surname");
//         String surname=sc.next().toUpperCase();

//         if(age>21 && property>=10000000 && surname.equals("AMBANI")){
//             System.out.println("The boy is eligible for marriage");
//         }
//         else{
//             System.out.println("Not eligible for marriage");
//         }
//     }
// }





//program for incearse the pay of employee...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your salary: ");
//         double sal=sc.nextDouble();
//         double dup=sal;
//         System.out.println("Enter your target score: ");
//         int score=sc.nextInt();

//         if(score>90){
//             sal=sal+sal*0.03;
//             System.out.println("Your salary is increase by 3% "+sal);
//         }else{
//             sal=sal+sal*0.01;
//             System.out.println("Your salary is increase by 1% "+sal);
//         }
//         System.out.println("Initial salary is: "+dup);
//         System.out.println("Final salary is: "+sal);

//     }
// }



// class program{
//     public static void main(String[] args) {
//         if(true)
//             if(false)
//                 System.out.println("if block");
//         else
//             System.out.println("else block");
//     }
// }





// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int age=sc.nextInt();
//         System.out.println("Enter your property amount: ");
//         long property=sc.nextLong();
//         System.out.println("Enter your Surname: ");
//         String surname=sc.next();

//         if(age>21 && (property>=10000000 || surname.equalsIgnoreCase("AMBANI"))){
//             System.out.println("You are eligible to marry");
//         }
//         else{
//             System.out.println("You are not eligible to marry");
//         }

        
//     }
// }




// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
        
        

//         System.out.println("name: "+ch);
        
//     }
// }




// import java.util.Scanner;

// class program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your marks (out of 500): ");
//         int marks = sc.nextInt();
//         double percentage;

//         if (marks < 0 || marks > 500) {
//             System.out.println("You entered invalid marks... Please enter valid marks between 0 to 500.");
//         } else {
//             percentage = (marks / 500.0) * 100; 

//             if (percentage < 35) {
//                 System.out.println("You are failed... You got " + percentage + "%");
//             } else if (percentage >= 35 && percentage <= 50) {
//                 System.out.println("You are pass... You got " + percentage + "%");
//             } else if (percentage > 50 && percentage <= 60) {
//                 System.out.println("You passed with second class... You got " + percentage + "%");
//             } else if (percentage > 60 && percentage <= 75) {
//                 System.out.println("You passed with first class... You got " + percentage + "%");
//             } else if (percentage > 75 && percentage <= 90) {
//                 System.out.println("You passed with distinction... You got " + percentage + "%");
//             } else {
//                 System.out.println("Outstanding performance... You got " + percentage + "%");
//             }
//         }
//     }
// }






//java application for cuurency converter...
// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         for(;;){
//             System.out.println("");
//             System.out.println("");
//             System.out.println("     Welcome");
//             System.out.println("");
//             System.out.println("List of currency");
//             System.out.println("1.USD");
//             System.out.println("2.EUR");
//             System.out.println("3.AED");
//             System.out.println("4.AFN");
//             System.out.println("5.AMD");
//             System.out.println("6.BRL");
//             System.out.println("7.PEN");
//             System.out.println("");
//             System.out.print("Enter your amount: ");
//             float amount=sc.nextFloat();

//             System.out.print("Enter the currency code: ");
//             String code=sc.next().toUpperCase();

//             float cov=0;

//             if(code.equals("USD")){
//                 cov=amount/85.5810f; 
//             }
//             else if(code.equals("EUR")){
//                 cov=amount/100.428f;
//             }
//             else if(code.equals("AED")){
//                 cov=amount/23.3024f;
//             }
//             else if(code.equals("AFN")){
//                 cov=amount/1.22627f;
//             }
//             else if(code.equals("AMD")){
//                 cov=amount/0.222727f;
//             }
//             else if(code.equals("BRL")){
//                 cov=amount/15.3433f;
//             }
//             else if(code.endsWith("PEN")){
//                 cov=amount/24.1541f;
//             }
//             else if(code.equals("0")){
//                 System.out.println("");
//                 System.out.println("Thank You visit again later...");
//                 return;
//             }
//             else{
//                 System.out.println("Invalid currncy code: "+code);
//                 return;
//             }
//             System.out.println(amount+" inr "+cov+ code);
            
//         }
//     }
// }




//program for if else...grade system
// class program{
//     public static void main(String[] args) {
//         java.util.Scanner sc=new java.util.Scanner(System.in);
//         System.out.print("Enter your marks: ");
//         int marks=sc.nextInt();
//         int totalMarks=500;
        
//         String grade;
//         if(marks>500 || marks<0){
//             System.out.println("You entered wrong marks "+marks);
//             return;
//         }
//         float per=(marks*100)/totalMarks;
//         if(per>=90){
//             System.out.println("outstanding");
//             grade="O";
//             System.out.println("Grade "+grade);
//         }
//         else if(per>=75){
//             System.out.println("You pass with distinction");
//             grade="A";
//             System.out.println("Grade "+grade);
//         }
//         else if(per>=60){
//             System.out.println("You pass with first class");
//             grade="B";
//             System.out.println("Grade "+grade);
//         }
//         else if(per>=50){
//             System.out.println("You pass with second class");
//             grade="C";
//             System.out.println("Grade "+grade);
//         }
//         else if(per>=35){
//             System.out.println("You are pass");
//             grade="P";
//             System.out.println("Grade "+grade);
//         }
//         else if(per>=0){
//             System.out.println("You are fail");
//             grade="F";
//             System.out.println("Grade "+grade);

//         }
            
//     }
// }




//currency converter code...practice
// import java.util.Scanner;
// class program{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         for (;;) {

//         System.out.println("");
//         System.out.println("         Welcome🙏");
//         System.out.println();
//         System.out.println("List of the Currency: ");
//         System.out.println("1.BTC");
//         System.out.println("2.PHP");
//         System.out.println("3.JPY");
//         System.out.println("4.RUB");
//         System.out.println("5.NZD");
//         System.out.println("");
//         System.out.print("Enter Amount: ");
//         long amount=sc.nextInt();
//         System.out.print("Enter Currency code: ");
//         String code=sc.next().toUpperCase();
//         float con;

//         if(code.equals("BTC")){
//             con=amount/9655500f;
//         }
//         else if(code.equals("PHP")){
//             con=amount/1.51636f;
//         }
//         else if(code.equals("JPY")){
//             con=amount/0.585232f;
//         }
//         else if(code.equals("RUB")){
//             con=amount/1.12784f;
//         }
//         else if(code.equals("NZD")){
//             con=amount/51.6162f;
//         }
//         else if(code.equals("0")){
//             System.out.println("Thank You...visit again...");
//             return;
//         }
//         else{
//             System.out.println("Invalid Currency code: "+code);
//             return;
//         }

//         System.out.println(amount+" inr is "+con+" "+ code);
//         }

        
//     }
// }





//Program for temprature Converter...
// import java.util.Scanner;
// class program{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         for (;;) {
//             System.out.println("");
//             System.out.println("");
//             System.out.println("                    Temprature Converter....");
//             System.out.println("");
//         System.out.println("1.Kelvin to Celsius    2.Fahrenheit to Celsius    3.Rankine to Celsius");
//         System.out.println("");
//         System.out.print("Enter Your choice: ");
//         float num=sc.nextFloat();
//         String choice="";

//         if(num==1){
//             choice="Kelvin to Celsius";

//         }
//         else if(num==2){
//             choice="Fahrenheit to Celsius";
//         }
//         else if(num==3){
//             choice="Rankine to Celsius";
//         }
//          else if(num==0){
//             System.out.println("");
//             System.out.println("Thank You Visit Again🙏...");
//             return;
//         }
//         else{
//             System.out.println("Invalid Choice");
//             choice="Invalid";
//             continue;
            
//         }
//         System.out.println("");
//         System.out.println("Choice: "+choice);
//         System.out.println("");

//         System.out.print("Enter the temprature in "+choice+" which you want to convert in Celsius: ");
//         float temp=sc.nextFloat();
//         float celsius=0;

//         if(choice.equals("Kelvin to Celsius")){
//             celsius=temp-273.15f;
//         }
//         else if(choice.equals("Fahrenheit to Celsius")){
//             celsius=(temp-32)*5/9;
//         }
//         else if(choice.equals("Rankine to Celsius")){
//             celsius=(temp-491.67f)*5/9;
//         }
       
        
//         System.out.println("");
//         System.out.println(temp+" "+choice+" is "+celsius+" celsius");
            
//         }
       
//     }
// }





// class program{
//     public static void main(String[] args) {
//         int a=1;
//         a=++a;
//         switch(++a){
//             case 1:{
//                 System.out.println("Sahil");
//                 break;
//             }
//             case 2:{
//                 System.out.println("Panmand");
//                 break;
//             }
//             default:{
//                 System.out.println("Invalid");
//                 break;
//             }
//         }
//     }
// }





// import java.util.Scanner;
// class program{
//     static int BJP,CONGRESS,SS,MNS,AAP,NOTA;
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("");
//         System.out.println("         Welcome");
//         System.out.println("");
//         System.out.print("Enter the Population: ");
//         int pop=sc.nextInt();
//         for(int i=1;i<=pop;i++){
//             System.out.println("");
//             System.out.println("List of Party: ");
//             System.out.println("");
//             System.out.println("1.BJP");
//             System.out.println("2.CONGRESS");
//             System.out.println("3.SHIV SENA");
//             System.out.println("4.MNS");
//             System.out.println("5.AAP");
//             System.out.println("6.NOTA");
//             System.out.println("");
//             System.out.print("Give your vote: ");
//             int vote=sc.nextInt();
//             switch (vote) {
//                 case 1:{
//                     BJP++;
//                     System.out.println("Acche din ayenge...");
//                     break;
//                 }
//                 case 2:{
//                     CONGRESS++;
//                     System.out.println("Congree is best...");
//                     break;
//                 }
//                 case 3:{
//                     SS++;
//                     System.out.println("Shiv Sena is best...");
//                     break;
//                 }
//                 case 4:{
//                     MNS++;
//                     System.out.println("Jay Maharastra...");
//                     break;
//                 }
//                 case 5:{
//                     AAP++;
//                     System.out.println("Aap is best...");
//                     break;
//                 }
//                 case 6:{
//                     NOTA++;
//                     System.out.println("Nota");
//                     break;
//                 } 
                    
//                 default:{
//                     System.out.println("Invalid ");
//                     break;
//                 }
                    
//             }
            
            

        
//         }
//             System.out.println("");
            
//             System.out.println("BJP "+BJP);
//             System.out.println("CONGRESS "+CONGRESS);
//             System.out.println("SHIV-SENA "+SS);
//             System.out.println("MNS "+MNS);
//             System.out.println("AAP "+AAP);
//             System.out.println("NOTA "+NOTA);

//             System.out.println("");

//             if(BJP>CONGRESS && BJP>SS && BJP>MNS && BJP>AAP && BJP>NOTA){
//                 System.out.println("BJP Won the election");
//             }
//             else if(CONGRESS>BJP && CONGRESS>SS && CONGRESS>MNS && CONGRESS>AAP && CONGRESS>NOTA){
//                 System.out.println("Congress won the election");
//             }
//             else if(SS>CONGRESS && SS>BJP && SS>MNS && SS>AAP && SS>NOTA){
//                 System.out.println("Shiv-Sena won the election");
//             }
//             else if(MNS>CONGRESS && MNS>BJP && MNS>SS && MNS>AAP && MNS>NOTA){
//                 System.out.println("MNS won the election");
//             }
//             else if(AAP>CONGRESS && AAP>BJP && AAP>SS && AAP>MNS && AAP>NOTA){
//                 System.out.println("AAP won the election");
//             }
//             else if(NOTA>CONGRESS && NOTA>BJP && NOTA>SS && NOTA>MNS && NOTA>AAP){
//                 System.out.println("Nota won the election");
//             }
//             else{
//                 System.out.println("Re-Election");
//             }

//     }
// }




// import java.util.Scanner;

// class program {
//     static String name;
//     static long contact;
//     static int pin;
//     static double balance;
//     static final long ACCOUNT_NUMBER = (long)(Math.random() * 100000000);

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         while (true) {
//             System.out.println("");
//             System.out.println("          Welcome");
//             System.out.println("    LAXMI CHITS FUNDS\n");
//             System.out.println("1. Existing User");
//             System.out.println("2. New User");
//             System.out.println("");
//             System.out.print("Enter Option: ");
             

//             switch (sc.nextInt()) {
//                 case 1: {
//                     System.out.println();
//                     if (name == null) {
//                         System.out.println("First create an account.");
//                         continue;
//                     }

//                     System.out.println("LOGIN");
//                     System.out.println("");
//                     System.out.print("Enter your phone: ");
//                     long phone = sc.nextLong();
//                     System.out.print("Enter your pin: ");
//                     int pin1 = sc.nextInt();

//                     if (phone == contact && pin == pin1) {
//                         System.out.println("Login Successful");
//                         System.out.println("");

//                         for(;;) {
//                             System.out.println("Home");
//                             System.out.println("");
//                             System.out.println("1. Deposit Amount");
//                             System.out.println("2. Withdraw Amount");
//                             System.out.println("3. Check Balance");
//                             System.out.println("4. Account INFO");
//                             System.out.println("5. Logout");
//                             System.out.println("");
//                             System.out.print("Enter an option: ");
//                             int opt = sc.nextInt();

//                             switch (opt) {
//                                 case 1: {
//                                     System.out.println("Deposit Module");
//                                     System.out.print("Enter an amount: ");
//                                     double amount = sc.nextDouble();
//                                     balance += amount;
//                                     System.out.println("Amount deposited successfully");
//                                     break;
//                                 }
//                                 case 2: {
//                                     System.out.println("Withdrawal Module");
//                                     System.out.print("Enter an amount: ");
//                                     double withAmt = sc.nextDouble();
//                                     System.out.print("Enter your pin: ");
//                                     int pin2 = sc.nextInt();
//                                     if (pin == pin2) {
//                                         if (withAmt <= balance) {
//                                             balance -= withAmt;
//                                             System.out.println("Amount withdrawn successfully");
//                                         } else {
//                                             System.out.println("Insufficient Funds");
//                                         }
//                                     } else {
//                                         System.out.println("Invalid Pin");
//                                     }
//                                     break;
//                                 }
//                                 case 3: {
//                                     System.out.println("Check Balance Module");
//                                     System.out.print("Enter pin: ");
//                                     int pin3 = sc.nextInt();
//                                     if (pin == pin3) {
//                                         System.out.println("Your balance is ₹" + balance);
//                                     } else {
//                                         System.out.println("Invalid Pin");
//                                     }
//                                     break;
//                                 }
//                                 case 4: {
//                                     System.out.println("Account Info Module");
//                                     System.out.println("");
//                                     System.out.println("Account Holder Name: " + name);
//                                     System.out.println("Contact No: " + contact);
//                                     System.out.println("Account No: " + ACCOUNT_NUMBER);
//                                     break;
//                                 }
//                                 case 5: {
//                                     System.out.println("Thank You... Visit Again");
//                                     break;
//                                 }
//                                 default:
//                                     System.out.println("Invalid Option");
//                             }

//                             if (opt == 5) break;
//                         }
//                     } else {
//                         System.out.println("Invalid Login Credentials");
//                     }
//                     break;
//                 }

//                 case 2: {
//                     System.out.println("CREATE YOUR ACCOUNT\n");
//                     System.out.print("Enter your name: ");
//                     name = sc.next();
//                     System.out.print("Contact Number: ");
//                     contact = sc.nextLong();
//                     System.out.print("Enter Pin: ");
//                     pin = sc.nextInt();
//                     System.out.print("Amount deposited: ");
//                     balance = sc.nextDouble();
//                     System.out.println("Account created successfully!");
//                     break;
//                 }

//                 default: {
//                     System.out.println("INVALID OPTION");
//                 }
//             }
//         }
//     }
// }






// class program{
//     public static void main(String[]args){
//         //A-Z
//         for(char ch='A';ch<='Z';ch++){
//             System.out.print(ch+" ");
//         }

//         System.out.println("");
//         System.out.println("........................................................");

//         //a-z
//         for(char ch=97;ch<=122;ch++){
//             System.out.print(ch+" ");
//         }

//         System.out.println("");
//         System.out.println("........................................................");

//         //0-9
//         for (char ch=48;ch<=57;ch++){
//             System.out.print(ch+" ");
//         }
//         System.out.println("");
//         System.out.println("........................................................");

//         //1 to 100
//         for(int i=1;i<=100;i++){
//             System.out.print(i+" ");
//         }
//         System.out.println("");
//         System.out.println("........................................................");

//         //100 to 1
//         for(int i=100;i>=1;i--){
//             System.out.print(i+" ");
//         }
//         System.out.println("");
//         System.out.println("........................................................");

//         //0 to 127 all acsii character
//         for(char i=0;i<=127;i++){
//             System.out.print(i+" ");
//         }

//         System.out.println("");
//         System.out.println("........................................................");

//         //A-Z a-z 0-9
//         for(char i=0;i<=127;i++){
//             if((i>='A' && i<='Z') || (i>='a' && i<='z') || (i>=48 && i<=57)){
//                 System.out.print(i+" ");
//             }
//         }
//         System.out.println("");
//         System.out.println("........................................................");

//         //only special charcter
//         for(char ch=0;ch<=127;ch++){
//             if(!((ch>=65 && ch<=90) ||(ch>=97 && ch<=122) || (ch>=48 && ch<=57)))
//             {
//                 System.out.print(ch+" ");
//             }
//         }
//         System.out.println("");
//         System.out.println("........................................................");

//         //Z-A
//         for(char ch=90;ch>=65;ch--){
            
//                 System.out.print(ch+" ");
            
//         }
// System.out.println("");
// System.out.println("");

//         for(char ch='A';ch<='Z';ch++){
//             System.out.print(ch+":"+(ch+0)+" ");
//         }

// System.out.println("");
// System.out.println("");

//         for(char ch=65;ch<=90;ch+=2){
//             System.out.print(ch+" ");
//         }
// System.out.println("");
// System.out.println("");

//         int step=1;
//         for(char ch=65;ch<=90;ch+=step){
//             System.out.print(ch+" ");
//             step++;
//         }
// System.out.println("");
// System.out.println("");
       


       

//     }
// }



// class program{
//     public static void main(String[] args) {
        
//         for(char ch=65;ch<=90;ch++){
//             switch(ch){
//                 case 'A','E','I','O','U' -> System.out.println(ch+" is Vowel  ");
//                 default -> System.out.println(ch+" Consonents");
//             }
//         }
//     }
// }





// class program{
//     public static void main(String[] args) {
//         for(char ch=97;ch<=122;ch++){
//             switch(ch){
//                 case 'a','e','i','o','u' -> System.out.println(ch+" is Vowel  ");
                
//             }
//         }
//     }
// }



// class program{
//     public static void main(String[] args) {
//         for(char ch=0;ch<=127;ch++){
//             if(!((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57))){
//                 System.out.print(ch+" ");
//             }
//         }
            
        
//     }
// }




// class program{
//     public static void main(String[] args) {
//         int step=1;
//         for(char ch=65;ch<=90;ch+=step){
//             System.out.print(ch+" ");
//             step++;
//         }
//     }
// }





// class program{
//     public static void main(String[] args) {
//         for(char ch=65;ch<=90;ch++){
//             switch(ch){
//                 case 'A','E','I','O','U' -> System.out.print(ch+" ");
//             }
//         }
//     }
// }





// class program{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number: ");//888
//         int num=sc.nextInt();
//         int dup=num;
//         int cube;
//         int sum=0;

//         while(num!=0){
//             int number=num%10;
//              cube=number*number*number;
//              sum+=cube;
//             num/=10;

//         }
//         if(sum==dup){
//             System.out.println("Armstrong Number "+dup);

//         }
//         else{
//             System.out.println("Not Armstong Number: "+dup);
//         }

//     }

// }






// class program {
//     public static void main(String[] args) {
        
//         char ch=65;
//         while(ch<=122){
//             switch(ch){
//                 case 'A','E','I','O','U','a','e','i','o','u' -> System.out.print(ch+" ");
//                 default -> {}             
//             }
//             ch++;

//         }
//     }
// }





// class program{
//     public static void main(String[] args) {
//         System.out.println("Starts");
//         final int b=5;
//         for(final int i=1;i<=b;){
//             System.out.println("hello");
//             if(i==b) break;
//         }
//         System.out.println("ends");
//     }
// }





// public class program {
//     public static void main(String[] args) {
//         System.out.println("Starts");
        
//         for(final byte i=1;i<=3;){
//             System.out.print(i+" ");
//             if(i==3) break;
//         }
        
//         System.out.println("Ends");
//     }
// }







// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();

//         int sum=0;
//         int product=1;

//         while(num>0){
//             int digit=num%10;
//             sum+=digit;
//             product*=digit;
//             num/=10;
//         }
//         if(sum==product){
//             System.out.println("SPY No");
//         }
//         else{
//             System.out.println("Is not SPY No");
//         }
//     }
// }





// class program{
//     public static void main(String[] args) {
//         System.out.println("Starts");
//         final boolean b=true;
//         int c=4;
//         int i=1;
//         for( ;b;){
        
//            if(i==c) break;
//             System.out.print(i+" ");
//             i++;
//         }
//         System.out.println("ends");
//     }
// }




// class program{
//     public static void main(String[] args) {
//         char ch=65;
        
//         do { 
//             switch (ch) {
//                 case 'A','E','I','O','U','a','e','i','o','u' -> System.out.println(ch+" is Vowels");
                    
                    
//                 //default -> System.out.println("");
//             }
//             ch++;
            
//         } while (ch<=122);
//     }
// }




// class program{
//     public static void main(String[] args) {
//         int i=1;
//         while(i<=10){
//             System.out.print("hello  ");
//             i++;
//         }
//     }
// }




// import java.util.Scanner;
// public class program{
//     public static void main(String[] args) {
//        program p=new program();
//        p.greeting();

//     }

//     public  void greeting(){
//         Scanner sc=new Scanner(System.in);
//         for (;;) {
//            System.out.println("             Welcome");
        
//         int num=sc.nextInt();

//         if(num==1){
//             System.out.println("Good Morning");
//         }
//         else if(num==2){
//             System.out.println("Good afternoon");
//         }
//         else if(num==3){
//             System.out.println("Good Evening");
//         }
//         else if(num==0){
//             System.out.println("Thank you visit again...");
//             return;
//         }
//         else{
//             System.out.println("Invalid");
//         } 
//         }
        
//     }
// }




// import java.util.Scanner;
// class program{
//     public static void main(String [] args) throws InterruptedException
//     {
//         Scanner sc=new Scanner(System.in);
//         int storePass=1234;
//         int duration=5000;

//         outerLoop:
//         for (;;) {
//             int attempts=3;
//         do { 
            
//             System.out.print("Enter Password: ");
//             int userPass=sc.nextInt();
//             if(storePass==userPass){
//                 System.out.println();
//                 System.out.println("Phone Unlock");
//                 break outerLoop;
//             }
//             else{
//                 System.out.println("Wrong Pin");
//                 System.out.println((attempts-1)+" are left");
                
//             }
//             attempts--;
//         } while (attempts>0);


//         System.out.println();
//         System.out.println("Your Phone is lock for "+(duration/1000)+" sec");
//         Thread.sleep(duration);
//         duration*=2;
//         System.out.println();
//         }
        
//     }
// }




// class program{
//     public static void main(String[] args)  throws InterruptedException
//     {
//         for(char i='A';i<='Z';i++){
//             System.out.print(i+" ");
//             Thread.sleep(300);

//         }
//     }
// }



// class program{
//     public static void main(String[] args) {
//         for( int i=1;i<=10;i++){
//             if(i==3) continue;
//             System.out.println(i +" Hello");
//             System.out.println("Good");
            
//         }
//     }
// }




// class program{
//     public static void main(String[] args) {
//         int i=1;
//         while(i<=10){
//             if(i==3) continue;
//             System.out.println(i+" Hello");
//             i++;
//         }
//     }
// }



// class program{
//     public static void main(String[] args) {
//         int sum=0;
//         for(int i=1;i<=10;i++){
//             sum+=(int)(Math.random()*100);
//              break;
            
//         }
//         System.out.println(sum);
        
//     }
// }



// class program{
//     public static void main(String[] args) {
//         for(int i=0;i++<=10;System.out.println("Hello"+i)){
            
//         }
//     }
// }






// class program{
//     public static void main(String[] args) {
//         System.out.println("main execution starts");
//         evenOddExecution:{
//             if(5%2==0){
//             System.out.println("even");
//             break evenOddExecution;
//         }
//         else{
//             System.out.println("Odd");
//         }
//         System.out.println("Even-Odd execution ends");
//         }
//         System.out.println("main execution ends");
//     }
    
// }






// class program{
//     public static void main(String[] args) {
//         outerLoop:{
//             int i=1;
        
//         do { 
//             if(i==5) break outerLoop;
//             System.out.println(i+" Hii");
//             i++;
//         } while (i<=10);

//         }
        
//     }
// }




// class program{
//     public static void main(String[] args) {
//         byte a=1;
//         switch(a){
//             case 1:System.out.println("case 1");break;
//             case 2:System.out.println("case 2");break;
//             case 3:System.out.println("case 3");break;
//             default:System.out.println("default");break;
//         }
//     }
// }



// class program{
//     public static void main(String[] args) {
//         byte a=127;
//         switch(a+1){
//             case 1:System.out.println("case 1");break;
//             case 127:System.out.println("case 127");break;
//             case 128:System.out.println("case 128");break;
//             default:System.out.println("default");
//         }
//     }
// }



// class program{
//     public static void main(String[] args) {
//         int a=127;
//         switch (a) {
//             case 97:System.out.println("case 1");break;
//             case 'a':System.out.println("case 2");break;
//             case 128:System.out.println("case 3");break;
//             default:System.out.println("default");break;
//         }
//     }
// }




// class program{
//     public static void main(String[] args) {
//         int a=1;
//         int b=2;
//         switch(a){
//             case 1:System.out.println("case 1");break;
//             case b:System.out.println("case 2");break;
//             default:System.out.println("default");break;
//         }
//     }
// }



// class program{
//     public static void main(String[] args) {
//         int a=1;
//         final int b=2;
//         switch(a){
//             case 1:System.out.println("case 1");break;
//             case b:System.out.println("case 2");break;
//             default:System.out.println("default");break;
//         }
//     }
// }




// class program{
//     public static void main(String[] args) {
//         int a=5;
//         switch(a){
//             case 1:System.out.println("case 1");break;
//             case 2:System.out.println("case 2");break;
//         }
//     }
// }




// class program{
//     public static void main(String[] args) {
//         int a=5;
//         switch(a){
//             default:System.out.println("default");break;
//         }
//     }
// }




// class program{
//     public static void main(String[] args) {
//         System.out.println("starts");
//         int a=5;
//         switch(a){

//         }
//         System.out.println("ends");
//     }
// }




// class program{
//     public static void main(String[] args) {
//         System.out.println("starts");
//         int a=5;
//         switch(a){
//             System.out.println("HELOOO");
//         }
//         System.out.println("ends");
//     }
// }



// class program{
//     public static void main(String[] args) {
//         System.out.println("starts");
//         boolean a=true;
//         switch(a){
//             case true:System.out.println("case 1");break;
//         }
//         System.out.println("ends");
//     }
// }




// class program{
//     public static void main(String[] args) {
//         byte a=5;
//         switch(a){
//             default:System.out.println("default");break;
//             case 1:System.out.println("case 1");break;
//             case 2:System.out.println("case 2");break;
//             case 3:System.out.println("case 3");break;
//         }
//     }
// }




// class program{
//     public static void main(String[] args) {
//         byte a=6;
//         switch(a){
//             case 1:System.out.println("case 1");break;
//             default:System.out.println("default");break;
//             case 2:System.out.println("case 2");break;
//             case 3:System.out.println("case 3");break;
//         }
//     }
// }




// class program{
//     public static void main(String[] args) {
//         byte a=6;
//         switch(a){
//             case 1:System.out.println("case 1");break;
//             default:System.out.println("default");break;
//             case 2:System.out.println("case 2");break;
//             case 3:System.out.println("case 3");break;
//             default:System.out.println("default2");break;

//         }
//     }
// }






// class program{
//     public static void main(String[] args) {
//         byte a=6;
//         switch(a){
//             case 1:{
//                 System.out.println("case 1");
                
//             }
//             System.out.println("Hellooooo");
//             case 2:{
//                 System.out.println("case 2");
//                 break;
//             }
//             case 3:{
//                 System.out.println("case 3");
//                 break;
//             }

//         }
//     }
// }





// import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int num1=sc.nextInt();
//         isEvenOdd(num1);
        
//     }
//     public static void   isEvenOdd(int  num1){
//         if(num1%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("False");
//         }

//     } 
// }






// class program{
//     public static void main(String[] args) {
//         byte a=1;
//         switch(a){
//         case 1:System.out.println("case 1");
//             System.out.println("Hellooo");
//     case 2:System.out.println("case 2");break;
        
//     default:System.out.println("default");
//         }
        
//     }
// }





class program{
    static int cnt=1;
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        System.out.println("Sahil "+cnt);
        cnt++;
        m1();
    }
}