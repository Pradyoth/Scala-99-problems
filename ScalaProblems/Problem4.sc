object P04{

  def lengthBuiltIn[A](ls:List[A]):Int = {
    return ls.length

  }

  def lengthRecursive[A](ls:List[A]):Int = {
    ls match {
      case Nil => 0

      case _::tail => 1 + lengthRecursive(tail)

    }
  }
}

P04.lengthRecursive(List(1,2,3,4))
