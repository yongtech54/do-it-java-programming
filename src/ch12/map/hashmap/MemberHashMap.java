package src.ch12.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import src.ch12.collection.Member;


public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if(hashMap.containsKey(memberID)) {
            hashMap.remove(memberID);
            return true;
        }
        System.out.println("존재하지 않는 번호입니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> iterator = hashMap.keySet().iterator();

        while(iterator.hasNext()) {
            Integer temp = iterator.next();
            System.out.println(hashMap.get(temp));
        }
        System.out.println();
    }
}
