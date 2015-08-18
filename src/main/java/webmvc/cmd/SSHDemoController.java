package webmvc.cmd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SSHDemoController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("spring", "spring mvc");
        mv.setViewName("business");
        return mv;
    }
}
