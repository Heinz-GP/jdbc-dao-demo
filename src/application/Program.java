package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("====TEST 1: Find by Id ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("==== END TEST 1 ====");
		
		System.out.println("====TEST 2: Find by Department====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== END TEST 2 ====");		
	
		
	
	
	}
}
