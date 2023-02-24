package chatgpt.programs;

import java.util.Scanner;

class Bus {
	  int busNo;
	  String destination;
	  int capacity;
	  int availableSeats;

	  public Bus(int busNo, String destination, int capacity) {
	    this.busNo = busNo;
	    this.destination = destination;
	    this.capacity = capacity;
	    this.availableSeats = capacity;
	  }

	  public void displayBusDetails() {
	    System.out.println("Bus No: " + busNo);
	    System.out.println("Destination: " + destination);
	    System.out.println("Capacity: " + capacity);
	    System.out.println("Available Seats: " + availableSeats);
	  }

	  public void bookSeats(int n) {
	    availableSeats -= n;
	  }
	}

public class Busreservation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Bus b[] = new Bus[3];
	    b[0] = new Bus(1, "Delhi", 50);
	    b[1] = new Bus(2, "Mumbai", 60);
	    b[2] = new Bus(3, "Bangalore", 40);

	    while (true) {
	      System.out.println("1. Display all available buses");
	      System.out.println("2. Book a seat");
	      System.out.println("3. Exit");
	      System.out.print("Enter your choice: ");
	      int ch = sc.nextInt();
	      if (ch == 1) {
	        for (int i = 0; i < 3; i++) {
	          b[i].displayBusDetails();
	          System.out.println();
	        }
	      } else if (ch == 2) {
	        System.out.print("Enter bus number: ");
	        int busNo = sc.nextInt();
	        System.out.print("Enter number of seats to be booked: ");
	        int seats = sc.nextInt();
	        for (int i = 0; i < 3; i++) {
	          if (b[i].busNo == busNo) {
	            if (b[i].availableSeats >= seats) {
	              b[i].bookSeats(seats);
	              System.out.println(seats + " seats booked successfully");
	            } else {
	              System.out.println("Seats not available");
	            }
	          }
	        }
	      } else {
	        break;
	      }
	    }
	    sc.close();

	}

}
