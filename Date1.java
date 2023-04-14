package projectJava2;
// Nada
public class Date1 {
    private int day;
    private int month;
    private int year;
    
    // parameteriz cons
    public Date1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // set/get methods
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    // print with toString method 
    public String toString(){
        return day + "/" + month + "/" + year;   
    }
      
}

/* 
ندى عبدالملك الخرجي 
ميرال محمد الربيعان
بنان فهد البريدي
*/