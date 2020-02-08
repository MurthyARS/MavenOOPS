package MavenTestEPAM.EPAMMavenTest;

import java.util.Comparator;

public class NewYearGift implements Comparable<NewYearGift> {
    private String name;
    private int price;
    int weight;

    public NewYearGift(String name,int price,int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
/*
    @Override
    public String toString() {
        return "Sweet name = " + this.name + " weight = " + this.weight + " price " + this.price;
    }
*/
    public int compareTo(NewYearGift o2) {
        return this.getPrice()-o2.getPrice();
    }
    

public int calculateWeight(int w, int q) {
	// TODO Auto-generated method stub
	return w*q;
}
}

class SortByPrice implements Comparator<NewYearGift>{
	public int compare(NewYearGift o,NewYearGift o2) {
        return o.getPrice()-o2.getPrice();
    }
}
class SortByWeight implements Comparator<NewYearGift>{
	public int compare(NewYearGift o,NewYearGift o2) {
        return o.getWeight()-o2.getWeight();
    }
}