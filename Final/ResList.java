import java.util.ArrayList;

public class ResList {
    Res head;

    public void insert(int id) {
        Res res = new Res();
        res.id = id;
        res.prefs = new ArrayList<Integer>();
        res.next = null;

        if (head == null) {
            head = res;
        } else {
            Res n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = res;
        }
    }

    public void PrefInsert(int resId, Integer hosId) {
        Res res = head;
        if (head != null) {
            while (res.id != resId) {
                res = res.next;
            }
            res.prefs.add(hosId);
        }
    }

    public void PShow() {
        Res res = head;
        if (res != null) {

            while (res.next != null) {
                System.out.println("r" + res.id + ": ");
                for (Integer i : res.prefs) {
                    System.out.println(i + ", ");
                  }
                System.out.println("----------------------");
                res = res.next;
            }
            System.out.println("r" + res.id + ": ");
                for (Integer i : res.prefs) {
                    System.out.println(i + ", ");
                  }
            System.out.println("----------------------");

        }

    }

    public void Show() {
        Res res = head;
        if (res != null) {

            while (res.next != null) {
                System.out.print("r" + res.id + ", ");
                res = res.next;
            }

            System.out.println("r" + res.id + ".");

        }
    }

    public int Index() {
        int length = 1;
        Res res = head;
        while (res.next != null) {
            length++;
            res = res.next;
        }
        length++;

        return length;
    }
}
