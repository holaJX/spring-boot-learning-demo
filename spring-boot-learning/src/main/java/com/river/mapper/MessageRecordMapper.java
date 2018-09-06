package com.river.mapper;


import com.river.model.MessageRecord;

public interface MessageRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(MessageRecord record);

    int insertSelective(MessageRecord record);

    MessageRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MessageRecord record);

    int updateByPrimaryKeyWithBLOBs(MessageRecord record);

    int updateByPrimaryKey(MessageRecord record);
}