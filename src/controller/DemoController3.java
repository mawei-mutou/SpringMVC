package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/5/25
 * time        : 16:10
 * description :使用注解就不用继承了，参考对比不用注解的方式
 *      1、使用@Controller注解将这个类交给Spring去管理
 *      2、@RequestMapping("demo") --->当请求的控制器的逻辑名为 demo时，就执行demo2方法
 *          public String demo() {
 *          System.out.println("执行了demo");
 *         return "main.jsp"; ---> 这个返回结构式返回给 ViewedResolver,让它去执行跳转。
 *       }
 */
@Controller
public class DemoController3 {
    @RequestMapping("demo1")
    public String demo1() {
        System.out.println("执行了demo1");
        return "jsp.jsp";
    }
}
