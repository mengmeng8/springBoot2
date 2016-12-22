
    package com.qst.controller;  
      
    import org.springframework.beans.factory.annotation.Value;  
    import org.springframework.stereotype.Controller;  
    import org.springframework.web.bind.annotation.RequestMapping;  
      
    import java.util.Date;  
    import java.util.Map;  
      
    /** 
     * Created by Administrator on 2016/5/6. 
     */  
    @Controller  
    public class IndexController {  
      
        @Value("${application.message:Hello World}")  
        private String message = "Hello World";  
      
        @RequestMapping("/")  
        public String welcome(Map<String, Object> model) {  
            model.put("time", new Date());  
            model.put("message", this.message);  
            return "welcome";  
        }  
        
    }  