package party.pjc.dao;

import party.pjc.model.NewsInfo;

public interface NewsInfoMapper {
	
    int deleteByPrimaryKey(Integer nid);

    int insert(NewsInfo newsInfo);

    int insertSelective(NewsInfo newsInfo);

    NewsInfo selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(NewsInfo newsInfo);

    int updateByPrimaryKey(NewsInfo newsInfo);
}