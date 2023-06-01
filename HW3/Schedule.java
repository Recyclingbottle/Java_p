import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

class Schedule {
    private Date date;
    private String content;
    private ArrayList<Member> participants;

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

    public ArrayList<Member> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Member> participants) {
        this.participants = participants;
    }

    public Member getParticipant(String name) {
        for (Member member : participants) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void addParticipant(Member member) {
        participants.add(member);
    }

    public void removeParticipant(String name) {
        Member member = getParticipant(name);
        if (member != null) {
            participants.remove(member);
        }
    }
}

class Department {
    private String name;
    private LinkedList<String> taskList;

    public Department() {
        taskList = new LinkedList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LinkedList<String> getTaskList() {
        return taskList;
    }
    
    public void setTaskList(LinkedList<String> taskList) {
        this.taskList = taskList;
    }
    
    public void addTask(String task) {
        taskList.add(task);
    }
    
    public String toString() {
        return getName();
    }
    
}

class Album {
    private String title;
    private Date releaseDate;
    private HashMap<String, String> trackList;

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

    public String getTrack(String title) {
        return trackList.get(title);
    }

    public HashMap<String, String> getTrackList() {
        return trackList;
    }

    public void setTrackList(HashMap<String, String> trackList) {
        this.trackList = trackList;
    }

    public void addTrack(String title, String length) {
        trackList.put(title, length);
    }

    public void removeTrack(String title) {
        trackList.remove(title);
    }

    public void updateTrack(String title, String length) {
        trackList.put(title, length);
    }
}

class Concert {
    private String name;
    private Date date;
    private String place;
    private ArrayList<IdolGroup> participatingGroups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public IdolGroup getGroup(String name) {
        for (IdolGroup group : participatingGroups) {
            if (group.getGroupName().equals(name)) {
                return group;
            }
        }
        return null;
    }

    public ArrayList<IdolGroup> getGroups() {
        return participatingGroups;
    }

    public void setGroups(ArrayList<IdolGroup> participatingGroups) {
        this.participatingGroups = participatingGroups;
    }

    public void addGroup(IdolGroup group) {
        participatingGroups.add(group);
    }

    public void removeGroup(String name) {
        IdolGroup group = getGroup(name);
        if (group != null) {
            participatingGroups.remove(group);
        }
    }
}
