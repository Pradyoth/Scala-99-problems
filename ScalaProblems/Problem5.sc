object P05{

  def reverseBuiltin[A](ls:List[A]):List[A] = {
    ls.reverse

  }

  def reverseRecursive[A](ls:List[A]):List[A] = {
    ls match {
      case Nil => Nil

      case h::tail => reverseRecursive(tail):::List(h)
    }
  }
}

P05.reverseRecursive(List(1,2,3,4))
