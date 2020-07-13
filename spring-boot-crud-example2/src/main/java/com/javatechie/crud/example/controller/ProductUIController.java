package com.javatechie.crud.example.controller;

import java.util.List;
import java.util.Optional;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.exception.RecordNotFoundException;
import com.javatechie.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ui")
public class ProductUIController
{
	@Autowired
	ProductService service;

	@RequestMapping
	public String getAllProducts(Model model)
	{
		List<Product> list = service.getProducts();

		model.addAttribute("product", list);
		return "list-products";
	}

	@RequestMapping(path = {"/edit", "/edit/{id}"})
	public String editProductById(Model model, @PathVariable("id") Optional<Integer> id)
							throws RecordNotFoundException
	{
		if (id.isPresent()) {
			Product entity = service.getProductById(id.get());
			model.addAttribute("product", entity);
		} else {
			model.addAttribute("product", new ProductService());
		}
		return "add-edit-product";
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String deleteProductById(Model model, @PathVariable("id") Integer id)
							throws RecordNotFoundException 
	{
		service.getProductById(id);
		return "redirect:/";
	}

	@RequestMapping(path = "/createProduct", method = RequestMethod.POST)
	public String createOrUpdateProduct(Product product)
	{
		service.saveProduct(product);
		return "redirect:/";
	}
}