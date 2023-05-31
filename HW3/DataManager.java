import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DataManager {
    private ArrayList<IdolGroup> idolGroups;
    private ArrayList<Member> members;
    private ArrayList<Schedule> schedules;
    private ArrayList<Department> departments;
    private ArrayList<Company> companies;
    private ArrayList<Album> albums;
    private static final String GROUPS_FILE = "C:\\Users\\hohol\\Documents\\vscode\\Java_p\\HW3\\idolGroups.csv";
    private static final String MEMBERS_FILE = "C:\\Users\\hohol\\Documents\\vscode\\Java_p\\HW3\\members.csv";
    private static final String SCHEDULES_FILE = "C:\\Users\\hohol\\Documents\\vscode\\Java_p\\HW3\\schedules.csv";
    private static final String DEPARTMENTS_FILE = "C:\\Users\\hohol\\Documents\\vscode\\Java_p\\HW3\\departments.csv";
    private static final String COMPANIES_FILE = "C:\\Users\\hohol\\Documents\\vscode\\Java_p\\HW3\\companies.csv";
    private static final String ALBUMS_FILE = "C:\\Users\\hohol\\Documents\\vscode\\Java_p\\HW3\\albums.csv";
    private static final String CSV_SEPARATOR = ",";


    public DataManager() {
        idolGroups = new ArrayList<>();
        members = new ArrayList<>();
        schedules = new ArrayList<>();
        departments = new ArrayList<>();
        companies = new ArrayList<>();
        albums = new ArrayList<>();
        loadIdolGroups();
        loadMembers();
        loadSchedules();
        loadDepartments();
        loadCompanies();
        loadAlbums();
    }
    private void loadIdolGroups() {
        try (BufferedReader reader = new BufferedReader(new FileReader(GROUPS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(CSV_SEPARATOR);
                String groupName = values[0];
                String debutDateStr = values[1];
                if (debutDateStr.equals("debut_date")) {
                    debutDateStr = "2014-08-01"; // 예시로 고정된 데뷔 날짜
                }
                Date debutDate = parseDate(debutDateStr);
                String agency = values[2];
                IdolGroup group = new IdolGroup(groupName, debutDate, agency);
                idolGroups.add(group);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public ArrayList<IdolGroup> getIdolGroups() {
        return idolGroups;
    }
    private void loadMembers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(MEMBERS_FILE))) {
            // 첫 번째 줄인 헤더를 무시하기 위해 한 줄을 읽어서 건너뜁니다.
            reader.readLine();
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(CSV_SEPARATOR);
                if (values.length >= 3) {
                    Member member = new Member();
                    member.setName(values[0]);
                    member.setBirthDate(parseDate(values[1]));
                    member.setContact(values[2]);
                    if (values.length >= 4) { // 필드가 존재할 경우에만 그룹 처리를 합니다.
                        String groupName = values[3];
                        IdolGroup group = getIdolGroup(groupName);
                        if (group != null) {
                            group.addMember(member);
                        }
                    }
                    members.add(member);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    private void loadSchedules() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SCHEDULES_FILE))) {
            // 첫 번째 줄을 건너뜁니다.
            reader.readLine();
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(CSV_SEPARATOR);
                Schedule schedule = new Schedule();
                schedule.setDate(parseDate(values[0]));
                schedule.setContent(values[1]);
                for (int i = 2; i < values.length; i++) {
                    schedule.addParticipant(values[i]);
                }
                schedules.add(schedule);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    private void loadDepartments() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DEPARTMENTS_FILE))) {
            // 첫 번째 줄을 건너뜁니다.
            reader.readLine();
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(CSV_SEPARATOR);
                Department department = new Department();
                department.setName(values[0]);
                for (int i = 1; i < values.length; i++) {
                    department.addTask(values[i]);
                }
                departments.add(department);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    private void loadCompanies() {
        try (BufferedReader reader = new BufferedReader(new FileReader(COMPANIES_FILE))) {
            // 첫 번째 줄을 건너뜁니다.
            reader.readLine();
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(CSV_SEPARATOR);
                Company company = new Company();
                company.setName(values[0]);
                company.setCEO(values[1]);
                company.setRegistrationNumber(values[2]);
                companies.add(company);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadAlbums() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ALBUMS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(CSV_SEPARATOR);
                Album album = new Album();
                album.setTitle(values[0]);
                album.setReleaseDate(parseDate(values[1]));
                for (int i = 2; i < values.length; i++) {
                    album.addTrack(values[i]);
                }
                albums.add(album);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Date parseDate(String dateString) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            if (dateString.equals("date")) {
                dateString = "2000-01-01"; // 예시로 고정된 날짜
            } else if (dateString.equals("release_date")) {
                dateString = "2000-01-01"; // 예시로 고정된 날짜
            }
            return format.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    

    private String formatDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
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
        saveIdolGroups();
    }

    public void removeIdolGroup(String name) {
        IdolGroup group = getIdolGroup(name);
        if (group != null) {
            idolGroups.remove(group);
            saveIdolGroups();
        }
    }

    public void updateIdolGroup(IdolGroup group) {
        IdolGroup existingGroup = getIdolGroup(group.getGroupName());
        if (existingGroup != null) {
            existingGroup.setDebutDate(group.getDebutDate());
            existingGroup.setAgency(group.getAgency());
            existingGroup.setMemberList(group.getMemberList());
            saveIdolGroups();
        }
    }

    private void saveIdolGroups() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(GROUPS_FILE))) {
            for (IdolGroup group : idolGroups) {
                String line = group.getGroupName() + CSV_SEPARATOR + formatDate(group.getDebutDate()) +
                        CSV_SEPARATOR + group.getAgency();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
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
        saveMembers();
    }

    public void removeMember(String name) {
        Member member = getMember(name);
        if (member != null) {
            members.remove(member);
            saveMembers();
        }
    }

    public void updateMember(Member member) {
        Member existingMember = getMember(member.getName());
        if (existingMember != null) {
            existingMember.setBirthDate(member.getBirthDate());
            existingMember.setContact(member.getContact());
            saveMembers();
        }
    }

    private void saveMembers() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(MEMBERS_FILE))) {
            for (Member member : members) {
                String line = member.getName() + CSV_SEPARATOR + formatDate(member.getBirthDate()) +
                        CSV_SEPARATOR + member.getContact();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
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
        saveSchedules();
    }

    public void removeSchedule(Date date) {
        Schedule schedule = getSchedule(date);
        if (schedule != null) {
            schedules.remove(schedule);
            saveSchedules();
        }
    }

    public void updateSchedule(Schedule schedule) {
        Schedule existingSchedule = getSchedule(schedule.getDate());
        if (existingSchedule != null) {
            existingSchedule.setContent(schedule.getContent());
            existingSchedule.setParticipants(schedule.getParticipants());
            saveSchedules();
        }
    }

    private void saveSchedules() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SCHEDULES_FILE))) {
            for (Schedule schedule : schedules) {
                String line = formatDate(schedule.getDate()) + CSV_SEPARATOR + schedule.getContent();
                for (String participant : schedule.getParticipants()) {
                    line += CSV_SEPARATOR + participant;
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
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
        saveDepartments();
    }

    public void removeDepartment(String name) {
        Department department = getDepartment(name);
        if (department != null) {
            departments.remove(department);
            saveDepartments();
        }
    }

    public void updateDepartment(Department department) {
        Department existingDepartment = getDepartment(department.getName());
        if (existingDepartment != null) {
            existingDepartment.setTaskList(department.getTaskList());
            saveDepartments();
        }
    }

    private void saveDepartments() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DEPARTMENTS_FILE))) {
            for (Department department : departments) {
                String line = department.getName();
                for (String task : department.getTaskList()) {
                    line += CSV_SEPARATOR + task;
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
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
        saveCompanies();
    }

    public void removeCompany(String name) {
        Company company = getCompany(name);
        if (company != null) {
            companies.remove(company);
            saveCompanies();
        }
    }

    public void updateCompany(Company company) {
        Company existingCompany = getCompany(company.getName());
        if (existingCompany != null) {
            existingCompany.setCEO(company.getCEO());
            existingCompany.setRegistrationNumber(company.getRegistrationNumber());
            saveCompanies();
        }
    }

    private void saveCompanies() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(COMPANIES_FILE))) {
            for (Company company : companies) {
                String line = company.getName() + CSV_SEPARATOR + company.getCEO() +
                        CSV_SEPARATOR + company.getRegistrationNumber();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
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
        saveAlbums();
    }

    public void removeAlbum(String title) {
        Album album = getAlbum(title);
        if (album != null) {
            albums.remove(album);
            saveAlbums();
        }
    }

    public void updateAlbum(Album album) {
        Album existingAlbum = getAlbum(album.getTitle());
        if (existingAlbum != null) {
            existingAlbum.setReleaseDate(album.getReleaseDate());
            existingAlbum.setTrackList(album.getTrackList());
            saveAlbums();
        }
    }

    private void saveAlbums() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ALBUMS_FILE))) {
            for (Album album : albums) {
                String line = album.getTitle() + CSV_SEPARATOR + formatDate(album.getReleaseDate());
                for (String track : album.getTrackList()) {
                    line += CSV_SEPARATOR + track;
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     public List<Album> getAlbums() {
        return albums;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }
}