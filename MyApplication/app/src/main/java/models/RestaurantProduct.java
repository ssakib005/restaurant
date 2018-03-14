package models;


import models.Restaurant;

public class RestaurantProduct {

    public int id;
    public int image;
    public String name;
    public String description;
    public int restaurantId;
    public int quantity;
    public double price;
    public int categoryId;
    public Restaurant restaurant;



    public RestaurantProduct() {

    }

    public RestaurantProduct(int id, String name, String description, int resId, int qty, int catId, double price, int images) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.restaurantId = resId;
        this.quantity = qty;
        this.categoryId = catId;
        this.price = price;
        this.image = images;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
