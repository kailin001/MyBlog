package com.qunar.lfz.dao;

import com.qunar.lfz.model.Blog;

import java.util.List;

public interface BlogDao {

    void writeBlog(Blog blog);

    List<Blog> selectAllBlog();

    List<Blog> selectBlogById(int blogid);

    void deleteBlogById(int blogid);

}
