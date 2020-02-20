package com.zhaotianyue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaotianyue.bean.Article;
import com.zhaotianyue.bean.Condition;
import com.zhaotianyue.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	ArticleService service;
	@RequestMapping("list.do")
	public String list(Model m,Condition con,@RequestParam(defaultValue = "1")int sortt,@RequestParam(defaultValue = "1")int pageNum) {
		PageHelper.startPage(pageNum, 5);
		List<Article> list = service.list(con,sortt);
		PageInfo<Article> pageInfo = new PageInfo<Article>(list);
		m.addAttribute("list", list);
		m.addAttribute("p", pageInfo);
		m.addAttribute("t1", con.getT1());
		m.addAttribute("t2", con.getT2());
		m.addAttribute("sorrt", sortt);
		return "list";
	}
}
