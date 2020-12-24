object P21{

  def insertNew[A](element:A,n:Int,ls:List[A]):List[A] ={


    val (pre,post) = ls.splitAt(n)

    pre:::List(element):::post










  }







}
P21.insertNew('f',1,List('a','b','c','d','e'))
