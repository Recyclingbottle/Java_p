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
    public Member getMember(String name) { /* 멤버를 이름으로 검색하여 반환하는 로직 구현 */ }
    public void addMember(Member member) { /* 멤버 추가하는 로직 구현 */ }
    public void removeMember(String name) { /* 멤버를 이름으로 검색하여 삭제하는 로직 구현 */ }
    public void updateMember(Member member) { /* 멤버 정보를 업데이트하는 로직 구현 */ }
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
    public Schedule getSchedule(Date date) { /* 날짜로 스케줄을 검색하여 반환하는 로직 구현 */ }
    public void addSchedule(Schedule schedule) { /* 스케줄을 추가하는 로직 구현 */ }
    public void removeSchedule(Date date) { /* 날짜로 스케줄을 검색하여 삭제하는 로직 구현 */ }
    public void updateSchedule(Schedule schedule) { /* 스케줄 정보를 업데이트하는 로직 구현 */ }
}

class Schedule {
    private Date date;
    private String content;
    private ArrayList<Member> participants;

    public String getContent() { return content; }
    public Member getParticipant(String name) { /* 참여 멤버를 이름으로 검색하여 반환하는 로직 구현 */ }
    public void addParticipant(Member member) { /* 참여 멤버를 추가하는 로직 구현 */ }
    public void removeParticipant(String name) { /* 참여 멤버를 이름으로 검색하여 삭제하는 로직 구현 */ }
}

class Department {
    private String name;
    private LinkedList<String> taskList;

    public String getName() { return name; }
    public LinkedList<String> getTasks() { return taskList; }
    public void addTask(String task) { /* 업무를 추가하는 로직 구현 */ }
    public void removeTask(String task) { /* 업무를 삭제하는 로직 구현 */ }
    public void updateTask(String oldTask, String newTask) { /* 업무를 업데이트하는 로직 구현 */ }
}

abstract class Employee extends Person {
    private Department department;

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}

class Manager extends Employee {
    private String phoneNumber;

    public String getPhoneNumber() { return phoneNumber; }
    public void assignGroup(IdolGroup group) { /* 매니저에게 그룹을 할당하는 로직 구현 */ }
    public void removeGroup() { /* 매니저의 소속 그룹을 제거하는 로직 구현 */ }
}

class Album {
    private String title;
    private Date releaseDate;
    private HashMap<String, String> trackList;

    public String getTitle() { return title; }
    public Date getReleaseDate() { return releaseDate; }
    public String getTrack(String title) { /* 특정 트랙을 검색하여 반환하는 로직 구현 */ }
    public HashMap<String, String> getTracks() { return trackList; }
    public void addTrack(String title, String length) { /* 트랙을 추가하는 로직 구현 */ }
    public void removeTrack(String title) { /* 트랙을 삭제하는 로직 구현 */ }
    public void updateTrack(String title, String length) { /* 트랙 정보를 업데이트하는 로직 구현 */ }
}

class Concert {
    private String name;
    private Date date;
    private String place;
    private ArrayList<IdolGroup> participatingGroups;

    public String getName() { return name; }
    public Date getDate() { return date; }
    public String getPlace() { return place; }
    public IdolGroup getGroup(String name) { /* 그룹을 이름으로 검색하여 반환하는 로직 구현 */ }
    public ArrayList<IdolGroup> getGroups() { return participatingGroups; }
    public void addGroup(IdolGroup group) { /* 그룹을 추가하는 로직 구현 */ }
    public void removeGroup(String name) { /* 그룹을 이름으로 검색하여 삭제하는 로직 구현 */ }
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
        
    public IdolGroup getIdolGroup(String name) { /* 그룹을 이름으로 검색하여 반환하는 로직 구현 */ }
    public void addIdolGroup(IdolGroup group) { /* 그룹을 추가하는 로직 구현 */ }
    public void removeIdolGroup(String name) { /* 그룹을 이름으로 검색하여 삭제하는 로직 구현 */ }
    public void updateIdolGroup(IdolGroup group) { /* 그룹 정보를 업데이트하는 로직 구현 */ }
    public Member getMember(String name) { /* 멤버를 이름으로 검색하여 반환하는 로직 구현 */ }
    public void addMember(Member member) { /* 멤버를 추가하는 로직 구현 */ }
    public void removeMember(String name) { /* 멤버를 이름으로 검색하여 삭제하는 로직 구현 */ }
    public void updateMember(Member member) { /* 멤버 정보를 업데이트하는 로직 구현 */ }
    public Schedule getSchedule(Date date) { /* 날짜로 스케줄을 검색하여 반환하는 로직 구현 */ }
    public void addSchedule(Schedule schedule) { /* 스케줄을추가하는 로직 구현 */ }
    public void removeSchedule(Date date) { /*  날짜로 스케줄을 검색하여 삭제하는 로직 구현 */ }
    public void updateSchedule(Schedule schedule) { /*  스케줄 정보를 업데이트하는 로직 구현 */ }
    public Department getDepartment(String name) { /*  부서를 이름으로 검색하여 반환하는 로직 구현 */ }
    public void addDepartment(Department department) { /*  부서를 추가하는 로직 구현 */}
    public void removeDepartment(String name) { /*부서를 이름으로 검색하여 삭제하는 로직 구현 */}
    public void updateDepartment(Department department) {/*부서 정보를 업데이트하는 로직 구현 */}
    public Company getCompany(String name) { /*회사를 이름으로 검색하여 반환하는 로직 구현 */ }
    public void addCompany(Company company) { /*회사를 추가하는 로직 구현 */ }
    public void removeCompany(String name) { /*회사를 이름으로 검색하여 삭제하는 로직 구현 */ }
    public void updateCompany(Company company) { /* 회사 정보를 업데이트하는 로직 구현 */ }
    public Album getAlbum(String title) { /* 앨범을 제목으로 검색하여 반환하는 로직 구현 */}
    public void addAlbum(Album album) { /* 앨범을 추가하는 로직 구현 */ }
    public void removeAlbum(String title) { /* 앨범을 제목으로 검색하여 삭제하는 로직 구현 */}
    public void updateAlbum(Album album) { /*앨범 정보를 업데이트하는 로직 구현 */ }
}

public class Test {

}