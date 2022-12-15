package src.ch12.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import src.ch12.collection.Member;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberID) {
        Iterator<Member> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberID() == memberID) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println("삭제 대상이 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println("=======================");
    }

}
