package src.ch12.collection.arraylist;

import src.ch12.collection.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberID) {
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberID() == memberID) {
                arrayList.remove(member);
                return true;
            }
        }

        /* get() 사용 가능한 경우
        int length = arrayList.size();
        for (int i = 0; i < length; i++) {
            if (arrayList.get(i).getMemberID() == memberID) {
                arrayList.remove(i);
                return true;
            }
        }
        */
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
//        System.out.println(arrayList);
    }

    public void insertMember(Member member, int index) {
        int length = arrayList.size();

        if (index < 0 || index > length) {
            System.out.println("범위를 벗어납니다.");
            return;
        }

        arrayList.add(index - 1, member);
    }
}
