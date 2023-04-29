package Chapter3.ch13.domain.userinfo.dao.oracle;

import Chapter3.ch13.domain.userinfo.UserInfo;
import Chapter3.ch13.domain.userinfo.dao.UserInfoDAO;

public class UserInfoOracleSqlDAO implements UserInfoDAO {

    @Override
    public void insertUserInfo(UserInfo userinfo) {
        System.out.println("insert into Oracle DB usersID = " +userinfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userinfo) {
        System.out.println("Delete into Oracle DB usersID = " +userinfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userinfo) {
        System.out.println("Update into Oracle DB usersID = " +userinfo.getUserId());
    }
}
