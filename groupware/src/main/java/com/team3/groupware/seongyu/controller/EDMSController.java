package com.team3.groupware.seongyu.controller;

import com.team3.groupware.common.model.EmployeeVO;
import com.team3.groupware.common.service.DepartmentService;
import com.team3.groupware.seongyu.model.EDMS_new_generalVO;
import com.team3.groupware.seongyu.service.EDMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/EDMS")
public class EDMSController {

    @Autowired
    EDMSService edmsService;

    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/new")
    public ModelAndView EDMS_new(EmployeeVO employeeVO){
        ModelAndView mv = new ModelAndView();
        List<EmployeeVO> vo = edmsService.selct_emp_list(employeeVO);

        mv.addObject("emp_info", vo);
        mv.setViewName("/seongyu/EDMS/EDMS_new");

        return mv;
    }

    @PostMapping("general")
    public ModelAndView EDMS_new_general(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/seongyu/EDMS/general");
        return mv;
    }

    @PostMapping("money")
    public ModelAndView EDMS_new_money(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/seongyu/EDMS/money");
        return mv;
    }

    @PostMapping("certificate")
    public ModelAndView EDMS_new_certificate(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/seongyu/EDMS/certificate");
        return mv;
    }

    @RequestMapping("general_add")
    public ModelAndView general_add(EDMS_new_generalVO edms_new_generalVO){
        System.out.println(edms_new_generalVO.toString());
        return new ModelAndView("redirect:/home");
    }





    @GetMapping("/home")
    public ModelAndView EDMS_home_view(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/seongyu/EDMS/EDMS_home");
        return mv;
    }

}