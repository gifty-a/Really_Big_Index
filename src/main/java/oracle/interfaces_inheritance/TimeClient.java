package main.java.oracle.interfaces_inheritance;

public interface TimeClient {
    void setDateandTime(int dd, int mmm, int yyyy, int hh, int mm, int s);
    void setTime(int hh, int mm, int s);
    void setDate(int dd, int mm, int yyyy);
}
