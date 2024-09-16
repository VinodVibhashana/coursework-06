import java.util.Scanner;

public class coursework {

    public static void main(String[] args) {
        System.out.println("Hallo");
        Homepage();
    }

    public static void Homepage() {
		clearConsole(); 
        Scanner scan = new Scanner(System.in);
        System.out.println("				 __   ______   ________  ________       ");
        System.out.println("				|  \\ /      \\ |        \\|        \\      ");
        System.out.println("				 \\$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$      ");
        System.out.println("				|  \\| $$   \\$$| $$__       | $$         ");
        System.out.println("				| $$| $$      | $$  \\      | $$         ");
        System.out.println("				| $$| $$   __ | $$$$$      | $$         ");
        System.out.println("				| $$| $$__/  \\| $$_____    | $$         ");
        System.out.println("				| $$ \\$$    $$| $$     \\   | $$         ");
        System.out.println("				 \\$$  \\$$$$$$  \\$$$$$$$$    \\$$         ");
        System.out.println("");
        System.out.println("");
        System.out.println("  _______             __   __    _____              _         _____   _    _   _                   _______    ____    _____  ");
        System.out.println(" |__   __|     /\\     \\ \\ / /   / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ ");
        System.out.println("    | |       /  \\     \\ V /   | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |");
        System.out.println("    | |      / /\\ \\     > <    | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / ");
        System.out.println("    | |     / ____ \\   / . \\   | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ ");
        System.out.println("    |_|    /_/    \\_\\ /_/ \\_\\   \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\");
    
        System.out.println("");
        System.out.println(" ===========================================================================================================================\n");
        System.out.println("");
        System.out.println("[01] Withholding Tax");
        System.out.println("[02] Payable Tax");
        System.out.println("[03] Income Tax");
        System.out.println("[04] Social Security contribution Levy (SSCL) Tax");
        System.out.println("[05] Leasing Payment");
        System.out.println("[06] Exit\n");

        System.out.print("Enter an option to continue -> ");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                WithholdingHome();
                break;
            case 2:
                PayableTax();
                break;
            case 3:
                IncomeTax();
                break;
            case 4:
                SocialTax();
                break;
             case 5:
                LeasingPaymentHome();
                break;  
             case 6:
                Exit();
                break;      
                
            default:
                System.out.println("Invalid Option. Try Again.");
                Homepage();
                break;
        }
    }

    public static void WithholdingHome() {
		clearConsole(); 
        System.out.println("WITHHOLDING TAX");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                             WITHHOLDING TAX                                               |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
           System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("[01] Rent Tax");
        System.out.println("[02] Bank Interest Tax");
        System.out.println("[03] Dividend Tax");
        System.out.println("[04] Exit\n");
        System.out.print("Enter an option to continue -> ");
        int WithholdingOption = scan.nextInt();

        switch (WithholdingOption) {
            case 1:
                WithholdingRentTax();
                break;
            case 2:
                BankInterestTax();
                break;
            case 3:
                DividendTax();
                break;
            case 4:
                Exit();
                break;
            default:
                System.out.println("Invalid Option. Try Again.");
                WithholdingHome();
                break;
        }
    }

    // 1.01
    public static void WithholdingRentTax() {
		clearConsole(); 
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                              RENT TAX                                                        |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your rent: ");
        int rentTax = scan.nextInt();
        if (rentTax <= 0) {
            System.out.println("Invalid Input...\n");
        } else if (rentTax <= 100000) {
            System.out.println("You don't have to pay rent tax....\n");
        } else {
            double tax = (rentTax - 100000) * 0.1;
            System.out.println("You have to pay Rent Tax: " + tax);
        }
        System.out.print("Do you want to enter the correct value again (Y/N) : ");
        char again = scan.next().charAt(0);
        if (again == 'Y' || again == 'y') {
            WithholdingRentTax();
        } else {
            Homepage();
        }
    }

