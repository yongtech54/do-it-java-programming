package src.ch12.collection.hashset;

import src.ch12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1006, "c");
        Member member2 = new Member(1005, "a");
        Member member3 = new Member(1002, "b");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.showAllMember();

        Member member4 = new Member(1002, "데이빗");
        memberHashSet.addMember(member4);
        memberHashSet.showAllMember();
    }
}
