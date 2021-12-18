@Grab("thymeleaf-spring5")

@Controller
class App {

    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    def home(ModelAndView mav){
        mav.setViewName("home")
        mav.addObject("msg", "名前書いてください")
        mav
    }

    @RequestMapping(value="/send", method=RequestMethod.POST)
    @ResponseBody
    def send(@RequestParam("text1")String str, ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "＋でこれはコントローラからの表示(send)" + str + "!!")
        mav.addObject("value",str)
        mav
    }

}
