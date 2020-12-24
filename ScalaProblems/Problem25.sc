object P25{


  def removeAt[A](Index:Int,ls:List[A]):(List[A],A)= ls.splitAt(Index) match {

    case(pre , e::post) => (pre:::post,e)
  }

  def randomSelect1[A](n: Int, ls: List[A]): List[A] =

    if (n <=0) Nil

    else{
      val (rest, e) = removeAt((new util.Random).nextInt(ls.length), ls)
      e :: randomSelect1(n - 1, rest)
    }

  def randomPermute[A](ls:List[A]):List[A]=

    randomSelect1(ls.length,ls)
}
P25.randomPermute(List('a','b','c','d'))
