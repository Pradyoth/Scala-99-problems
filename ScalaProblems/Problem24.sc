object P24{

  def removeAt[A](Index:Int,ls:List[A]):(List[A],A)= ls.splitAt(Index) match {

    case(pre , e::post) => (pre:::post,e)
  }

  def randomSelect1[A](n: Int, ls: List[A]): List[A] =

    if (n <=0) Nil

    else{
      val (rest, e) = removeAt((new util.Random).nextInt(ls.length), ls)
      e :: randomSelect1(n - 1, rest)
    }

  def random(n:Int,max:Int): List[Int] =
    randomSelect1(n,List.range(1,max))

}

P24.random(5,49)


