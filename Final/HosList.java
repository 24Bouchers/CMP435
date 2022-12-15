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

    public Hos getHos(int id) {
        Hos hos = head;
        while (hos.id != id) {
            hos = hos.next;
        }
        return hos;
    }

    public int checkSpace(int id) {
        Hos hos = head;
        int openSpaces = 0;
        while (hos.id != id) {
            hos = hos.next;
        }
        for (int i = 0; i < hos.matches.length; i++) {
            if (hos.matches[i] == -1) {
                openSpaces++;
            }
        }
        return openSpaces;
    }

    public void match(int hosId, int resId) {
        Hos hos = head;
        while (hos.id != hosId) {
            hos = hos.next;
        }
        for (int i = 0; i < hos.matches.length; i++) {
            if (hos.matches[i] == -1) {
                hos.matches[i] = resId;
                i = hos.matches.length;
            }
        }
    }

    public void Init(int hosId, int size, boolean debug) {
        Hos hos = head;
        if (head != null) {
            while (hos.id != hosId) {

                hos = hos.next;

            }
            hos.matches = new int[size];
            if (debug) {
                System.out.println("Size: " + size);
            }
            for (int i = 0; i < hos.matches.length; i++) {
                hos.matches[i] = -1;
            }
            if (debug) {
                System.out.println("Hospital " + hosId + " Initialized");
            }
        }
    }

    public int Replace(int hosId, int resId, ResList rList) {
        Hos hos = head;
        while (hos.id != hosId) {
            hos = hos.next;
        }
        int callBack =0;

        for(int i = hos.prefs.size() - 1; i > 0; i--){
            for(int j = 0; j < hos.matches.length;){
                if(hos.prefs.get(i) == hos.matches[j]){
                 /* System.out.println("Found it");
                    System.out.println(hos.matches[j]);
                    System.out.println("size" + hos.prefs.size());
                    */
                    rList.getRes(hos.prefs.get(i)).match[0] = -1;
                    rList.getRes(resId).match[0] = hosId;
                    rList.DESTROY(hos.matches[j], hosId);
                    hos.prefs.add(resId);
                    System.out.println(rList.getRes(resId).match[0] = hosId);
                    callBack = rList.getRes(hos.prefs.get(i)).id;
                    i = 0;
                    
                    

                }
                j++;
            }
            
        }
        return rList.getRes(hos.prefs.get(callBack)).id;

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
