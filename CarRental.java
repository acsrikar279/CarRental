package rental;
public class CarRental{
    public String name,zip,size;
    public double dailyRentalFee;
    public int lengthOfRental;
    public double totalRentalFee;
    public void display(){
        System.out.println("The Rental Data is as follows:");
        System.out.println("Name: "+ name +"\nPostal Address: "+zip +
        "\nSize: "+size + "\nDaily Rental Fee: "+dailyRentalFee 
        + "\nLength of Rental: "+ lengthOfRental + "\nTotal Rental Fee"+
        totalRentalFee);
    }
    public CarRental(String name, String zip, String size, int lengthOfRental){
        this.name = name;
        this.zip = zip;
        this.size = size;
        this.lengthOfRental = lengthOfRental;
        if(size.equals("economy")){
            dailyRentalFee = 29.99;
        }
        else if (size.equals("midsize")){
            dailyRentalFee = 38.99;
        }
        else{
            dailyRentalFee = 43.50;
        }
        totalRentalFee = dailyRentalFee*lengthOfRental;
    }
}