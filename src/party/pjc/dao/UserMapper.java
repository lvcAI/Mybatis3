package party.pjc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import party.pjc.model.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(Integer id);
    @Insert(" INSERT INTO user ( username,password) VALUES( #{username,jdbcType=VARCHAR},#{password,jdbcType=VARCHAR} )")
    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
    @Results(id = "userResult", value = {
    		  @Result(property = "id", column = "id", id = true),
    		  @Result(property = "username", column = "username"),
    		  @Result(property = "password", column = "password")})
    @Select(" select * from user order by id desc ")
    List<User> findAll();
}