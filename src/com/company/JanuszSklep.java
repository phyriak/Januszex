package com.company;

import java.util.ArrayList;
import java.util.List;

public class JanuszSklep {
    private JanuszUser januszUser;
    private List<ShopItem> koszyk = new ArrayList<>();

    public JanuszSklep(JanuszUser januszUser) {
        this.januszUser = januszUser;
        System.out.println("Witaj w sklepie "
                + januszUser.getName() + "\n"
                + JanuszTools.getSexByName(januszUser.getName()));
    }

    public void setFakeData() {
        mockKoszyk();
    }

    public List<ShopItem> getKoszyk() {
        return koszyk;
    }

    public double getTotal() {
        double result = 0;
        for (ShopItem item : koszyk) {
            result = result + item.getItemPrice();
        }
        return result;
    }

    private void mockKoszyk() {
        for (int i = 0; i < 3; i++) {
            koszyk.add(new ItemGenerator().randomItem());
        }
    }

    public String getAllNames() {
        String result = "";
        for (ShopItem item : koszyk) {
            result = result + "\n" + item.getItemName();
        }
        return result;
    }

    public void setDiscount() {
        for (ShopItem item : koszyk) {
            item.setItemPrice(item.getItemPrice() / 2);
        }
    }

    public void goldShootDiscount() {
        /* max price item get 50% discount */
        ShopItem maxPriceItem = koszyk.get(0);
        for (ShopItem item : koszyk) {
            if (maxPriceItem.getItemPrice() < item.getItemPrice()) {
                maxPriceItem = item;
            }
        }
        maxPriceItem.setItemPrice(maxPriceItem.getItemPrice() / 2);
    }
}
