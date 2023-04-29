package Chapter3.ch13.userinfo.web;

import Chapter3.ch13.domain.userinfo.UserInfo;
import Chapter3.ch13.domain.userinfo.dao.UserInfoDAO;
import Chapter3.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import Chapter3.ch13.domain.userinfo.dao.oracle.UserInfoOracleSqlDAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/yuling/Desktop/공부/카테캠/자바중급/자바중급/src/Chapter3/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("김유선");
        userInfo.setUserId("aaa");
        userInfo.setPassword("bbb");
        UserInfoDAO userInfoDAO = null;

        if (dbType.equals("ORACLE")) {
            userInfoDAO = new UserInfoOracleSqlDAO();
        } else if (dbType.equals("MYSQL")) {
            userInfoDAO = new UserInfoMySqlDao();
        } else {
            System.out.println("db error");
            return;
        }

        userInfoDAO.insertUserInfo(userInfo);
        userInfoDAO.updateUserInfo(userInfo);
        userInfoDAO.deleteUserInfo(userInfo);
    }
}
