import java.util.Scanner;

class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);       

        System.out.print("Enter a month : ");

        if (scan.hasNextInt()) {     
            int intMonth = scan.nextInt();

            switch (intMonth) {
                case 1: case 2: case 12:
                    System.out.printf("Month %d is in winter.\n", intMonth);
                    break;
                case 3: case 4: case 5:
                    System.out.printf("Month %d is in spring.\n", intMonth);
                    break;
                case 6: case 7: case 8:
                    System.out.printf("Month %d is in fall.\n", intMonth);
                    break;
                case 9: case 10: case 11:
                    System.out.printf("Month %d is in summer.\n", intMonth);
                    break;
                default:
                    System.out.println("Invalid month!");
                    break; // optional            
            }
        }
        else {
            String strMonth = scan.next().toLowerCase();

            switch (strMonth) {
                case "jan": case "january": case "feb": case "feburary": case "dec": case "december":
                    System.out.printf("%s is in winter.\n", strMonth);
                    break;
                case "mar": case "march": case "apr": case "april": case "may": 
                    System.out.printf("%s is in spring.\n", strMonth);
                    break;
                case "jun": case "june": case "jul": case "july": case "aug": case "august":
                    System.out.printf("%s is in fall.\n", strMonth);
                    break;
                case "sep": case "september": case "oct": case "october": case "nov": case "november":
                    System.out.printf("%s is in summer.\n", strMonth);
                    break;
                default:
                    System.out.println("Invalid month!");
                    break; // optional            
            }
        } //end if
    }
}
