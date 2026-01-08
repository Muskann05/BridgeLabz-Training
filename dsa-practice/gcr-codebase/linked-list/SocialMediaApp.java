class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }

    // Add friend ID
    void addFriend(int fid) {
        FriendNode newNode = new FriendNode(fid);
        newNode.next = friendHead;
        friendHead = newNode;
    }

    // Remove friend ID
    void removeFriend(int fid) {
        FriendNode curr = friendHead, prev = null;
        while (curr != null) {
            if (curr.friendId == fid) {
                if (prev == null) {
                    friendHead = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    // Count friends
    int countFriends() {
        int count = 0;
        FriendNode temp = friendHead;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

class SocialMedia {
    private UserNode head = null;

    // Add user
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Search user by ID
    public UserNode searchById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by Name
    public UserNode searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (bidirectional)
    public void addFriendConnection(int id1, int id2) {
        UserNode u1 = searchById(id1);
        UserNode u2 = searchById(id2);
        if (u1 != null && u2 != null) {
            u1.addFriend(id2);
            u2.addFriend(id1);
        }
    }

    // Remove friend connection
    public void removeFriendConnection(int id1, int id2) {
        UserNode u1 = searchById(id1);
        UserNode u2 = searchById(id2);
        if (u1 != null && u2 != null) {
            u1.removeFriend(id2);
            u2.removeFriend(id1);
        }
    }

    // Display friends of a user
    public void displayFriends(int userId) {
        UserNode user = searchById(userId);
        if (user == null) return;
        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;
        while (temp != null) {
            System.out.print("U" + temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = searchById(id1);
        UserNode u2 = searchById(id2);
        if (u1 == null || u2 == null) return;
        System.out.print("Mutual Friends of " + u1.name + " & " + u2.name + ": ");
        FriendNode f1 = u1.friendHead;
        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print("U" + f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Display friend count
    public void displayFriendCounts() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.countFriends() + " friends");
            temp = temp.next;
        }
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

        // Add Users
        sm.addUser(1, "Amit", 22);
        sm.addUser(2, "Neha", 21);
        sm.addUser(3, "Rahul", 23);
        sm.addUser(4, "Sneha", 20);

        // Add Friend Connections
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        // Display Friends
        sm.displayFriends(1);
        sm.displayFriends(2);

        // Mutual Friends
        sm.findMutualFriends(1, 2);

        // Remove Friend Connection
        sm.removeFriendConnection(1, 3);
        sm.displayFriends(1);

        // Search
        System.out.println("Search by Name: " + sm.searchByName("Rahul").userId);
        System.out.println("Search by ID: " + sm.searchById(4).name);

        // Friend Count
        sm.displayFriendCounts();
    }
}
