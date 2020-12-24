object P01{

  def lastRecursive[A](ls:List[A]):A = {
    ls match {
      case h :: Nil => h

      case _ ::tail =>lastRecursive(tail)

      case _        => throw new NoSuchElementException

    }
  }
}
P01.lastRecursive(List(1,2,3,4,5))
