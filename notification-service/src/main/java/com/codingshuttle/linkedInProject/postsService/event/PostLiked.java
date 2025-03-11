package com.codingshuttle.linkedInProject.postsService.event;

import lombok.Data;

@Data
public class PostLiked {
    private Long postId;
    private Long ownerUserId;
    private Long likedByUserId;
}
