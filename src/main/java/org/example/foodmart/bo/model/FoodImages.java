package org.example.foodmart.bo.model;

import java.util.Date;

public class FoodImages extends BaseModel {
    private String ImageUrl;

    public FoodImages(int id, Date createdAt, Date updatedAt, boolean idDeleted, String imageUrl) {
        super(id, createdAt, updatedAt, idDeleted);
        ImageUrl = imageUrl;
    }
}
