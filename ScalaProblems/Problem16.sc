def dropRecursive[A](n:Int,ls:List[A]):List[A]=
  {
    def dropR[A](c:Int,curList:List[A]):List[A]= {
      (c,curList) match{
        case (_,Nil) => Nil

        case (1,_::tail) => dropR(n,tail)

        case (_,h::tail) => h::dropR(c-1,tail)
      }
    }

    dropR(n,ls)
  }

dropRecursive(3,List('a','b','c','d','e','f','g'))




