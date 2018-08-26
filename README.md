# Car Rental Java Program

Create a class named CarRental that contains fields that hold a renter's name, zip code, size of the car rented, daily rental fee length of rental in days, and total rental fee. The class contains a constructor that requires all the rental data except the daily rate and total fee, which are calculated based on the size of the car: economy at $29.99 per day, midsize at $38.99 per day, full size at $43.50 per day. The class also includes a display() method that displays all the rental data. Create a subclass named LuxuryCarRental. The class sets the rental fee at $79.99 per day and prompts the user to respond to the option of including a chauffeur at $200 per day. Override the parent class display() method to include chauffeur fee information. Write an application named UserCarRental that prompts the user for the data needed for a rental and creates an object of the correct type. Display the total rented fee. Save the files as CarRental.java, LuxuryCarRental.java and UserCarRental.java 


### Compilation Instructions

* Place the CarRental.java file in directory 'rental'.
* Compile the CarRental.java by <addr> javac -d . CarRental.java <addr>
