import java.util.Date;
import java.util.LinkedList;

abstract class Person {
    private String name;
    private Date birthDate;
    private String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

class Member extends Person {
    private String position;
    private LinkedList<Schedule> scheduleList;

    public Member() {
        scheduleList = new LinkedList<>();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LinkedList<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(LinkedList<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public Schedule getSchedule(Date date) {
        for (Schedule schedule : scheduleList) {
            if (schedule.getDate().equals(date)) {
                return schedule;
            }
        }
        return null;
    }

    public void addSchedule(Schedule schedule) {
        scheduleList.add(schedule);
    }

    public void removeSchedule(Date date) {
        Schedule schedule = getSchedule(date);
        if (schedule != null) {
            scheduleList.remove(schedule);
        }
    }

    public void updateSchedule(Schedule schedule) {
        Schedule existingSchedule = getSchedule(schedule.getDate());
        if (existingSchedule != null) {
            existingSchedule.setContent(schedule.getContent());
            existingSchedule.setParticipants(schedule.getParticipants());
        }
    }
}

abstract class Employee extends Person {
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

class Manager extends Employee {
    private String phoneNumber;
    private IdolGroup assignedGroup;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void assignGroup(IdolGroup group) {
        assignedGroup = group;
        System.out.println("Assigned group: " + group.getGroupName());
    }

    public void removeGroup() {
        if (assignedGroup != null) {
            System.out.println("Removed group: " + assignedGroup.getGroupName());
            assignedGroup = null;
        } else {
            System.out.println("No group assigned.");
        }
    }
}
