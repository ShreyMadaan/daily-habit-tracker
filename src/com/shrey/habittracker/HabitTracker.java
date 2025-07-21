package com.shrey.habittracker;

import java.util.ArrayList;
import java.util.List;

public class HabitTracker {
    private List<Habit> habitList = new ArrayList<>();

    public void addHabit(Habit habit) {
        habitList.add(habit);
    }
    public boolean removeHabit(int id) {
        return habitList.removeIf(habit -> habit.getId() == id);
    }
    public boolean markHabitAsCompleted(int id) {
        for (Habit habit : habitList) {
            if (habit.getId() == id) {
                habit.setCompleted(true);
                return true;
            }
        }
        return false;
    }
    public List<Habit> getAllHabits() {
        return habitList;
    }
    public List<Habit> searchHabits(String searchTerm) {
        return habitList.stream()
                .filter(habit -> habit.getName().toLowerCase().contains(searchTerm.toLowerCase()))
                .toList();
    }
}
