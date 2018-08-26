import java.util.Scanner;
import rental.CarRental;
public class LuxuryCarRental extends CarRental{
    LuxuryCarRental(String name, String zip, String size, int lengthOfRental){
    super(name,  zip, size, lengthOfRental);
        
    }
    public void display(){
        Scanner sc = new Scanner(System.in);
        dailyRentalFee = 79.99;
        System.out.println("Do you want a Chauffeur ? Enter 1.Yes 2.No?");
        int choice = sc.nextInt();
        System.out.println("The Rental Data is as follows:");
        int chauffeurFee = 0;
        if(choice==1){
            chauffeurFee = 200;
        }
        totalRentalFee = (dailyRentalFee+chauffeurFee) * lengthOfRental;
        System.out.println("Name: "+ name +"\nPostal Address: "+zip +
        "\nSize: "+size + "\nDaily Rental Fee: "+dailyRentalFee + "\nChauffeur Fee: "
        + chauffeurFee + "\nLength of Rental: "+ lengthOfRental + "\nTotal Rental Fee"+
        totalRentalFee);
        
    }

}