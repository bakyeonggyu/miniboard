package mn.brd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mn.brd.beans.UserBean;
import mn.brd.mapper.UserMapper;

@Repository
public class UserDao {

	@Autowired
	private UserMapper userMapper;
	
	public String checkUserIdExist(String user_id) {
		return userMapper.checkUserIdExist(user_id);
	}
	
	public void addUserInfo(UserBean joinUserBean) {
		userMapper.addUserInfo(joinUserBean);
	}
	
	public UserBean getLoginUserInfo(UserBean tempLoginUserBean) {
		return userMapper.getLoginUserInfo(tempLoginUserBean);
	}
	
	public UserBean getmodifyUserInfo(int user_idx) {
		return userMapper.getmodifyUserInfo(user_idx);
	}
	
	public void modifyUserInfo(UserBean modifyUserBean) {
		userMapper.modifyUserInfo(modifyUserBean);
	}
	
	
	
	
	
	
	
}
