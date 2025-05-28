package com.sprint.deokhugamteam7.domain.comment.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record CommentDto(
    UUID id,
    UUID reviewId,
    UUID userId,
    String userNickname,
    String content,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {

}
