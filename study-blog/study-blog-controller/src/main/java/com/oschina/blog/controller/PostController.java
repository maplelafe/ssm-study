package com.oschina.blog.controller;

import com.alibaba.fastjson.JSONObject;
import com.oschina.blog.dto.BlogPostDTO;
import com.oschina.blog.service.PostService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mzdbxqh on 2017/3/18.
 */
@RestController
public class PostController {

	@Resource
	private PostService postService;

	@RequestMapping("/xml/{postId}")
	public BlogPostDTO getPostByPostId(@PathVariable long postId){
		BlogPostDTO blogPostDTO = postService.selectPostByPostId(postId);
		return blogPostDTO;
	}
	@RequestMapping(value = "/json/{postId}",produces={"application/json; charset=UTF-8"})
	public BlogPostDTO getJosnPostByPostId(@PathVariable long postId){
		BlogPostDTO blogPostDTO = postService.selectPostByPostId(postId);
		return blogPostDTO;
	}

}
