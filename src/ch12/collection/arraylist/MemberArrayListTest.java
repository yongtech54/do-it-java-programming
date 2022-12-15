package src.ch12.collection.arraylist;

import src.ch12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList members = new MemberArrayList();

        Member member1 = new Member(101, "제임스");
        Member member2 = new Member(102, "다니엘");
        Member member3 = new Member(103, "산체스");

        members.addMember(member1);
        members.addMember(member2);
        members.addMember(member3);

        /*
        members.showAllMember();
        System.out.println(members);

        System.out.println(members.removeMember(100));
        System.out.println(members.removeMember(101));

        members.showAllMember();
        */
        Member member4 = new Member(104, "데이빗");

        members.insertMember(member4, 2);

        members.showAllMember();
    }
}
