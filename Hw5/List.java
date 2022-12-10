public class List {
    Spice head;

    public void insert(String name, int ammount, int totalprice) {
        Spice spice = new Spice();
        spice.name = name;
        spice.ammount = ammount;
        spice.totalprice = totalprice;
        spice.unitprice = (totalprice / ammount);
        spice.next = null;
        spice.resetValue = spice.ammount;

        if (head == null) {
            head = spice;
        } else {
            Spice n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = spice;
        }
    }

    

    public void Show() {
        Spice spice = head;
        if (spice != null) {

            while (spice.next != null) {
                System.out.print(spice.name + ": " + spice.totalprice + spice.ammount );
                spice = spice.next;
            }
            System.out.println(spice.name + ".");
        }
    }

    public int Index() {
        int length = 1;
        Spice node = head;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        length++;

        return length;
    }

    public int Snatch() {
        Spice spice = head;
        int max = 0;
        String nameMax = " ";
        int TotalPlunder = 0;
        while (spice.next != null) {
            max = 0;
            if (spice.unitprice > max && spice.ammount > 0) {
                max = spice.unitprice;
                nameMax = spice.name;
                spice.ammount--;
            }
            spice = spice.next;
        }
        if (spice.unitprice > max && spice.ammount > 0) {
            max = spice.unitprice;
            nameMax = spice.name;
            spice.ammount--;

        }
        TotalPlunder = TotalPlunder + max;
        System.out.println(nameMax);
        return TotalPlunder;
    }

    

    void Reset() {
        Spice spice = head;
        if (spice != null) {

            while (spice.next != null) {
                spice.ammount = spice.resetValue;
                spice = spice.next;
            }
            spice.ammount = spice.resetValue;

        }
    }
}
