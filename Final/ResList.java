public class ResList {
    Res head;

    public void insert(int id) {
        Res res = new Res();
        res.id = id;
        Res.prefs = new RPrefList();
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
