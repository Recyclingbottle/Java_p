package HW2;

import java.util.*;

abstract class Group {
    private String groupName;
    public String getGroupName() { return groupName; }
}

class IdolGroup extends Group {
    private Date debutDate;
    private String agency;
    private ArrayList<Member> memberList;

    public Date getDebutDate() { return debutDate; }
    public String getAgency() { return agency; }
    public Member getMember(String name) { }
    public void addMember(Member member) { }
    public void removeMember(String name) { }
    public void updateMember(Member member) { }
}

abstract class Person {
    private String name;
    private Date birthDate;
    private String contact;

    public String getName() { return name; }
    public Date getBirthDate() { return birthDate; }
    public String getContact() { return contact; }
}

class Member extends Person {
    private String position;
    private LinkedList<Schedule> scheduleList;

    public String getPosition() { return position; }
    public Schedule getSchedule(Date date) { }
    public void addSchedule(Schedule schedule) { }
    public void removeSchedule(Date date) { }
    public void updateSchedule(Schedule schedule) { }
}

class Schedule {
    private Date date;
    private String content;
    private ArrayList<Member> participants;

    public String getContent() { return content; }
    public Member getParticipant(String name) { }
    public void addParticipant(Member member) { }
    public void removeParticipant(String name) { }
}

class Department {
    private String name;
    private LinkedList<String> taskList;

    public String getName() { return name; }
    public LinkedList<String> getTasks() { return taskList; }
    public void addTask(String task) { }
    public void removeTask(String task) { }
    public void updateTask(String oldTask, String newTask) { }
}

abstract class Employee extends Person {
    private Department department;

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}

class Manager extends Employee {
    private String phoneNumber;

    public String getPhoneNumber() { return phoneNumber; }
    public void assignGroup(IdolGroup group) { }
    public void removeGroup() { }
}

class Album {
    private String title;
    private Date releaseDate;
    private HashMap<String, String> trackList;

    public String getTitle() { return title; }
    public Date getReleaseDate() { return releaseDate; }
    public String getTrack(String title) { }
    public HashMap<String, String> getTracks() { return trackList; }
    public void addTrack(String title, String length) { }
    public void removeTrack(String title) { }
    public void updateTrack(String title, String length) { }
}

class Concert {
    private String name;
    private Date date;
    private String place;
    private ArrayList<IdolGroup> participatingGroups;

    public String getName() { return name; }
    public Date getDate() { return date; }
    public String getPlace() { return place; }
    public IdolGroup getGroup(String name) { }
    public ArrayList<IdolGroup> getGroups() { return participatingGroups; }
    public void addGroup(IdolGroup group) { }
    public void removeGroup(String name) { }
}

class Company {
    private String name;
    private String CEO;
    private String registrationNumber;

    public String getName() { return name; }
    public String getCEO() { return CEO; }
    public String getRegistrationNumber() { return registrationNumber; }
}

class DataManager {
    private ArrayList<IdolGroup> idolGroups;
    private ArrayList<Member> members;
    private ArrayList<Schedule> schedules;
    private ArrayList<Department> departments;
    private ArrayList<Company> companies;
    private ArrayList<Album> albums;
    
    public IdolGroup getIdolGroup(String name) { }
    public void addIdolGroup(IdolGroup group) { }
    public void removeIdolGroup(String name) { }
    public void updateIdolGroup(IdolGroup group) { }
    public Member getMember(String name) { }
    public void addMember(Member member) { }
    public void removeMember(String name) { }
    public void updateMember(Member member) { }
    public Schedule getSchedule(Date date) { }
    public void addSchedule(Schedule schedule) { }
    public void removeSchedule(Date date) { }
    public void updateSchedule(Schedule schedule) { }
    public Department getDepartment(String name) { }
    public void addDepartment(Department department) { }
    public void removeDepartment(String name) { }
    public void updateDepartment(Department department) { }
    public Company getCompany(String name) { }
    public void addCompany(Company company) { }
    public void removeCompany(String name) { }
    public void updateCompany(Company company) { }
    public Album getAlbum(String title) { }
    public void addAlbum(Album album) { }
    public void removeAlbum(String title) { }
    public void updateAlbum(Album album) { }
}

public class TEST2 {
    
}
