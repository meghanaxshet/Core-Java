package ComparableAndComparator;

public class Laptop{

    private String name;

    @Override
    public String toString() {
        return "ComparableAndComparator.Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Laptop(String name, int price) {
        this.name = name;
        this.price = price;
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

    private int price;


//    @Override
//    public int compareTo(Laptop o) {
//      if(this.getPrice() > o.getPrice()) {
//        return 1;
//      }
//      else {
//          return -1;
//      }
//        return 0;
  //  }
}
