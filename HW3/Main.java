import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;

public class Main {
    private DataManager dataManager;
    private DefaultListModel<IdolGroup> idolGroupListModel;
    private JList<IdolGroup> idolGroupList;
    private JFrame detailFrame;
    private JLabel groupNameLabel;
    private JLabel debutDateLabel;
    private JLabel agencyLabel;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        // DataManager의 인스턴스 생성
        dataManager = new DataManager();

        // JFrame 및 JPanel 생성
        JFrame frame = new JFrame("아이돌 그룹 관리");
        JPanel panel = new JPanel(new GridBagLayout());

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
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        panel.add(scrollPane, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(addIdolGroupButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(removeIdolGroupButton, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        panel.add(updateIdolGroupButton, constraints);

        // 아이돌 그룹 목록 초기화
        refreshIdolGroupList();

        addIdolGroupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                    clearDetailedInformation();
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
                    String groupName = JOptionPane.showInputDialog(frame, "수정할 아이돌 그룹의 이름을 입력하세요:");
                    if (groupName != null && !groupName.isEmpty()) {
                        selectedGroup.setGroupName(groupName);
                        dataManager.updateIdolGroup(selectedGroup);
                        refreshIdolGroupList();
                        clearDetailedInformation();
                    }
                }
            }
        });

        // ListSelectionListener 추가
        idolGroupList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = idolGroupList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        IdolGroup selectedGroup = idolGroupListModel.get(selectedIndex);
                        showDetailedInformation(selectedGroup);
                    }
                }
            }
        });

        // JFrame에 JPanel 추가
        frame.add(panel);

        // JFrame 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // 아이돌 그룹 목록을 갱신하는 메서드
    private void refreshIdolGroupList() {
        idolGroupListModel.clear();
        for (IdolGroup group : dataManager.getIdolGroups()) {
            idolGroupListModel.addElement(group);
        }
    }

    // 상세 정보를 보여주는 메서드
    private void showDetailedInformation(IdolGroup group) {
        if (detailFrame == null) {
            detailFrame = new JFrame("상세 정보");
            detailFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

            JPanel detailPanel = new JPanel(new GridBagLayout());
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.anchor = GridBagConstraints.WEST;

            JLabel nameLabel = new JLabel("그룹 이름:");
            detailPanel.add(nameLabel, constraints);

            groupNameLabel = new JLabel();
            constraints.gridx = 1;
            constraints.gridy = 0;
            constraints.weightx = 1.0;
            detailPanel.add(groupNameLabel, constraints);

            JLabel debutLabel = new JLabel("데뷔 날짜:");
            constraints.gridx = 0;
            constraints.gridy = 1;
            constraints.weightx = 0.0;
            detailPanel.add(debutLabel, constraints);

            debutDateLabel = new JLabel();
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.weightx = 1.0;
            detailPanel.add(debutDateLabel, constraints);

            JLabel agencyLabel = new JLabel("소속사:");
            constraints.gridx = 0;
            constraints.gridy = 2;
            constraints.weightx = 0.0;
            detailPanel.add(agencyLabel, constraints);

            this.agencyLabel = new JLabel();
            constraints.gridx = 1;
            constraints.gridy = 2;
            constraints.weightx = 1.0;
            detailPanel.add(this.agencyLabel, constraints);

            detailFrame.add(detailPanel);
            detailFrame.setSize(300, 200);
        }

        groupNameLabel.setText(group.getGroupName());
        debutDateLabel.setText(group.getDebutDate().toString());
        agencyLabel.setText(group.getAgency());

        detailFrame.setVisible(true);
    }

    // 상세 정보를 초기화하는 메서드
    private void clearDetailedInformation() {
        groupNameLabel.setText("");
        debutDateLabel.setText("");
        agencyLabel.setText("");
    }
}
