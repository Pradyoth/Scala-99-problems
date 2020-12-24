object P12{

  def decode[A](ls: List[(Int,A)]):List[A] ={
    ls flatMap{e => List.make(e._1,e._2)}
  }





}

P12.decode(List((4,'a'),(2,'b'),(3,'c')))
