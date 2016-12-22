package com.qst.employee.dao.impl;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.qst.employee.dao.EmployeeDao;
import com.qst.employee.domain.Employee;
/**
 * 员工管理的DAO的实现类
 * @author ymm
 *
 */
public class EmployeeDaoImpl extends HibernateDaoSupport  implements EmployeeDao{

	@Override
	/**
	 * DAO中根据用户名和密码查询用户的方法
	 */
	public Employee findByUsernameandPassword(Employee employee) {
		String hql="from Employee where username = ? and password = ?";
		List<Employee> list=(List<Employee>) this.getHibernateTemplate().find(hql, employee.getUsername(),employee.getPassword());
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public int findCount() {
		String hql="select count(*) from Employee";
		List<Long> list=(List<Long>) this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();			
		}
		return 0;
	}

	@Override
	//分页查询
	public List<Employee> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Employee.class);
		List<Employee> list=(List<Employee>) this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	//DAO中保存员工的方法
	public void save(Employee employee) {
		this.getHibernateTemplate().save(employee);
		
	}

	@Override
	//DAO中根据员工ID查询员工
	public Employee findById(Integer eid) {
		
		return this.getHibernateTemplate().get(Employee.class, eid);
	}

	@Override
	//DAO中修改员工的方法
	public void update(Employee employee) {
	   this.getHibernateTemplate().update(employee);
	}

	@Override
	//DAO中删除员工的方法
	public void delete(Employee employee) {
		this.getHibernateTemplate().delete(employee);
		
	}

}
