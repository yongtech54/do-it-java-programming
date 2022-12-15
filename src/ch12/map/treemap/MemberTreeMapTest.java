package src.ch12.map.treemap;

import src.ch12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap treeMap = new MemberTreeMap();

        Member member1 = new Member(1001, "제이슨");
        Member member2 = new Member(1003, "제이미");
        Member member3 = new Member(1004, "케이티");
        Member member4 = new Member(1002, "존");

        treeMap.addMember(member1);
        treeMap.addMember(member2);
        treeMap.addMember(member3);
        treeMap.addMember(member4);

        treeMap.showAllMember();

        treeMap.removeMember(1002);

        treeMap.showAllMember();

    }
}
