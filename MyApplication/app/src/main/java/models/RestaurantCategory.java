package models;


import java.util.List;

public class RestaurantCategory {

    private int id;
    private int image;
    private String name;
    private String description;
    private int restaurantId;
    private Restaurant restaurant;
    private List<RestaurantProduct> products;


    public RestaurantCategory() {

    }
    public RestaurantCategory(int id, String name, String description, int resId, List<RestaurantProduct> products, int images) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.restaurantId = resId;
        this.image = images;
        this.products = products;

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
        restaurantId = restaurantId;
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public List<RestaurantProduct> getProducts() {
        return products;
    }
    public void setProducts(List<RestaurantProduct> products) {
        this.products = products;
    }

}