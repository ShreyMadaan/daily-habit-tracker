# 🗓️ Daily Habit Tracker

A simple yet powerful Java-based command-line application to help users track and manage their daily habits.  
This is my **first independent CLI project** built from scratch using **pure Java and OOP principles**.

---

## 🚀 Features

- ✅ Add new habits with name, description, and creation date
- ✅ View all current habits
- ✅ Mark habits as completed
- ✅ Delete habits by ID
- ✅ Search habits by name (case-insensitive)
- ✅ Fully interactive command-line interface

---

## 🛠️ Tech Stack

- Java (Core + OOP)
- Java Collections (ArrayList)
- Java Time API (`LocalDate`)
- CLI-based input using `Scanner`

---

## 📂 Folder Structure

daily-habit-tracker/
├── src/
│ └── com/shrey/habittracker/
│ ├── Habit.java # Model class for each habit
│ ├── HabitTracker.java # Business logic to manage habits
│ ├── HabitCLI.java # CLI interface with menu
│ └── Main.java # Application launcher
├── .gitignore
├── README.md


---

## ▶️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/ShreyMadaan/daily-habit-tracker.git
   cd daily-habit-tracker
2. Open in IntelliJ IDEA or any Java IDE
   Make sure your src/ folder is marked as a source root.

3. Run Main.java
   This will launch the interactive habit tracker CLI in your terminal.



Sample CLI Output
===== Daily Habit Tracker =====
1. Add Habit
2. View All Habits
3. Mark Habit as Completed
4. Remove Habit
5. Search Habit by Name
6. Exit
Enter your choice:



Future Scope (Stretch Ideas)
Store habits in a local file or DB for persistence
Add reminder logic or streak tracking
Migrate to a GUI using JavaFX or a Web version using Spring Boot
Export habit history as CSV


👨‍💻 Author
Shrey Madaan
BTech CSE | MS in CS (Woolf x Scaler)
LinkedIn | GitHub


Status
🎉 Project is complete and actively maintained for enhancements.

