package com.company;

public class ShopItem {
    private String itemName;
    private String itemDescription;
    private double itemPrice;

    public ShopItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = "The best item!";
    }

    public ShopItem(String itemName, double itemPrice, String opis) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = opis;
    }

    @Override
    public String toString() {

        return this.itemName
                + "\n" + this.itemPrice
                + "\n" + this.itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
