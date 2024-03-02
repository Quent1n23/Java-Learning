package hspedu.mhl.service;

import hspedu.mhl.dao.BasicDAO;
import hspedu.mhl.dao.BillDAO;
import hspedu.mhl.dao.MultiTableDAO;
import hspedu.mhl.domain.Bill;
import hspedu.mhl.domain.MultiTableBean;

import java.util.List;
import java.util.UUID;

/**
 * @author 丁聪
 * @version 1.0
 * 处理和账单相关的业务逻辑
 */
public class BillService {
    //定义BillDAO
    private BillDAO billDAO = new BillDAO();
    //定义MenuService属性
    private MenuService menuService = new MenuService();
    //定义DiningTableServer属性
    private DiningTableService diningTableService = new DiningTableService();
    //
    private MultiTableDAO multiTableDAO = new MultiTableDAO();


    //点餐
    //1. 生成账单
    //2. 更新对应餐桌的状态
    //3. 成功返回true
    public boolean orderMenu(int menuId, int nums, int diningTableId) {
        //生成一个账单号,UUID
        String billID = UUID.randomUUID().toString();

        //将账单生成到bill表, 直接计算账单金额
        int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billID, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);
        if (update <= 0) {
            return false;
        }
        //更新餐桌状态
        return diningTableService.updateDiningTableState(diningTableId, "就餐中");
    }

    //返回所有的账单,提供给View调用
    public List<Bill> list() {
        return billDAO.queryMulti("select * from bill", Bill.class);
    }
    //返回所有的账单,带菜品名,价格,提供给View调用
    public List<MultiTableBean> list2() {
        return multiTableDAO.queryMulti("SELECT bill.*,NAME,price " +
                "FROM bill,menu " +
                "WHERE bill.menuId = menu.id", MultiTableBean.class);
    }

    //查看某个餐桌是否有未结账的账单
    public boolean hasPayBillByDiningTableId(int diningTableId) {
        Bill bill =
                billDAO.querySingle("SELECT * FROM bill WHERE diningTableId=? AND state = '未结账' LIMIT 0, 1",
                        Bill.class, diningTableId);
        return bill != null;
    }

    //完成结账(如果餐桌存在,并且该餐桌有未结账的账单)
    public boolean payBill(int diningTableId, String payMode) {
        //如果这里使用事务,需要使用 ThreadLocal来解决, 框架中 mybatis 提供了事务支持
        //1. 修改bill表
        int update = billDAO.update("update bill set state = ? where diningTableId=? and state = '未结账'",
                payMode, diningTableId);
        if(update <= 0){//更新失败
            return false;
        }
        //2. 修改diningTable表
        //注意: 不要在这里操作,而应该调用DiningTableService方法
        if(!(diningTableService.updateDiningTableToFree(diningTableId,"空"))){
            return false;
        }
        return true;
    }
}
