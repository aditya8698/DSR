package com.example.product.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestParam;


import com.example.product.Service.ProductServicelmp;
import com.example.product.enitity.Product;


@Controller
public class ProductController {
	
	@Autowired
	 ProductServicelmp imp;
	
	@GetMapping("/home")
	public String gethome()
		{
			return "Home";
		}
	@GetMapping ("/product")
	public String getadd()
	{
		return "Add";
	}
	@GetMapping ("/addproduct")
		public String addProcduct(Model m,@ModelAttribute("Product") Product p)
		{
		List<Product> ls = new ArrayList<Product>();
		ls.addAll(imp.insertProduct(p));
		m.addAttribute("Alldata", ls);
		System.out.println("********"+ls);
			return "Add";
		}
		
	@GetMapping("/deleteProduct")
	    public String deletedata(Model m , @RequestParam("id") Integer id) {
		List<Product> ls = new ArrayList<Product>();
		ls.addAll(imp.deleteProduct(id));
		m.addAttribute("Alldata", ls);
		return "Add";
	}
	@GetMapping("/updateProduct")
	public String updatedata(Model m, @RequestParam("id") Integer id)
	{
		Product ls = imp.updatedata(id);;
		ls.setId(id);
		m.addAttribute("Alldata", ls);
		return "Edit";
	}
	
	
	
}