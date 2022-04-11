package mapper;
/*
@author JiaLess
@date 2021/11/28 16:13
*/

import pojo.User;
import java.util.List;

public interface UserMapper {

    int insertUser();

    /**
     * 查询
     */
    User getUserById();

    void  deleteUser();

    List<User> getAllUser();

}
