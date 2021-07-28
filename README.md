# AndroidSignAuthWithNDK

1.用签名文件打包AndroidSignAuthWithNDK项目

2.运行打包后的Apk并查看获取的签名信息

3.用签名信息替换../app/src/main/cpp/gifprompt.cpp中sign_sha1的值

4.rebuild项目

5.从../app/build/intermediates/cmake/release/obj中提取自己需要的架构的so文件
