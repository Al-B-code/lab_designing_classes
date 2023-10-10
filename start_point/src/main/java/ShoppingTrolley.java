import java.util.ArrayList;

public class ShoppingTrolley {

    private ArrayList<String> itemList; // Creates and ArrayList object;


    public ShoppingTrolley(){

        this.itemList = new ArrayList<>();

    }

    public ArrayList getList() {
        return this.itemList;
    }

    public void addItem(String item) {

        this.itemList.add(item);

    }

    public int countItems() {
        return itemList.size();
    }

    public boolean containsItem(String item) {

        boolean isItemInList = false;

        for (int i = 0; i < itemList.size() ; i++) {
            if (itemList.get(i).equals(item)){
                isItemInList = true;
            }
        }
        return  isItemInList;
    }

}



