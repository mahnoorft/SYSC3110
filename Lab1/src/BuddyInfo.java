public class BuddyInfo {
    private String name;
    private String address;
    private String phone_number;

    public BuddyInfo(String name, String address, String phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }
    public BuddyInfo() {
        this.name = "default";
        this.address = "default";
        this.phone_number = "613-000-0000";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo user1 = new BuddyInfo("Homer", "123 abcd street", "613-123-4567");
        System.out.println(user1.getName() + " Hello");
    }
}
