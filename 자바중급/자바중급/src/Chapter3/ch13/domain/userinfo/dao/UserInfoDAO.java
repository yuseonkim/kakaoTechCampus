package Chapter3.ch13.domain.userinfo.dao;

import Chapter3.ch13.domain.userinfo.UserInfo;

public interface UserInfoDAO {
    void insertUserInfo(UserInfo userinfo);
    void deleteUserInfo(UserInfo userinfo);
    void updateUserInfo(UserInfo userinfo);
}
