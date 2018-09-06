package com.river.wx.dao;

import com.river.test.MessageRecord;
import com.river.test.MessageRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int countByExample(MessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int deleteByExample(MessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int insert(MessageRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int insertSelective(MessageRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    List<MessageRecord> selectByExampleWithBLOBs(MessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    List<MessageRecord> selectByExample(MessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    MessageRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int updateByExampleSelective(@Param("record") MessageRecord record, @Param("example") MessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") MessageRecord record, @Param("example") MessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int updateByExample(@Param("record") MessageRecord record, @Param("example") MessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int updateByPrimaryKeySelective(MessageRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(MessageRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_record
     *
     * @mbggenerated Mon Sep 03 15:55:08 CST 2018
     */
    int updateByPrimaryKey(MessageRecord record);
}