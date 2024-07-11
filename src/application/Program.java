package application;

import java.util.Date;
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
	
		System.out.println("====TEST 3: Find All====");
		list = sellerDao.findAll();	
		for(Seller obj : list) {
			System.out.println(obj);
		}	
		System.out.println("==== END TEST 3 ====");
		
		System.out.println("====TEST 4: Seller Insert====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		System.out.println("==== END TEST 4 ====");
	}
}
