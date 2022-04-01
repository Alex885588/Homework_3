import java.util.ArrayList;

public class RestaurantMenu {
    private ArrayList<Food> foods;
    public RestaurantMenu(){
        this.foods=new ArrayList<Food>();
        foods.add(new Food("BBQ","3.00$"));
    }
    public boolean addFood(Food f){
        return foods.add(f);
    }
    public String printMenu(){
        String str="";
        for(Food e:foods) {
            str+=e.getName()+" "+e.getPrice()+" ";
        }
        return str;
    }
    public boolean removeFood(Food f){
        if(foods.contains(f)){
            foods.remove(f);
            return true;
        }
        else
            return false;
    }
    public boolean exist(Food f){
        if(foods.contains(f)==true){
            return true;
        }
        else
            return false;
    }
}

