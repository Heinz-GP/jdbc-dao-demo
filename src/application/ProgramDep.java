package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entitites.Department;

public class ProgramDep {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("====TEST 1: Find by Id ===");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		System.out.println("==== END TEST 1 ====");

		
		System.out.println("====TEST 2: Find by All ===");
		
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== END TEST 2 ====");
	}

}
