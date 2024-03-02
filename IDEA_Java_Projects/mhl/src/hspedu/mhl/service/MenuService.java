package hspedu.mhl.service;

import hspedu.mhl.dao.MenuDAO;
import hspedu.mhl.domain.Menu;

import java.util.List;

/**
 * @author 丁聪
 * @version 1.0
 * 完成对menu表的各种操作 (通过调用MenuDAO)
 */
public class MenuService {
    //定义MenuDAO属性
    private MenuDAO menuDAO = new MenuDAO();

    //返回所有的菜品
    public List<Menu> list() {
        return menuDAO.queryMulti("select * from menu", Menu.class);
    }

    //根据 id,返回menu对象
    public Menu getMenuById(int id) {
        return menuDAO.querySingle("select * from menu where id = ?", Menu.class, id);
    }
}
