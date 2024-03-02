package hspedu.mhl.service;

import hspedu.mhl.dao.EmployeeDAO;
import hspedu.mhl.domain.Employee;

/**
 * @author 丁聪
 * @version 1.0
 * 该类完成对employee表的各种操作, 通过调用EmployeeDAO对象完成
 */
public class EmployeeService {

    //定义一个EmployeeDAO属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    // 方法,根据empId 和 pwd 返回一个employee对象
    public Employee getEmployeeByIdAndPwd(String empId, String pwd) {

        return employeeDAO.querySingle("select * from employee where empId=? AND pwd=MD5(?)",
                Employee.class, empId, pwd);

    }

}
