package com.hr.sm_p.dao;

import com.hr.sm_p.entity.VisitorInfo;
import java.util.List;

public interface VisitorInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitorInfo record);

    VisitorInfo selectByPrimaryKey(Integer id);

    List<VisitorInfo> selectAll();

    int updateByPrimaryKey(VisitorInfo record);
}