package inheritanceandother;

import java.util.Scanner;

public class ContractHourlyEmployee {
	Scanner sc = new Scanner(System.in);
		
		float noOfYears_Contract;
		float noOfYears_Completed;
		
		void readNoOfYears_Contract() {
			System.out.println("Enter the noOfYears_Contract ");
			noOfYears_Contract = sc.nextFloat();
		}
		
		void isContractedCompleted() {
			if(noOfYears_Completed == noOfYears_Contract) {
				System.out.println("Contract Completed");
			}else {
				System.out.println("Contract not completed");
			}
		}

	}

