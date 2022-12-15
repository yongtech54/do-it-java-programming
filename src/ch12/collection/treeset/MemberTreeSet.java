package src.ch12.collection.treeset;

import src.ch12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberID) {
        Iterator iterator = treeSet.iterator();

        while(iterator.hasNext()) {
            Member temp = (Member) iterator.next();
            if (temp.getMemberID() == memberID) {
                treeSet.remove(temp);
                return true;
            }
            return false;
        }
        System.out.println("일치하는 회원이 없습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println("=======================");
    }
}
