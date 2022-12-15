package src.ch12.collection;

public class Member implements Comparable<Member>{
    private int memberID;
    private String memberName;

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberID;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Member) {
            Member temp = (Member) object;
            if(temp.memberID == this.memberID) {
                return true;
            }
            return false;
        }

        return false;
    }

    @Override
    public int compareTo(Member member) {
//        return (this.memberID - member.memberID) ;
        return this.memberName.compareTo(member.memberName);
    }
}
