package com.codingshuttle.linkedInProject.postsService.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostLiked {
    private Long postId;
    private Long ownerUserId;
    private Long likedByUserId;
}
