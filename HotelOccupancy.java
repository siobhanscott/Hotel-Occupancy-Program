/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.occupancy;

import java.util.Scanner;

/**
 *
 * @author Siobhan Scott
 */
public class HotelOccupancy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int roomsTotal = 0;
        int roomsOccupied = 0;
        
        
        System.out.println("What is your hotel rate?");
        double revenue = scan.nextDouble();
        
        System.out.println("How many floors are there ?");
        int floors = scan.nextInt();
        
        for (int i = 1; i <= floors; i++)
        {
           System.out.println("How many rooms are there on this floor:" + i + "?");
           int numberOfRooms = scan.nextInt();
           roomsTotal += numberOfRooms;
           
           System.out.println("How many of those rooms are occupied");
           int numberOfOccupiedRooms = scan.nextInt();
           roomsOccupied += numberOfOccupiedRooms;
             
        }
        double occupancyRate = ((double) roomsOccupied / roomsTotal) * 100;
        System.out.println("Total # of rooms: " + roomsTotal);
        System.out.println("Occupied rooms: " + roomsOccupied);
        System.out.println("Vacant rooms: " + (roomsTotal - roomsOccupied));
     
        
        System.out.printf("Occupancy Rate: %.2f%%\n", occupancyRate);

        
        
        System.out.println("Total Hotel Room Revenue: $" + revenue*roomsOccupied);
    }
}
