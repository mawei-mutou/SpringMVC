package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.Demo;
import pojo.Demo02;
import pojo.People;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
 *
 *       3、a、可以直接在控制器中获取浏览器传来的参数，，类型都不用转换，只需要参数名和url中的参数名相同即可，springmvc可以自动传值
         *       public String demo0(String name,int age)
         *       这种方式，如果url中不配对应的参数或者参数名不匹配，则会报错。
 *          b、如果url的参数名和控制器中的参数名不一致，需要配置：
     *          public String demo2(@RequestParam(value = "name1") String name, @RequestParam(value = "age1") int age)
     *          name1、age1为url中的参数名，此时如果，url中没有参数或者类型不匹配、名字不匹配也不会报错。
 *          c、    public String demo2(@RequestParam(value = "name1",required=true,defaultValue = "huxiaoyang") String name, @RequestParam(value = "age1")int age)
                        required=true:表示这个参数必须的传值，不然就会报错，defaultValue = "huxiaoyang"：
                                    表示如果浏览器传值了就将该值获取并赋给参数，如果没有改参数，就使用默认的值
            d、public String demo3(String name,int age, People people)
                如果参数为对象，且对象中的属性名和浏览器传过来的参数名一致，则mvc会自动生成一个对象，并将浏览器传的值赋给对象对应的属性
            e、@RequestParam(value = "hover") List<String> list
                获取浏览器传递过来的多个同名参数：比如多个复选框。
 *
 */
@Controller
public class DemoController2 {
    @RequestMapping("demo0")
    public String demo0(String name,int age) {
        System.out.println("执行了demo0" + "名字：" + name + "--->age:" + age);//这里我们可以直接在控制器中获取浏览器传来的参数，
        return "redirect:/jsp.jsp";
    }
    @RequestMapping("demo2")
    public String demo2(@RequestParam(value = "name1",required=true,defaultValue = "huxiaoyang") String name, @RequestParam(value = "age1") int age) {
        System.out.println("执行了demo2" + "名字：" + name + "--->age:" + age);//这里我们可以直接在控制器中获取浏览器传来的参数，
        return "/jsp.jsp";
    }

    @RequestMapping("demo3")
    public String demo3(People people) {
        System.out.println(" people 对象："+people);
        return "redirect:/jsp.jsp";
    }
    @RequestMapping("demo4")
    public String demo4(String name,int age, @RequestParam(value = "hover") List<String> list) {

        System.out.println("执行了demo4" + "名字：" + name + "--->age:" + age);//这里我们可以直接在控制器中获取浏览器传来的参数，
        System.out.println(" List对象："+list);
        return "/jsp.jsp";
    }

    @RequestMapping("demo5")
    public String demo5( Demo demo) {
        System.out.println("执行了demo5" );//这里我们可以直接在控制器中获取浏览器传来的参数，
        System.out.println(" Demo 对象："+demo);
        return "redirect:/jsp.jsp";
    }

    @RequestMapping("demo6")
    public String demo6(Demo02 demo) {

        System.out.println("执行了demo6" );//这里我们可以直接在控制器中获取浏览器传来的参数，
        System.out.println(" Demo 对象："+demo);
        return "/jsp.jsp";
    }
    @RequestMapping("demo7/{name1}/{age}")
    public String demo7(@PathVariable("name1") String name, @PathVariable int age) {

        System.out.println("执行了demo7" );//这里我们可以直接在控制器中获取浏览器传来的参数，
        System.out.println("名字：" + name + "--->age:" + age);

        return "redirect:/jsp.jsp";
    }

    @RequestMapping("demo8/{name1}/{age}")
    public String demo8(@PathVariable("name1") String name, @PathVariable int age) {

        System.out.println("执行了demo8" );//这里我们可以直接在控制器中获取浏览器传来的参数，
        System.out.println("名字：" + name + "--->age:" + age);

        return "forward:/demo9";
    }
    @RequestMapping("demo9")
    public String demo9(HttpServletRequest request) {
        String name = request.getParameter("name1");
        System.out.println("执行了demo9" );//这里我们可以直接在控制器中获取浏览器传来的参数，
        System.out.println("名字：" + name);
        return "redirect:/jsp.jsp";
    }

}
