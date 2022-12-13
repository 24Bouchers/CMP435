import java.util.ArrayList;

public class HosList {
    Hos head;

    public void insert(int id) {
        Hos hos = new Hos();
        hos.id = id;
        hos.prefs = new ArrayList<Integer>();
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

    public void Init(int hosId, int size, boolean debug) {
        Hos hos = head;
        if (head != null) {
            while (hos.id != hosId) {
                hos.matches = new int[size];
                if (debug) {
                    System.out.println("Hospital " + hosId + " Initialized");
                }
                hos = hos.next;

            }
            hos.matches = new int[size];
            if (debug) {
                System.out.println("Hospital " + hosId + " Initialized");
            }
        }
    }

    public void PrefInsert(int hosId, Integer resId) {
        Hos hos = head;
        if (head != null) {
            while (hos.id != hosId) {
                hos = hos.next;
            }
            hos.prefs.add(resId);
        }
    }

    public void PShow() {
        Hos hos = head;
        if (hos != null) {
            while (hos.next != null) {
                System.out.println("");
                System.out.println("h" + hos.id + ": ");
                for (Integer i : hos.prefs) {
                    System.out.print(i + ", ");
                }
                hos = hos.next;
            }
            System.out.println();
            System.out.println("h" + hos.id);
            for (Integer i : hos.prefs) {
                System.out.print(i + ", ");
            }

        }

    }

    public void Show() {
        Hos hos = head;
        if (hos != null) {

            while (hos.next != null) {
                System.out.print("h" + hos.id + ", ");
                hos = hos.next;
            }

            System.out.println("h" + hos.id + ".");

        }
    }

    public int Index() {
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
