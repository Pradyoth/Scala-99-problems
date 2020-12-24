object P23{

  def removeAt[A](Index:Int,ls:List[A]):(List[A],A)= ls.splitAt(Index) match {

    case(pre , e::post) => (pre:::post,e)
  }

  def randomSelect1[A](n: Int, ls: List[A]): List[A] =

    if (n <=0) Nil

    else{
      val (rest, e) = removeAt((new util.Random).nextInt(ls.length), ls)
      e :: randomSelect1(n - 1, rest)
    }



}

P23.randomSelect1(3,List('a','b','c','d','e'))