public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap and old.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public String getWeight() {
        return String.valueOf(this.weight);
    }
  

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 800 && this.weight <= 1200) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year > 2016 && this.price < 1600) {
            System.out.println("This notebook is the best.");

        }
        else if (this.year < 2016 && this.price >= 700){
            System.out.println("This notebook is good enough.");
        }
        else {
            System.out.println("This notebook is OK.");
        }
    }

}



