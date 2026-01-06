package org.example.foodmart.bo.model;

import java.util.Date;


public class BaseModel {
    private int Id;
    private Date CreatedAt;
    private Date UpdatedAt;
    private boolean IdDeleted;

    public BaseModel() {
    }

    public BaseModel(int id, Date createdAt, Date updatedAt, boolean idDeleted) {
        Id = id;
        CreatedAt = createdAt;
        UpdatedAt = updatedAt;
        IdDeleted = idDeleted;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public boolean isIdDeleted() {
        return IdDeleted;
    }

    public void setIdDeleted(boolean idDeleted) {
        IdDeleted = idDeleted;
    }

    public Date getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        UpdatedAt = updatedAt;
    }
}
