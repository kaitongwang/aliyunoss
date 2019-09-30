# aliyunoss
阿里云 oss  文件上传
1 引jar：
         
         <dependency>
            <groupId>com.aliyun.oss</groupId>
            <artifactId>aliyun-sdk-oss</artifactId>
            <version>3.5.0</version>
        </dependency>
2 创建客户端
 
 
   OSS build = new OSSClientBuilder().build(configValue.endPoint, configValue.accessKeyId, configValue.accessKeySecret);
   
   
3 文件上传并且获取访问地址

                String name = file.getOriginalFilename();
                log.info("上传文件的名称为：{}", name);
                build.putObject(configValue.bucketName, name, file.getInputStream());
                stringBuffer = new StringBuffer("https://wkt-wtt.oss-cn-hangzhou.aliyuncs.com/");
                stringBuffer.append(name);
                strings.add(stringBuffer.toString());