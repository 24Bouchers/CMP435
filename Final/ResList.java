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

    public void Remove(int id) {
        Res res = head;
        while (res.id != id) {
            res = res.next;
        }
        res.match[0] = -1;
        res.prefs.remove(0);
    }


    public void DESTROY(int resId, int hosId) {
        Res res = head;
        while (res.id != resId) {
            res = res.next;
        }
        for (int i = 0; i < res.prefs.size(); i++) {
            if (res.prefs.get(i) == hosId) {
                System.out.println("Deleting" + res.prefs.get(i) + "from "+ resId);
                res.prefs.remove(i);
            }
        }
    }

    public Res getRes(int id) {
        Res res = head;
        while (res.id != id) {
            res = res.next;
        }
        return res;
    }

    public void Init(Boolean debug) {
        Res res = head;
        if (res != null) {

            while (res.next != null) {
                res.match = new int[1];
                res.match[0] = -1;
                if (debug) {
                    System.out.println("Resident Matches Initialized");
                }
                res = res.next;
            }
            res.match = new int[1];
            res.match[0] = -1;
            if (debug) {
                System.out.println("Resident Matches Initialized");
            }
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
                System.out.println();
                System.out.println("r" + res.id + ": ");
                for (Integer i : res.prefs) {
                    System.out.print(i + ", ");
                }
                res = res.next;
            }
            System.out.println();
            System.out.println("r" + res.id + ": ");
            for (Integer i : res.prefs) {
                System.out.print(i + ", ");
            }

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

    /*
     * public Res select(){
     * 
     * }
     */
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
