package com.blogPlatform.BlogPlatform.dto;

import com.blogPlatform.BlogPlatform.entity.Blog;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import java.util.List;


@Component
public class UserDTO {
    private long id;
    private String email;
    private Role role;
    private List<Blog> blogs;

}
