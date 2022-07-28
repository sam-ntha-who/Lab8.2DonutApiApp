package co.grandcircus.Donuts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.Donuts.Service.DonutApiService;

@Controller
public class DonutController {
	
	@Autowired
	private DonutApiService donutService;

	@RequestMapping("/")
	public String showDonuts(Model model) {
	model.addAttribute("donuts", donutService.getDonuts());
		return "home";
	}
	
	@RequestMapping("donut-info")
	public String showDonutInfo(Model model, @RequestParam Integer id) {
		model.addAttribute("donut", donutService.getDonutInfo(id));
		return "donut-info";
	}
}
