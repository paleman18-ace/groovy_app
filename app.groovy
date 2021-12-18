@RestController
class App {

    @RequestMapping("/")
    def home(){
        "Hello!!"
    }

    @RequestMapping("/site")
    def site(){
      def header = "<html><body>"
      def footer = "</body></html>"
      def content = "<h1>youkoso, site!!</h1><p>nakami</p>"
      
      header + footer + content
    }
}
