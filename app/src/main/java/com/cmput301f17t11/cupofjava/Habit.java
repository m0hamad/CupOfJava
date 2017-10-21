package com.cmput301f17t11.cupofjava;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by nazim on 21/10/17.
 */

public class Habit {

    private String habitTitle; //TODO: ensure habitTitle no more than 20 chars
    private String habitReason; //TODO: ensure habitReason no more than 30 chars
    private Date habitStartDate;
    private ArrayList<Integer> repeatingDays; //0 = Sun, 1 = Mon... 6 = Sat

    public Habit(String title, String reason, Date date){
        this.habitTitle = title;
        this.habitReason = reason;
        this.habitStartDate = date;
    }

    public String getHabitTitle() {
        return habitTitle;
    }

    public void setHabitTitle(String habitTitle) {
        this.habitTitle = habitTitle;
    }

    public String getHabitReason() {
        return habitReason;
    }

    public void setHabitReason(String habitReason) {
        this.habitReason = habitReason;
    }

    public Date getHabitStartDate() {
        return habitStartDate;
    }

    public void setHabitStartDate(Date habitStartDate) {
        this.habitStartDate = habitStartDate;
    }
}