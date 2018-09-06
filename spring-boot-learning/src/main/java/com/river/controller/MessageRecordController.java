package com.river.controller;


import com.river.model.MessageRecord;
import com.river.service.MessageRecordService;
import net.karp.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messagerecord")
public class MessageRecordController {

    @Autowired
    MessageRecordService messageRecordService;
    Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value = "getmessage", method = RequestMethod.GET)
    public Result getMessage(@RequestParam(value = "id") String id) {
        logger.info("请求参数为："+id);
        MessageRecord messageRecord = messageRecordService.selectByPrimaryKey(id);
       logger.info("执行成功");
        return Result.success("messageRecord", messageRecord);
    }
}
