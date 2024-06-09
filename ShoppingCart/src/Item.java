public class Item{
    private String Name;
    private String Vendor;
    private double Price;
    private double Cost;
    private double Weight;
    private boolean Taxable;

    public Item(){
        this.Name = "Sprite";
        this.Vendor = "ABC Shop";
        this.Price = 25.00;
        this.Cost = 25.00;
        this.Weight = 2;
        this.Taxable = false;
    }
    public Item(String name, double price, double weight, boolean taxable){
        this.Name = name;
        this.Weight = weight;
        this.Price = price;
        this.Taxable = taxable;
    }
    //Constructor with all six parameters
    public Item(String name, String vendor, double price, double cost, double weight, boolean taxable) {
        this.Name = name;
        this.Vendor = vendor;
        this.Price = price;
        this.Cost = cost;
        this.Weight = weight;
        this.Taxable = taxable;
    }
    //Setter method to set attributes
    public void setName(String newName){
        this.Name = newName;
    }
    public void setVendor(String newVendor){
        this.Vendor = newVendor;
    }
    public void setPrice(double newPrice){
        this.Price = newPrice;
    }
    public void setCost(double newCost){
        this.Cost = newCost;
    }
    public void setWeight(double newWeight){
        this.Weight = newWeight;
    }
    public void setTaxable(boolean newTaxable){
        this.Taxable = newTaxable;
    }
    //Getter method to access private attribute
    public String getName(){
        return Name;
    }
    public String getVendor(){
        return Vendor;
    }
    public double getPrice(){
        return Price;
    }
    public double getCost(){
        return Cost;
    }
    public double getWeight(){
        return Weight;
    }
    public boolean getTaxable(){
        return Taxable;
    }
    //Method for IncreaseCost
//    public double IncreaseCost(dou){
//        if(this.Taxable){
//            System.out.println("This product is for tax.");
//            this.Cost = this.Cost+(this.Cost*0.05);
//            return this.Cost;
//        }
//        else{
//            System.out.println("This product is not for tax.");
//            return Cost;
//        }
//    }
    //Method for Profit
    public double profit(){
        return this.Price-this.Cost;
    }
    public void increaseCost(double percentage){
        this.Cost = this.Cost+(this.Cost*(0.01*percentage));
    }

    @Override
    public String toString() {
        return "Item{" +
                "Name='" + Name + '\'' +
                ", Vendor='" + Vendor + '\'' +
                ", Price=" + Price +
                ", Cost=" + Cost +
                ", Weight=" + Weight +
                ", Taxable=" + Taxable +
                '}';
    }
}
