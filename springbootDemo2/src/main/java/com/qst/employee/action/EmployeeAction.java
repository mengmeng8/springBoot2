package com.qst.employee.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qst.employee.domain.Department;
import com.qst.employee.domain.Employee;
import com.qst.employee.domain.PageBean;
import com.qst.employee.service.DepartmentService;
import com.qst.employee.service.EmployeeService;

/**
 * 
 * 员工管理的Action类
 *
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	//模型驱动使用对象
	private Employee employee=new Employee();
	@Override
	public Employee getModel() {
		return employee;
	}
	//注入业务层的类;
	private EmployeeService employeeService;
	private DepartmentService departmentService;
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	//当前的页数
	private Integer currPage=1;
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	/**
     * 登录执行的方法:
     * @return
     */
	public String login(){
	  System.out.println("login执行了");
	  //调用业务层类
	  Employee existEmployee=employeeService.login(employee);
	  if(existEmployee ==null){
		  //登录失败
		  this.addActionError("用户名或密码错误！");
		  return INPUT;
	  }else{
		  //登录成功
		  ActionContext.getContext().getSession().put("existEmployee", existEmployee);
		  return SUCCESS;
	  }
  }
	/**
     * 分页查询员工执行的方法:
     * @return
     */
    public String findAll(){
    	PageBean<Employee> pageBean=employeeService.findByPage(currPage);
    	//装到值栈中去
    	ActionContext.getContext().getValueStack().push(pageBean);
    	return "findAll";
    }
    /**
     * 跳转到添加员工页面的执行方法
     */
     public String saveUI(){
    	 List<Department> list=departmentService.findAll();
    	ActionContext.getContext().getValueStack().set("list", list);
    	 return "saveUI";
     }
     /**
      * 保存员工的执行方法
      */
     public  String save(){
    	 employeeService.save(employee);
    	 return "saveSuccess";
     }
     /**
      * 编辑员工的执行的方法
      * 
      */
     public String edit(){
    	//根据ID查询员工
    	 employee=employeeService.findById(employee.getEid());
    	//查询所有部门
    	 List<Department> list=departmentService.findAll();
         ActionContext.getContext().getValueStack().set("list",list);
         return "editSuccess";
     }
     
     /**
      * 修改员工的执行的方法
      */
     public String update(){
    	employeeService.update(employee); 
    	return "updateSuccess";
     }
     /**
      * 删除员工的执行的方法
      */
     public String delete(){
    	employee=employeeService.findById(employee.getEid()); 
        employeeService.delete(employee);
        return "deleteSuccess";
     }
}
