package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("====TEST 1: Find by Id ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
	
		
	
	
	}
}
