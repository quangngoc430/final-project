package vn.edu.vnuk.shopping.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "AccountId")
    private Long accountId;

    @Column(name = "ItemId")
    private Long itemId;

    @Column(name = "Value")
    private Long value;

    @Column(name = "Comment")
    private String comment;

    @Transient
    private Account account;

    @Column(name = "CreatedAt")
    private Date createdAt;

    @Column(name = "UpdatedAt")
    private Date updatedAt;

    public Rating() {}

    public Rating(Rating rating, Account account) {
        this.id = rating.id;
        this.itemId = rating.itemId;
        this.accountId = rating.accountId;
        this.value = rating.value;
        this.comment = rating.comment;
        this.createdAt = rating.createdAt;
        this.updatedAt = rating.updatedAt;

        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", itemId=" + itemId +
                ", value=" + value +
                ", comment='" + comment + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
