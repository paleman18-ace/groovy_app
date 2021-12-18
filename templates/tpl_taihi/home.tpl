html {
  head {
    title('index page')
  }
  body {
    h1('tplファイル')
    div(){
      a(href:'http://google.com'){
        yield 'googleのlink'
      }
    }
  }
}
