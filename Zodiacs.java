import java.util.Scanner;

public class Zodiacs {

	public static void main(String[] args) {
		int month; 
		int day; 
		String sign = null;
		
		Scanner scnr = new Scanner (System.in);
		
		//get month
		System.out.println("Enter the month of your birth (1-12): ");
		month = scnr.nextInt();
		
		//invalid month prompt 
		while ((month < 1) || (month > 12)) {
			System.out.println("That's not a valid month, my dude.");
			System.out.println("Enter the month of your birth (1-12): ");
			month = scnr.nextInt();
		}
		
		//get day
		System.out.println("Enter the day of your birth (1-31): "); 
		day = scnr.nextInt();
		
		
		//Zodiac assignments
		if (month == 1) {
			while ((day < 1) || (day > 31)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 19) {
				sign = "Capricorn, the Goat";
			} 
			if ((day >= 20) && (day <= 31)){
				sign = "Aquarius, the Water Bearer"; 
			}
		}
		
		if (month == 2) {
			while ((day < 1) || (day > 29)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 18) {
				sign = "Aquarius, the Water Bearer";
			} 
			if ((day >= 19) && (day <= 29)){
				sign = "Pisces, the Fishes";
			}
		}
		
		if (month == 3) {
			while ((day < 1) || (day > 31)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 20) {
				sign = "Pisces, the Fishes";
			} 
			if ((day >= 21) && (day <= 31)){
				sign = "Aries, the Ram";
			} 
		}
		
		if (month == 4) {
			while ((day < 1) || (day > 30)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 19) {
				sign = "Aries, the Ram";
			} 
			if ((day >= 20) && (day <= 30)){
				sign = "Taurus, the Bull";
			} 
		} 
		
		if (month == 5) {
			while ((day < 1) || (day > 31)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 20) {
				sign = "Taurus, the Bull";
			} 
			if ((day >= 21) && (day <= 31)){
				sign = "Gemini, the Twins";
			} 
		}
		
		if (month == 6) {
			while ((day < 1) || (day > 30)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 21) {
				sign = "Gemini, the Twins";
			} 
			if ((day >= 20) && (day <= 30)){
				sign = "Cancer, the Crab";
			} 
		}
		
		if (month == 7) {
			while ((day < 1) || (day > 31)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 22) {
				sign = "Cancer, the Crab";
			} 
			if ((day >= 23) && (day <= 31)){
				sign = "Leo, the Lion";
			} 
		}
		
		if (month == 8) {
			while ((day < 1) || (day > 31)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 22) {
				sign = "Leo, the Lion";
			} 
			if ((day >= 23) && (day <= 31)){
				sign = "Virgo, the Virgin";
			} 
		}
		
		if (month == 9) {
			while ((day < 1) || (day > 30)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 22) {
				sign = "Virgo, the Virgin";
			} 
			if ((day >= 23) && (day <= 30)){
				sign = "Libra, the Balance";
			} 
		}
		
		if (month == 10) {
			while ((day < 1) || (day > 31)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 23) {
				sign = "Libra, the Balance";
			} 
			if ((day >= 24) && (day <= 31)){
				sign = "Scorpio, the Scorpion";
			} 
		}
		
		if (month == 11) {
			while ((day < 1) || (day > 30)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 22) {
				sign = "Scorpio, the Scorpion";
			} 
			if ((day >= 23) && (day <= 30)){
				sign = "Sagittarius, the Archer";
			} 
		}
		
		if (month == 12) {
			while ((day < 1) || (day > 31)){
				System.out.println("That's not a valid day for this month.");
				System.out.println("Enter the day of your birth (1-31): "); 
				day = scnr.nextInt();
			}
			if (day <= 21) {
				sign = "Sagittarius, the Archer";
			} 
			if ((day >= 22) && (day <= 31)){
				sign = "Capricorn, the Goat";
			} 
		}
		
		//print Zodiac
		System.out.println("Your sign is " + sign + "!");

	}

}
