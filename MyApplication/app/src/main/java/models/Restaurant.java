package models;

public class Restaurant {

    public int id;
    public int image;
    public String name;
    public String description;
    public String address;

    public Restaurant(){

    }

    public Restaurant(int id, String name, String description, String address, int images) {

        this.id = id;
        this.image = images;
        this.name = name;
        this.description = description;
        this.address = address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}