    // 1.02
    public static void BankInterestTax() {
		clearConsole(); 

        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                              BANK INTEREST TAX                                            |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your bank interest: ");
        int bankPay = scan.nextInt();
        if (bankPay <= 0) {
            System.out.println("Invalid Input ....\n");
        } else {
            double tax = bankPay * 0.05;
            System.out.println("You have to pay Bank Interest Tax per year: " + tax);
        }
        System.out.print("Do you want to enter the correct value again (Y/N) : ");
        char again = scan.next().charAt(0);
        if (again == 'Y' || again == 'y') {
            BankInterestTax();
        } else {
            Homepage();
        }
    }

    // 1.03
    public static void DividendTax() {
		clearConsole(); 
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                              DIVIDEND TAX                                  |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your total dividend per year: ");
        int dividend = scan.nextInt();
        if (dividend <= 100000) {
            System.out.println("You don't have to pay Dividend Tax..\n");
        } else {
            double tax = (dividend - 100000) * 0.14;
            System.out.println("You have to pay Dividend Tax per year: " + tax);
        }
        System.out.print("Do you want to enter the correct value again (Y/N) : ");
        char again = scan.next().charAt(0);
        if (again == 'Y' || again == 'y') {
            DividendTax();
        } else {
            Homepage();
        }
    }

    public static void Exit() {
        System.out.println("Exiting the program...");
        System.exit(0); // Properly exit the program
    }

    // 02
    public static void PayableTax(){
		clearConsole(); 
		    System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|                              PAYABLE TAX                                  |");
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		   System.out.print(" ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your employee payment per month: ");
        int salary = scan.nextInt();
        if (salary <= 100000) {
            System.out.println("You don't have to pay Payable Tax...");
        } else {
            double payableTax = 0.0;
            if (salary <= 141667) {
                payableTax = (salary - 100000) * 0.06;
            } else if (salary <= 183333) {
                payableTax = (salary - 141667) * 0.12 + (141667 - 100000) * 0.06;
            } else if (salary <= 225000) {
                payableTax = (salary - 183333) * 0.18 + (183333 - 141667) * 0.12 + (141667 - 100000) * 0.06;
            } else if (salary <= 266667) {
                payableTax = (salary - 225000) * 0.24 + (225000 - 183333) * 0.18 + (183333 - 141667) * 0.12 + (141667 - 100000) * 0.06;
            } else if (salary <= 308333) {
                payableTax = (salary - 266667) * 0.30 + (266667 - 225000) * 0.24 + (225000 - 183333) * 0.18 + (183333 - 141667) * 0.12 + (141667 - 100000) * 0.06;
            } else {
                payableTax = (salary - 308333) * 0.36 + (308333 - 266667) * 0.30 + (266667 - 225000) * 0.24 + (225000 - 183333) * 0.18 + (183333 - 141667) * 0.12 + (141667 - 100000) * 0.06;
            }
            System.out.println("You have to pay Payable Tax per year: " + (int) payableTax);
        }
        System.out.print("Do you want to enter the correct value again (Y/N) : ");
        char again = scan.next().charAt(0);
        if (again == 'Y' || again == 'y') {
            PayableTax();
        } else {
            Homepage();
        }
    }

