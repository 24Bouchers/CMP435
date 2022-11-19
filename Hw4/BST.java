

public class BST {
    Component head;

    public Component createNewComponent(String data){
        Component component = new Component();
        component.data = data;
        component.left = null;
        component.right = null;
        component.attunded = false;
        return component;

    }

    public Component insert(Component component, String data) {
        if (component == null) {
            return createNewComponent(data);
        }
        if (component.data.compareToIgnoreCase(data) <= 0) {
            component.right = insert(component.right, data);
            System.out.println("R");
        } else if (component.data.compareToIgnoreCase(data) > 0) {
            component.left = insert(component.left, data);
            System.out.println("R");
        }
        return component;
    }

    public int index(int num) {
        int indexNum = 0;
        for (int i = 0; i < num; i++) {
            indexNum++;
        }
        return indexNum;
    }

    void printInorder(Component component)
    {
        if (component == null)
            return;
 
        printInorder(component.left);
        System.out.print(component.data + " ");
        printInorder(component.right);
    }

    void LocateItem(Component component, String itemToFind ){
        if (component == null)
        return;
        if(component.data == itemToFind){
            System.out.println("Found it");
        }
        LocateItem(component.left, itemToFind);
        LocateItem(component.right, itemToFind);
    }
}
