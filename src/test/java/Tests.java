import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    public RestaurantMenu rm;
    @Test
    public void addFoodTest(){
        RestaurantMenu rm=new RestaurantMenu();
        Food f=new Food("Sandwich","2.20$");
        Assert.assertTrue(rm.addFood(f));
    }
    @Test
    public void printMenuTest(){
        RestaurantMenu rm=new RestaurantMenu();
        Food f=new Food("Pizza","5.00$");
        rm.addFood(f);
        Assert.assertEquals(rm.printMenu(), "BBQ 3.00$ Pizza 5.00$ ");
    }
    @Test
    public void removeFoodTest1(){
        // when we have food in our menu
        RestaurantMenu rm=new RestaurantMenu();
        Food f1 = new Food("Pizza","5.00$");
        Food f2=new Food("Burger","2.20$");
        Food f3=new Food("Spas","1.20$");
        rm.addFood(f1);
        rm.addFood(f2);
        rm.addFood(f3);
       //System.out.println( rm.printMenu());
        Assert.assertTrue(rm.removeFood(f1));
    }
    @Test
    public void removeFoodTest2(){
        // when we do not have food in our menu
        RestaurantMenu rm=new RestaurantMenu();
        Food f1 = new Food("Pizza","5.00$");
        Food f2=new Food("Burger","2.20$");
        Food f3=new Food("Spas","1.20$");
        Food f4=new Food("Borsh","1.60$");
        rm.addFood(f1);
        rm.addFood(f2);
        rm.addFood(f3);
        //System.out.println( rm.printMenu());
        Assert.assertFalse(rm.removeFood(f4));
    }
    @Test
    public void existTest1(){
        //when it exists
        RestaurantMenu rm=new RestaurantMenu();
        Food f1 = new Food("Pizza","5.00$");
        Food f2=new Food("Burger","2.20$");
        Food f3=new Food("Spas","1.20$");
        Food f4=new Food("Borsh","1.60$");
        rm.addFood(f1);
        rm.addFood(f2);
        rm.addFood(f3);
        Assert.assertTrue(rm.exist(f1));
    }
    @Test
    public void existTest2(){
        //when it does not exist
        RestaurantMenu rm=new RestaurantMenu();
        Food f1 = new Food("Pizza","5.00$");
        Food f2=new Food("Burger","2.20$");
        Food f3=new Food("Spas","1.20$");
        Food f4=new Food("Borsh","1.60$");
        rm.addFood(f1);
        rm.addFood(f2);
        rm.addFood(f3);
        Assert.assertFalse(rm.exist(f4));
    }

}
