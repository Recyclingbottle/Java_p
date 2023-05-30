import java.util.*;

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();

        // 테스트 데이터 생성
        createTestData(dataManager);
        // 새로운 아이돌 그룹 추가 테스트
        IdolGroup newGroup = new IdolGroup();
        newGroup.setGroupName("New Group");
        dataManager.addIdolGroup(newGroup);
        System.out.println("Added new IdolGroup: " + newGroup.getGroupName());

        // 멤버 삭제 테스트
        String memberNameToRemove = "Member 351";
        dataManager.removeMember(memberNameToRemove);
        System.out.println("Removed Member: " + memberNameToRemove);

        // 아이돌 그룹 업데이트 테스트
        String groupNameToUpdate = "Group 81";
        IdolGroup updatedGroup = new IdolGroup();
        updatedGroup.setGroupName(groupNameToUpdate);
        updatedGroup.setDebutDate(new Date());
        updatedGroup.setAgency("New Agency");
        dataManager.updateIdolGroup(updatedGroup);
        System.out.println("Updated IdolGroup: " + groupNameToUpdate);

        // 멤버 검색 테스트
        String memberNameToSearch = "Member 1";
        Member searchedMember = dataManager.getMember(memberNameToSearch);
        if (searchedMember != null) {
            System.out.println("Found Member: " + searchedMember.getName());
        } else {
            System.out.println("Member not found");
        }

        // 아이돌 그룹 검색 테스트
        String groupToSearch = "Group 9";
        IdolGroup searchedGroup = dataManager.getIdolGroup(groupToSearch);
        if (searchedGroup != null) {
            System.out.println("Found IdolGroup: " + searchedGroup.getGroupName());
        } else {
            System.out.println("IdolGroup not found");
        }
    }

    private static void createTestData(DataManager dataManager) {
        // 멤버 테스트 데이터 생성
        for (int i = 1; i <= 100; i++) {
            Member member = new Member();
            member.setName("Member " + i);
            member.setBirthDate(new Date());
            member.setContact("Contact " + i);
            dataManager.addMember(member);
        }
    
        // 아이돌 그룹 테스트 데이터 생성
        for (int i = 1; i <= 100; i++) {
            IdolGroup group = new IdolGroup();
            group.setGroupName("Group " + i);
            group.setDebutDate(new Date());
            group.setAgency("Agency " + i);
            dataManager.addIdolGroup(group);
        }
    }
    
}
