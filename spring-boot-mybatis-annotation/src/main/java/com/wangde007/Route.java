package com.wangde007;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

@Controller
@RequestMapping("/")
public class Route {

    /***
     *  url 路由注册
     * @return String path
     */

    @GetMapping(value = "sysUser/list")
    public String UsersGet(){
        return "sysUser/list";
    }
    @GetMapping(value="sysUser/save")
    public String UsersSave(){
        return "sysUser/save";
    }
    @RequestMapping(value="/admin/home")
    public String admin(){return "admin/index";}
    @GetMapping(value="admin/main/code")
    public String adminCode(){return "admin/main/code";}
    @GetMapping(value="admin/main/menu")
    public String adminMenu(){return "admin/main/menu";}
    @GetMapping(value="admin/main/secondMenu")
    public String adminSecondMenu(){return "admin/main/second-menu";}
    @GetMapping(value="admin/main/dynaMenu")
    public String adminDynaMenu(){return "admin/main/dyna-menu";}
    @GetMapping(value="admin/main/operation")
    public String adminOption(){return "admin/main/operation";}
    @GetMapping(value="admin/main/quick")
    public String adminQuick(){return "admin/main/quick";}
    @GetMapping(value="admin/main/resource")
    public String adminResource(){return "admin/main/resource";}
    @GetMapping(value="admin/main/loader")
    public String adminLoader(){return "admin/main/loader";}
    @GetMapping(value="admin/form/code")
    public String adminFormCode(){return "admin/form/code";}
    @GetMapping(value="admin/form/example")
    public String adminFormExample(){return "admin/form/example";}
    @GetMapping(value="admin/form/introduce")
    public String adminFormIntroduce(){return "admin/form/introduce";}
    @GetMapping(value="admin/form/basicValid")
    public String adminFormBasicValid(){return "admin/form/basicValid";}
    @GetMapping(value="admin/form/advalid")
    public String adminFormAdvalid(){return "admin/form/advalid";}
    @GetMapping(value="admin/form/remote")
    public String adminFormRemote(){return "admin/form/remote";}
    @GetMapping(value="admin/form/group")
    public String adminFormGroup(){return "admin/form/group";}
    @GetMapping(value="admin/form/depends")
    public String adminFormDepends(){return "admin/form/depends";}
    @GetMapping(value="admin/form/success")
    public String adminFormSuccess(){return "admin/form/success";}
    @GetMapping(value="admin/form/fail")
    public String adminFormFail(){return "admin/form/fail";}
    @GetMapping(value="admin/form/grid")
    public String adminFormGrid(){return "admin/form/grid";}
    @GetMapping(value="admin/form/form-grid")
    public String adminFormFormGrid(){return "admin/form/form-grid";}
    @GetMapping(value="admin/form/dialog-grid")
    public String adminFormDialogGrid(){return "admin/form/dialog-grid";}
    @GetMapping(value="admin/form/form-dialog-grid")
    public String adminFormFormDialogGrid(){return "admin/form/form-dialog-grid";}
    @GetMapping(value="admin/search/code")
    public String adminSearchCode(){return "admin/search/code";}
    @GetMapping(value="admin/search/example")
    public String adminSearchExample(){return "admin/search/example";}
    @GetMapping(value="admin/search/example-dialog")
    public String adminSearchExampleDialog(){return "admin/search/example-dialog";}
    @GetMapping(value="admin/search/introduce")
    public String adminSearch(){return "admin/search/introduce";}
    @GetMapping(value="admin/search/config")
    public String adminSearchConfig(){return "admin/search/config";}
    @GetMapping(value="admin/search/tab")
    public String adminSearchTab(){return "admin/search/tab";}
    @GetMapping(value="admin/detail/code")
    public String adminDetailCode(){return "admin/detail/code";}
    @GetMapping(value="admin/detail/example")
    public String adminDetailExample(){return "admin/detail/example";}
    @GetMapping(value="admin/detail/introduce")
    public String adminDetailIntroduce(){return "admin/detail/introduce";}
    @GetMapping(value="admin/chart/code")
    public String adminChartCode(){return "admin/chart/code";}
    @GetMapping(value="admin/chart/line")
    public String adminChartLine(){return "admin/chart/line";}
    @GetMapping(value="admin/chart/area")
    public String adminChartArea(){return "admin/chart/area";}
    @GetMapping(value="admin/chart/column")
    public String adminChartColumn(){return "admin/chart/column";}
    @GetMapping(value="admin/chart/pie")
    public String adminChartPie(){return "admin/chart/pie";}
    @GetMapping(value="admin/chart/radar")
    public String adminChartRadar(){return "admin/chart/radar";}
    @GetMapping(value="admin/login")
    public String adminLogin(){
        return "admin/login/index";
    }
    @GetMapping(value="admin/forgot")
    public String adminForget(){return "admin/login/forgot";}
    @GetMapping(value="admin/reset")
    public String adminReset(){return "admin/login/reset";}
    @GetMapping(value="admin/register")
    public String adminRegister(){return "admin/login/register";}








}
