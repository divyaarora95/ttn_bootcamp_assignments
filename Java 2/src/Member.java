public class Member implements Person {
    String memberId;
    String memberName;
    
    Member(String memberId, String memberName)
    {
        this.memberId = memberId;
        this.memberName = memberName;
    }
    
    public void getPersonDetails(){
        System.out.println("Member ID : "+this.memberId);
        System.out.println("Member Name : "+this.memberName);
    }
}
