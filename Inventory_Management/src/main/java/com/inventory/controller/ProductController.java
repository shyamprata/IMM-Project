package com.inventory.controller;

import com.inventory.entity.Contact;
import com.inventory.entity.Product;
import com.inventory.repo.ProductRepo;
import com.inventory.service.ContactService;
import com.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/url")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ContactService contactService;
	

// not response this method to send the data

	@PostMapping("/addProduct") 
	public String addProduct(@ModelAttribute("product") Product product) {
		 
		productService.addProduct(product); // Assuming you have productService bean injected

		return "addProduct";

	}

	// get product
	@GetMapping("/addProduct")
	public String getAddProductForm(@ModelAttribute ProductRepo productRepo) {
		return "addProduct";
	}

	// get main page
	@GetMapping("/main")
	public String frontPage(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "main";
	}

	// get all products
	@GetMapping("/products")
	public String productList(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}

	// get index page
	@GetMapping("/index")
	public String getIndex(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "index";
	}

// get signup form
	@GetMapping("/form")
	public String getEnquiryform(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "form";
	}

//get contact form
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("contacts", contactService.getAllContacts());
		return "contact";
	}

	// post data to form
	@PostMapping("/contact")
	public String createContact(@ModelAttribute Contact contact) {
		contactService.getAllContacts();
		System.out.println(contact);
		return "contactData";
	}

	// get seller page
	@GetMapping("/seller")
	public String getSeller() {
		return "seller";
	}

	// get seller login panel
	@GetMapping("/sellerlogin")
	public String loginPage() {
		return "sellerlogin";
	}

// delete product
	@GetMapping("/deleteProduct")
	public String getdeleteProduct() {
		return "deleteProduct";
	}

	// get product filter
	@GetMapping("/filter")
	public String getFilter() {
		return "filter";
	}

}