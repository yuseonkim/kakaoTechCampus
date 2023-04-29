package Chapter3.ch13.domain.userinfo.dao.mysql;

import Chapter3.ch13.domain.userinfo.UserInfo;
import Chapter3.ch13.domain.userinfo.dao.UserInfoDAO;

public class UserInfoMySqlDao implements UserInfoDAO {


    @Override
    public void insertUserInfo(UserInfo userinfo) {
        System.out.println("insert into MYSQL DB usersID = " +userinfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userinfo) {
        System.out.println("Delete into MYSQL DB usersID = " +userinfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userinfo) {
        System.out.println("Update into MYSQL DB usersID = " +userinfo.getUserId());
    }
}
