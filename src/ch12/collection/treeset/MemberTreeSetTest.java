package src.ch12.collection.treeset;

import src.ch12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet treeSet = new MemberTreeSet();

        Member member1 = new Member(1001, "제이슨");
        Member member2 = new Member(1002, "데이빗");
        Member member3 = new Member(1003, "다니엘");

        treeSet.addMember(member1);
        treeSet.addMember(member2);
        treeSet.addMember(member3);
        treeSet.showAllMember();

        Member member4 = new Member(1002, "제이슨");
        treeSet.addMember(member4);
        treeSet.showAllMember();
    }
}
