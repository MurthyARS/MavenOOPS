package MavenTestEPAM.EPAMMavenTest;

import java.util.*;
/**
 * Hello world!
 *
 */


class Dairy_Milk extends NewYearGift {
    int quantity;

    public Dairy_Milk(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}
class Ferrero_Rocher extends NewYearGift{
	int quantity;

    public Ferrero_Rocher(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}
class MandM extends NewYearGift{
int quantity;

    public MandM(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}

class Bournville extends NewYearGift{
int quantity;

    public Bournville(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}

class KitKat extends NewYearGift{
int quantity;

    public KitKat(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}

class Toblerone extends NewYearGift{
int quantity;

    public Toblerone(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}

class Hersheys extends NewYearGift{
int quantity;

    public Hersheys(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}


public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	//int n = sc.nextInt();
        //NewYearGift nyg = new NewYearGift();
        //nyg.PrintN(n);
    	int quantity = 0, total_candies = 0;
        char n1;
        NewYearGift collect;
        Boolean n = true;
        int price, weight = 0,totalbox_wt = 0, total_weight = 0;
        //Scanner sc=new Scanner(System.in);
        System.out.println("Fill the New Year Gift Box!!");
        ArrayList<NewYearGift> hm =  new ArrayList<NewYearGift>();
        while(n) {
        System.out.println("AVAILABLE Candies");
        System.out.println("1. Dairy Milk");
        System.out.println("2. Ferrero Rocher");
        System.out.println("3. MandM");
        System.out.println("4. KitKat");
        System.out.println("5. Bournville");
        System.out.println("6. Toblerone");
        System.out.println("7. Hersheys");
        System.out.println("8. Calculate Total Weight of candies");
        System.out.println("9. Sort and Display all gifts");
        System.out.println("Choose an option 1-9");
        try {
       
        switch(sc.next().charAt(0))
        {
        case '1':
        System.out.println("Please enter the quantity");
        quantity = sc.nextInt();
        System.out.println("Please enter the weight in grams");
        weight = sc.nextInt();
        System.out.println("Enter Price");
        price = sc.nextInt();
        collect = new Dairy_Milk("Dairy Milk", price, weight,quantity);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.add(collect);
        System.out.println("Added "+collect.getName());
        System.out.println("Do you want to access any other item (y/n)");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
             n = true;
                 break;
               }
        else
            {
        n = false;
        break;
            }
        case '2':
        System.out.println("please enter the quantity");
        quantity = sc.nextInt();
        System.out.println("please enter the weight in grams");
        weight = sc.nextInt();
        System.out.println("Enter price");
        price = sc.nextInt();
        collect = new Ferrero_Rocher("Ferrero_Rocher",price, weight,quantity);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.add(collect);
        System.out.println("Added "+collect.getName());
        
        System.out.println("Do you want to access any other item (y/n)");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y')
                {
        n = true;
        break;
                }
        else {
        n = false;
        break;
               }
        case '3':
        System.out.println("Please enter the quantity");
        quantity = sc.nextInt();
        System.out.println("Please enter the weight in grams");
        weight = sc.nextInt();
        System.out.println("Please enter the price");
        price = sc.nextInt();
        collect = new MandM("MandM",price, weight,quantity);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.add(collect);
        System.out.println("Added "+collect.getName());
        
        System.out.println("do you want to access to access any other item (y/n)");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
        n = true;
        break;
        }
        else {
        n = false;
        break;
        }
        case '4':
        System.out.println("please enter the quantity");
        quantity = sc.nextInt();
        System.out.println("please enter the weight in grams");
        weight = sc.nextInt();
        System.out.println("Enter price");
        price = sc.nextInt();
        collect = new KitKat("KitKat",price, weight,quantity);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies = total_candies + quantity;
        hm.add(collect);
        System.out.println("Added "+collect.getName());
        
        System.out.println("Do you want to access any other item (y/n)");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
        n = true;
        break;
        }
        else {
        n = false;
        break;
        }
          case '5':
          System.out.println("Please enter the quantity");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams");
          weight = sc.nextInt();
          System.out.println("Enter price");
          price = sc.nextInt();
          collect = new Bournville("Bournville",price, weight,quantity);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.add(collect);
          System.out.println("Added "+collect.getName());
          

      
          System.out.println("Do you want to access any other item (y/n)");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          break;
          }
          case '6':
          System.out.println("Please enter the quantity");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams");
          weight = sc.nextInt();
          System.out.println("Please enter the price");
          price = sc.nextInt();
          collect = new Toblerone("Toblerone",price, weight,quantity);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.add(collect);
          System.out.println("Added "+collect.getName());
          
          System.out.println("Do you want to access to add any other item (y/n)");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          break;
          }
          case '7':
          System.out.println("Please enter the quantity");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams");
          weight = sc.nextInt();
          System.out.println("Please enter the price");
          price = sc.nextInt();
          collect = new Hersheys("Hersheys",price, weight,quantity);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.add(collect);
          System.out.println("Added "+collect.getName());
          
          System.out.println("Do you want to access to add any other item (y/n)");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          break;
          }
          case '9':
          Collections.sort(hm,new SortByPrice());
          for(NewYearGift i:hm) {
        	  System.out.println("Name: "+i.getName()+" Price: "+i.getPrice()+" Weight: "+i.getWeight());
          }
          System.out.println(hm);
          break;
          case '8':
        	  System.out.println(total_weight);
        	  break;
        	  default:
        		  System.out.println("Enter valid Input");
        		  break;
        }}
        catch(Exception e)
        {
        System.out.println("please select from 1-9 options");
           
       
       
    }}
        
        System.out.println("The following candies are present in the Gift Box!!");
        System.out.println(hm);
        System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        System.out.println("Total number of candies in the giftbox is:" +total_candies);
        
        /*Set< Map.Entry< String, Integer> > st = hm.entrySet();
        for (Map.Entry< String, Integer> me: st)
        {
            System.out.print("Name of Chocolate: " +me.getKey()+", ");
            System.out.println(" Price: " +me.getValue());
        }*/
        sc.close();
    }
}
