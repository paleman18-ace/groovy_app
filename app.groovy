@Grab("thymeleaf-spring5")

@Controller
class App {

    @RequestMapping("/")
    @ResponseBody
    def home(ModelAndView mav){
        mav.setViewName("home")
        mav
    }

    @RequestMapping("/site")
    def site(){
      def header = "<html><body>"
      def footer = "</body></html>"
      def content = "<h1>youkoso, site!!</h1><p>nakami</p>"
      
      header + footer + content
    }
}
