package com.aliyun.com.aliyunoss.web;

import com.aliyun.com.aliyunoss.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * @ClassName : FileController
 * @description :
 * @Author : wangkaitong
 * @Date : 2019/9/30
 * @Version : 1.0
 * @Since : 1.0
 * @Copyright : 四川去哪游科技有限公司
 */
@Api("上传文件控制器")
@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;


    @ApiOperation("上传文件")
    @PostMapping("/upload")
    public String upload(@ApiParam("文件") MultipartFile file){
        return  fileService.upload(file);
    }

    @ApiOperation("批量上传文件")
    @PostMapping("/uploads")
    public List<String> uploads(@ApiParam("文件") MultipartFile[]  files){
        return  fileService.uploads(files);
    }
}