    // 03
    public static void IncomeTax(){
		clearConsole(); 
		        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                              INCOME TAX                                  |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
		        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your total income per year: ");
        int income = scan.nextInt();

        if (income <= 1200000) {
            System.out.println("You don't have to pay Income Tax...");
        } else {
            double incomeTax = 0.0;
            if (income <= 1700000) {
                incomeTax = (income - 1200000) * 0.06;
            } else if (income <= 2200000) {
                incomeTax = (income - 1700000) * 0.12 + (1700000 - 1200000) * 0.06;
            } else if (income <= 2700000) {
                incomeTax = (income - 2200000) * 0.18 + (2200000 - 1700000) * 0.12 + (1700000 - 1200000) * 0.06;
            } else if (income <= 3200000) {
                incomeTax = (income - 2700000) * 0.24 + (2700000 - 2200000) * 0.18 + (2200000 - 1700000) * 0.12 + (1700000 - 1200000) * 0.06;
            } else if (income <= 3700000) {
                incomeTax = (income - 3200000) * 0.30 + (3200000 - 2700000) * 0.24 + (2700000 - 2200000) * 0.18 + (2200000 - 1700000) * 0.12 + (1700000 - 1200000) * 0.06;
            } else {
                incomeTax = (income - 3700000) * 0.36 + (3700000 - 3200000) * 0.30 + (3200000 - 2700000) * 0.24 + (2700000 - 2200000) * 0.18 + (2200000 - 1700000) * 0.12 + (1700000 - 1200000) * 0.06;
            }
            System.out.println("You have to pay Income Tax per year: " + (int) incomeTax);
        }
        System.out.print("Do you want to enter the correct value again (Y/N) : ");
        char again = scan.next().charAt(0);
        if (again == 'Y' || again == 'y') {
            IncomeTax();
        } else {
            Homepage();
        }
    }
        public static void SocialTax(){
			clearConsole(); 
	    System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                  SOCIAL SECURITY CONTRIBUTION LEVY TAX (SSCL)              |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
	    System.out.println("");
	    Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of Good or Service : ");
        int service = scan.nextInt();
        if(service<=0){
			System.out.print("Invalid Input ...... ");
			System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
            char again = scan.next().charAt(0);
            if (again == 'Y' || again == 'y') {
                SocialTax();
               } else {
                Homepage();
                }
			
		}else{
			double saleTax = service*0.025; //2500
			double afterSaleTax = service+saleTax ; //102500
			
			//step02
			double afterSaleTax2 = afterSaleTax*0.15;
			double total= afterSaleTax2+saleTax;
			System.out.println("You have to play SSCL Tax : "+total);
		    System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
                char again = scan.next().charAt(0);
                 if (again == 'Y' || again == 'y') {
                  SocialTax();
                  } else {
                   Homepage();
              }
			
			
			
			
			
			}
        
		
		}
		//05
		 public static void LeasingPaymentHome(){
			 clearConsole(); 
			 Scanner scan = new Scanner(System.in);
			   System.out.println("+---------------------------------------------------------------------------------------------------------------------------+");
               System.out.println("|                         		         LEASING PAYMENT                                                            |");
               System.out.println("+----------------------------------------------------------------------------------------------------------------------------+");
		     System.out.println("");
			 System.out.println("[01] Calculate Monthly Installment ");
			 System.out.println("[02] Serch Leasing Category");
			 System.out.println("[03] Find Leasing Amount");
			 System.out.println("[04] Exit \n");
			 System.out.println("	Enter an Option to continue -> ");
			 int leasingOption = scan.nextInt();
			 
			 switch(leasingOption){
				case 1:
				MonthlyLeasing(); 
				case 2:
				SerchLeasing();
				case 3:
				LeasingAmount();
				case 4:
				Exit();
				 
				 
				 }
			 
			 
			 
			 }
		//5.01	 
     public static void MonthlyLeasing(){
		 clearConsole(); 
		  System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+ ");
		  System.out.println("|         		                             	     Calculate Leasing Payment                                                             |");
       	  System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+ ");
        Scanner scan = new Scanner(System.in);
        System.out.println("CALCULATE LEASING PAYMENT\n");
        System.out.print("Enter lease amount: ");
        int A = scan.nextInt();
        
        System.out.print("Enter annual interest rate : ");
        double I = scan.nextDouble();
        
        int year = 0;
        while (true) {
            System.out.print("Enter number of years (must be <= 5): ");
            year = scan.nextInt();
            
            if (year <= 5) {
                break;  
            } else {
                System.out.println("Invalid input! Number of years should be 5 or less. Please try again.\n");
            }
        }
        
     
        int n = 12 * year; 
       double monthlyRate = (I / 100) / 12;
       
       double MonthlyInt = (A * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -n));
       
