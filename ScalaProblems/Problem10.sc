object P10 {
  def pack[A](ls:List[A]):List[List[A]] = {

    if (ls.isEmpty) List(List())

    else {

      val (packed , next) = ls span(_ == ls.head)
      if (next==Nil)List(packed)

      else
        packed :: pack(next)
    }


  }
  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }
}



P10.encode(List('a','a','a','a','b','c','c'))

