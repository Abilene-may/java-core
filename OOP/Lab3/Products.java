package Lab3;

public class Products {
    private String productCode ;
    private String name;
    private String Describe;
    private int amount;
    private int price;
    private String productType;
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescribe() {
        return Describe;
    }
    public void setDescribe(String describe) {
        Describe = describe;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String output(){
        return "Produce code: " + getProductCode() + "\nName: " + getName()
        + "\nDescribe: " + getDescribe() + "\nAmount: " + getAmount() + 
        "\nPrice: " + getPrice() + "\nProduct type: " + getProductType(); 
    }
    

}
