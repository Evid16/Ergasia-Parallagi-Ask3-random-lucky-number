package gr.texnikes.rest.texnikes;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class ProductService implements IProductService{
	
	@Override
	public List<Product> findAll(){
		
		//creating an object of ArrayList
		ArrayList<Product> products = new ArrayList<Product>();
		
		//adding products to the List
		//we generate a random number from 0 to 100
		Random number = new Random();
		products.add(new Product("Your Lucky Number is ", number.nextInt(101)));
		
		//returns a list of product
		return products;
	}
	
}
