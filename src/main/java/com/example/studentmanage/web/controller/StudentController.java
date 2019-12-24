package com.example.studentmanage.web.controller;

import com.example.studentmanage.bean.Student;
import com.example.studentmanage.util.Message;
import com.example.studentmanage.util.MessageUtil;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")                             //说明描述
public class StudentController {
    @PostMapping("/add")
    @ApiOperation(value = "添加学生")
    public Message add(Student student){
        return MessageUtil.success("添加学生信息成功！");
    }

    @GetMapping("/delete")
    @ApiOperation(value = "删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuId",value = "学生ID",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value = "学生姓名",paramType = "query",dataType = "string")
    })
    public Message delete(int stuId,String name){
        return MessageUtil.success("学生删除成功");
    }

    @PostMapping("/edit")
    @ApiOperation(value = "修改学生信息")
    public Message<String> edit(){
        return MessageUtil.success("修改信息成功");
    }

    @GetMapping("/query")
    @ApiOperation(value = "查询学生信息")                 //说明描述
    public Message<String> query(){
        return MessageUtil.success("查询信息成功");
    }
}
