import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
