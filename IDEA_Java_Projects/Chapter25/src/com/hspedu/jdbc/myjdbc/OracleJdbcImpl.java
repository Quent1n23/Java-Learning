package com.hspedu.jdbc.myjdbc;

/**
 * @author 丁聪
 * @version 1.0
 */
public class OracleJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到 oracle 的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 oracle 增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 oracle 的连接");
    }
}
