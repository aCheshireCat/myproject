package com.wk.project.db;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther weikai2
 * @Date 2023/9/28
 * @Description
 **/
public class CmsPushContracts {

    String URL = "jdbc:oracle:thin:@10.0.10.122:1521:HCMS";

    String DRIVER = "oracle.jdbc.driver.OracleDriver";
    String USERNAME = "longi_dev";
    String PASSWORD = "longi123";

    @Test
    public void sendContract(){
        try {
            Class.forName(DRIVER);
            String produceName = "CMS_P_SYNC_CT";
            List<String> ctGroupIds = contractCtGroupId();
//            List<String> ctGroupIds = executeSql(getCtGroupIdSQL());
            ctGroupIds.forEach(p-> System.out.println(p));
            ctGroupIds.forEach(p->executeProduces(produceName,p));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void sendPayments(){
        String produceName = "CMS_P_SYNC_PAYMENTPLAN";
//        List<String> ctGroupIds = contractCtGroupId();
        List<String> ctGroupIds = executeSql(getCtGroupIdSQL());
        ctGroupIds.forEach(p->executeProduces(produceName,p));
    }




    @Test
    public void getConnection() {
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("成功连接数据库");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("驱动不存在", e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void executeProduces(String produceName,String ctGroupId){
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             CallableStatement stmt = conn.prepareCall("{call "+ produceName +"(?,'1')}")) {
            // 创建数组参数
//            String[] arrParam = {"value1", "value2", "value3"};
            // 将数组转换为逗号分隔的字符串
//            String arrString = String.join(",", arrParam);
            // 设置存储过程参数
            stmt.setString(1, ctGroupId);
            // 执行存储过程
            stmt.execute();
            System.out.println("存储过程执行成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    private List<String> executeSql(String sql){
        List<String> ctGroupIds = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement();) {
            // 设置sql
            ResultSet rs = stmt.executeQuery(sql);
//            ResultSet rs = stmt.executeQuery("SELECT * FROM ...") ;
//            int rows = stmt.executeUpdate("INSERT INTO ...") ;
//            boolean flag = stmt.execute(String sql) ;
            // 执行存储过程
            while (rs.next()){
//                String name = rs.getString("ct_group_id");
                ctGroupIds.add(rs.getString(1));
            }
            System.out.println("SQL执行成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ctGroupIds;
    }


    private List<String> contractCtGroupId(){
        return Arrays.asList("24EBC65BC9C04A59BCCA73927DB1EFBD","0B0D3ABDBF334BABAC9081575CD06FE8");
    }


    private String getCtGroupIdSQL(){
        String sql = "select t.ct_group_id\n" +
                "  from cms_si_ct_header t\n" +
                " where t.ct_status ='30'  and t.ct_code in ('LGi-L-Sal-2302-0164-C012',\n" +
                "                     'LGi-DG-Sal-2303-2335-C012',\n" +
                "                     'LGi-DG-Sal-2303-2564-C012',\n" +
                "                     'LGi-DG-Sal-2303-1203-C012',\n" +
                "                     'LGi-DG-Sal-2303-0801-B012',\n" +
                "                     'LGi-DG-Sal-2303-2522-C012',\n" +
                "                     'LGi-DG-Sal-2303-1228-C012',\n" +
                "                     'LGi-DG-Sal-2307-2526-C012',\n" +
                "                     'LGi-DG-Sal-2307-1936-C012',\n" +
                "                     'LGi-DG-Sal-2307-1490-C012',\n" +
                "                     'LGi-DG-Sal-2303-0087-C012',\n" +
                "                     'LGi-DG-Sal-2304-1787-C012',\n" +
                "                     'LGi-DG-Sal-2304-1274-C012',\n" +
                "                     'LGi-DG-Sal-2305-0437-C012',\n" +
                "                     'LGi-DG-Sal-2306-1251-C012',\n" +
                "                     'LGi-DG-Sal-2303-2320-C012',\n" +
                "                     'LGi-DG-Sal-2303-1007-C012',\n" +
                "                     'LGi-DG-Sal-2305-1093-C012',\n" +
                "                     'LGi-DG-Sal-2304-0185-C012',\n" +
                "                     'LGi-DG-Sal-2303-2365-C012',\n" +
                "                     'LGi-DG-Sal-2303-2634-C012',\n" +
                "                     'LGi-DG-Sal-2304-1941-C012',\n" +
                "                     'LGi-DG-Sal-2303-1308-C012',\n" +
                "                     'LGi-L-Sal-2302-0678-C012',\n" +
                "                     'LGi-DG-Sal-2306-2543-C002',\n" +
                "                     'LGi-DG-Sal-2307-0408-B012',\n" +
                "                     'LGi-DG-Sal-2306-0624-C012',\n" +
                "                     'LGi-DG-Sal-2307-1076-C012',\n" +
                "                     'LGi-DG-Sal-2307-2308-C012',\n" +
                "                     'LGi-DG-Sal-2304-1932-C012',\n" +
                "                     'LGi-L-Sal-2211-0996-B002',\n" +
                "                     'LGi-L-Sal-2212-1734-A012-230731-01',\n" +
                "                     'LGi-DG-Sal-2307-1865-C371',\n" +
                "                     'LGi-DG-Sal-2305-0374-C012',\n" +
                "                     'LGi-DG-Sal-2303-1708-C012',\n" +
                "                     'LGi-DG-Sal-2304-0135-C012',\n" +
                "                     'LGi-DG-Sal-2304-1147-C002',\n" +
                "                     'LGi-DG-Sal-2304-1508-B012',\n" +
                "                     'LGi-L-Sal-2302-0941-C002',\n" +
                "                     'LGi-L-Sal-2212-1037-B012',\n" +
                "                     'LGi-L-Sal-2302-0127-C012',\n" +
                "                     'LGi-DG-Sal-2307-0396-B012',\n" +
                "                     'LGi-DG-Sal-2304-2073-B012',\n" +
                "                     'LGi-DG-Sal-2307-2060-C012',\n" +
                "                     'LGi-UG-Sal-2306-1971-B012',\n" +
                "                     'LGi-UG-Sal-2303-0623-B012',\n" +
                "                     'LGi-L-Sal-2211-2191-A012',\n" +
                "                     'LGi--Sal-2303-0059-C012',\n" +
                "                     'LGi-UG-Sal-2303-0119-B012',\n" +
                "                     'LGi-L-Sal-2209-2113-A012',\n" +
                "                     'LGi-L-Sal-2211-1501-A012-230216-01',\n" +
                "                     'LGi-UG-Sal-2305-1172-C012-230725-01',\n" +
                "                     'LGi-UG-Sal-2309-0784-C012',\n" +
                "                     'LGi-UG-Sal-2308-2072-C012',\n" +
                "                     'LGi-UG-Sal-2305-1154-B371',\n" +
                "                     'LGi-UG-Sal-2306-1028-A012',\n" +
                "                     'LGi-UG-Sal-2308-2575-C012',\n" +
                "                     'LGi-L-Sal-2208-0803-A368-230302-02',\n" +
                "                     'LGi-L-Sal-2301-1263-C417',\n" +
                "                     'LGi-L-Sal-2212-2341-A417',\n" +
                "                     'LGi-L-Sal-2206-0634-A002',\n" +
                "                     'LGi-L-Sal-2210-0175-A368-230307-01',\n" +
                "                     'LGi-L-Sal-2105-0231-A012',\n" +
                "                     'LGi-L-Sal-2207-1558-C368',\n" +
                "                     'LGi-DG-Sal-2307-2106-C368',\n" +
                "                     'LGi-DG-Sal-2305-1329-A012-230913-01',\n" +
                "                     'LGi-L-Sal-2206-1465-A012',\n" +
                "                     'LGi-L-Sal-2209-0244-C001',\n" +
                "                     'LGi-UG-Sal-2304-0698-C002',\n" +
                "                     'LGi-L-Sal-2301-1867-A018',\n" +
                "                     'LGi-L-Sal-2208-1050-A018',\n" +
                "                     'LGi-L-Sal-2102-0499-A018',\n" +
                "                     'LGi-L-Sal-2011-0184-A018',\n" +
                "                     'LGi-UG-Sal-2306-2012-A012',\n" +
                "                     'LGi-L-Sal-2110-1401-B012-230710-01',\n" +
                "                     'LGi-SU-Ino-2307-0971-N012',\n" +
                "                     'LGi-Z-Ino-2210-0137-A391',\n" +
                "                     'LGi-Z-Ino-2212-0014-N391',\n" +
                "                     'LGi-DG-Sal-2306-1265-C012',\n" +
                "                     'LGi-SU-Ino-2306-2697-N012',\n" +
                "                     'LGi-SU-Ino-2308-2857-N012',\n" +
                "                     'LGi-SU-Ino-2309-0266-N012',\n" +
                "                     'LGi-DG-Sal-2309-1938-C332',\n" +
                "                     'LGi-DG-Gif-2303-2776-B368',\n" +
                "                     'LGi-L-Sal-2211-1332-A012-230602-03',\n" +
                "                     'LGi-DG-Sal-2308-0202-C368',\n" +
                "                     'LGi-DG-Sal-2306-2256-C368')\n" +
                "\n";
        System.out.println("sql:"+"\n" + sql);
        return sql;
    }
}
