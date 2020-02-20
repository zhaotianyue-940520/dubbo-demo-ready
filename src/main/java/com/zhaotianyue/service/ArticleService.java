package com.zhaotianyue.service;

import java.util.List;

import com.zhaotianyue.bean.Article;
import com.zhaotianyue.bean.Condition;


public interface ArticleService {

	List<Article> list(Condition con, int sortt);

}
