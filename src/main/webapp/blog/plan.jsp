<%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2017/2/13
  Time: 上午11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Study Plan</title>
    <link rel="stylesheet" type="text/css" href="../css/stylePlan.css" />
</head>
<body>
    <jsp:include page="../com/header.jsp"></jsp:include>
    <nav class="navbar navbar-default" role="navigation" style="background-color: transparent;border-color: transparent;">
        <div class="container">
            <div>
                <ul class="nav navbar-nav">
                    <li ><a href="../bloglist">博文精粹</a></li>
                    <%--<li><a href="#">碎言碎语</a></li>
                    <li><a href="#">个人日记</a></li>--%>
                    <li><a href="../blog/photos.jsp">相册展示</a></li>
                    <li class="active"><a href="#">学无止境</a></li>
                    <li><a href="#">留言板</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="main">
        <div class="container">
            <div class="row col-xs-10">
                <div class="panel01" style="background-color: transparent;">
                    <div class="tab-content">
                        <ol class="breadcrumb" style="font-size:17px; background-color: transparent;border-color: transparent;">
                            <li>
                                <a href="../bloglist">首页</a></li>
                            <li>
                                <a href="">学无止境</a></li>
                        </ol>
                    </div>
                </div>
                <div class="panel01" >
                    <div class="panel01-body">

                        <div class="myplan">
                            <h2>Java工程师学习路线 </h2>

                            <h4>1. 基础</h4>

                            <ul>
                                <li>主要看《java核心技术：卷一》的重点章节</li>
                                <li>掌握java常用技术，io、多线程、反射、常用集合框架</li>
                                <li>数据结构看一遍，作用至少要清楚。如hash冲突解决办法，常用排序算法的应用场景和空间/时间复杂度等</li>
                                <li>数据库，能看懂ER关系，熟悉数据库三大范式，熟练常用SQL语句</li>
                                <li>可以掌握一点java网络编程方面的知识，对tcp/ip有初步的认识</li>
                                <li>学习servlet/jsp，至少能写简单的图书管理系统，熟悉核心api</li>
                                <li>了解前后端交互方式，ajax、json/xml至少知道，会使用jquery，html，css，js最好</li>
                            </ul>

                            <h4>2. 提高</h4>

                            <ul>
                                <li>学习后端框架，SpringMVC/Struts2、Mybatis、Spring，熟悉MVC模式，知道三层架构及每一层之间的关系</li>
                                <li>会用chrome/firefox浏览器分析http请求，解决、定位问题。知道常用http状态码，了解TCP/IP，知道一次http请求发生了哪些事情</li>
                                <li>学习设计模式，23种设计模式都需要了解一点，熟悉常用的如：单例，工厂，模板，适配器，代理，责任链，构造器，装饰器，迭代器，策略，命令，观察者，外观，享元。理解他们的好处，可以找找在其他框架哪些用了这些设计模式。</li>
                                <li>可以适当的看一些源码，Spring的源码可以着重的看一下。tomcat可以从源码的角度看看tomcat的整体设计方案，一次请求tomcat如何处理，servlet在tomcat中的加载，编译过程。tomcat自定义的ClassLoader有什么作用。</li>
                                <li>会设计数据库，多对多，一对多，迭代，会写复杂的SQL，了解SQL调优，会写存储过程，触发器。熟悉索引的使用，了解视图。去了解一些常用NOSQL，比如Redis/mongodb</li>
                                <li>学习Linux，熟悉基本命令，学习一种脚本语言(shell/python)。会在linux下写脚本开发</li>
                            </ul>

                            <h4>3. 深入</h4>

                            <ul>
                                <li>算法，可以看看编程之美，算法导论。学习一些算法相关的知识</li>
                                <li>深入java：理解JVM,JMM，Classloader，GC算法，GC收集器。学会定位OOM问题所在。</li>
                                <li>源码分析，常用集合类如：Hashmap，Arraylist,linkedList，HashSet，ConcurrentHashmap等的源码分析，要非常熟悉java集合框架设计。最好能够分析一种框架源码，比如Spring</li>
                                <li>深入数据库，理解至少两种数据库引擎（Inndb/Mysiam）的差异性,熟悉索引的内部数据结构，熟悉常见的索引方式（Btree，hash），和索引类型（unique，full text,normal），会使用explain分析SQL语句，会优化SQL语句，熟悉一种NOSQL，知道内部实现原理（内部数据结构，在算法优化，内部机制）,掌握分布式数据库的知识，分表，分库，分区，分布式事务等，可以学习一个数据库中间件（TDDL/COBAR）</li>
                                <li>架构设计，看看大型高流量/高并发的网站设计（CDN，异步，前端优化），了解缓存（分布式memcached/常用本地缓存），搜索引擎（lucene/solr/elasticSearch），分布式（负载均衡/分布式数据库/分布式应用集群）,消息队列（ActiveMQ/Rabbitmq）在大型网站中的作用</li>
                                <li>还有一些其他的知识，如RPC框架，分布式服务架构，SOA,REST架构等等</li>
                                <li>可以接触一些云计算方面的知识，如Hadoop/Storm/Spark等，要是再能接触一点机器学习就更棒啦(反正我是没有，听着就吓人，跑个kmeans算法都要弄死人</li>
                            </ul>

                            <p>￼</p>

                            <h4>推荐书籍</h4>

                            <ul>
                                <li>《深入分析Java Web技术内幕》</li>
                                <li>《java编程思想》</li>
                                <li>《java核心技术：卷一卷二》</li>
                                <li>《java并发编程实战》</li>
                                <li>《编程之美》,《剑指offer》这两本本书不用说，刷offer必备</li>
                                <li>《深入理解jvm虚拟机》</li>
                                <li>《Spring技术内幕》</li>
                                <li>《大型网站技术架构》</li>
                                <li>《java设计模式》这本书一般般，主要看看大牛的博客</li>
                                <li>《java网络编程》一般般，讲得不是很深，可以对io和网络有进一步的认识</li>
                                <li>《java分布式应用：基础与实践》@毕玄写的书，大牛写的书都要膜拜</li>
                                <li>《java数据结构与算法》外国人写的书，一般，不评价！用java实现了80%的数据结构</li>
                                <li>《how tomcat works》在讲解tomcat的架构和设计模式方面讲得非常不错，虽然和现在的版本上有一些差别，但是影响不大</li>
                                <li>《tcp/ip详解，卷一：协议》深入理解tcp。对tcp各个方面都有更加深刻的认识。</li>
                                <li>《算法导论》</li>
                            </ul>

                            <h4>大牛博客</h4>

                            <ul>
                                <li><a href="http://blog.csdn.net/v_JULY_v">结构之法，算法之道,july大神的博客</a></li>
                                <li><a href="http://blog.csdn.net/xieyuooo">xieyuooo的专栏，《java特种兵作者》</a></li>
                                <li><a href="http://blog.csdn.net/ns_code?viewmode=list">@兰亭风雨人任平生|兰亭风雨的专栏, 目前人在腾讯，博客都写得很好，很深入！受益匪浅</a></li>
                                <li><a href="http://blog.csdn.net/yangbutao?viewmode=list">分布式架构、大数据、机器学习、搜索、推荐、广告</a></li>
                                <li><a href="http://www.liaoxuefeng.com">廖雪峰的官方网站,python学习</a></li>
                                <li><a href="%E7%A9%BA%E8%99%9A%E6%B5%AA%E5%AD%90%E5%BF%83%E7%9A%84%E7%81%B5%E9%AD%82,java%E5%AE%89%E5%85%A8%EF%BC%8Calibaba%E7%9A%84%E5%AE%89%E5%85%A8%E4%B8%93%E5%AE%B6">空虚浪子心的灵魂,java安全，alibaba的安全专家</a></li>
                                <li><a href="http://www.apelearn.com/study_v2/index.html">跟阿铭学Linux</a></li>
                                <li><a href="http://mindhacks.cn">刘未鹏 | MIND HACKS，这个大牛简直不要太叼</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </div>
</body>
</html>
