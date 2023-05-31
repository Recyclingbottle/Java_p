import java.util.ArrayList;
import java.util.Date;

public class Group {
    private String groupName;

    public Group(String groupName) {
        this.groupName = groupName;
    }

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

    public IdolGroup(String name, Date debutDate, String agency) {
        super(name);
        this.debutDate = debutDate;
        this.agency = agency;
        this.memberList = new ArrayList<>();
    }
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
    @Override
    public String toString() {
        return getGroupName(); // 그룹 이름을 반환하도록 toString() 메서드 오버라이딩
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

    public Schedule() {
        participants = new ArrayList<>();
    }

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

    public void addParticipant(String participant) {
        participants.add(participant);
    }
}


class Department {
    private String name;
    private ArrayList<String> taskList;

    public Department() {
        taskList = new ArrayList<>();
    }

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

    public void addTask(String task) {
        taskList.add(task);
    }
}

class Album {
    private String title;
    private Date releaseDate;
    private ArrayList<String> trackList;

    public Album() {
        trackList = new ArrayList<>();
    }

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

    public void addTrack(String track) {
        trackList.add(track);
    }
}

