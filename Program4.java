//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!!
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
    class program4 {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            
            // Create my variables
            double num1 = 0;
            double num2 = 0;
            double num3 = 0;
            double num4 = 0;
            double num5 = 0;
            
            //Ask for user input:
            System.out.println("Please enter the first number");
            
            //Get input
            num1 = myObj.nextInt();
            
            //Ask for user input:
            System.out.println("Please enter the second number");
            
            //Get input
            num2 = myObj.nextInt();

            //Ask for user input:
            System.out.println("Please enter the third number");
            
            //Get input
            num3 = myObj.nextInt();

            //Ask for user input:
            System.out.println("Please enter the fourth number");
            
            //Get input
            num4 = myObj.nextInt();
            
            //Output
            System.out.println("The sum of the four number is " + (num1 + num2 + num3 + num4));
            System.out.println("The average of the four number is " + (num1 + num2 + num3 + num4) / 4);
        
        }
    }


//Paste console output below:
/*

Please enter the first number
475
Please enter the second number
821
Please enter the third number
369
Please enter the fourth number
562
The sum of the four number is 2227.0
The average of the four number is 556.75

*/
