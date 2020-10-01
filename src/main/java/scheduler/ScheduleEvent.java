package main.java.scheduler;

import java.util.Date;


public class ScheduleEvent
{
    private Date date;
    private int time;
    private int duration;
    private int frequency;
    private String dayOfWeek;
    private int localId;
    private static int id = 0;


    public ScheduleEvent(Date d, int t, int du, int f, String dOW)
    {
        this.date = d;
        this.time = t;
        this.duration = du;
        this.frequency = f;
        this.dayOfWeek = dOW;
        this.localId = id++;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public int getTime()
    {
        return time;
    }

    public void setTime(int time)
    {
        this.time = time;
    }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public int getFrequency()
    {
        return frequency;
    }

    public void setFrequency(int frequency)
    {
        this.frequency = frequency;
    }

    public String getDayOfWeek()
    {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek)
    {
        this.dayOfWeek = dayOfWeek;
    }

    public int getId()
    {
        return localId;
    }

    public void setId(int id)
    {
        this.localId = id;
    }


}