     //  System.out.printf("Your monthly instalment: "+MonthlyInt);
       System.out.printf("Your monthly instalment: %.2f\n", MonthlyInt);
          System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
                char again = scan.next().charAt(0);
                 if (again == 'Y' || again == 'y') {
                  MonthlyLeasing();
                  } else {
                   Homepage();
              }
       }
    //5.2
     public static void SerchLeasing(){
		clearConsole();  
		  System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+ ");
		  System.out.println("|         		                               Search Leasing Category                                                             |");
       	  System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+ ");
		  System.out.println("");
		Scanner scan = new Scanner(System.in);
        //System.out.println("Search Leasing Category\n");
        System.out.print("Enter lease amount: ");
        int A = scan.nextInt();
        
        //System.out.print("Enter annual interest rate : ");
        double I = 0.0;
          while (true) {
               System.out.print("Enter annual interest rate ( >0 ) : ");
          I = scan.nextDouble();
            
            if (I>0) {
                break;  
            } else {
                System.out.println("Invalid input! Enter positive rate... Please try again.\n");
            }
        }
  
       double monthlyRate = (I / 100) / 12;
       // 3 year
             int n3 = 12 * 3; 
             double MonthlyIntIn3year = (A * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -n3));
             System.out.println("Your monthly instalment for  3 year leasing plan %.2f : "+MonthlyIntIn3year);
		// 4 year 
		   int n4 = 12 * 4; 
           double MonthlyIntIn4year = (A * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -n4));
           System.out.println("Your monthly instalment for  4 year leasing plan %.2f : "+MonthlyIntIn4year);
        //5 year
           int n5 = 12 * 5; 
           double MonthlyIntIn5year = (A * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -n5));  
             System.out.println("Your monthly instalment for  5 year leasing plan %.2f : "+MonthlyIntIn5year); 
               System.out.println("");
             System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
                char again = scan.next().charAt(0);
                if (again == 'Y' || again == 'y') {
               SerchLeasing();
                } else {
                   Homepage();
               }
		 
		 }
		 //5.3
		 public static void LeasingAmount(){
			 clearConsole();
			   System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+ ");
		       System.out.println("|         		                              Find Leasing Amount                                                                 |");
       	       System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+ ");
		       System.out.println("");
			 Scanner scan = new Scanner(System.in);
			 System.out.println("Find Leasing Amount \n");
			 
	    System.out.print("Enter the monthly lease payment amount you can afford :  ");
        int LeaseAmount = scan.nextInt();
        //maniman 5 year check
        int year=0;
         while (true) {
               System.out.print("Enter number of year (<=5) : ");
               year = scan.nextInt();
            
            if (year<=5) {
                break;  
            } else {
                System.out.println("Invalid input! Enter a (year <=5) .. Please try again.\n");
            }
        }
        //check anunal rate 
        double I=0.0;
           while (true) {
               System.out.print("Enter annual interest rate : ");
               I = scan.nextDouble();
            
            if (I>=0) {
                break;  
            } else {
                System.out.println("Invalid input! positive valius .. Please try again.\n");
            }
        }
        //print Amount
            double monthlyRate = (I / 100) / 12;
            int n = 12 * year; 
            double A =  (LeaseAmount*(1 - Math.pow(1 + monthlyRate, -n)))/ monthlyRate;
            
            System.out.println("You can get Lease Amount  : "+A);
             
             System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
             char again = scan.next().charAt(0);
             if (again == 'Y' || again == 'y') {
              LeasingAmount();
              } else {
                   Homepage();
               }
			 
			 
			 }
			 //clean methoad
			 public final static void clearConsole() {
                 try {
                 final String os = System.getProperty("os.name");
                 if (os.contains("Windows")) {
                 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                 } else {
                 System.out.print("\033[H\033[2J");
                 System.out.flush();
                 }
                 } catch (final Exception e) {
                 e.printStackTrace();
                // Handle any exceptions.
                }
            }
			 
    
}
