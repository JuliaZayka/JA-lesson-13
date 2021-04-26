package ua.lviv.service;

import java.util.Map; 

import ua.lviv.Product;
import ua.lviv.shared.AbstractCRUD;

public interface ProductService extends AbstractCRUD<Product>{
 
	public Map<Integer, Product> readAllMap();
}
