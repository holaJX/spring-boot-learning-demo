package com.river.service.impl;


import com.river.mapper.MessageRecordMapper;
import com.river.model.MessageRecord;
import com.river.service.MessageRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MessageRecordServiceImp implements MessageRecordService {
    @Autowired
    MessageRecordMapper messageRecordMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return messageRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MessageRecord record) {
        return messageRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(MessageRecord record) {
        return messageRecordMapper.insertSelective(record);
    }

    @Override
    public MessageRecord selectByPrimaryKey(String id) {
        return messageRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MessageRecord record) {
        return messageRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(MessageRecord record) {
        return messageRecordMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(MessageRecord record) {
        return messageRecordMapper.updateByPrimaryKey(record);
    }
}
