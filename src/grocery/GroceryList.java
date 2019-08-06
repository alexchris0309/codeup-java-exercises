package grocery;
import java.util.Collections;
import java.util.ArrayList;
import util.Input;
import java.util.HashMap;
import java.util.Scanner;



public class GroceryList {
    private String itemName;
    private int itemQuantity;
    private String category;
    private ArrayList<String> list;
    private ArrayList<String> categoryList;





    //constructor
    public GroceryList() {
        this.itemQuantity = itemQuantity;
        this.itemName = itemName;
        this.list = new ArrayList<>();


    }



    public String getItemName(){
        return this.itemName;
    }



    public int gerItemQuantity(){
        return this.itemQuantity;

    }

    public String getCategory(){
        return this.category;

    }
    public void addCategory(String cat){
         this.categoryList.add(cat);


    }
    public void addtoList(String item){
        this.list.add(item);


    }



    public static void main(String[] args) {

        GroceryList  grocerylist = new GroceryList();

        grocerylist.addCategory("Dairy");
        grocerylist.addCategory("Meat");
        grocerylist.addCategory("Fruit");
        grocerylist.addCategory("Vegetable");






        System.out.println();

        Input input= new Input();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Would you like to create a new grocery list?");
        boolean userInput=(input.yesNo());
        System.out.println("Please a Pick Category");
        System.out.println("| Dairy | Meat | Fruit | ");
        String userInput = scanner.nextLine();


        ;








    }
}