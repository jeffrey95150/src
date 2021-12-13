public class LinkedList {
    private LinkedList next;
    private Object content;
    private String separator;

    public LinkedList(String separator) {
        this(separator, null);
    }

    public LinkedList(String separator, Object content) {
        this.content = content;
        this.next = null;
        this.separator = separator;
    }

    public void append(Object o) {
        System.out.println("ah ");
        if (this.content == null) {
            this.content = o;
        } else {
            LinkedList current = this;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new LinkedList(separator, o);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedList current = this;
        while (current != null) {
            sb.append(current.content + current.separator);
            current = current.next;
        }
        return sb.toString();
    }
}
