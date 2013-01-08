Spiderman - Java开源Web数据抽取工具
==========================================
    Spiderman 是一个Java开源Web数据抽取工具。它能够收集指定的Web页面并从这些页面中提取有用的数据。
    Spiderman主要是运用了像XPath,正则表达式等这些技术来实数据抽取。
    
它包含了两部分（二者缺一不可）：
* [内核https://github.com/laiweiwei/spiderman](https://github.com/laiweiwei/spiderman) 
* [插件https://github.com/laiweiwei/spiderman-plugin](https://github.com/laiweiwei/spiderman-plugin)

主要特点
----------------------
    * 微内核+插件式架构、灵活、可扩展性强
    * 无需编写程序代码即可完成数据抽取
    * 多线程保证性能

怎么使用？
----------
* 首先，确定好你的目标网站以及目标网页（即某一类你想要获取数据的网页，例如网易新闻的新闻页面）
* 然后，打开目标页面，分析页面的HTML结构，得到你想要数据的XPath，具体XPath怎么获取请看下文。
* 最后，在一个xml配置文件里填写好参数，运行Spiderman吧！

这里有很多例子提供参考
------------------------
* [spiderman-sample](https://github.com/laiweiwei/spiderman-sample)

XPath获取技巧？
--------------
这里只说下Chrome浏览器，其他浏览器估计也差不多，只不过插件不同而已。
* 首先，下载xpathonclick插件，[猛击这里](https://chrome.google.com/webstore/search/xpathonclick)
* 安装完毕之后，打开Chrome浏览器，可以看到右上角有个“X Path” 图标。
* 在浏览器打开你的目标网页，然后点击右上角的那个图片，然后点击网标上你想要获取XPath的地方，例如某个标题
* 这时候按住F12打开JS控制台，拖到底部，可以看到一串XPath内容
* 记住，这个内容不是绝对OK的，你可能还需要做些修改，因此，你最好还是去学习下XPath语法
* 学习XPath语法的地方：[猛击这里](http://www.w3school.com.cn/xpath/index.asp)

更多内容待增加......
----
