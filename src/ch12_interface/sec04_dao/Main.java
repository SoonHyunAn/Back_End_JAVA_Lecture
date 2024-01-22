package ch12_interface.sec04_dao;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		//MySQL DB를 사용하려면
		CustomerDao customerDao = new CustomerDaoMySQLImpl();
		Customer customer = customerDao.getCustomer(34);
		List<Customer> list = customerDao.getCustomerList();
		customerDao.insertCustomer(customer);
		customerDao.updateCustomer(customer);
		customerDao.deleteCustomer(34);
		
		// Oracle DB를 사용하려면
		customerDao = new CustomerDaoOracleImpl();
		customer = customerDao.getCustomer(34);
		list = customerDao.getCustomerList();
		customerDao.insertCustomer(customer);
		customerDao.updateCustomer(customer);
		customerDao.deleteCustomer(34);
		
		// SpringBoot에서 사용하려면
//		@Autowired private CusromerDao customerDao;
		// 프로그램이 실행될 때 SpringBoot에서 CusotmerDao 구현 객체를 주입시켜 줌
		
	}
}
