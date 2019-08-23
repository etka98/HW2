	import java.util.Scanner;
	/**
	 * 
	 * @author etka uzun
	 *
	 */
	
	public class HW2_150118504 {
	
		public static void main(String[] args) {
			//Create Scanner
			Scanner scan = new Scanner(System.in);
			
			//Variable
		    char carModel;
			double totalCost = 0;
			char pU;
			char sU;
			char mU;
			char sunRoof;
			char soP;
			char auV;
			double saleTax;
			double otv;
			double kdv;
			double addCost = 0;
			//Program code
			System.out.print("Welcome to Marmara Motor Cars\n"
					+ "-----------------------------\n"
					+ "Compact (C) \n"
					+ "Luxury (L)\n"
					+ "Midsize (M) \n"
					+ "Pickup (P) \n"
					+ "SUV (S) \n"
					+ "What model of car do you want? (C, L, M, P, S) :");
			carModel = scan.next().charAt(0);
			
			//If compact is selected
			if('C' == Character.toUpperCase(carModel)) {
				totalCost = 16000.0;				
				System.out.print("Do you want protective undercoating for $125.0 (Y/N)? ");
				pU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(pU))
					totalCost += 125.0;
				
				System.out.print("Do you want security package for $800.0 (Y/N)? ");
				sU = scan.next().charAt(0);
			    if('Y' == Character.toUpperCase(sU))
					totalCost += 800.0;
				
				System.out.println("You ordered a COMPACT car with a base price :$16000.0");
				System.out.println("Your additional cost is : $" + (totalCost - 16000.0));
				if(totalCost < 35000.0) {
					otv = (totalCost * 35.0) / 100.0;
					kdv = (totalCost + otv) * 18.0 /100.0;
					saleTax = otv + kdv;
				}
				else
					otv = (totalCost * 40.0) / 100.0;
				    kdv = (totalCost + otv) * 18.0 /100.0;
				    saleTax = otv + kdv;
				    System.out.println("sale tax : $" + saleTax);
				System.out.println("Total cost of car & options : $" +  (int)((saleTax + totalCost) * 100) / 100.0);    
			}
			//If luxury is selected
			if('L' == Character.toUpperCase(carModel)) {
				System.out.print("Do you want protective undercoating for $125.0 (Y/N)? ");
				pU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(pU))
					addCost += 125.0;
				System.out.print("Do you want Multimedia package for $1250.0 (Y/N)? ");
				mU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(mU))
					addCost += 1250.0;
				if('Y' == Character.toUpperCase(pU) && 'Y' == Character.toUpperCase(mU))
				addCost = ((125.0 + 1250.0) * 95) / 100.0;
				System.out.println("You ordered a LUXURY car with a base price :$39000.0");
				System.out.println("Your additional cost is : $" + addCost);
				totalCost = 39000.0 + addCost;
				
				if(totalCost < 35000.0) {
					otv = (totalCost * 35.0) / 100.0;
					kdv = (totalCost + otv) * 18.0 /100.0;
					saleTax = otv + kdv;
				}
				else
					otv = (totalCost * 40.0) / 100.0;
				    kdv = (totalCost + otv) * 18.0 /100.0;
				    saleTax = otv + kdv;
				    System.out.println("sale tax : $" + saleTax);
				System.out.println("Total cost of car & options : $" +  (int)((saleTax + totalCost) * 100) / 100.0); 
			}
			//If midsize is selected
			if('M' == Character.toUpperCase(carModel)) {
				totalCost = 26000.0;
				
				System.out.print("Do you want protective undercoating for $125.0 (Y/N)? ");
				pU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(pU))
					addCost += 125.0;
				
				System.out.print("Do you want Automatic transmission for $2000.0 (Y/N)? ");
				auV = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(auV))
					addCost += 2000.0;
				
				System.out.print("Do you want sunroof for $1500.0 (Y/N)? ");
				sunRoof = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(sunRoof))
					addCost += 1500.0;
				
				System.out.print("Do you want Multimedia package for $750.0 (Y/N)? ");
				mU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(mU))
					addCost += 750.0;
				
				System.out.print("Do you want security package for $1000.0 (Y/N)? ");
				sU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(sU))
					addCost += 1000.0;
				
				System.out.print("Do you want Sport package for + %5 (Y/N)? ");
				soP = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(soP))
					addCost += (26000.0 * 5)/100;
				
				if('Y' == Character.toUpperCase(sunRoof) && 'Y' == Character.toUpperCase(mU))
					addCost = addCost - 250.0;
				if('Y' == Character.toUpperCase(sU) && 'Y' == Character.toUpperCase(auV))
					addCost = addCost - (300) ;
 				
				totalCost += addCost;
				
				System.out.println("You ordered a MIDSIZE car with a base price :$26000.0");
				System.out.println("Your additional cost is : $" + (addCost));
	
				if(totalCost < 35000.0) {
					otv = (totalCost * 35.0) / 100.0;
					kdv = (totalCost + otv) * 18.0 /100.0;
					saleTax = otv + kdv;
				}
				else
					otv = (totalCost * 40.0) / 100.0;
				    kdv = (totalCost + otv) * 18.0 /100.0;
				    saleTax = otv + kdv;
				    System.out.println("sale tax : $" + saleTax);
				
				System.out.println("Total cost of car & options : $" +  (int)((saleTax + totalCost) * 100) / 100.0); 
				}
			//If pickup is selected
			if('P' == Character.toUpperCase(carModel)) {
				System.out.print("Do you want protective undercoating for $150.0 (Y/N)? ");
				pU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(pU))
					totalCost = 19500.0 + 150.0;
				else
					totalCost = 19500.0;
				System.out.print("Do you want Multimedia package for $750.0 (Y/N)? ");
				mU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(mU))
					totalCost = totalCost + 750.0;
				
				System.out.println("You ordered a PICKUP car with a base price : $19500.0");
				System.out.println("Your additional cost is : $" + (totalCost - 19500.0));
				if(totalCost < 35000.0) {
					otv = (totalCost * 35.0) / 100.0;
					kdv = (totalCost + otv) * 18.0 /100.0;
					saleTax = otv + kdv;
				}
				else
					otv = (totalCost * 40.0) / 100.0;
				    kdv = (totalCost + otv) * 18.0 /100.0;
				    saleTax = otv + kdv;
				    System.out.println("sale tax : $" + saleTax);
				System.out.println("Total cost of car & options : $" +  (int)((saleTax + totalCost) * 100) / 100.0); 
				}
			//If SUV is selected
			if('S' == Character.toUpperCase(carModel)) {
				System.out.print("Do you want protective undercoating for $200.0 (Y/N)? ");
				pU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(pU))
					addCost += 200.0;
				
				System.out.print("Do you want security package for $1350.0 (Y/N)? ");
				sU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(sU))
					addCost += 1350.0;
					
				System.out.print("Do you want Multimedia package for $1000.0 (Y/N)? ");
				mU = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(mU))
					addCost += 1000.0;
				
				System.out.print("Do you want sunroof for $2300.0 (Y/N)? ");
				sunRoof = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(sunRoof))
					addCost += 2300.0;
				
				System.out.print("Do you want Sport package for + %5 (Y/N)? ");
				soP = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(soP))
					addCost += (29000.0 * 5)/100;
				
				System.out.print("Do you want Automatic transmission for $2500.0 (Y/N)? ");
				auV = scan.next().charAt(0);
				if('Y' == Character.toUpperCase(auV))
					addCost += 2500.0;
				
				System.out.println("You ordered a SUV car with a base price :$29000.0");
				if('Y' == Character.toUpperCase(auV) && 'Y' == Character.toUpperCase(sunRoof) && 'Y' == Character.toUpperCase(mU) && 'Y' == Character.toUpperCase(sU))
					System.out.println("You won protective undercoating for free!");
				if('Y' == Character.toUpperCase(pU) && 'Y' == Character.toUpperCase(auV) && 'Y' == Character.toUpperCase(sunRoof) && 'Y' == Character.toUpperCase(mU) && 'Y' == Character.toUpperCase(sU)) 
					addCost -= 200;
				
				System.out.println("Your additional cost is : $" + addCost);
				totalCost = 29000.0 + addCost;
				if(totalCost < 35000.0) {
					otv = (totalCost * 35.0) / 100.0;
					kdv = (totalCost + otv) * 18.0 /100.0;
					saleTax = otv + kdv;
					}
				else
					otv = (totalCost * 40.0) / 100.0;
				    kdv = (totalCost + otv) * 18.0 /100.0;
				    saleTax = otv + kdv;
				    System.out.println("sale tax : $" + saleTax);
				    totalCost = 29000.0 + addCost + saleTax;
				System.out.println("Total cost of car & options : $" + (int)((totalCost) * 100) / 100.0); 
			    }
			
			
		
			
			
			
			
			
			
			
		}
	
	}
