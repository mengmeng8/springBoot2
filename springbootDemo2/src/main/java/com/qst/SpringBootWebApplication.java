
    package com.qst;  
      
    import org.springframework.boot.SpringApplication;  
    import org.springframework.boot.autoconfigure.SpringBootApplication;  
    import org.springframework.boot.builder.SpringApplicationBuilder;  
    import org.springframework.boot.context.web.SpringBootServletInitializer;  
      
    /** 
     * Created by Administrator on 2016/5/6. 
     */  
    @SpringBootApplication  
    public class SpringBootWebApplication extends SpringBootServletInitializer {  
      
        @Override  
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
            return application.sources(SpringBootWebApplication.class);  
        }  
      
        public static void main(String[] args) throws Exception {  
            SpringApplication.run(SpringBootWebApplication.class, args);  
        }  
      
    }  