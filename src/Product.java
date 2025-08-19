import java.util.Objects;
public class Product {

    //Properties (instance variables)
    private String id;
    private String name;
    private String description;
    private double price;
    private int quality; //this is actually is quantity not quality this is done by mistake at all  placces
    private double discount; //Stored as a decimal, e.g., 0.10 for 10%

    //1. Constructor
    public Product(String id, String name, String description, double price, int quality, double discount)
    {
       this.id = id;
       this.name = name;
       this.description= description;
       this.price = price;
       this.quality= quality;
       this.discount= discount;
    }

    //2. Getter methods
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public int getQuality(){
        return quality;
    }
    public double getDiscount(){
        return discount;
    }

    //3. Setter methods
    public void setId(String id){
        this.id= id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        if(price>0) {
            this.price = price;
        }else{
            System.out.println("Error: Price must be a positive number.");
        }
    }
    public void setQuality(int quality){
        if(quality>=0) {
            this.quality = quality;
        }else{
            System.out.println("Error: Quality cannot be negative.");
        }
    }
    public void setDiscount(double discount){
        if(discount>=0 && discount<=1.0) {
            this.discount = discount;
        }else{
            System.out.println("Error: Discount must be between 0.0 and 1.0");
        }
    }

    //4. Working methods
    /*
    *calculates and returns the final price after applying the discount.
    * @return The discounted price
     */
    public double calculateFinalPrice(){
        return this.price*(1-this.discount);
    }

    /*
    *Sells a spcified number of items reducing the quantity
    * @param itemSold The number of item to sell.
     */
    public void sellItems(int itemSold){
        if( this.quality>= itemSold){
            this.quality -= itemSold;
            System.out.print(itemSold+ "item of "+this.name +" sold");
        }
        else{
            System.out.println("error: Not enough "+ this.name +" in stock.");
        }
    }

    //5. Enquiry methods
    /*
    * Checks if the product is in stock ( quantity is grater than 0).
    * @return true if quantity > 0, otherwise false
     */
    public boolean isInStock(){
        return this.quality>0;
    }

    //6. toString() Method
    @Override
    public String toString(){
        return "product{"+
                "id="+ this.id +'\''+
                ",name="+ this.name +'\''+
                ",description="+ this.description + '\''+
                ",price=" + this.price +String.format("%.2f",this.price)+
                ",quality="+ this.quality+
                "discount="+(this.discount*100)+"%"+
                '}';

    }

    //Main method
    public static void main(String[]args){

        //Product object creation
        Product laptop = new Product("A101","Gaming Laptop","A powerful machine for gamers",1500.00,10,0.15);

        //to string use
        System.out.println("Initial product info: "+laptop.toString());
        System.out.println("\n");

        //Working method use
        System.out.println("Is the laptop in stock ?"+ laptop.isInStock());

        System.out.println("Remaining quality:"+laptop.getQuality());

        //final state with toString()
        System.out.println("Final Product info:"+ laptop.toString());
    }
}
