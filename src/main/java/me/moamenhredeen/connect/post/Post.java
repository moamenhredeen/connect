package me.moamenhredeen.connect.post;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.time.LocalDateTime;

public class Post extends PanacheEntity {
    String title;
    String content;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
