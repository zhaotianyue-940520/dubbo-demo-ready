package com.zhaotianyue.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaotianyue.bean.Article;
import com.zhaotianyue.bean.Condition;
import com.zhaotianyue.mapper.ArticleMapper;
import com.zhaotianyue.service.ArticleService;

@Service
public class ArticleServiceImp implements ArticleService{
	@Autowired
	ArticleMapper mapper;
	@Override
	public List<Article> list(Condition con,int sortt) {
		// TODO Auto-generated method stub
		return mapper.list(con,sortt);
	}

}
