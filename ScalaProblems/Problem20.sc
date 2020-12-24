object P20{

  def removeAt[A](Index:Int,ls:List[A]):(List[A],A)= ls.splitAt(Index) match {

    case(pre , e::post) => (pre:::post,e)
  }


}

P20.removeAt(1,List('a','b','c','d','e'))




