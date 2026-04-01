public class Member extends User implements FineCalculator {
    private String memberType;
    public Member(int userId, String name, String memberType) {
        super(userId, name);
        this.memberType = memberType;
    }
    public String getMemberType() {
        return memberType;
    }
    // Polymorphism
    public double calculateFine(int lateDays) {
        if (memberType.equalsIgnoreCase("Student")) {
            return lateDays * 2.0;
        } else {
            return lateDays * 5.0;
        }
    }
}
