
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.print("Enter a Number :");//1234
//             int num=sc.nextInt();
//             int dup=num;
//             int sum=0;

//             int rem=num%10;//4
//             sum=sum+rem;
//             num=num/10;

//             rem=num%10;//3
//             sum=sum+rem;
//             num=num/10;

//             rem=num%10;//2
//             sum=sum+rem;
//             num=num/10;

//             rem=num%10;//1
//             sum=sum+rem;
//             num=num/10;

//             System.out.println("Number is: "+dup);
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
//import java.util.Scanner;
// class program{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         long minutes=sc.nextLong();

//         long year=minutes/(60*24*365);
//         long days=year/7;

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