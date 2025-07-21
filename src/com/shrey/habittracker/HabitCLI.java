package com.shrey.habittracker;

import java.time.LocalDate;
import java.util.Scanner;



public class HabitCLI {

    public static void start(){
            Scanner scanner = new Scanner(System.in);
            HabitTracker tracker = new HabitTracker();
            int habitIdCounter = 1;

        while(true){

            System.out.println("Welcome to Habit Tracker!");
            System.out.println("1. Add Habit");
            System.out.println("2. View All Habits");
            System.out.println("3. Mark Habit as Completed");
            System.out.println("4. Remove Habit");
            System.out.println("5. Search Habits");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter habit name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter habit description: ");
                    String description = scanner.nextLine();
                    tracker.addHabit(new Habit(habitIdCounter++, name, description, LocalDate.now(), false));
                    break;
                case 2:
                    for(Habit habit : tracker.getAllHabits()){
                        System.out.println(habit);
                    }
                    break;
                case 3:
                    System.out.println("Enter habit id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    if(tracker.markHabitAsCompleted(id)){
                        System.out.println("Habit marked as completed!");
                    }else{
                        System.out.println("Habit not found!");
                    }
                    break;
                case 4:
                    System.out.println("Enter habit id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    if(tracker.removeHabit(id)){
                        System.out.println("Habit removed!");
                    }else{
                        System.out.println("Habit not found!");
                    }
                    break;
                case 5:
                    System.out.println("Enter search term: ");
                    String searchTerm = scanner.nextLine();
                    for(Habit habit : tracker.searchHabits(searchTerm)){
                        System.out.println(habit);
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
         }
    }
}
