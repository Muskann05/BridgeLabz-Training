public class Tab {
    String url;
    Tab prev;
    Tab next;

    public Tab(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
