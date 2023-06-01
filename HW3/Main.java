import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultListModel;

public class Main {
    private DataManager dataManager;
    private DefaultListModel<IdolGroup> idolGroupListModel;
    private DefaultListModel<Album> albumListModel;
    private DefaultListModel<Company> companyListModel;
    private DefaultListModel<Department> departmentListModel;
    private DefaultListModel<Member> memberListModel;
    private DefaultListModel<Schedule> scheduleListModel;
    private JList<IdolGroup> idolGroupList;
    private JList<Album> albumList;
    private JList<Company> companyList;
    private JList<Department> departmentList;
    private JList<Member> memberList;
    private JList<Schedule> scheduleList;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        // DataManager의 인스턴스 생성
        dataManager = new DataManager();

        // JFrame 및 JPanel 생성
        JFrame frame = new JFrame("데이터 관리");
        JPanel panel = new JPanel();

        // 아이돌 그룹 목록
        JLabel idolGroupLabel = new JLabel("아이돌 그룹 관리");
        idolGroupListModel = new DefaultListModel<>();
        idolGroupList = new JList<>(idolGroupListModel);
        idolGroupList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane idolGroupScrollPane = new JScrollPane(idolGroupList);
        idolGroupScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // 앨범 목록
        JLabel albumLabel = new JLabel("앨범 관리");
        albumListModel = new DefaultListModel<>();
        albumList = new JList<>(albumListModel);
        albumList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane albumScrollPane = new JScrollPane(albumList);
        albumScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // 회사 목록
        JLabel companyLabel = new JLabel("회사 관리");
        companyListModel = new DefaultListModel<>();
        companyList = new JList<>(companyListModel);
        companyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane companyScrollPane = new JScrollPane(companyList);
        companyScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // 부서 목록
        JLabel departmentLabel = new JLabel("부서 관리");
        departmentListModel = new DefaultListModel<>();
        departmentList = new JList<>(departmentListModel);
        departmentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane departmentScrollPane = new JScrollPane(departmentList);
        departmentScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // 멤버 목록
        JLabel memberLabel = new JLabel("멤버 관리");
        memberListModel = new DefaultListModel<>();
        memberList = new JList<>(memberListModel);
        memberList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane memberScrollPane = new JScrollPane(memberList);
        memberScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // 스케줄 목록
        JLabel scheduleLabel = new JLabel("스케줄 관리");
        scheduleListModel = new DefaultListModel<>();
        scheduleList = new JList<>(scheduleListModel);
        scheduleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scheduleScrollPane = new JScrollPane(scheduleList);
        scheduleScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // 아이돌 그룹 관리 버튼
        JButton idolGroupButton = new JButton("아이돌 그룹 관리");
        idolGroupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showIdolGroupManagement();
            }
        });

        // 앨범 관리 버튼
        JButton albumButton = new JButton("앨범 관리");
        albumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAlbumManagement();
            }
        });

        // 회사 관리 버튼
        JButton companyButton = new JButton("회사 관리");
        companyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCompanyManagement();
            }
        });

        // 부서 관리 버튼
        JButton departmentButton = new JButton("부서 관리");
        departmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDepartmentManagement();
            }
        });

        // 멤버 관리 버튼
        JButton memberButton = new JButton("멤버 관리");
        memberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMemberManagement();
            }
        });

        // 스케줄 관리 버튼
        JButton scheduleButton = new JButton("스케줄 관리");
        scheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showScheduleManagement();
            }
        });

        panel.add(idolGroupButton);
        panel.add(albumButton);
        panel.add(companyButton);
        panel.add(departmentButton);
        panel.add(memberButton);
        panel.add(scheduleButton);

        // JFrame에 JPanel 추가
        frame.add(panel);

        // JFrame 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // 아이돌 그룹 관리 창 보여주는 메서드
    private void showIdolGroupManagement() {
        JFrame frame = new JFrame("아이돌 그룹 관리");
        JPanel panel = new JPanel();
    
        // DefaultListModel와 JList 생성
        idolGroupListModel = new DefaultListModel<>();
        idolGroupList = new JList<>(idolGroupListModel);
        idolGroupList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(idolGroupList);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
        // JButton 생성
        JButton addIdolGroupButton = new JButton("아이돌 그룹 추가");
        JButton removeIdolGroupButton = new JButton("아이돌 그룹 삭제");
        JButton updateIdolGroupButton = new JButton("아이돌 그룹 수정");
    
        // 버튼 옆에 리스트 뷰를 보여주기 위해 JPanel에 JScrollPane 추가
        panel.add(addIdolGroupButton);
        panel.add(removeIdolGroupButton);
        panel.add(updateIdolGroupButton);
        panel.add(scrollPane);
    
        // 아이돌 그룹 목록 초기화
        refreshIdolGroupList();
    
        idolGroupList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = idolGroupList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        IdolGroup selectedGroup = idolGroupListModel.get(selectedIndex);
                        showIdolGroupDetails(selectedGroup);
                    }
                }
            }
        });
    
        addIdolGroupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 아이돌 그룹 추가 로직 구현
                String groupName = JOptionPane.showInputDialog(frame, "추가할 아이돌 그룹의 이름을 입력하세요:");
                if (groupName != null && !groupName.isEmpty()) {
                    String debutDateString = JOptionPane.showInputDialog(frame, "데뷔일자를 입력하세요 (yyyy-MM-dd):");
                    String agency = JOptionPane.showInputDialog(frame, "소속사를 입력하세요:");
    
                    if (debutDateString != null && !debutDateString.isEmpty() && agency != null && !agency.isEmpty()) {
                        try {
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date debutDate = dateFormat.parse(debutDateString);
    
                            IdolGroup group = new IdolGroup(groupName, debutDate, agency);
                            dataManager.addIdolGroup(group);
                            refreshIdolGroupList();
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });
    
        removeIdolGroupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 아이돌 그룹 삭제 로직 구현
                int selectedIndex = idolGroupList.getSelectedIndex();
                if (selectedIndex != -1) {
                    IdolGroup selectedGroup = idolGroupListModel.get(selectedIndex);
                    dataManager.removeIdolGroup(selectedGroup.getGroupName());
                    refreshIdolGroupList();
                }
            }
        });
    
        updateIdolGroupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 아이돌 그룹 수정 로직 구현
                int selectedIndex = idolGroupList.getSelectedIndex();
                if (selectedIndex != -1) {
                    IdolGroup selectedGroup = idolGroupListModel.get(selectedIndex);
                    
                    // 이름 수정
                    String groupName = JOptionPane.showInputDialog(frame, "수정할 아이돌 그룹의 이름을 입력하세요:", selectedGroup.getGroupName());
                    if (groupName != null && !groupName.isEmpty()) {
                        selectedGroup.setGroupName(groupName);
                    }
                    
                    // 데뷔 날짜 수정
                    String debutDateString = JOptionPane.showInputDialog(frame, "수정할 데뷔 날짜를 입력하세요 (yyyy-MM-dd):", selectedGroup.getDebutDateString());
                    if (debutDateString != null && !debutDateString.isEmpty()) {
                        try {
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date debutDate = dateFormat.parse(debutDateString);
                            selectedGroup.setDebutDate(debutDate);
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }
                    }
                    
                    // 소속사 수정
                    String agency = JOptionPane.showInputDialog(frame, "수정할 소속사를 입력하세요:", selectedGroup.getAgency());
                    if (agency != null && !agency.isEmpty()) {
                        selectedGroup.setAgency(agency);
                    }
                    
                    // 아이돌 그룹 수정 후 업데이트
                    dataManager.updateIdolGroup(selectedGroup);
                    refreshIdolGroupList();
                }
            }
        });
    
        // JFrame에 JPanel 추가
        frame.add(panel);
    
        // JFrame 설정
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    
    private void showIdolGroupDetails(IdolGroup group) {
        StringBuilder details = new StringBuilder();
        details.append("그룹 이름: ").append(group.getGroupName()).append("\n");
        details.append("데뷔 날짜: ").append(group.getDebutDate()).append("\n");
        details.append("소속사: ").append(group.getAgency()).append("\n");
    
        JOptionPane.showMessageDialog(null, details.toString(), "아이돌 그룹 상세 정보", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showAlbumManagement() {
        JFrame frame = new JFrame("앨범 관리");
        JPanel panel = new JPanel();
    
        // DefaultListModel와 JList 생성
        albumListModel = new DefaultListModel<>();
        albumList = new JList<>(albumListModel);
        albumList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(albumList);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
        // JButton 생성
        JButton addAlbumButton = new JButton("앨범 추가");
        JButton removeAlbumButton = new JButton("앨범 삭제");
        JButton updateAlbumButton = new JButton("앨범 수정");
    
        // JTextArea 생성 (앨범 상세 정보를 표시할 용도)
        JTextArea albumDetailsArea = new JTextArea();
        albumDetailsArea.setEditable(false);
        JScrollPane detailsScrollPane = new JScrollPane(albumDetailsArea);
        detailsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
        // 버튼 옆에 리스트 뷰와 앨범 상세 정보를 보여주기 위해 JPanel에 JScrollPane 추가
        panel.add(addAlbumButton);
        panel.add(removeAlbumButton);
        panel.add(updateAlbumButton);
        panel.add(scrollPane);
        panel.add(detailsScrollPane);
    
        // 앨범 목록 초기화
        refreshAlbumList();
    
        albumList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = albumList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        Album selectedAlbum = albumListModel.get(selectedIndex);
                        showAlbumDetails(selectedAlbum, albumDetailsArea);
                    }
                }
            }
        });
    
        addAlbumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 앨범 추가 로직 구현
                String albumName = JOptionPane.showInputDialog(frame, "추가할 앨범의 이름을 입력하세요:");
                if (albumName != null && !albumName.isEmpty()) {
                    String releaseDateString = JOptionPane.showInputDialog(frame, "발매일을 입력하세요 (yyyy-MM-dd):");
                    String groupName = JOptionPane.showInputDialog(frame, "소속된 아이돌 그룹의 이름을 입력하세요:");
        
                    // 여기에 날짜 형식 변환 및 Album 객체 생성 및 설정 코드를 추가합니다.
                    if (releaseDateString != null && !releaseDateString.isEmpty() && groupName != null && !groupName.isEmpty()) {
                        try {
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date releaseDate = dateFormat.parse(releaseDateString);
        
                            Album album = new Album();
                            album.setTitle(albumName);
                            album.setReleaseDate(releaseDate);  // releaseDate 설정
        
                            dataManager.addAlbum(album);
                            refreshAlbumList();
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });
    
        removeAlbumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 앨범 삭제 로직 구현
                int selectedIndex = albumList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Album selectedAlbum = albumListModel.get(selectedIndex);
                    dataManager.removeAlbum(selectedAlbum.getTitle());
                    refreshAlbumList();
                }
            }
        });
    
        updateAlbumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 앨범 수정 로직 구현
                int selectedIndex = albumList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Album selectedAlbum = albumListModel.get(selectedIndex);
                    String albumName = JOptionPane.showInputDialog(frame, "수정할 앨범의 이름을 입력하세요:");
                    if (albumName != null && !albumName.isEmpty()) {
                        selectedAlbum.setTitle(albumName);
                        dataManager.updateAlbum(selectedAlbum);
                        refreshAlbumList();
                    }
                }
            }
        });
    
        // JFrame에 JPanel 추가
        frame.add(panel);
    
        // JFrame 설정
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    
    private void showAlbumDetails(Album album, JTextArea detailsArea) {
        StringBuilder details = new StringBuilder();
        details.append("앨범 이름: ").append(album.getTitle()).append("\n");
        details.append("발매 날짜: ").append(album.getReleaseDate()).append("\n");
        details.append("아이돌 그룹: ").append(album.getTitle()).append("\n");
    
        detailsArea.setText(details.toString());
    }
    
    // 회사 관리 창 보여주는 메서드
    private void showCompanyManagement() {
        JFrame frame = new JFrame("회사 관리");
        JPanel panel = new JPanel();

        // DefaultListModel와 JList 생성
        companyListModel = new DefaultListModel<>();
        companyList = new JList<>(companyListModel);
        companyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(companyList);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // JButton 생성
        JButton addCompanyButton = new JButton("회사 추가");
        JButton removeCompanyButton = new JButton("회사 삭제");
        JButton updateCompanyButton = new JButton("회사 수정");

        // 버튼 옆에 리스트 뷰를 보여주기 위해 JPanel에 JScrollPane 추가
        panel.add(addCompanyButton);
        panel.add(removeCompanyButton);
        panel.add(updateCompanyButton);
        panel.add(scrollPane);

        // 회사 목록 초기화
        refreshCompanyList();

        addCompanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 회사 추가 로직 구현
                String companyName = JOptionPane.showInputDialog(frame, "추가할 회사의 이름을 입력하세요:");
                String ceoName = JOptionPane.showInputDialog(frame, "CEO 이름을 입력하세요:");
                String registrationNumber = JOptionPane.showInputDialog(frame, "등록 번호를 입력하세요:");
        
                if (companyName != null && !companyName.isEmpty() && ceoName != null && !ceoName.isEmpty() && registrationNumber != null && !registrationNumber.isEmpty()) {
                    Company company = new Company();
                    company.setName(companyName);
                    company.setCEO(ceoName);
                    company.setRegistrationNumber(registrationNumber);
                    dataManager.addCompany(company);
                    refreshCompanyList();
                }
            }
        });

        removeCompanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 회사 삭제 로직 구현
                int selectedIndex = companyList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Company selectedCompany = companyListModel.get(selectedIndex);
                    dataManager.removeCompany(selectedCompany.getName());
                    refreshCompanyList();
                }
            }
        });

        updateCompanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 회사 수정 로직 구현
                int selectedIndex = companyList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Company selectedCompany = companyListModel.get(selectedIndex);
                    String companyName = JOptionPane.showInputDialog(frame, "수정할 회사의 이름을 입력하세요:");
                    if (companyName != null && !companyName.isEmpty()) {
                        selectedCompany.setName(companyName);
                        dataManager.updateCompany(selectedCompany);
                        refreshCompanyList();
                    }
                }
            }
        });

        // JFrame에 JPanel 추가
        frame.add(panel);

        // JFrame 설정
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private void showDepartmentManagement() {
        JFrame frame = new JFrame("부서 관리");
        JPanel panel = new JPanel();
    
        // DefaultListModel와 JList 생성
        DefaultListModel<Department> departmentListModel = new DefaultListModel<>();
        JList<Department> departmentList = new JList<>(departmentListModel);
        departmentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(departmentList);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
        // JButton 생성
        JButton addDepartmentButton = new JButton("부서 추가");
        JButton removeDepartmentButton = new JButton("부서 삭제");
        JButton updateDepartmentButton = new JButton("부서 수정");
    
        // 버튼 옆에 리스트 뷰를 보여주기 위해 JPanel에 JScrollPane 추가
        panel.add(addDepartmentButton);
        panel.add(removeDepartmentButton);
        panel.add(updateDepartmentButton);
        panel.add(scrollPane);
    
        // 부서 목록 초기화
        refreshDepartmentList();
    
        addDepartmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 부서 추가 로직 구현
                String departmentName = JOptionPane.showInputDialog(frame, "추가할 부서의 이름을 입력하세요:");
                String departmentRole = JOptionPane.showInputDialog(frame, "추가할 부서의 역할을 입력하세요:");
                if (departmentName != null && !departmentName.isEmpty() && departmentRole != null && !departmentRole.isEmpty()) {
                    Department department = new Department();
                    department.setName(departmentName); 
                    department.setRole(departmentRole); 
                    dataManager.addDepartment(department);
                    refreshDepartmentList();
                }
            }
        });
    
        removeDepartmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 부서 삭제 로직 구현
                int selectedIndex = departmentList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Department selectedDepartment = departmentListModel.get(selectedIndex);
                    dataManager.removeDepartment(selectedDepartment.getName());
                    refreshDepartmentList();
                }
            }
        });
    
        updateDepartmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 부서 수정 로직 구현
                int selectedIndex = departmentList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Department selectedDepartment = departmentListModel.get(selectedIndex);
                    String departmentName = JOptionPane.showInputDialog(frame, "수정할 부서의 이름을 입력하세요:");
                    if (departmentName != null && !departmentName.isEmpty()) {
                        selectedDepartment.setName(departmentName);
                        dataManager.updateDepartment(selectedDepartment);
                        refreshDepartmentList();
                    }
                }
            }
        });
    
        // JFrame에 JPanel 추가
        frame.add(panel);
    
        // JFrame 설정
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // 멤버 관리 창 보여주는 메서드
    private void showMemberManagement() {
        JFrame frame = new JFrame("멤버 관리");
        JPanel panel = new JPanel();

        // DefaultListModel와 JList 생성
        memberListModel = new DefaultListModel<>();
        memberList = new JList<>(memberListModel);
        memberList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(memberList);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // JButton 생성
        JButton addMemberButton = new JButton("멤버 추가");
        JButton removeMemberButton = new JButton("멤버 삭제");
        JButton updateMemberButton = new JButton("멤버 수정");

        // 버튼 옆에 리스트 뷰를 보여주기 위해 JPanel에 JScrollPane 추가
        panel.add(addMemberButton);
        panel.add(removeMemberButton);
        panel.add(updateMemberButton);
        panel.add(scrollPane);

        // 멤버 목록 초기화
        refreshMemberList();

        addMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 멤버 추가 로직 구현
                String memberName = JOptionPane.showInputDialog(frame, "추가할 멤버의 이름을 입력하세요:");
                if (memberName != null && !memberName.isEmpty()) {
                    String groupName = JOptionPane.showInputDialog(frame, "소속될 아이돌 그룹의 이름을 입력하세요:");
                    String position = JOptionPane.showInputDialog(frame, "멤버의 포지션을 입력하세요:");

                    if (groupName != null && !groupName.isEmpty() && position != null && !position.isEmpty()) {
                        Member member = new Member();
                        dataManager.addMember(member);
                        refreshMemberList();
                    }
                }
            }
        });

        removeMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 멤버 삭제 로직 구현
                int selectedIndex = memberList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Member selectedMember = memberListModel.get(selectedIndex);
                    dataManager.removeMember(selectedMember.getName());
                    refreshMemberList();
                }
            }
        });

        updateMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 멤버 수정 로직 구현
                int selectedIndex = memberList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Member selectedMember = memberListModel.get(selectedIndex);
                    String memberName = JOptionPane.showInputDialog(frame, "수정할 멤버의 이름을 입력하세요:");
                    if (memberName != null && !memberName.isEmpty()) {
                        selectedMember.setName(memberName);
                        dataManager.updateMember(selectedMember);
                        refreshMemberList();
                    }
                }
            }
        });

        // JFrame에 JPanel 추가
        frame.add(panel);

        // JFrame 설정
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // 스케줄 관리 창 보여주는 메서드
    private void showScheduleManagement() {
        JFrame frame = new JFrame("스케줄 관리");
        JPanel panel = new JPanel();

        // DefaultListModel와 JList 생성
        scheduleListModel = new DefaultListModel<>();
        scheduleList = new JList<>(scheduleListModel);
        scheduleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(scheduleList);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // JButton 생성
        JButton addScheduleButton = new JButton("스케줄 추가");
        JButton removeScheduleButton = new JButton("스케줄 삭제");
        JButton updateScheduleButton = new JButton("스케줄 수정");

        // 버튼 옆에 리스트 뷰를 보여주기 위해 JPanel에 JScrollPane 추가
        panel.add(addScheduleButton);
        panel.add(removeScheduleButton);
        panel.add(updateScheduleButton);
        panel.add(scrollPane);

        // 스케줄 목록 초기화
        refreshScheduleList();

        addScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 스케줄 추가 로직 구현
                String scheduleName = JOptionPane.showInputDialog(frame, "추가할 스케줄의 이름을 입력하세요:");
                if (scheduleName != null && !scheduleName.isEmpty()) {
                    String groupName = JOptionPane.showInputDialog(frame, "소속된 아이돌 그룹의 이름을 입력하세요:");
                    String date = JOptionPane.showInputDialog(frame, "스케줄 날짜를 입력하세요 (yyyy-MM-dd):");

                    if (groupName != null && !groupName.isEmpty() && date != null && !date.isEmpty()) {
                        try {
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date scheduleDate = dateFormat.parse(date);

                            Schedule schedule = new Schedule();
                            dataManager.addSchedule(schedule);
                            refreshScheduleList();
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });

        removeScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 스케줄 삭제 로직 구현
                int selectedIndex = scheduleList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Date selectedDate = scheduleListModel.get(selectedIndex).getDate();
                    dataManager.removeSchedule(selectedDate);
                    refreshScheduleList();
                }
            }
        });
        
        updateScheduleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 스케줄 수정 로직 구현
                int selectedIndex = scheduleList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Schedule selectedSchedule = scheduleListModel.get(selectedIndex);
                    String scheduleName = JOptionPane.showInputDialog(frame, "수정할 스케줄의 이름을 입력하세요:");
                    if (scheduleName != null && !scheduleName.isEmpty()) {
                        selectedSchedule.setContent(scheduleName);
                        dataManager.updateSchedule(selectedSchedule);
                        refreshScheduleList();
                    }
                }
            }
        });
        

        // JFrame에 JPanel 추가
        frame.add(panel);

        // JFrame 설정
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // 앨범 목록을 갱신하는 메서드
    private void refreshAlbumList() {
        albumListModel.clear();
        List<Album> albums = dataManager.getAlbums();
        for (Album album : albums) {
            albumListModel.addElement(album);
        }
    }

    // 회사 목록을 갱신하는 메서드
    private void refreshCompanyList() {
        companyListModel.clear();
        List<Company> companies = dataManager.getCompanies();
        for (Company company : companies) {
            companyListModel.addElement(company);
        }
    }

    // 부서 목록을 갱신하는 메서드
    private void refreshDepartmentList() {
        departmentListModel.clear();
        List<Department> departments = dataManager.getDepartments();
        for (Department department : departments) {
            departmentListModel.addElement(department);
        }
    }

    // 멤버 목록을 갱신하는 메서드
    private void refreshMemberList() {
        memberListModel.clear();
        List<Member> members = dataManager.getMembers();
        for (Member member : members) {
            memberListModel.addElement(member);
        }
    }

    // 스케줄 목록을 갱신하는 메서드
    private void refreshScheduleList() {
        scheduleListModel.clear();
        List<Schedule> schedules = dataManager.getSchedules();
        for (Schedule schedule : schedules) {
            scheduleListModel.addElement(schedule);
        }
    }
    // 아이돌 그룹 목록을 갱신하는 메소드
    private void refreshIdolGroupList() {
        idolGroupListModel.clear(); // 기존 목록을 비웁니다.
        for (IdolGroup group : dataManager.getIdolGroups()) {
            idolGroupListModel.addElement(group); // 새로운 아이돌 그룹을 목록에 추가합니다.
    }
}
}