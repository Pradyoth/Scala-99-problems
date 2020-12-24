object P18 {


  def sliceBuiltIn[A](start:Int,end:Int,ls:List[A])=

    ls.slice(start,end)


  def sliceRecursive[A](start:Int,end:Int,ls:List[A]):List[A]=

    (start,end,ls) match {

      case (s,e,h::tail)  if (e<=0) => Nil

      case (s,e,h::tail)  if (s<= 0) =>  h :: sliceRecursive(0,e-1,tail)




      case (s,e,h::tail) => sliceRecursive(s-1,e-1,tail)


  }



}

P18.sliceRecursive(3,7,List('a','b','c','d','e','f','g','h','i'))

