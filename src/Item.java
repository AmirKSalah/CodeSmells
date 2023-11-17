class Item {
    private String name;
    private double price;
    private int quantity;
    private DiscountType discountType;
    private double discountAmount;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addDiscount(DiscountType discountType, double discountAmount) {
        this.discountType = discountType;
        this.discountAmount = discountAmount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}
