/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Blog {
    int id;
    String title;
    Date timePost;
    String image;
    String description;
    String category;
    String shortDescription;

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Blog(int id, String title, Date timePost, String image, String description, String category, String shortDescription) {
        this.id = id;
        this.title = title;
        this.timePost = timePost;
        this.image = image;
        this.description = description;
        this.category = category;
        this.shortDescription = shortDescription;
    }

    public Blog() {
    }

    public Blog(int id, String title, Date timePost, String image, String description) {
        this.id = id;
        this.title = title;
        this.timePost = timePost;
        this.image = image;
        this.description = description;
    }
    

    public Blog(int id, String title, Date timePost, String image, String description, String category) {
        this.id = id;
        this.title = title;
        this.timePost = timePost;
        this.image = image;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTimePost() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
        return sdf.format(timePost);
    }

    public void setTimePost(Date timePost) {
        this.timePost = timePost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
}
