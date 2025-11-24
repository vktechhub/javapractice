package com.example;

public class Student {
    int stdid;
    String stdname;
    String city;
    
    // public Student(int stdid, String stdname, String city) {
    //     this.stdid = stdid;
    //     this.stdname = stdname;
    //     this.city = city;
    // }
    public int getStdid() {
        return stdid;
    }
    public void setStdid(int stdid) {
        this.stdid = stdid;
    }
    public String getStdname() {
        return stdname;
    }
    public void setStdname(String stdname) {
        this.stdname = stdname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Student [stdid=" + stdid + ", stdname=" + stdname + ", city=" + city + "]";
    }

}
