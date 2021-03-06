package com.yy.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yy.service.ComputeService;

 
@RestController
public class ConsumerController {

	@SuppressWarnings("unused")
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

   /* @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        return restTemplate.getForEntity("http://SERVICE1/add?a=10&b=20", String.class).getBody();
    }*/
    
    @Resource
    private ComputeService computeService;
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
    	return computeService.addService();
    }
}
