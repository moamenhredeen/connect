package me.moamenhredeen.connect.post;

import java.time.LocalDateTime;

public record PostResponse(
        long id,
        String title,
        String content,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
