import java.util.ArrayList;
import java.util.Date;

public class Group {
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}

class IdolGroup extends Group {
    private Date debutDate;
    private String agency;
    private ArrayList<Member> memberList;

    public Date getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(Date debutDate) {
        this.debutDate = debutDate;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public Member getMember(String name) {
        for (Member member : memberList) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public void removeMember(String name) {
        Member member = getMember(name);
        if (member != null) {
            memberList.remove(member);
        }
    }

    public void updateMember(Member member) {
        Member existingMember = getMember(member.getName());
        if (existingMember != null) {
            existingMember.setBirthDate(member.getBirthDate());
            existingMember.setContact(member.getContact());
        }
    }
}

class Company {
    private String name;
    private String CEO;
    private String registrationNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

class Schedule {
    private Date date;
    private String content;
    private ArrayList<String> participants;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<String> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<String> participants) {
        this.participants = participants;
    }
}

class Department {
    private String name;
    private ArrayList<String> taskList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<String> taskList) {
        this.taskList = taskList;
    }
}

class Album {
    private String title;
    private Date releaseDate;
    private ArrayList<String> trackList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<String> getTrackList() {
        return trackList;
    }

    public void setTrackList(ArrayList<String> trackList) {
        this.trackList = trackList;
    }
}

class DataManager {
    private ArrayList<IdolGroup> idolGroups;
    private ArrayList<Member> members;
    private ArrayList<Schedule> schedules;
    private ArrayList<Department> departments;
    private ArrayList<Company> companies;
    private ArrayList<Album> albums;

    public DataManager() {
        idolGroups = new ArrayList<>();
        members = new ArrayList<>();
        schedules = new ArrayList<>();
        departments = new ArrayList<>();
        companies = new ArrayList<>();
        albums = new ArrayList<>();
    }

    public IdolGroup getIdolGroup(String name) {
        for (IdolGroup group : idolGroups) {
            if (group.getGroupName().equals(name)) {
                return group;
            }
        }
        return null;
    }

    public void addIdolGroup(IdolGroup group) {
        idolGroups.add(group);
    }

    public void removeIdolGroup(String name) {
        IdolGroup group = getIdolGroup(name);
        if (group != null) {
            idolGroups.remove(group);
        }
    }

    public void updateIdolGroup(IdolGroup group) {
        IdolGroup existingGroup = getIdolGroup(group.getGroupName());
        if (existingGroup != null) {
            existingGroup.setDebutDate(group.getDebutDate());
            existingGroup.setAgency(group.getAgency());
            existingGroup.setMemberList(group.getMemberList());
        }
    }

    public Member getMember(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(String name) {
        Member member = getMember(name);
        if (member != null) {
            members.remove(member);
        }
    }

    public void updateMember(Member member) {
        Member existingMember = getMember(member.getName());
        if (existingMember != null) {
            existingMember.setBirthDate(member.getBirthDate());
            existingMember.setContact(member.getContact());
        }
    }

    public Schedule getSchedule(Date date) {
        for (Schedule schedule : schedules) {
            if (schedule.getDate().equals(date)) {
                return schedule;
            }
        }
        return null;
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public void removeSchedule(Date date) {
        Schedule schedule = getSchedule(date);
        if (schedule != null) {
            schedules.remove(schedule);
        }
    }

    public void updateSchedule(Schedule schedule) {
        Schedule existingSchedule = getSchedule(schedule.getDate());
        if (existingSchedule != null) {
            existingSchedule.setContent(schedule.getContent());
            existingSchedule.setParticipants(schedule.getParticipants());
        }
    }

    public Department getDepartment(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(String name) {
        Department department = getDepartment(name);
        if (department != null) {
            departments.remove(department);
        }
    }

    public void updateDepartment(Department department) {
        Department existingDepartment = getDepartment(department.getName());
        if (existingDepartment != null) {
            existingDepartment.setTaskList(department.getTaskList());
        }
    }

    public Company getCompany(String name) {
        for (Company company : companies) {
            if (company.getName().equals(name)) {
                return company;
            }
        }
        return null;
    }

    public void addCompany(Company company) {
        companies.add(company);
    }

    public void removeCompany(String name) {
        Company company = getCompany(name);
        if (company != null) {
            companies.remove(company);
        }
    }

    public void updateCompany(Company company) {
        Company existingCompany = getCompany(company.getName());
        if (existingCompany != null) {
            existingCompany.setCEO(company.getCEO());
            existingCompany.setRegistrationNumber(company.getRegistrationNumber());
        }
    }

    public Album getAlbum(String title) {
        for (Album album : albums) {
            if (album.getTitle().equals(title)) {
                return album;
            }
        }
        return null;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeAlbum(String title) {
        Album album = getAlbum(title);
        if (album != null) {
            albums.remove(album);
        }
    }

    public void updateAlbum(Album album) {
        Album existingAlbum = getAlbum(album.getTitle());
        if (existingAlbum != null) {
            existingAlbum.setReleaseDate(album.getReleaseDate());
            existingAlbum.setTrackList(album.getTrackList());
        }
    }
}
