package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entitites.Department;

public class ProgramDep {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("====TEST 1: Find by Id ===");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		System.out.println();

		
		System.out.println("====TEST 2: Find All ===");
		
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		
		
		System.out.println("====TEST 3: Insert ===");
		System.out.print("Name of the department: ");
		String name = sc.nextLine();
		dep.setName(name);
		depDao.insert(dep);	
		System.out.println(dep);
		System.out.println();
		
		
		
		System.out.println("====TEST 4: Update ===");
		System.out.print("Department name update: ");
		String depNewName = sc.nextLine();
		System.out.print("Department id which name gonna be update: ");
		int id = sc.nextInt();
		dep = depDao.findById(id);
		dep.setName(depNewName);
		depDao.update(dep);
		System.out.println(dep);
		
		
		System.out.println("====TEST 4: Delete ===");
		System.out.print("Department for delete: ");
		int id2 = sc.nextInt();
		depDao.deleteById(id2);
		System.out.println("Department Delete!!!");
		
		
		
		sc.close();
	}

}
