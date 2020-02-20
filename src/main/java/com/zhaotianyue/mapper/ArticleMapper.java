package com.zhaotianyue.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhaotianyue.bean.Article;
import com.zhaotianyue.bean.Condition;


public interface ArticleMapper {

	List<Article> list(@Param("con")Condition con, @Param("sortt")int sortt);

}
