package src.ch12.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import src.ch12.collection.Member;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (treeMap.containsKey(memberID)) {
            treeMap.remove(memberID);
            return true;
        }

        System.out.println("요청하신 대상이 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> iterator = treeMap.keySet().iterator();

        while(iterator.hasNext()) {
            System.out.println(treeMap.get(iterator.next()));
        }

        System.out.println("========================");
    }
}
