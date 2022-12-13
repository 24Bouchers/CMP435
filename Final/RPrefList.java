public class RPrefList {
    Hos head;

    public void RPrefinsert(int id) {
        Hos hos = new Hos();
        hos.id = id;
        hos.next = null;

        if (head == null) {
            head = hos;
        } else {
            Hos n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = hos;
        }
    }

    public void RPrefShow() {
        Hos hos = head;
        if (hos != null) {

            while (hos.next != null) {
                System.out.print("r" + hos.id + ", ");
                hos = hos.next;
            }

            System.out.println("r" + hos.id + ".");

        }
    }

    public int RPrefIndex() {
        int length = 1;
        Hos hos = head;
        while (hos.next != null) {
            length++;
            hos = hos.next;
        }
        length++;

        return length;
    }
}
