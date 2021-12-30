package com.example.product.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.product.Repo.ProductRepo;
import com.example.product.enitity.Product;
@Component
@Service
public class ProductServicelmp implements ProductService {
	
	@Autowired
	private ProductRepo repo;

	@Override
	public List<Product> insertProduct(Product pro) 
	{
		repo.save(pro);
		List<Product> list = repo.findAll();	
		return list;
	}

	public List<Product> deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		List<Product> list = repo.findAll();
		return list;
	}

	public Product updatedata(Integer id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}


	





	
	

	
		
	}
	