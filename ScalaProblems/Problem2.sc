object P02 {

  /*def penultimateList[A](ls:List[A]):A =
    if (ls.isEmpty) throw new NoSuchElementException

    else ls.init.last*/



  def penultimateRecursive[A](ls:List[A]):A={

    ls match{
      case h :: _ :: Nil => h


      case _ :: tail  => penultimateRecursive(tail)


      case _          => throw new NoSuchElementException
    }




  }
  def lastBuiltIn[A](n: Int,ls:List[A]):A = {
    if (n <= 0 ) throw new IllegalArgumentException
    if (ls.length < n) throw new NoSuchElementException

    else return ls.takeRight(n).head


  }












}

P02.lastBuiltIn(3,List(1,2,3,4))
