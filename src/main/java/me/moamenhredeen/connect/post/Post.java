package me.moamenhredeen.connect.post;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Post extends PanacheEntity {
    String title;
    String content;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
