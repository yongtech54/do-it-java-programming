package src.ch12.map.hashmap;

import src.ch12.collection.Member;

import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 =  new Member(1001, "제이슨");
        Member member2 =  new Member(1003, "타일러");
        Member member3 =  new Member(1002, "마이크");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.showAllMember();

        memberHashMap.removeMember(1002);
        memberHashMap.showAllMember();
    }
}
