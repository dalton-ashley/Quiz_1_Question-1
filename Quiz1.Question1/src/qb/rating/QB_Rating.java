package qb.rating;
//Program By: Dalton Ashley
//CISC181-010 Quiz 1 Question 1

import java.util.Scanner;

public class QB_Rating {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter amount of touchdowns by QB
		System.out.print("Enter amount of touchdowns(TD) QB has:");
		Double number_of_touchdowns = input.nextDouble();
		
		//Prompts user to enter total yards by QB
		System.out.print("Enter amount of total yards(Yards) QB has:");
		Double total_yards = input.nextDouble();
		
		//Prompts user to enter amount of interceptions by QB
		System.out.print("Enter the amount of interceptions(INT) QB has:");
		Double number_of_interceptions = input.nextDouble();
		
		//Prompts user to enter number of completions by QB
		System.out.print("Enter number of completions(COMP) QB has:");
		Double number_of_completions = input.nextDouble();
		
		//Prompts user to enter number of passes attempted by QB
		System.out.print("Enter number of passes attempted(ATT) by QB:");
		Double number_of_attempted_passes = input.nextDouble();
		
		input.close();
		
		//Computes passer rating
		Double completion_rate = (((number_of_completions/number_of_attempted_passes)-0.3)*5);
		Double yards_per_attempt = (((total_yards/number_of_attempted_passes)-3)*.25);
		Double touchdown_rate = ((number_of_touchdowns/number_of_attempted_passes)*20);
		Double interception_rate = ((2.375-(number_of_interceptions/number_of_attempted_passes)*25));
		
		Double passer_rating = (((completion_rate + yards_per_attempt + touchdown_rate + interception_rate)/6)*100);
		
		//Program output display
		System.out.printf("Passer rating is %.1f", passer_rating);
		System.out.print("\n");
		System.out.println("This rating is on a scale of 0 - 158.3: (Low Rating - Perfect Rating)");
		
	}//end main
}//end QB_Rating
