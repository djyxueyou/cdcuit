package cn.edu.cuit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.cuit.Service.GoodsService;
import cn.edu.cuit.entity.Goods;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("/goodslist")
	public String list(Model model) {
		List<Goods> ls=goodsService.findAll();
		model.addAttribute("ls", ls);
		return "goodslist";
	}

}
