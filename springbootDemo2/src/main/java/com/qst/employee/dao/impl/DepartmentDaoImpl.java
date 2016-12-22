package com.qst.employee.dao.impl;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.qst.employee.dao.DepartmentDao;
import com.qst.employee.domain.Department;
/**
 * 部门管理DAO层的实现类
 * @author ymm
 *
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao{

	@Override
	//统计个数
	public int findCount() {
		String hql="select count(*) from Department";
		List<Long> list=(List<Long>) this.getHibernateTemplate().find(hql);//根据HQL查询字符串来返回实例集合
		if(list.size()>0){
		  return list.get(0).intValue();//(1)intValue（）方法意识是说，把Integer类型转化为Int类型;(2)list.get(0)获取索引值	
		}
		return 0;
	}

	@Override
	/**
	 * 分页查询部门
	 */
	public List<Department> findByPage(int begin, int pageSize) {
	    DetachedCriteria criteria=DetachedCriteria.forClass(Department.class);
	    List<Department> list=(List<Department>) this.getHibernateTemplate().findByCriteria(criteria,begin, pageSize);
		return list;
	}

	@Override
	//DAO中保存部门的方法
	public void save(Department department) {
		this.getHibernateTemplate().save(department);
		
	}

	@Override
	//DAO中根据部门的ID查询部门的方法
	public Department findById(Integer did) {
		return this.getHibernateTemplate().get(Department.class, did);
	}

	@Override
	//DAO中修改部门的方法
	public void update(Department department) {
		this.getHibernateTemplate().update(department);
	}

	@Override
	//DAO中删除部门的方法
	public void delete(Department department) {
		this.getHibernateTemplate().delete(department);	
	}
	@Override
	//DAO中查询所有部门
	public List<Department> findAll() {
		return (List<Department>) this.getHibernateTemplate().find("from Department");
	}

}
