package web.newblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import web.newblog.service.IUserService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/1.
 */
@Controller
@RequestMapping("/mainController")
public class MainController {

    @Autowired
    private IUserService userService;
    @RequestMapping("index")
    public String index(){
        String a = this.userService.getAllUser();
        System.out.print(a);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, String> json(){
        Map<String, String> result = new HashMap<String, String>();
        result.put("MarK", "hello");
        result.put("Ken", "Hehe");
        result.put("Fowafolo", "fool");
        return result;
    }

}
