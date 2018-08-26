import java.util.Scanner;
import rental.CarRental;
class UserCarRental{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,zip,size;
        double dailyRentalFee;
        int lengthOfRental;
        double totalRentalFee;
        System.out.println("Enter the Rental Details\n");
        System.out.println("Enter the Name");
        name = sc.nextLine();
        System.out.println("Enter the Postal Address");
        zip = sc.nextLine();
        System.out.println("Enter the Size ('economy' or 'luxury' or 'full size')");
        size = sc.nextLine();
        System.out.println("Enter the Length of Rental in days");
        lengthOfRental = sc.nextInt();
        if(size.equals("luxury")){
            LuxuryCarRental lcr = new LuxuryCarRental(name, zip, size, lengthOfRental);
            lcr.display();
        }
        else{
            CarRental cr = new CarRental(name, zip, size, lengthOfRental);
            cr.display();
        }

    }
}