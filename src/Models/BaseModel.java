package Models;

import java.util.Date;

public class BaseModel {
    private Long Id;
    private Date CreatedAt;
    private Date UpdateAt;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Date getUpdateAt() {
        return UpdateAt;
    }

    public void setUpdateAt(Date updateAt) {
        UpdateAt = updateAt;
    }
}
